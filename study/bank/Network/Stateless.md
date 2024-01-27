# Stateless


<br>

### Stateless

- HTTP는 무상태(Stateless) 프로토콜이다.
- 클라이언트와 서버가 요청과 응답을 주고받으면 연결이 끊어지고 이전 요청을 기억하지 못한다.
- 클라이언트와 서버는 서로 상태를 유지하지 않는다.

<br>

### 쿠키

- 따라서 간단한 유저정보는 쿠키에 저장이 된다.
- 쿠키정보는 항상 서버에 전송이되고 최소한의 정보만 사용한다.(세션id, 인증 토큰)
- 보안에 민간함 데이터는 저장하면 안된다!
- 원래는 http,https를 구분하지 않고 전송하나 Secure을 적용하면 https만 전송한다.
- set-cookie: sessionId=abcde1234; expires=Sat, 26-Dec-2020 00:00:00 GMT; path=/; domain=.google.com; Secure
  expires는 만료시점 path와 domain은 쿠키가 이 경로와 도메인에 허용하는지?  secure은 쿠키의 보안정보다.
