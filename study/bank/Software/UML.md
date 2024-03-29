# UML

<br>

## DFD(Data Flow Diagram)

<br>

-  요구사항 분석에서 자료의 흐름 및 변환 과정과 기능을 기능과 도형중심으로 기술하는 방법.

<br>

   ![image](https://github.com/MarkZiRo/spring-project/assets/37473857/3195ed3f-ba25-494d-b0bb-1d512c138c61)


<br>


## UML(Unified Modeling Language)

<br>

- UML은 시스템 분석, 설계, 구현등 시스템 개발 과정에서 시스템 개발자와 고객 또는 개발자 상호간의 의사소통이 원활하게 이루어지도록 표준화한 대표적은 객체지향 모델링 언어이다.
  사물(Things), 관계(Relationships), 다이어그램(Diagram) 등이 있다.

<br>

## 사물,관계,다이어그램

<br>

- 사물은 구조 사물(Structural Things), 행동 사물(Behavioral Things), 그룹 사물(Grouping Things), 주해 사물(Annotation Things)등이 있다.
- 다이어그램은 구조적 다이어그램(Structural) 과 행위(Behavioral) 다이어그램으로 나뉜다.

- 클래스 다이어그램(클래스와 클래스가 가지는속성과 관계를 표현, 시스템의 구조를 파악하고 구조상의 문제점을 도출) Class

  클래스가 수행할수 있는동작 함수(Method) 또는 Operation 이라고 한다.
  
- 객체 다이어그램(객체와 객체사이의 관계로 표현, 럼바우 객체지향분석기법에서 객체 모델링에 활용) Object
- 컴포넌트 다이어그램(컴포넌트간의 인퍼페이스를 표현, 구현단계에서 사용) Component
- 배치 다이어그램(결과물, 프로세스, 컴포넌트등 물리적 요소의 위치를 표현, 구현단계에서사용) Deployment
- 복합체 구조 다이어그램(복합구조를 갖는 경우 내부 구조를 표현) Composite Structure Diagram
- 패키지 다이어그램(유스케이스나 클래스등의 모델 요소들을 그룹화한 패키지의 관계를 표현) Package

<br>

- 유스케이스 다이어그램(사용자의 구조를 분석한것으로 기능 모델링에 사용된다) Use case
 
  액터 : 시스템과 상호작용을 하는 모든 외부 요소로, 사람이나 외부 시스템을 의미함.
  특정 조건에 부합되어 기능이 확장될때 서로 확장 관계이다.
   
- 순차 다이어그램(상호작용하는 시스템이나 객체들이 주고받는 메시지 표현) Sequence

   시스템이나 객채들이 메시지를 주고 받으며 시간의 흐름에 따라 상효작용한것을 그림으로 표현하며, 주고받는 메시지를 표현한다.
  수직방향은 시간의 흐름을 표현한다.
  
- 커뮤니케이션 다이어그램(메시지뿐만아니라 객체들간의 연관까지 표현)Communication
- 상태 다이어그램(이벤트에 의한 객체들의 상태변화를 그림으로 표현, 럼바우 객체지향 분석기법에서 동적 모델링에 활용) State
- 활동 다이어그램(객체의 처리로직이나 조건에 따른 처리의 흐름을 순서에 따라 표현한다.) Acitivity
- 상호작용 개요 다이어그램(제어흐름을 표현) Interaction Overview
- 타이밍 다이어그램(시간 제약을 포현) Timing
  
<br>


## 관계

<br>

- Dependency(의존) 관계
  연관 관계와 같이 사물사이에 서로 연관은 있으나 필요에 의해 서로에게 짧은 시간동안만 여관을 유지하는 관계

- 실체화(Realization) 관계
  사물이 할 수 있거나 해야하는 기능으로 서로를 그룹화 할수 있는 관계를 표현
  한 사물이 다른 사물에게 오퍼레이션을 수행하도록 지정하는 의미적 관계

- 일반화(Generalization) 관계
  하나의 사물이 다른사물에 비해 더 일반적인지 구체적인지를 표현

<br>


## 스트레오 타입(Stereotype)

<br>

- UML에서 추가적인 기능을 표현
- 길러멧(Guilemet)라고 부르는 << >> 에 표현할 형태를 기술.

<br>
