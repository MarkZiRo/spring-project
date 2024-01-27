# WEB

### Web Server
- HTTP 기반으로 동작.
- 정적(HTML,CSS,JS,이미지 영상) 데이터들 제공.
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/c30f38ed-ec5f-4916-bdb3-731b3ab03a9d)


<br>

### Web Application Server(WAS)
- 웹서버 기능 + 프로그램 코드를 실행해서 애플리케이션 로직실행.
- 동적 HTML, HTTP API(JSON), 서블릿 , 스프링 MVC

<br>

### 웹 시스템 구성(WEB,WAS,DB)
- 정적리소스는 웹서버가 처리하며
- 웹서버는 애플리케이션로직같은 동적 처리가 필요하면 WAS에 위임을 요청.


![image](https://github.com/MarkZiRo/spring-project/assets/37473857/0774a991-e775-463a-977d-2874c8e9d6ce)


<br>

### Servlet
- Http를 이렇게 클라이언트에서 서버로 전송할때 수많은 작업이 필요하다.
- 해야될작업이 상당히 많은데 이를 편리하게 지원해주는것이 Servlet이다!


 ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/ea56b012-8bb2-4408-bdf7-25904ba6d364)
- 서블릿은 그림에 있는 비즈니스로직을 제외한 다른 기능을 편하게 하도록 지원해준다.

<br>

  ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/1e112e7f-def1-40fa-a136-fb00ba74e8d7)

- 요청정보를 편리하게 사용하는 HttpServletRequest
- 응답정보를 편리하게 제공하는 HttpServletResponse
  


<br>


### ServletContainer
- 톰캣처럼 서블릿을 지원하는 WAS를 서블릿 컨테이너라고 한다.
- 서블릿 컨테이너는 서블릿객체를 생성, 초기화, 호출, 종료하는 생명주기를 관리한다.
- 서블릿 객체는 싱글톤으로 관리되어 고객이 요청할때마다 객체를 생성하지 않아 효율적이다
- 또한 동시 요청을 위한 멀티 쓰레드도 지원처리 해준다!!(설정한 쓰레드풀에서 필요할때마다 쓰레드를 생성하는 것들을 관리해준다!)

<br>


### Spring MVC
- 여러기술이 난립하다(jsp 등) @Controller 애노테이션 기반의 스프링 mvc등장!
- spring boot가 등장해 jar(빌드결과)에 was서버까지 포함-> 빌드 배포 단순화
