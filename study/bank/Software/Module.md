# 모듈

<br>

## 모듈이란?

<br>

- 모듈은 모듈화를 통해 분리된 시스템의 각 기능들로, 서브루틴, 서브시스템, 소프트웨어 내의 프로그램, 작업 단위 등과 같은 의미로 사용된다.
 
  모듈의 독립성은 결합도와 응집도에의 해 측정되며, 독립성을 높이려면 모듈의 결합도는 약하게, 응집도는 강하게, 모듈의 크기는 작게 만들어야 한다.

<br>

### 결합도(Coupling)

- 결합도는 두 모듈의 상호의존하는 정도, 연관 관계를 의미한다.
- 결합도가 강하면 시스템 규현 및 유지보수 작업이 어렵다. 결합도가 약할수록 품질이 높고 강할수록 낮다. 아래로 갈수록 결합도가 강하다.

<br>

- 자료 결합도     모듈간의 인터페이스가 자료요소로만 구성될때의 결합도
- 스탬프 결합도   모듈간의 인터페이스로 배열이나 레코드등의 자료구조가 전달될때의 결합도
- 제어 결합도     어떤 모듈이 다른 모듈내부의 논리적인 흐름을 제어하기 위해 제어 신호를 이용하여 통신하거나 제어요소를 전달하는 결합도
- 외부 결합도     어떤 모듈에서 선언한 데이터를 외부의 다른 모듈에서 참조할때의 결합도
- 공통 결합도     공유되는 공통 데이터 영역을 여러 모듈이 사용할때의 결합도
- 내용 결합도     한 모듈이 다른 모듈의 내부기능및 그 내부 자료를 직접 참조하거나 수정할때의 결합

<br>

## 응집도(Cohesion)

<br>

- 응집도는 정보은닉개념을 확장한것으로, 명령어나 호출문등 모듈의 내부요소들의 서로 관련되어 있는정도, 즉 모듈이 독립적인 기능으로 정의되어 있는 정도를 의미한다.
- 아래로 갈수록 응집도가 강하다.

<br>

- 우연적 응집도   모듈 내부의 각 구성요소들이 서로 관련없는 요소로만 구성됬을때의 응집도
- 논리적 응집도   유사한 성격을 갖거나 특정 형태로 분류되는 처리 요소들로 하나의 모듈이 형성되는 경우의 응집도
- 시간적 응집도   특정 시간에 처리되는 몇개의 기능을 모아 하나의 모듈로 작성할때의 응집도
- 절차적 응집도   모듈이 다수의 관련기능을 가질때 모듈안의 구성요소들이 그 기능을 순차적으로 수행할 경우의 응집도
- 교환적 응집도   동일한 입력과 출력을 사용하여 서로 다른 기능을 수행하는 구성요소들의 응집
- 순차적 응집도   모듈내 하나의 활동으로 부터 나온 출력 데이터를 그 다음 활동의 입력데이터로 사용할 경우의 응집도
- 기능적 응집도   모듈 내부의 모든 기능요소들이 단일 문제와 연관되어 수행될 경우의 응ㅈ비
- Strategy 동일한 계열의 알고리즘을 개별적으로 캡슐화하여 상호 교환할수 잇도록 정의하는 패턴
- Template Method 상위클래스에서 골격을 정의하고 하위클래스에서 세부 처리를 구체화하는 패턴
- Visitor 각 클래스들의 데이터 구조에서 처리기능을 분리하여 별도의 클래스로 구성하는 패턴

<br>