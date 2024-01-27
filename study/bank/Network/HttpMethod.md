# Http Method


<br>


### HttpMethod의 종류

-GET : 리소스 조회, 전달하고 싶은 데이터는 query를 통해서 전달

-POST : 메시지 바디를 통해 서버로 요청 데이터 전달하면 서버는 요청데이터를 처리.

-PUT : 리소스를 완전히 대체함. 게시판 업데이트 같은데 적당하다.

-PATCH : 리소스를 부분 변경한다.

-DELETE : 리소스를 제거한다.

-이외  HEAD, OPTIONS, CONNECT 등도 존재는 한다.

<br>


### 특징들.

- 멱등(한번 호출하든 두번호출하든 결과가 같다)
  
  GET,PUT,DELETE는 몇번을해도 결과는 같다.
  POST는 멱등이 아니다. 두번호출하면 결제가 중복해서 일어날 수 있다.
- HTML Form 전송은 GET,POST만 지원.

- 정적데이터 조회(이미지,텍스트) GET  /static/star.jpg
- 동적데이터 조회(쿼리 파라미터 사용) GET (key, value 형식으로 꺼내서 동적으로 생성 주로 검색어나 정렬필터로 사용)
- HTML Form를 사용한 데이터 전송
  
   ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/81fd36bf-21bd-4fda-a524-d472d27889fa)

  메시지 바디를 통한 데이터 전송 POST,PUT,PATCH (다양한 기능!)

 ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/3f8069b0-b9c5-4be6-817f-d2dd54c889b0)

 <br>

 ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/4354f2d7-287a-49c3-b7ef-8ed70421c4af)

 <br>
 

- HTTP API를 사용한 데이터 전송

  POST,PUT,PATCH,GET 다 사용가능
  JSON 사용!

<br>


### HTML Form을 이용한 API 설계(예시)

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/9542ffbe-9b5a-4e6a-86a2-2aff82401703)
