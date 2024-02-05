# Rest

### 포인트컷 지시자

@PointCut("execution(" hello.aop.order..*(..))")등을 통해 메소드 실행 조인포인트를 매칭한다.
- .은 해당 위치의 패키지이며 ..은 하당 위치의 패키지와 하위 패키지도 포함한다.

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/cfa1409e-7a26-4e90-b4dd-fca8f7d0be10)

<br>

### 주의사항

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/bb84a799-3c00-49aa-b6fc-a8fba008e779)

<br>

- 한 함수에서 바로 내부의 다른 함수를 호출하면 this.internal() 처럼 되기때문에 프록시가 작동하지 않게된다.(프록시 방식의 단점)
- 이럴때는 아예 다른 클래스로 분류하거나 또는 아예 자신의 클래스.internal()로 가져오거나 또는 지연조회인 ObjectProvider등을 사용하는 방법이 있다.

<br>

### jdk 동적프록시 , cglib 프록시 차이

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/c0820ae3-7c31-4e16-823e-0db2690076d1)

- jdk 동적프록시의 경우 memberService는 주입이 된다. 그러나 memberserviceImpl은 무엇인지 몰라 주입이 불가능하다.

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/85d224b1-6f99-4fb4-9a3a-bcf0526fd957)

- 반면 cglib는 애초에 상속관계구성이기 때문에 memberserviceimpl을 기반으로 만들어 졌기때문에
- 둘다 주입이 가능하다.
- 그러나 cglib는 상속이기때문에 기본생성자가 필수고,생성자가 두번호출되고, final 키워드가 사용불가한 문제가 있다.
- 이는 스프링이 objenesis라는 특별한 라이브러리를 사용해 해결하였다.
- 따라서 현재는 cglib가 기본으로 사용된다!!
