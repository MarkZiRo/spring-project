# Spring Basic2

### @PostConstruct @PreDestroy
- 스프링빈이 사이클은 다음과 같다.
- 스프링컨테이너생성->빈 생성-> 의존관계 주입-> 초기화 콜백 -> 사용 -> 소멸전 콜벽 -> 스프링 종료
- 이 어노테이션은 스프링이아닌 jsr-250이라는 자바 표준이기때문에 다른 컨테이너에서도 잘 작동한다.

<br>

### 프로토타입스코프
- 싱글톤과는 다르게 요청이 들어오면 항상 새로운 프로토타입빈을 생성한다.
- 스프링컨테이너는 프로토 타입빈은 생성,의존관계주입, 초기화까지만 하기때문에 @PreDestroy는 실행되지 않는다.
- 따라서 이 프로토타입스코프를 싱글톤과 함께쓰면 의존관계 주입만받기때문에 빈은 계속 유지가 되는 문제가 생긴다.
- 그렇다면 ObjectFactory를 상속받은 ObjectProvider 주입받을 때 각각 새로운 프로토타입빈을 생성하게해 이문제를 해결할 수 있다. 

### 웹스코프
- request, session, application, websocket등은 웹환경에서만 작동하는 웹스코프이며 프로토타입과는 다르게 스프링이 종료시점까지 관리한다.
- 스프링컨테이너는 프로토 타입빈은 생성,의존관계주입, 초기화까지만 하기때문에 @PreDestroy는 실행되지 않는다.
  
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/09dd14ad-c539-4894-9e53-b693e099b540)

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/3b7ca3ac-7c04-4ffb-bc5a-6f1594e43ea2)

- 다음코드는 @Scope(value= "reuqest") 에서 Http 요청당 하나씩 생성되고, Http요청이 끝나는 시점에 소멸된다.
- 그런데 스프링 애플리케이션을 실행할때 싱글톤빈은 생성되서 주입이 가능하지만  request 스코프빈은 아직 생성되지 않아 오류가 발생한다.
- 따라서 이를 막기위해 위처럼 ObjectProvider를 통해 request scope빈의 생성을 지연할수 있다.
- 그렇지만 더좋은 방법은 @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS) 를 써서 HttpRequest와 달리 가짜 프록시 클래스를 다른빈에 미리 주입해둘수 있다.
- 가짜프록시객체는 원본 클래스를 상속받아서 만들어져서 다형성을 통해 클라이언트 요청이들어오면 진짜 로직을 호출한다.
- CGLIB라는 라이브러리로 실제요청이면 그때 내부빈을 요청하는 위임로직이 들어있다.
<br>
