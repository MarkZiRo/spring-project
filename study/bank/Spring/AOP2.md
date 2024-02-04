# AOP2


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
<br>

