<<<<<<< HEAD
package oopExam;

public class VariableExam {
    public static void main(String[] args) {
// 인스턴스 변수 즉 객체 변수는 객체가 생성될 때마다 함께 생성되므로
// 객체마다 각기 다른 값을 유지할 수 있다. 반면 클래스 변수는 모든 객체들이
// 하나의 저장 공간을 공유한다. 따라서 항상 같은 공통된 값을 갖는다.


        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", "+ c1.number);
        System.out.println("c2는 " + c2.kind + ", "+ c2.number);

        c1.width = 50;
        c1.height = 150;

        System.out.println("- 클래스변수 출력 -");
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        System.out.println("C2 변수 출력-");
        System.out.println("C2.width = " + c2.width);

        System.out.println("c1.width = " + c1.width);
        System.out.println("c1.height = " + c1.height);

    }
}
class Card {
    String kind;      // 객체변수
    int number;       // 객체변수
    static int width = 100;      // 클래스변수
    static int height = 250;     // 클래스변수
}



/*
선언 위치에 따른 변수의 종류
  클래스 변수 class cariable
  인스턴스(객체)변수 instance variable
  지역변수 local variable

  static이 붙은 변수는 클래스 변수,  static이 붙지 않으면 객체 변수

  class x {
           int iv;  객체변수
    static int cv;  클래스변수(공유변수)
  }







=======
package oopExam;

public class VariableExam {
    public static void main(String[] args) {
// 인스턴스 변수 즉 객체 변수는 객체가 생성될 때마다 함께 생성되므로
// 객체마다 각기 다른 값을 유지할 수 있다. 반면 클래스 변수는 모든 객체들이
// 하나의 저장 공간을 공유한다. 따라서 항상 같은 공통된 값을 갖는다.


        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", "+ c1.number);
        System.out.println("c2는 " + c2.kind + ", "+ c2.number);

        c1.width = 50;
        c1.height = 150;

        System.out.println("- 클래스변수 출력 -");
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        System.out.println("C2 변수 출력-");
        System.out.println("C2.width = " + c2.width);

        System.out.println("c1.width = " + c1.width);
        System.out.println("c1.height = " + c1.height);

    }
}
class Card {
    String kind;      // 객체변수
    int number;       // 객체변수
    static int width = 100;      // 클래스변수
    static int height = 250;     // 클래스변수
}



/*
선언 위치에 따른 변수의 종류
  클래스 변수 class cariable
  인스턴스(객체)변수 instance variable
  지역변수 local variable

  static이 붙은 변수는 클래스 변수,  static이 붙지 않으면 객체 변수

  class x {
           int iv;  객체변수
    static int cv;  클래스변수(공유변수)
  }







>>>>>>> 4801aee843c0fa98041e93d513809646248e636a
*/