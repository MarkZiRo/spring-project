#HTTP Header

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/1179b57a-0bf2-4f39-af32-961bf0651950)


<br>


### Http Header(표현 헤더)
Content-Type: 표현 데이터의 형식 (text/html; charset-utf-8, application/json, image/png)

Content-Encoding: 표현 데이터의 압축방식 (gzip, deflate, identity)

Content-Language: 표현 데이터의 언어 (ko, en, en-US)

Content-Length: 표현 데이터의 길이 (바이트단위)

Accept : 클라이언트가 선호하는 미디어 타입

Accept-Charset: 클라이언트가 선호하는 문자 인코딩

Accept-Encoding : 클라이언트가 선호하는 압축 인코딩

Accept-Language : 클라이언트가 선호하는 언어

<br>
0~1까지. 1일수록 큰가치이다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/e67cef75-1cf5-4bca-b31a-cb513bd0b9cd)


<br>


### 전송

- 전송은 단순전송(content의 길이를 알경우 한번에 전달 응답을 받음), 압축전송(Content-Encoding을 포함해서 압축전달)
- 분할전송(용량이 클때 몇바이트씩 전송하기를 반복, Transfer-Encoding이 추가된다. 이때 Content-Length는 길이는 예상하기 어려워 사용하지않는다.)
- 범위전송(데이터를 받을때 받가가 끊긴경우 범위를 지정해서 다시 전송. Range: bytes= 1001-200, Content-Range: bytes 1001-2000/ 2000)
