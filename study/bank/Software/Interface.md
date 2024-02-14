# Interface

<br>

### EAI(Enterprise Application Integration)

<br>

- 모듈 연계는 내부 모듈과 외부모듈간의 데이터교환을 위해 관계를 사용하는것이다.
- Point-to-point 1:1 연결. Hub & Spoke 단일 접점인 허브시스템을 통해 데이터전송
- Message Bus 애플리케이션 사이에 미들웨어(Bus)를 두어 처리
- Hybrid  Hub & Spoke와 Message Buse를 합친것으로 그룹내에서는 Hub & Spoke를 그룹간에는 Message Bus를 사용

<br>

### 인터페이스 구현

- 인터페이스 구현은 송 수신 시스템간의 데이터 교환 및 처리를 실현해주는 작업이다. 주로 Json, Xml 형식의 데이터 포맷을 사용한다.
- Json은 속성-값쌍으로 이루어진 데이터객체를 전달하는 방식으로 JavaScript를 토대로 개발되었다.
- AJAX JavaScript를 활용한 서버간의 xml 교환 및 제어를 한다.

<br>


## 인터페이스 보안

<br>

- 네트워크 영역보안은 스니핑(네트워크 중간에서 남의 패킷정보를 도청)을 방지하기 위해 IPsec, SSL, S-HTTP등 다양한 암호화를 사용한다.

<br>

## 인터페이스 구현 검증도구

<br>

- XUnit(JUnit, CppUnit, Nunit등 다양한 언어에 사용)
- STAF 데몬이 프로그램테스트에 대한응답을 대신하고 테스트가 완료되면 통합하고 나동화한다.
- Fitness 웹기반 테스트 프테임워크이다.
- NTAF Fitness와 STAF의 장점을 합친 NHN(Naver)의 테스트 자동화 프레임워크이다.
- wair Ruby를 사용하는 애플리케이션 테스트 프레임워크이다.
- 성능 관리도구에는 Scouter, Jennifer 등이 있다. 

<br>
