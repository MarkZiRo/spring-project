# 

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/b3570b29-7d8d-491a-9145-778919b44910)


 HandlerInterceptror : Spring Framework의 일부분으로 DeispatcherServlet이 Handler Method로 요청을 넘기기전에 실행하는 요소로
                      보통 Interceptro라고 부릅니다.

 Filter : Servlet에 도달하기전에 요청을 검사할수 있습니다. 


 


### Filter

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/7df5f221-60b2-4b25-8c3b-04da9609a1d1)


필터에서 다음과 같이 만들어서 doFilter를 통해서 필터가 있으면 호출합니다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/23c98902-ff12-4ae5-ae95-5e297764e961)

그다음 WebConfig를 통해서 FilterRegistrationBean을 통해 등록될 필터를 정하고 체인순서를 정한뒤 적용할 패턴을 정해줍니다.


![image](https://github.com/MarkZiRo/spring-project/assets/37473857/9770c1f1-cef8-48c0-ad6d-95b24a2cf91c)


![image](https://github.com/MarkZiRo/spring-project/assets/37473857/b4739fbd-42e2-45f9-a7c8-7db998359f4e)

다음과 같이 만들어 whitelist를 통해 인증과 무관하게 항상허용하며 화이트리스트를 제외한경우 체크로직을 적용하고 미인증 사용자는 리다이렉트를 해버립니다.
그리고 return을 통해 미인증사용자는 다음을 진행하지 않습니다.


<br>


<br>

### Interceptror

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/7dd9a049-3a56-45a4-8ad6-0af3275c17c5)

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/21c6a0f9-2c4b-45a4-bff1-6baa2bbeda81)

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/784f7095-dd05-43b1-921a-5510de47cfc0)


![image](https://github.com/MarkZiRo/spring-project/assets/37473857/5250d6c3-c391-4700-afbd-1afabccf11e3)

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/869bbe5c-a429-4bde-9638-e2f8d795f1f9)


다음과 같이 HandlerInterceptor를 상속받아 preHandle, postHandle, afterCompletion를 만든뒤 Config를 통해 실행하게 만듭니다.





