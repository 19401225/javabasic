<<<<<<< HEAD
package oopExam;

class Car {    // Car라는 클래스 생성
    String color;
    String gear;
    int door;

    Car() {                            // 기본 생성자 

    }
    Car(String c, String g, int d) {   // 매개변수가 있는 생성자
        color = c;
        gear = g;
        door = d;
    }

}

public class carTest {
    public static void main(String[] args) {
        Car c1 = new Car();    //  기본 생성자는 변수를 직접 설정해야 하는 수고가 있다.
        c1.color = "white";
        c1.gear = "auto";
        c1.door = 2; 

        Car c2 = new Car("Black", "auto", 4);

        System.out.println("c1의 색상은 " + c1.color);   // c1의 색상은 white
        System.out.println("c2의 색상은 " + c2.color);   // c2의 색상은 Black
        



    }
}
=======
package oopExam;

class Car {    // Car라는 클래스 생성
    String color;
    String gear;
    int door;

    Car() {                            // 기본 생성자 

    }
    Car(String c, String g, int d) {   // 매개변수가 있는 생성자
        color = c;
        gear = g;
        door = d;
    }

}

public class carTest {
    public static void main(String[] args) {
        Car c1 = new Car();    //  기본 생성자는 변수를 직접 설정해야 하는 수고가 있다.
        c1.color = "white";
        c1.gear = "auto";
        c1.door = 2; 

        Car c2 = new Car("Black", "auto", 4);

        System.out.println("c1의 색상은 " + c1.color);   // c1의 색상은 white
        System.out.println("c2의 색상은 " + c2.color);   // c2의 색상은 Black
        



    }
}
>>>>>>> 4801aee843c0fa98041e93d513809646248e636a
