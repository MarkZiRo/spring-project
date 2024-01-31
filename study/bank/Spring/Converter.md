## Converter

- 문자를 숫자로, 또는 ip번호를 문자로 , 다시 문자를ip번호로 바꿀때 사용되는게 Converter이다.
- 이를 편리하게도와주는게 ConversionService고 여기에 내가만든 converter를 등록할수도 있다.
- 뷰에서는 {{ }} 를 사용하거나 th:field를 사용할시 자동으로 컨버전이 된다.
  
<br>


### Formatter
- converter의 특별한 버전이라고 생각하면 좋고, 문자에 특화되었으며 + 현지화(Locale)가 가능하다.
- 다음은 스프링이 제공하는 기본 포맷터다.

<br>
  
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/19af2f2a-a964-4e04-902d-3568ceb9dade)
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/f732300b-d980-444a-a5a5-6c51a2388d2f)


<br>

### 주의

- HttpMessageConverter는 Http 메시지 바디의 내용을 객체로 변환하거나 객체를 Http 메시지 바디에 입력하는것이다.
- 따라서 json결과를 만들어지는 숫자나 날짜포맷을 변경하고 싶으면 해당 라이브러리가 제공하는 설정을 통해서 포맷을지정해야된다.


