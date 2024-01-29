## Spring MVC(Model, View , Controller)

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/7baa03c3-349b-4023-82b0-d035485bbb3b)
<br>


### MVC 기능들

<br>

- @Controller
  자동으로 스프링빈이 등록되며 스프링 mvc에서 컨트롤러로 인식하게 해준다.

<br>

- @RestController
   추가로 @ResponseBody가 붙은것으로 반환 값으로 뷰를 찾는것이 아니라 HTTP Message Body에 바로 입력해버린다.

<br>

- @RequestMapping
  들어온 요청을 특정 method와 매핑하기 위해 사용된다. 주로 받을 URL을 설정하게 된다.
  @PostMapping, @GetMapping 등으로 받을 HTTP Method를 지정하기도 한다.


  <br>

- @PathVariable
   경로 변수를 받는다. @PathVariable 이름과 파라미터 이름이 같으면 생략 가능한다.

<br>

  ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/4e16d4e0-5136-43f9-a6b6-f5e2e1d08e9f)

<br>


### 클라이언트에서 서버로 요청할때(Get 쿼리파라미터, Post Html Form, Http message body에 요청)

- GET 쿼리파라미터 /url..?username=abc&age =20 의 경우
  
  이름이 같으면 @ReqeustParam("username") String username  ->  @ReqeustParam Strung username -> String username
  
  (그렇다고 너무생략해버리면 눈에 안들어오므로 두번째가 적절한것 같다.)
  
  <br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/c478bded-b9bd-46aa-9497-96cb09494e8c)


<br>

- @ModelAttribute 사용.
  
  객체의 경우 객체를 따로 만들어서 다음과 같이 쉽게 적용할수도 있다.

  <br>
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/10737081-82f7-4bb3-8def-48d60cc6ad50)

<br>

- Http message body에 데이터를 직접 담아서 사용하는 경우(위에 두가지 방법은 못씀)

<br>

  ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/b86d5786-9c58-41a6-9e59-4ea21a91791a)

<br>

- Http message body  json인 경우

<br>

 ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/16ca5780-67ee-4f61-9acc-fd7dfe3251c1)


<br>



### Http 응답 


- 정적리소스, 뷰 템플릿

  <br>
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/5283a360-3bbc-4ffa-8d8e-cdb51afce6fc)

<br>

- Http message body에 직접 입력

<br>

 ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/48098acf-7c7b-48f8-924a-800ed3c6e13a)


<br>

- Http message body  json인 경우

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/a97c6dc5-3055-4776-9f65-c5888456f219)



<br>
