# 데이터베이스 구조

<br>

### 데이터베이스 구조

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/1fda16d8-b1b0-4d4e-b41d-3d8481cb010e)

- 튜플의 수를 카디널리티라고 한다.
- 파일구조에서는 레코드와 의미가 같다.

- 속성은 객체의 특성을 기술한 가장 작은 논리적 단위이다.
- 속성의 수를 디그리 또는 차수라고 한다.

- 도메인이란 하나의 속성이 가질수 있는 같은 타입의 모든값의 집합으로 각 속성의 도메인은 원자값을 갖습니다.

  
<br>

### 키의특징

<br>

- 후보키는 유일성과 최소성을 만족시켜야한다.
- 기본키는 후보키중에서 특별히 선정된 주키로(Main Key)로 중복된 값을 가질 수 없다.
- 기본키는 NULL값을 가질수 없고, 기본키로 설정된 속성에는 NULL 값이 있어서는 안된다.
- 기본키는 튜플을 구별할수 있다.
- 대체키는 후보키가 둘이상일때 기본키를 제외한 나머지 후보키를 의미한다.
- 외래키는 NULL 값을 입력할수 있다. 외래키는 중복이 허용되므로 유일성과 최소성을 가지진 않는다.
- 슈퍼키는 한 릴레이션 내에있는 속성들의 집합으로 유일성을 만족시키지만 최소성은 만족시키지 못한다.
  

<br>

### 무결성

<br>

- 개체무결성은 테이블의 기본키는 어떤 속성도 Null값이나 중복값을 가질수 없다.
- 도메인무결성은 속성값이 정의된 도메인에 속한 값이여야만된다.(과목명에 영어,수학만있다면 해당값만 입력가능)
- 참조무결성은 외래키값은 NULL이거나 참조 릴레이션의 기본키값과 동일해야 한다. 참조할수없는 왜래키값은 가질수 없다.
- 사용자 정의 무결성은 속성값들이 사용자가 정의한 제약조건에 만족해야 한다는 것이다.


<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/338c755d-0ccd-4516-9811-28e41e892542)

<br>


