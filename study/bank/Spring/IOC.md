## Ioc(Inversion of Control)
- AppConfig는 애플리케이션의 전체 동작 방식을 구성(Config)하기 위해, 구현 객체를 생성하고, 연결하는 역할을 합니다.
- 따라서 어떤 정책을 변경해도 AppConfig의 구성 영역만 변경하면되기때문에 클라이언트 코드를 바꾸지 않아도 됩니다.
- 이렇듯 프로그램의 제어흐름을 직접제어하는것이 아닌 외부에서 관리하는것을 제어의 역전(IOC)라고 합니다.

  
<br>


### 의존관계 주입 DI(Dependency Injection)
- 애플리케이션 실행시점(런타임)에 외부에서 실제 구현객체를 생성하고 클라이언트에 전달해서 클라이언트와 서버가 다로 실제 의존관계가 되는것을 의존관계주입 이라 한다.
- 의존관계주입을 사용하면 클라이언트 코드를 변경하지않고, 클라이언트가 호출하는 대상의 타입 인스턴스를 변경할 수 있다.
- 이처럼 AppConfig처럼 객체를 생성하고 관리하면서 의존관계를 연결해주는것을 IOC컨테이너 또는 DI컨테이너라고 한다. 

<br>

### spring에서 사용
spring에서 사용시 아래 그림과 같다. 스프링에서는 이제 스프링컨테이너가 이 역할을 대신한다.

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/a6215000-0448-444f-a9ad-54af97eee4ff)

<br>

![image](https://github.com/MarkZiRo/spring-project/assets/37473857/c49e5208-c042-460b-b1c6-a68b2b2abdd8)

<b>
  
  ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/b4c8d37d-6c5b-4d94-8cad-31fa5fb75afc)


- ApplicationContext를 스프링컨테이너라 하며 인터페이스 입니다. 스프링 컨테이너는 설정 정보를 참고해 의존관계를 주입(DI)합니다.
- 등록된 Bean은 컨테이너가 관리합니다. @Bean(name = "이름) 이런식으로 빈이름을 부여할수도 있습니다.
- 


<br>

### LSP(Liskov substitution principle)
- 상위 타입의 객체를 하위 타입의 객체로 치환해도 상위 타입을 사용하는 프로그램은 정상 작동 해야한다.
- 다형성에서 하위 클래스는 인터페이스 규약을 다 지켜야 한다. 

<br>
