package oopExam;

public class constructorExam {
    
}
/*
생성자 Constructor 
 생성자는 객체가 생성될 때 자동으로 제일 먼저 호출되는 '초기화 매서드'
 따라서 객체 변수의 초기화 작업에 주로 사용된다.
 웹 개발에서도 게시물이나 사용자 정보들을 데이터베이스에서 가져와서 
 생성자를 통해 객체로 만들어 사용된다.
 생성자도 결국 매서드이므로 오버로딩이 사용된다.

 1. 클래스명과 동일한 이름을 사용한다.
 2. 리턴형도 없고 리턴도 없다.
 
 기본 생성자 default constructor
     생성자를 모르고도 클래스를 통해 객체를 생성해왔지만 
     사실 모든 클래스에는 반드시 하나 이상의 생성자가 정의되어야만 한다.
     그러나 생성자를 정의하지 않고서도 사용할 수 있었던 이유는 기본 생성자 덕분이다.

     생성자가 하나도 정의되지 않은 경우에는 자바가 자동으로 기본 생성자를 추가하기 때문에
     문제가 발생하지 않은 것이다.

     기본 생성자는 매개변수도 없고 아무런 내용도 없고 리턴도 없는
     아주 간단한 생성자를 말한다. 즉, 이름뿐인 아무 것도 없는 생성자를
     기본 생성자라고 한다.

     class Car {
        Car() { // 기본 생성자 

         }
     }

 매개변수가 있는 생성자 

     class Car {
        Car() {    // 기본 생성자 

         }
     }  Car(String a, String b) {   // 매개변수가 있는 생성자 (같은 이름)
            color = a;
            door = c;
     }
아무 것도 없이 호출할 때는 기본 생성자로
매개변수를 입력하면 그에 맞는 생성자를 호출한다.


 생성자에서 다른 생성자 호출
      생성자의 이름으로 클래스 이름 대신 this를 사용한다.
      한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.




*/
