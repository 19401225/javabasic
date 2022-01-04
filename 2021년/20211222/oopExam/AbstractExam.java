package oopExam;

public class AbstractExam {
    public static void main(String[] args) {
        
    }
}
/*
추상 클래스 abstract class '미완성의...' 라는 의미를 가진다.
 매서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상 매서드를 선언하는데 사용된다.
 추상 클래스는 인터페이스의 기능과 일반 클래스의 기능을 복합적으로 가지고 있다.
 일반 클래스에 더 가까우나 객체를 생성하지는 못한다.




















*/











/*
접근 제어자   public   protected   (default)   private
     제어자   static  final  abstract....


 접근 제어자는 한 번에 네 가지 중 하나만 선택하여 사용할 수 있다. (중복을 허용하지 않음)
 
    static  
        '클래스의 ...', '공통적인....'   이러한 의미를 가진다.
         객체 변수는 객체들마다 고유한 값을 따로 유지하지만 static은 객체와 관계 없이
         같은 값을 유지한다. 즉, 하나의 변수를 모든 객체가 공유한다.

    final 
         '마지막의...', '변경될 수 없는...' 이러한 의미를 가진다.
         final을 선언하여 변수를 만들면 그 값을 변경할 수 없는 상수가 된다.
         final을 선언하여 매서드를 만들면 오버라이딩을 할 수 없게 된다.
         final을 선언하여 클래스를 만들면 상속을 허용하지 않는 클래스가 된다. (와!)

         final class FinalTest {         // 조상이 될 수 없는 클래스
             final int MAX_SIZE = 10;    // 값을 변경할 수 없는 변수, 즉 상수
             final void getMaxSize() {   // 오버라이딩 금지 매서드

             }
            }

     abstract (추상 클래스 혹은 추상 매서드)








*/