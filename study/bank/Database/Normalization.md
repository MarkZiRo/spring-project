
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
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/3dc2b6e3-3191-40eb-b7f5-2d6987902c8d)



<br>

-별도의 테이블에서 관리하기 시작하면 제1정규형 테이블이 2개

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/0afee676-863b-4645-96fe-351587c07dac)




<br>


-데이터를 좀더 추가해서 아래와 같다면

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/e74fe7d2-82b7-4b49-b9b4-d60e6375d271)





<br>

- 기본키에 종속되지 않는 칼럼은 테이블에서 분리되어야 한다.(제2정규형)
  
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/757e8898-bfad-42f2-b596-63e1bfe7ac57)






<br>

- 여기서는 키본키가 아닌 다른 속성에 종속성을 갖는 칼럼은 별도로 분리해야 한다.(제3정규형)
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/1b975a0b-756b-478e-80cd-dad1ba4227b6)






<br>


- 제조사 국적은 상품자체가 아닌 제조사와 종속적인 관계이기 때문이다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/2c6b196b-5e4c-4970-9753-af2f93a4cd14)






<br>




