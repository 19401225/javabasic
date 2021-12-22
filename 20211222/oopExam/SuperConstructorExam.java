package oopExam;


class Point {
    int x, y;

    Point() {                        // 부모 클래스에 생성자 하나를 만들어주면 Point3D클래스에서
                                     // 에러가 발생하지 않는다.
    }

    Point (int x, int y) {
        this.x = x;
        this.y = y;                    
    }
    String getLoc() { 
        return "x : " +x+", y = " + y;
    }

}
              // 부모 클래스에 생성자를 만들거나 혹은 자식 클래스에 super(매개변수)를 넣어줘야 
              // 자식 클래스에서 부모 클래스를 잘 호출할 수 있게 된다.
class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {  // 자동으로 Point클래스를 호출해서 진행하게 된다.
        // super(x, y);             // Point3D클래스 첫 줄에 생성자(부모)를 호출하는 문장이 없으면 에러가 난다.
        this.x = x;                 
        this.y = y;
        this.z = z;
    }
    String getLoc() {
        return "x = " +x+", y = " +y+", z = " + z;
    }

}





public class SuperConstructorExam {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
        System.out.println(p3.x);
        System.out.println(p3.y);
        System.out.println(p3.z);




    }   
}
/*
Point3D 클래스의 생성자에서 조상 클래스(Point)의 생성자인 Point()를 찾을 수 없다는 내용의 에러가 발생한다.
Point3D 클래스의 생성자의 첫 줄에 생성자(부모)를 호출하는 문장이 없기 때문에 자동적으로 
super();를 생성자의 첫 줄에 넣어준다. 
예) super(x, y);
혹은 부모 클래스에 생성자를 만들어주면 된다. 
예) Point() {}

*/