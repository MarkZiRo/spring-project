# Pattern2

### ProxyPattern, DecoratorPattern
- 클라가 서버에 요청을 할때 어떤 대리자가 있을수 있다. 이 대리자를 영어로 Proxy라고 한다.
- 크게 2가지 기능을 담당하는데 접근제어(권한에 따른 차단, 캐싱, 지연로딩) 부가기능(요청값 응답값 변형, 추가로그)를 담당한다.
- 접근제어기능이 주면 Proxy 새로운기능추가가 목적이면 Decorator 패턴이라고 부른다!
- 이로인해 기존코드를 변경하지 않고 프록시에 로그 추적기같은 부가기능을 손쉽게 넣을수 있다.

<br>


### 특징


 ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/e269de66-78d3-4c21-a568-9473d31425c7)
 
 ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/fda0f81f-c90f-4192-9ba1-edef4219432e)
 
- 이렇게하면 프록시를 실제 스프링 빈 대신 등록하여 실제 객체는 스프링빈으로 등록되지 않는다. 
- 따라서 스프링빈을 주입받으면 실제 객체대신 프록시 객체가 주입된다.
- 프록시 객체는 스프링 컨테이너가 관리하는 힙메모리에 올라가고, 실제 객체는 힙 메모리에 올라가지만 스프링 컨테이너가 관리하진 않는다.

  
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/18a1c7ab-555b-48bb-bdd8-8a4d7ee1c324)


<br>
