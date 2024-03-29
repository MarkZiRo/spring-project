# 객체지향의 5가지 원칙

<br>

## 생성 패턴(Creational Pattern)

<br>

- 추상팩토리(Abstract Factory) 인터페이스를 통해서 서로 연관, 의존하는 개체들의 그룹으로 추상적으로 표현한다.
- 빌더(Builder) 작게 분리된 인스턴스를 건축하듯이 조합하여 객체를 생성한다.
- 팩토리 메소드(Factory Method) 객체생성을 서브클래스에서 처리하도록 분리하여 캡슐화된 패턴. 상위클래스에서 인퍼페이스만 존재하고 실제 생성은 서브클래스가 담당. Virtual Constructor
- Prototype 원본 객체를 복제하는 방법으로 객체를 생성.
- Singleton 하나뿐인 객체를 생성해 어디서든 참조할수 있지만 여러프로세스가 동시에 참조할수는 없다.

<br>

## 구조 패턴(Structural Pattern)

<br>

- Adapter 호환성이 없는 클래스들의 인터페이스를 다른 클래스가 이용할수 있도록 변환해주는 패턴
- Bridge 구현부에서 추상층을 분리하여 서로가 독릭적으로 확장할수 있도록 구성한 패턴. 기능과 구현을 두개의 별도 클래스로 분리
- Composite 여러객체를 가진 복합 객체와 단일 객체를 구분 없이 다루고자 할때 사용하는 패턴.
- Decorator 객체간의 결합을 통해 능동적으로 기능을 확장할수 있는 패턴.
- Facade 서브클래스 사이의 통합인터페이스 Wrapper 객체가 필요
- FlyWeight 인퍼테이스를 공유해서 사용
- Proxy 접근이 어려운 객체와 여기에 연결하려는 객체사이에서 인터페이스 역할을 수행하는 패턴.

<br>

## 행위 패턴(Behavioral Pattern)

<br>

- Chain of Responsibility 요청을 처리하는 객체가 둘이상 존재하여 하나가 해결하지못하면 다음 객체로 넘어감.
- Command 요청을 객체의 형태로 캡슐화하여 재이용하거나 취소할수 있도록 요청에 필요한 정보를 저장하거나 로그에 남기는 패턴
- Interpreter 언어에 문법 표현을 정의하는 패턴
- Iterator 자료구조와 같이 접근이 잦은 객체에 동일한 인터페이스를 사용하도록 하는 패턴
- Mediator 수 많은 객체들간의 복잡한 상호작용을 캡슐화하여 객체로 정의하는 패턴
- Memento ctrl+z 같은 기능으로 객체를 해당시점의 상태로 되돌릴때 사용하는 패턴
- Observer 한 객체의 상채가 변화하면 객체에 상속되어 있는 다른객체에게 변화된 상태를 전달하는 패턴
- State 객체의 상태에 따라 동일한 동작을 다르게 처리할때 사용되는 패턴
- Strategy 동일한 계열의 알고리즘을 개별적으로 캡슐화하여 상호 교환할수 잇도록 정의하는 패턴
- Template Method 상위클래스에서 골격을 정의하고 하위클래스에서 세부 처리를 구체화하는 패턴
- Visitor 각 클래스들의 데이터 구조에서 처리기능을 분리하여 별도의 클래스로 구성하는 패턴

<br>
