# Spring Boot


### 빈후처리기

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/abf6838b-b524-4d58-af4b-e2b174657c5e)

- 빈후처리기는 실제 객체대신 프록시를 스프링빈으로 등록한다.

- @Configuration의 경우 실제 객체를 이미 스프링빈으로 등록해버려서 프록시 적용이 불가능했지만
- 빈 후처리기는 이 등록과정을 가로채서 프록시를 스프링빈으로 등록시킨다.

<br>

### @Aspect 프록시

<br>

- 스프링에서는 @Aspect를 통해서 애노테이션기반 프록시를 매우 편리하게 적용할수 있다. 실무에서도 자주사용된다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/718ffbad-e72d-46e8-a48d-b9e1a5698675)

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/7ba0df37-bece-4fa1-8e21-a3259a9d575f)


<br>


### 스프링 AOP

- 핵심과 부가기능을 분리하기위한 @Aspect같은 것을 AOP(Aspect Oriented Programming)이라 한다.
  
<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/15ee4209-3ddb-4d06-885e-1e20975ad78d)

<br>

AOP를 적용할때는 크게 3가지 컴파일시점, 클래스로딩시점, 런타임 시점(프록시) 등이 있다.
지금까지 한것이 바로 이 스프링부트의 프록시방식의 aop이다.
스프링에서 AOP프록시는 JDK동적프록시 또는 CGLIB프록시를 나타낸다.


### 용어들

- 조인포인트 어드바이스가 적용되는 위치, 메소스실행, 생성자호출, 필드값 접근, static 메서드같은 프로그램 실행중 지점이다
  AOP를 적용하는 모든지점이나 스프링AOP는 프록시 방식이므로 항상 메소드 실행지점이다.

- Aspect 어드바이스+ 포인트컷을 모듈화한것 @Aspect이다!.
  
