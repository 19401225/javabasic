package oopExam;

public class InheriExam {
    public static void main(String[] args) {
        
    }
}



/*
상속
 기존의 클래스를 재사용하여 새로운 클래스를 만드는 것이다.
 상속을 사용하면 보다 적은 양의 코드로 새로운 클래스를 작성할 수 있다.
 공통적으로 관리할 수 있기 때문에 코드의 추가/변경 등이 매우 용이하다.

 이러한 특징은 코드의 재사용성을 높이고 코드의 중복을 제거하여
 프로그램의 생산성과 유지보수에 크게 기여하게 된다.

 조상 클래스 - 부모, 상위, 기반 클래스 라고 부른다.
 자손 클래스 - 자식, 하위, 파생 클래스 라고 부른다.
 부모 < 자식 

 class Parants {
    int money;
 }

 class Child extends Parents {   // Parents 를 상속받았기 때문에 Parants의 내용을 
    void play() {                  조건 없이 사용할 수 있다.
        System.out.println("야 놀자!");
     }                        
 }
 상속을 받는다는 것은 조상 클래스를 확장한다는 의미로 해석할 수 있다.
 그래서 상속을 받을 때 extends 키워드를 사용한다.
 단, 멤버들만 상속이 되고 생성자는 상속되지 않는다.
 자손 클래스는 항상 조상 클래스보다 멤버의 갯수가 많거나 같다.
 하나의 클래스를 부모로 둔 두 개의 각각 클래스들 사이에는 전혀 관계가 없다.

 자바에서의 상속은 단일 상속만 지원한다. single inheritance
 (상속 받는 클래스 각각의 매서드가 중복될 수 있어서 단일만 허용)
 c++, python 등의 언어에서는 다중 상속을 지원하고 있다.

    class AllTv extend CaptionTv, VodTv,ThreeDTv {}   // 다중 상속





*/