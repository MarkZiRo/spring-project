
## Normalization (정규화)

- 테이블간 중복된 데이터를 허용하지 않는것이 주 목표이다.
- 중복된 데이터를 만들지 않아 무결성을 유지하고, DB 저장 용량 또한 효율적으로 관리 할 수 있다.
- 데이터베이스의 테이블에 담기는 데이터를 적절하게 나누어 구조화 하는것으로
- 학문적의미론 제 6정규형까지 존재하지만 실제에서는 제3정규형이 정규화 기준이다.


<br>


### 정규형

- 초기 데이터 - 기본적으로 각 레코드가 중복되지 않은, 정규화가 전혀 진행되지 않은 상태
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/a12df306-72fc-490b-ba66-e330792457e1)

<br>
  
- 제1 정규형은 하나의 컬럼이 복수의 데이터를 가지고 있지 않아야 한다. 
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/d3b814f2-c959-469d-b8da-f1f7309f232d)


<br>

-별도의 테이블에서 관리하기 시작하면 제1정규형 테이블이 2개
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/b323bcb6-2332-4091-b313-6c5d2207d068)



<br>
