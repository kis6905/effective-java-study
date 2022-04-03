# Effective Java 스터디

## 회고
### 유용한 Item 3가지
- Item 17. 변경 가능성을 최소화하라  
  어렵지 않지만 여러 장점이 있는데 평소에 이렇게 사용하지 않고 있었음. 앞으로 잘 사용할것 같다.
- Item 31. 한정적 와이들카드를 사용해 API 유연성을 높이라  
  처음알게된 내용들이 있어 유용했음.
  - 공변성, 불공변성
  - 펙스(PECS): producer-extends, consumer-super  
    매겨변수화 타입 T가 생산자(read only)라면 <? extends T> 를 사용, 소비자(수정)라면 <? super T>를 사용
- Item 76. 가능한 한 실패 원자적으로 만들라  
  클래스와 메소드를 만들때 validation 과 예외 처리를 좀 더 주의해서 해야겠다고 느낌.  
