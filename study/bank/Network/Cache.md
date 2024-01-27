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


<br>

### Cache

- 만약에 캐시가 없다면 데이터가 변경되지 않아도 매번 네트워크롤 통해 데이터(Http header+body)를 다운받아야한다.
- 따라서 그 데이터 웹브라우저 캐시에서 일정시간만큼 보관하고 필요하면 네트워크를 사용하지않고 바로 캐시에서 가져온다
- cache-control: max-age:60 (캐시가 유효한 시간)
- 만약 시간이 초과하면 다시 Http header+body의 데이터를 받는다.
- 하지만 만약 캐시의 유효시간이 초과되도 서버의 데이터가 갱신되지 않는다면 304 Not Modified+ Header정보(Bodyx)로 응답한다.
- 만약 변경되었다면 200 Header +Body 모두 전송한다.

<br>


### Cache-Control의 종류

- Cache-Control: max-age 캐시 유효시간, 초단위
- Cache-Control: no-cache 데이터는 캐시해도 되지만 항상 원서버에 검증하고 사용(혹시라도 원서버만 접근 실패시 오래된 데이터냐(200) or Error냐 선택을 한다)
- Cache-Control: no-store 데이터에 민감한 정보가 있으므로 저장하면 안된다.
- Cache-Control: must-revalidate (원서버에 검증해야된다. 원서버 접근 실패시 504 오류가 난다.)

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/2c002ff3-7fd4-4607-aa32-44cc0a080996)



