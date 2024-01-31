## Error


- WAS -> 필터 -> 서블릿 -> 인터셉터 -> 컨트롤러 -> View 로 이어지는데

- 에러 발생시  WAS <- 필터 <- 서블릿 <- 인터셉터 <- 컨트롤러(예외발생) 에서
  WAS에서  WAS-> 필터(X) -> 서블릿 -> 인터셉터(X) -> 컨트롤러 -> 뷰로 중복호출을 제거해서 효율적으로 작동하게 한다.
  필터에서는 (DispatchType=REQUEST) 인터셉터에서는(excludePathPattherns("/error-page/**") 이런식.

<br>

  ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/4d3f8c43-1da2-4390-b986-f5676230d6c0)


<br>

### api

html은 이렇게하면되나 api의 경우 json일 경우도 있다. 따라서 ExceptionResolver를 활용하여 이부분을 처리해준다.
 was가 아니라 respose.sendError(xxx) 서블릿에서 상태코드에 따른 처리를 하도록 한다.

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/ddb18eee-0f9e-46b4-9cd9-dc3ad9af2f02)

<br>

스프링부트는 기본적으로 3가지의 ExceptionResolver를 제공한다. 서블릿컨테이너가기전에 처리해버린다.

### ExceptionHandler ExcpetionResolver 
api의 경우 시스템마다 응답모양이 다르고 스펙도 달라서 이런것을 가볍게 처리하도록 도와준다.
부모예외 자식예외의 경우 자식부터다.

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/316c9c8d-25b0-4bfd-951e-1c5ab4bb0936)

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/a9961d93-fc54-42e9-a362-b3d4f3be86fd)

<br>

### ResponseStatus ExceptionResolver
@ResponseseStatus가 달려있으면 sendError로 바꿔준다.

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/fea0dd81-c7cd-4abf-b23b-0a4901612ced)

<br>


### DefaultHandler ExcpetioResolver

바인딩시점에 Type이 안맞은경우 서블릿컨테이너까지가 500에러가 나타나는데 이것은 대부분 클라이언트가 HTTP정보를 잘못 호출해서 발생한다.
따라서 이럴때는 HTTP상태를 400으로 해야되는데 이런부분을 처리하도록 많이 스프링내부에 정의되어있다. 

<br>

### RestControllerAdvice

@RestControlleradvice(@ControllerAdvice +@Responsebody) 또는 @ControllerAdvice를 통해 에러부분을 컨트롤러부분에서 따로 빼준다.
- 기본적으로 모든 컨트롤러에 적용된다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/e81cab7e-8019-49c5-8475-9205a5626883)
다음과 같이 컨트롤러를 지정도 가능하다.
  
