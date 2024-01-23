
##  JOIN절
- 일반적으로 데이터베이스 테이블에서 관계는 외래키를 통해 표현한다.
 왼쪽 테이블의 제조사 ID는 오른쪽 테이블의 ID를 의미합니다. 자신의 테이블이 아닌 테이블의 Key(외래키 Foreign Key)가 된다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/5bb8424c-a016-4a2d-bc41-ceb81cf15b9a)

<br>

### 1:1 One to One 관계
- 한 테이블의 레코드 하나가 다른 테이블의 레코드 하나와 연관된 관계
- 특정 데이터를 성능 또는 보안적 측면에서 나눌 때 사용

### N:1, Many to One 관계
- 한 테이블의 레코드 0개 이상이 다른 테이블의 레코드 하나와 연관된 관계
- 일반적인 데이터베이스의 가장 흔한 관계 (게시글 - 댓글 , 가게 - 상품 등)

### M:N, Many to Many 관계
- 한 테이블의 레코드 0개 이상이 다른 테이블의 레코드 0개 이상과 연관된 관계
- 양쪽 테이블의 PK를 Foreign Key 로 가진 Join Table, Associative Table 활용


<br>

### JOIN

- 아래와 같이 조인할수 있다.!
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/0cf57e66-75c3-4e4e-be4c-89e64997022d)

<br>

#### Cross Join
- 1명의 학생당 교수 모두 조합하여 모든 경우의 수가 출력된다.
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/0ec664f4-9050-4d1f-9c9a-ee8d6f265e06)


<br>


#### Inner Join
- 2개의 테이블을 합쳐서 보고싶을때 ON절의 조건을 기준으로 join
- 고유키와 외래키를 확인하여 값을 가져와 테이블을 합친다.
  
 ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/62ab8d34-85a8-4cb4-bb16-9a83e9d8250c)

<br>

- inner join은 정보가 일치하지 않는 경우 가져오지 않아 한쪽에만 존재하는 정보의 경우 볼수 없다는 단점이 있다.
- 이런식으로 일치하는 정보만 출력한다.
  
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/d72a1dbe-bc50-4902-9307-436ce36ad875)


<br>


#### Outer Join
- 전부다 보고싶다면 outer join!.
- 전부 가져올수 있고 null이더라도 왼쪽을 기준으로 가져올수 있다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/84593721-febb-4de3-884c-96411cfe63c4)

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/c67047aa-6141-43fd-b38f-404571e50036)


<br>


