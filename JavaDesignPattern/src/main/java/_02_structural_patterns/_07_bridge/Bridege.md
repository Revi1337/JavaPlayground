### 브릿지 패턴

* 어댑터패턴이 상이한 Interface 를 연결하는 것이 목적이라면, Bridge 패턴은
`추상적인 것`과 `구체적인 것`을 분리하여 `연결`하는 것이 목적인 패턴이다.
  (즉, 상속이 아닌, Composition 을 사용한다.)
* 하나의 계층 구조일 때보다 각기 나누었을 때 독립적인 계층 구조로 발전 시킬 수 있다.

#### 장점

* 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장할 수 있다. (OCP)
* 추상적인 코드와 구체적인 코드를 분리할 수 있다. (SRP)

#### 단점

* 계층 구조가 늘어나 복잡도가 증가할 수 있다.
