package oopExam;



public class ModifierExam {
    public static void main(String[] args) {
        
    }
}


/*
접근 제어자   public  >  protected  > (default) > private
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

    
접근 제어자   public  >  protected  > (default) > private

 private 
     같은 클래스 안에서만 접근이 가능하다.
 
 default 
     같은 패키지 내에서만 접근이 가능하다.

 protected 
     같은 패키지 내에서 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다.

 public 
     접근 제한이 전혀 없다.

 만약 매서드 하나를 변경해야 할 때, 이 매서드의 접근 제어자가 public 이라면
 매서드를 변경한 후에 오류가 없는지 테스트해야 하는 범위가 아주 크다.
 만약 default일 경우 패키지 내부에서만 접근이 가능하므로 그 패키지 내의 클래스들만 
 테스트할 수 있다. 
 private일 경우 해당 클래스만 확인해보면 된다.
 따라서 접근 제어자 하나로 상당한 차이를 만들 수 있으므로 접근 제어자를 적절하게 선택하여
 접근 범위 최소화를 위해 노력하자.

 
 생성자의 접근 제어자
 생성자에 접근 제어자를 사용하면 객체 생성을 제한할 수 있다.
 생성자에 private을 지정하면 외부에서 생성자에 접근할 수 없다. 클래스 내부에서만
 객체를 생성할 수 있다.


 

*/