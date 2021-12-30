package oopExam;

class Parents {
    int x = 10;
}


class Child extends Parents {   // Parents클래스를 상속받은 Child 클래스

    int x = 20;
    void method() {
        System.out.println("x = " + x);                 // (자식(자신)을 통해)
        System.out.println("this.x = " + this.x);       // this는 객체를 의미(자식(자신)을 통해)
        System.out.println("super.x = " + super.x);     // super는 부모를 의미(부모 클래스에서 직접)
    }
}

public class SuperExam {
    public static void main(String[] args) {
        // super와 this는 static에서는 사용할 수 없다.
        Child c = new Child();
        c.method();  // method() 매서드를 호출하였다.


    }
}
