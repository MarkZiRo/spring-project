# Pattern1

### Template Method Pattern
- 템플릿이라는 틀을 사용해서 변하지 않는 부분을 몰아두고 일부 변하는 부분은 호출해서 해결한다. 
- 즉 부모클래스에 알고리즘의 골격인 템플릿을 정의, 일부 변경되는 로직은 자식클래스에 정의한다.
- 상속과 오버라이딩을 통한 다형성으로 문제를 해결한다.
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/bdd7b124-34d4-4b89-be88-a2fff550f444)

<br>

- 문제는 상속에서오는 문제점. 자식이 부모의 기능을 사용하지 않더라도 상속받고 있고,
- 별도의 클래스나 익명내부 클래스를 만드는것도 복잡하다.

<br>

### Strategy Pattern
- 전력패턴은 상속대신에 인터페이스를 구현해서 변하지 않는 부분을 Context에두고 변하는 부분을 Strategy 인터페이스를 만들어 해결한다.
- Context는 내부에 Strategy 필드를 가지고 이 구현체에 변하는 부분을 주입한다.(스프링 의존관계 주입에서 사용하는 전략!)
- 선조립후 실행하는 느낌이다. 단점은 조립을 한 이후에는 전략을 변경하기 어렵고, 실행할때마다 전략을 지정해주여야된다.
  
 ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/493f04a8-e895-4a28-aced-42b8e7b66a15)
 
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/56b07073-1005-40a3-8b1b-a1fadb678c13)

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/5ef2d6d8-86ca-4994-b208-d5648a13be16)


<br>

### Template Callback Pattern
- 전력패턴에서 Context가 템플릿 역할을하고, Strategy이 콜백으로 넘어오는 방식이다. 전략패턴에서 템플릿과 콜백이 강조된 패턴이다.
- 스프링 내부에서 이런방식을 자주사용한다. 예를들어 JdbcTemplate, RestTemplate, TransactionTemplate등 다양한 템플릿 콜백패턴이 있다.
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/9064ccff-2e6d-40ab-9c42-011594d7b231)

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/85e0a7b2-f33e-43d0-8d06-83e39c4bd3e9)

- 람다를 사용하면 편리하다!

<br>
