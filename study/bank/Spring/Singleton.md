# Singleton

### Singloeton Pattern
- 클래스의 인스턴스가 딱 1개만 생성하는것을 보장하는 디자인 패턴이다.
- 스프링 컨테이너는 객체 인스턴스를 싱글톤으로 관리한다.(@Configuration을 붙이면)
- 이로인해 서비스를 요청될때마다 객체를 생성하는것이 아니라, 이미 만들어진 객체를 공유해서 효율적으로 사용할수 있다.
- 따라서 특정 클라이언트가 값을 변경할수 있는 필드가 있으면 안되며, 가급적으로 읽기만 해야된다.

<br>

### @ComponentScan
- @Componentscan은 @Component가 있다면 @Bean없이 자동으로 스프링빈을 등록하게 해주는 기능이 있다.
- 또 의존관계주입도 자동으로 해주는 @Autowired도 제공한다.
- 기본적으로 스프링부트 시작인 @SpringBootApplication에 @ComponentScan이 들어있다.!
- 또한 @ComponentScan(basePackages= "hello.core") 이런식으로 시작탐색위치를 지정해줄수도 있고
- 지정해주지 않는다면 @ComponentScan이 붙은 설정 정보 클래스패키지가 시작위치가 된다.
- 이 패키지를 기준으로 하위패키지를 모두 탐색하기때문에 프로젝트 최상단에 두면 편리하다!
- includeFilters, exculureFilters 를 활용하여 스프링빈에 등록하지 않을지도 결정할 수 있다.
- @Controller, @Service, @Repository, @Configuration 을 들어가서보면 모두 @Component가 있다.! 


<br>



### DIP(Dependency Inversion)
- 추상화에 의존해야지 , 구체화에 의존하면 안된다는 이야기. 
- 즉 인터페이스에 의존해야지, 구현체에 의존하게되면 변경이 어려워진다.

<br>
