![image](https://github.com/MarkZiRo/spring-project/assets/37473857/6369bd8f-5a00-4d5b-baac-48a3afcaf6fe)


일대일, 일대다, 다대일, 다대다 거기에 상속과 embed까지 다 사용할수있도록 테이블설계를 해보았습니다.
상속관계 매핑에서 사용할수있는 3가지중 
부모클래스의 속성을 모든 자식클래스에 때려넣어 성능이 느린 class_per_table을 제외하고
joined와 single_table중에 single_table을 사용해보았습니다.




