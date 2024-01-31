## Error


- WAS -> 필터 -> 서블릿 -> 인터셉터 -> 컨트롤러 -> View 로 이어지는데

- 에러 발생시  WAS <- 필터 <- 서블릿 <- 인터셉터 <- 컨트롤러(예외발생) 에서
  WAS에서  WAS-> 필터(X) -> 서블릿 -> 인터셉터(X) -> 컨트롤러 -> 뷰로 중복호출을 제거해서 효율적으로 작동하게 한다.
  필터에서는 (DispatchType=REQUEST) 인터셉터에서는(excludePathPattherns("/error-page/**") 이런식.


  ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/4d3f8c43-1da2-4390-b986-f5676230d6c0)


스프링부트에서는 위의 저 과정을 다 해주고 다음과 같이 오류페이지를 쉽게 뛰울수 있도록 도와준다.

  
