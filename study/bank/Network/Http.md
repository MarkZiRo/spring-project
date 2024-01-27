
# HTTP

### HyperText Transfer Protocol
- 통신 계층 이후 전달된 데이터가 **어떻게** 표현되어 있는 지 클라이언트와 서버가 서로 주고받는 문서의 양식 같은 통신규약이다.
- HTML 문서와 같은 자원을 주고받을 수 있도록 하는 규약
- 클라이언트가 요청하면 서버는 응답하는 , Client - Sever Protocol 이라고도 부른다.


### HTTP Request
- Request Line (HTTP Method(get,post,put,delete), URL 경로,  Http버전)
- Request Header(요청에 대한 정보, 어떤방식인지, 어떤형태의 답을 줘야하는지)
- Request Body(요청을 통해 전달하고 싶은 실제 데이터)

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/4bc7da49-451e-4707-b4ba-41d21e38141f)

<br>


### HTTP Reponse
- Start Line (HTTP 버전, 상태코드, 코드 메시지)
- Request Header(어떤 방식으로 해석해야하는지)
- Request Body(요청을 통해 전달하고 싶은 실제 데이터) 구조자체는 request와 비슷.

<br>

### HTTP Status Codes

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/48ee1621-8cf1-4b7d-8b90-6427cee118a2)



### HTTPS
- HTTP의 경우 누군가 네트워크에서 신호를 가로채면 내용이 노출되는 보안이슈가 존재하여 이 보안문제를 해결해주는 것이 HTTPS
- 암호화와 CA인증서, 전자서명등을 통해 위조를 방지한다.
