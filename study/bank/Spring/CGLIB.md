## JDK 동적프록시와 CGLIB

- 100개의 클래스면 100개의 프록시가 필요할까? 아니다.
- 동적프록시를 사용하면 개발자가 따로 프록시를 만들 필요없이 런타임에 프록시 객체를 동적으로 만들어준다.
- 스프링 AOP에서는 인터페이스가 있으면 JDK Dynamic Proxy를 없으면 CGLIB(Code Generator Library)로 프록시를 생성한다.
- CGLIB는 바이트코드를 조작해서 동적으로 클래스를 생성하는 기술을 제공하는 라이브러리다.
- 프록시 팩토시가 편리하게 동적프록시를 생성해준다.


![image](https://github.com/MarkZiRo/spring-project/assets/37473857/43f90fde-c7c5-4a51-9461-1ae3c44658e8)

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/6c7fc059-c608-4cb4-817d-25ef6523a8a3)

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/82f8448b-1c88-4781-963c-7a3caba830ed)


### Advice

- 두 기술을 함께 사용한다면 JDK 동적프록시와 CGLIB가 제공하는 InvocationHandler나 MethodInterceptor를 둘다 만들어야 될까?
- 아니다. 스프링은 Advice 개념을 도입해서 Advice란 프록시 팩토리의 서비스 추상화덕분에 의존하지않고 매우 편리하게 동적 프록시를 생성할수 있다.

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/958a8a62-a30f-4e9d-bdd8-4ead81cd7ebc)


<br>

### 용어들

- Pointcut 어디에 부가기능을 적용할지, 않할지 판단하는 필터링이다.
- Advisor는 단순하게 하나의 포인트컷과 하나의 어드바이스로 이루어져있다.
- 조언자(Advisor)는 조언(Advice)를 어디(Pointcout)에 할것인가?

  ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/01f09eef-a8d7-4194-ba71-a146d08ee0e9)

  클라이언트가 프록시의 find를 호출한다. pointcut의 서비스 클레스에 save어드바이스를 적용할지 물어본다. 포인트컷이 true를 반환하면 적용하고 부가기능을 적용한다.
  그렇지 않다면 false를 반환하고 부가기능을 적용하지 않는다.
  
- 하나의 프록시 팩토리는 여러 어드바이저가 적용이 가능하다.
  프록시 팩토리와 어드바이저 덕분에 원본코드를 손대지 않고 프록시를 통해 어떤 부가기능을 어디에 적용할지 정할수 있다.




