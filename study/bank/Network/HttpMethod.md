# Http Method


<br>


### HttpMethod의 종류

-GET : 리소스 조회, 전달하고 싶은 데이터는 query를 통해서 전달.
-POST : 메시지 바디를 통해 서버로 요청 데이터 전달하면 서버는 요청데이터를 처리.
-PUT : 리소스를 완전히 대체함. 게시판 업데이트 같은데 적당하다.
-PATCH : 리소스를 부분 변경한다.
-DELETE : 리소스를 제거한다.
-이외  HEAD, OPTIONS, CONNECT 등도 존재는 한다.

<br>


### 데이터 링크 계층(L2)

- 데이터를 전송 받을 수 있는 두 기계(Node)사이의 연결 계층
- 각 기계사이의 데이터를 안전하게 전달하는 역할을 하며 데이터전달을 위해 MAC주소를 사용한다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/c8eab907-ea31-4cc2-848c-993e1c0a70b9)

<br>


### 네트워크 계층(L3)

- 네트워크 계층은 이런 Node의 네트워크 내부의 데이터 전송을 어떻게 할지, 데이터가 크면 데이터의 크기를 조절하기도 한다.
- 각 기계사이의 데이터를 안전하게 전달하는 역할을 하며 데이터전달을 위해 ip주소를 사용한다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/5362aa62-e2a1-4cdc-9775-b6bb1fafced6)


<br>


### 전송 계층(L4)

- 실제로 데이터가 의도한대로 전송됬는지 확인하는 역할을 해준다.
- 데이터가 손실이 있었는지, 있었다면 다시보내고, ip주소의 Port번호를 통해 프로세스를 결정한다.
- TCP(Transmission Control Protocol)로 실제로 전달할 데이터를 쪼개고, 쪼개진 데이터가 정상적인지를 판단하기 위해 패킷단위로 보낸다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/5c997f30-6aca-49dc-8b11-1c81b8d89c62)


<br>


### 세션 계층(L5) 

- TCP를 비롯한 전송계층 통신의 세션을 관리하는 계층.
- 두 컴퓨터를 연결하고, 연결을 제어하고, 연결을 중단하는 역할

<br>


### 표현 계층(L6) 

- 전달된 데이터를 사용하는 시스템의 형식에 맞게 변환하는 계층
- 파일 인코딩, 명령어를 포장, 압축, 암호화 한다.

<br>


### 응용 계층(L7) 

- 그 전달된 데이터가 어떤형태여야 하는지 정의하는 계층(HTTP, SMTP, FTP)

<br>
