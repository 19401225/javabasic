package oopExam;

class Car2 {    // Car라는 클래스 생성
    String color;
    String gear;
    int door;

    Car2() {                      // 기본 생성자 
        this("white", "auto", 4); // this는 객체이름 곧 c1을 의미한다.
                                  // 밑으로 내려가게 된다.
    }
    Car2(String c, String g, int d) {   // 매개변수가 있는 생성자
        this.color = c;
        this.gear = g;
        this.door = d;
    }

}

public class carTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();    //  기본 생성자는 변수를 직접 설정해야 하는 수고가 있다.
       
       
        // c1.color = "white";
        // c1.gear = "auto";
        // c1.door = 2; 

        // Car2 c2 = new Car2("Black", "auto", 4);

        System.out.println("c1의 색상은 " + c1.color);   // c1의 색상은 white
        // System.out.println("c2의 색상은 " + c2.color);   // c2의 색상은 Black
        



    }
}
