## Transactional

- @Transactional은 만약 JDBC코드에 트랜잭션을 적용한다면 JDBC기술이 서비스 계층에 누구되거나, 예외처리를 해야되거나 , JDBC반복문제를 모두 해결해준다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/96e713d0-c683-4966-bb42-6bf0f6e36302)

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/42cc8216-6ceb-4ca6-98dd-743570a07a1a)

<br>

- 스프링의 트랜잭션 AOP기능은 public 메서드에만 적용되며 , protected, private등은 적용되지 않는다.
- @PostConstruct 에는 @Transactional 이 적용되지 않을수 있다. 따라서 @EventListener(value = AAA.class) 를 사용하자.
- 스프링체크예외는 비즈니스 의미가 있을대 사용하고 언체크 예외(런타임)은 복구 불가능한 예외일때 사용한다.

<br>

### 주의할점

그림과 같이 @Transactional을 MemberService에 붙여주고, MeberRepository와 LogRepository은 MemberSerive가 호출하므로
같은 트랜잭션을 활용하게 된다. 만약 클라이언트가 각각 트랜잭션이 필요하다면 마찬가지로 둘다 @Transactional을 붙여주어야한다.
문제는 그렇게 됬을시 MemberService는 외부트랜잭션 MemberRepository와 LogRepository는 내부트랜잭션이된다.

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/e9f280e0-9d00-4034-af69-10a85e18c319)


<br>
이 경우에 만약 MemberRepository가 커밋을 요청하고 LogRepository가 롤백을 요청하면 MemberService의 내부트랜잭션은 
MemberRepository의 커밋을 무시하고롤백을 시켜버린다. LogRepository에서 예외를 발생시켜 MemberService에서 잡게해도 마찬가지이다.
이미 LogRepository에서 rollbackOnly =true를 시켜버렸기 때문이다. 

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/cd1de443-9c17-4b05-842a-9a936c542913)



<br>

만약 이부분을 다르게 하고싶다면

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/7c9a551d-f5c9-4ba4-81de-8a0b8d547bf1)

<br>

다음과 같이 아예 신큐트랜잭션을 만들어줘야된다.

