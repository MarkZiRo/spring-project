
##  데이터베이스란?
- DB(DataBase)는 일정한 규칙 혹은 규약을 통해 구조화되어 저장 되는 데이터의 모음이며
- 이러한 데이터베이스를 관리하는 시스템을 DBMS(DataBase Management System) 이라고 한다.
- 이러한 DBMS에 정의된 쿼리 언어를 통해 데이터에 CRUD가 가능하며
- 데이터베이스는 트랜잭션, 동시공유, 사용자에 따른 데이터접근 권한부여, 데이터 암호화, 백업 및 복구등이 가능합니다.


<br>

### 관계형 데이터베이스란?
- Relational Database Management System으로 관계형 데이터베이스를 다루기 위한 프로그램입니다.
- 데이터는 여러개의 테이블로 각 테이블은 행과 열로 이루어져있으며 이러한 테이블간의 관계를 통해 데이터가 구조화 됩니다.
- 주요특직엔 데이터 구조화(스키마)는 각테이블은 명시적인 스카마에 따라 정의 되며 이러한 스키마는 데이터의 유형,조건등을 정의하여 데이터의 일관성과 무결성을 유지합니다.
- SQL(Structured Query Language) 를 통해 데이터를 조작하여 검색,삽입,수정,삭제등의 작업을 할수 있습니다.
- 데이터 무결성을 보장하기 위해 다양한 제약조건(Primark Key, Foreign Key등)이 있습니다.
- 스키마
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/22051297-51cd-4ffe-838a-87546af2fc02)
<br>
  
- 필드와 레코드
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/46855630-b1c3-4ca0-99fb-483ac5802882)

<br>

#### Primary Key  
- 테이블에서 각행을 식별하는데 사용되는 유일한 식별자(identifier) 입니다. 기본키는 해당 테이블내에 중복되지 않고, 모든 행에서 유일한 값을 가집니다.
- 특징으론 null 값을 허락하지 않고, 다른 테이블에서 외래키(Foreign Key)로 사용되서, 다른 테이블과의 관계를 설정하는데 사용됩니다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/ad72ebcf-a1e4-4548-a9c4-e94708178c8f)

#### Foreign Key
- 관계형 데이터베이스에서 한 테이블의 필드가 다른 테이블의 Primary Key(기본키)를 가리키는 제약조건입니다. 두 테이블과의 관계를 설정하는데 사용됩니다.
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/77e9ced3-380a-4527-a595-13fd280dc03e)


<br>

<br>

### Entity
- 데이터베이스에서 실제 세계의 객체나 개념을 모델링한것을 의미하며 DB내에서 하나의 고유하게 식별될수 있는 속성을 가집니다.
- 혼자서는 존재하지 못하면 약한 엔터티 그렇지 않다면 강한 엔터티라고도 이야기 합니다.
- 강한 엔터티(Strong Entity)는 자체적인 주요키(Primary Key)를 가지고 다른 엔터티에 독립적인 엔터티입니다.

<br>


### SQL(Structured Query Language)이란?
- SQL(Structured Query Language)은 데이터베이스에서 데이터를 관리하고 조작하기 위해 표준화된 언어입니다.
- 저장, 검색, 수정 , 삭제를 하는데 사용되며 다양한 작업을 수행합니다. 크게 3가지로 나눌수 있습니다.
- DDL(Data Definition Language) 데이터 정의
- DML(Data Manipulation Language) 데이터 조작
- DCL(Data Control Language) 데이터 접근 권한
  
<br>

#### 기본타입

- DB별로 다르긴하나 기본적으로
- int : 4바이트
- DATE : 날짜만
- DATETIME : 날짜 + 시간(문자형저장)
- TIMESTAMP : 날짜 + 시간 1970 1.1 자정을 기준으로 몇초가 지났는지를 저장(숫자형저장)

#### SQL DDL
-1 CREATE TABLE
     
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/5503e94f-0485-45f4-acfb-df3333133532)


<br>

-2 UNIQUE - 해당컬럼값이 고유해야함.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/9b9de1d1-3208-46a0-b3dd-bab07d98b5ff)

<br>

-3 PRIMAR KEY (PK로 지정)

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/b74c3a97-7230-4077-bf45-e9351c8e8ad3)


<br>


-4 RENAME TO : 테이블이름을 수정

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/f75748b3-a9bf-498d-aa6c-fd001344fe45)



<br>

-5 RENAME COLUMN : 테이블칼럼이름을 변경

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/daa4e472-bdd2-40c6-9f54-65164b568b3a)



<br>

-6 ADD COLUMN : 테이블에 칼럼을 추가

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/f55d41b9-6083-4563-9494-0a3186844d81)


<br>



-7 RENAME COLUMN : 테이블에 칼럼을 추가

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/f55d41b9-6083-4563-9494-0a3186844d81)


<br>


-8 DROP COLUMN : 테이블을 제거

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/0d9f76ae-d91e-4525-a258-7a32d9f4b5d6)



<br>



#### DML(Data Manipulation Language)
- 데이터베이스내의 데이터를 조작하는데 사용되는 sql로 삽입,업데이트, 삭제, 및 조회하는데 사용됩니다.

-1 INSERT INTO [테이블명] (칼럼1, 칼럼2..) VALUES(값1, 값2..)
     
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/b7d809db-184a-467c-9dc7-8f510208f62d)



<br>

-2 UPDATE

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/c4566b05-3013-4a6c-aba9-901b42317bf0)


<br>

-3 DELETE

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/9ec5312a-8133-45c7-95cb-616bbbdfd6ee)



<br>


-4 SELECT

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/5c5633d3-9243-4330-93a5-9167e8168dfd)




<br>

-5 오름차순 정렬

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/19055099-ddbd-4f41-abae-9a9d9f52a5b6)




<br>

-6 내림차순 정렬

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/4cdd33f6-3a42-4ebd-ad02-4fe1f6c8d5ad)



<br>



-7 조회할 칼럼의 중복을 제거

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/51ef6608-03f1-467d-8870-1515cfe7461a)



<br>


-8 WHERE을 조회할때 조건 지정하기

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/3751c1ed-bebf-4695-9e38-4b6481d2662b)




<br>


-9 where시 and,or, orderby 활용.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/eaeb68d6-cc55-40a8-90fe-28acac2884e5)

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/8f8bc8b0-bf00-4824-9f81-edc4d47356d9)



<br>




  
