# Spring Boot


### Spring Boot

<br>
- 스프링을 편리하게 사용하도록 지원!! 최근에는 거의 기본으로 사용하고있다.

<br>

### WAS

<br>

- jar에 필요한 라이브러리(WAS 포함)를 다 넣어서 FatJar를 만들었고 FatJar의 문제인
- jar 안에 jar파일을 못넣는 문제를 jar안에 jar를 포함시킬수 있도록 특별한 jar를 만들고,
-  a.jar b.jar식으로 클래스 중복문제 또한 해결하였다.
- 결국 WAS(Web Application Server): Tomcat를 포함하여 편리하게 배포가 가능하다!!

<br>

### 라이브러리 관리

- 스프링부트는 원하는 라이브러리만 고르면 스프링부트가 버전에 맞는 최적화된 라이브버젼을 선택해준다.
  
![image](https://github.com/MarkZiRo/spring-project/assets/37473857/b2f20b1b-8bf6-4074-807d-efa8e951058e)

- 이는 스프링부트가 필요한 관련 라이브러리를 제동하는 스프링부트 스타터를 제공하기 때문이다.
- 다만 자주쓰지 않는 라이브러리라면 버전까지 적어주어야 한다.

<br>

### 자동구성(Auto Configuration)

- 스프링부트는 일반적으로 자주 사용하는 수 많은 빈들을 등록해준다.
- https://docs.spring.io/spring-boot/docs/current/reference/html/auto-configuration-classes.html

- 내부를 열어보면 
<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/0518022b-f12d-4173-87ed-a833beb33a84)

<br>

- 이런식으로 되어있다. AutoConfiguration을 통해 자동으로 동록하게 하고, 실행순서는 after로 DataSourceAuto 다음으로 되어있다.
- ConditionalOnClass({~})를 통해 이런 클래스가 있는 경우에만 설정이 동작하도록 한다.
- Import를 통해 설정으로 사용할 대상을 설정한다. 또는 Import(ImportSelector)로 설정으로 사용할 대상을 동적으로 선택할수도 있다.
- @SpringBootApplication -> @EnableAutoConfiguration -> @Import(AutoConfigutaionImportSelector.class)
  
  -> resources/META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports 로 해당파일의 설정정보가 스프링 컨테이너에 등록되고 사용되는것을 볼수 있다.!


<br>


### 외부설정

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/c49cf58d-5adb-40c4-b6b1-1ba138a99bcf)

<br>

- 외부설정은 OS 환경변수, 자바 시스템속성, 커맨드 라인옵션인수(Main에서 args로 넘기기) 등이 있으나
- 사용하기가 번거로워 자주사용되는것은 PropertSource 설정데이터 파일이다.

<br>

  ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/7b279222-1dd4-453c-ba59-2d18dfe6cfa6)

  다음과 같이 사용하며 yaml 파일이 더 편리한거 같다!!

<br>

  ### 프로덕션

- implementation 'org.springframework.boot:spring-boot-starter-actuator' 을 실행하고

- yaml

    ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/5bec552c-c648-45b4-8f1d-127d16f02df5)

  <br>

  - 다음과 같이 설정하면 info, loggers, beans , env 등 여러가지 엔드 포인트를 볼수있다.
  - 이를 마이크로미터, 프로메테우스, 그라파나등을 통해 성능을 더 세세히 점검할수 있다.

  <br>

  ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/871177d9-c104-4696-83ae-816d9ef68f1a)


  
