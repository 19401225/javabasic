<<<<<<< HEAD
package src.JavaInter.variableExam;

public class VariableExam {
    public static void main(String[] args) {







        

/*
        
        // String url = "www.naver.com";
        // float f1 = .10f;     // .10은 소숫점 10자리까지 float
        // float f2 = 3.14e3f;
        // double d = 1.23456789;

        // System.out.printf("f1 : %f%n", f1);
        // System.out.printf("f2 : %f%n", f2);
        // System.out.printf("d : %14.2f%n", d);     //%14.2f  은 float 소숫점 아래 2자리까지
        //                                           // 14. 는 총 자릿수14에서 오른쪽(기본) 정렬
        // System.out.printf("Address : %s%n", url);
        // System.out.printf("%.8s%n", url);   // .8s 는 문자열 인덱스값 8까지
        // System.out.printf("%10.8s%n", url);  // 10. 은 총 자릿수10에서 오른쪽(기본) 정렬  
        // System.out.printf("%-10.8s%n", url); // -10. 은 총 자릿수10에서 왼쪽 정렬

 변수와 함께 많이 사용되는 printf()
   지금까지는 println()만 사용했지만 println()은 변수 값을 그대로 출력하므로
   다른 형태로 출력하기가 힘들다. 예를 들면 소수 2자리까지만 출력...
   printf 는 println과 달리 줄바꿈을 하지 않는다. 
   줄바꿈을 할 때는 %n을 넣는다.
   %d  decimal 10진수 즉 숫자 출력
   %s  String 문자열 출력
   %f  float 실수 출력
   %c  char  문자 출력
 
    int age = 14;
    int year = 2021;
    System.out.printf("age:%d", age);
    System.out.printf("age:%d", age);
    System.out.printf("age:%d, year:%d", age, year);
    System.out.printf("age:%d%n, year:%d", age, year); 



*/










/*
 변수 타입
   주로 사용하는 값은 크게 문자(문자열,문자)와 숫자(정수,실수)
   값(data)의 종류(type)에 따라서 저장될 공간의 크기와 형식을 정하는 것이 자료형
   자료형은 크게 기본형과 참조형이 있다.

   기본형(primitive type) - 실제 값이 저장 (총 8가지)
    - 논리 boolean,  문자 char,  정수 int,long,byte,short  실수 double,float ...

   참조형(reference type) - 실제 값이 저장되어 있는 주소값을 저장
    - 기본형을 제외한 모든 것 (String, )
    

   기본형
     논리형 boolean : true or false, 조건식, 논리 계산(if) ...에 사용
     문자형 char : 변수 하나에 한 글자만 저장 (내부적으로는 숫자 정수로 저장된다. ascII)   
     정수형 int long (byte short) : 주로 int가 사용된다.
     실수형 double float :  주로 double이 사용된다.

     int              -2,147,483,648 ~             2,147,483,647 (이 크기만큼의 공간을 사용한다.)
     long -9,223,372,036,845,775,808 ~ 9,223,372,036,845,775,807



 # 상수 constant 
     변수와 마찬가지로 값을 저장할 수 있는 공간인 변수와는 달리 한 번 값을 저장하면 
     변경하지 않고 사용한다. 선언하는 방법도 변수와 동일하지만 final을 붙여서 상수를 나타낸다.
     암묵적인 관례이지만, 상수명은 대문자로 표기한다.
        final int MAX_SPEED = 100;    // 상수를 final로 선언하면 구조적으로 변경 불가능
              int MAX_SPEED = 100;    // 변경하지 않고 그냥 쓰기도 한다.

     상수 선언은 반드시 선언과 동시에 초기화 해야만 한다. 
        final int MIN_SPEED;       이렇게는 안된다. 무언가 값을 입력해줘야 한다.
                  MIN_SPEED = 30;  상수의 값은 변경할 수 없다. 
    

                  
    int i = 'A';       // 에러가 날 거 같지만 사실 그렇지는 않다.
                       // 문자 'A'의 코드 값(ascII)이 저장된다.
    long l = 123;      // int의 크기보다 long의 크기가 더 크다. 에러가 나지 않는다.
    double d = 3.14F;  // double의 크기가 float보다 더 크다. 에러가 나지 않는다.
    float f = 3.14;    // F를 생략하면 double이 된다. 크기와 상관 없이 double은 float에 넣을 수 없다.          
    int i = 32194032489301254319804321L;   // long을 int에 넣을 수는 없다.
    

*/







        // int curPos = 0;   // 현재 위치 current position을 의미
        // int lastPos = -1; // 마지막 위치 last position을 의미
      
    //     * 변수 선언 규칙 (반드시)
    //     1. 대소문자를 구분하며 길이에는 제한이 없다.
    //     2. 예약어를 사용할 수 없다. (println..)
    //     3. 숫자로 시작할 수 없다. (중간에 넣을 수는 있지만, top10은 가능함)
    //     4. 특수문자는 '_', '$' 만 허용한다.
     
    //   *. 클래스명의 첫글자는 항상 대문자로 시작을 권장
    //   *. 변수명과 메서드명의 첫글자는 항상 소문자로 시작을 권장
    //   *. 여러 단어를 사용할 때는 단어의 첫글자는 대문자 사용 권장
    //   *. 상수이름은 전부 대문자 사용을 권장







      
        // 두 변수의 값 교환 
        // int x = 10;
        // int y = 20;
        // int temp;
        // temp = x;    // temp 10  x10  y20
        // x = y;       // temp 10  x20  y20
        // y = temp;    // temp 10  x20  y10
        // System.out.println("x = " + x);
        // System.out.println("y = " + y);
        // x, y = y, x 
       

        // 두 변수의 값 교환 오류 
        // int x = 10;
        // int y = 20;

        // System.out.println("x = " + x);
        // System.out.println("y = " + y);
        
        // x = y;
        // y = x;
        // System.out.println("x = " + x);  // x = 20
        // System.out.println("y = " + y);  // y = 20
        
      






        // int year = 0;   // 초기화 
        // int age = 15;
        // System.out.println(year);  
        // System.out.println(age);

        // year = age + 2000;   // 15 + 2000 -> 2015 year
        // age = age + 1;       // 15 + 1    -> 16 age
        // System.out.println(year);
        // System.out.println(age);


    //         변수 variable 
    //   단 하나의 값을 저장할 수 있는 메모리 공간
    //   변수를 사용하기 위해서는 먼저 초기화 해야 한다.
    
    //   int age;   (int는 변수 타입 / age는 변수의 이름을 선언)
    //                         메모리 공간에 이름을 붙인다. 같은 이름이 여러 개 존재 x
    
    //   변수타입 : 변수에 저장될 값의 종류를 지정하는 것 (정수, 실수, 문자...)
    //       정수는 int,   실수는 double,  
    //       문자열은 String,   하나의 문자는 char, 
    
    //   int age = 25;  // age라는 변수를 선언하고, 숫자25로 초기화한다.

    //   int a;
    //   int b;  -> int a,b  이렇게 한 번에 할 수도 있다.

    //   int x = 0;
    //   int y = 0;  ->  int x = 0, y = 0;    이렇게 한 줄로 가능
    //   변수를 사용하기 전에 적절한 값(0, 1, " ")으로 초기화한다.
    
    //   변수의 초기화란,  
    //      변수를 사용하기 전에 처음으로 값을 저장하는 것을 말한다.



    }
}



/*






=======
package src.JavaInter.variableExam;

public class VariableExam {
    public static void main(String[] args) {







        

/*
        
        // String url = "www.naver.com";
        // float f1 = .10f;     // .10은 소숫점 10자리까지 float
        // float f2 = 3.14e3f;
        // double d = 1.23456789;

        // System.out.printf("f1 : %f%n", f1);
        // System.out.printf("f2 : %f%n", f2);
        // System.out.printf("d : %14.2f%n", d);     //%14.2f  은 float 소숫점 아래 2자리까지
        //                                           // 14. 는 총 자릿수14에서 오른쪽(기본) 정렬
        // System.out.printf("Address : %s%n", url);
        // System.out.printf("%.8s%n", url);   // .8s 는 문자열 인덱스값 8까지
        // System.out.printf("%10.8s%n", url);  // 10. 은 총 자릿수10에서 오른쪽(기본) 정렬  
        // System.out.printf("%-10.8s%n", url); // -10. 은 총 자릿수10에서 왼쪽 정렬

 변수와 함께 많이 사용되는 printf()
   지금까지는 println()만 사용했지만 println()은 변수 값을 그대로 출력하므로
   다른 형태로 출력하기가 힘들다. 예를 들면 소수 2자리까지만 출력...
   printf 는 println과 달리 줄바꿈을 하지 않는다. 
   줄바꿈을 할 때는 %n을 넣는다.
   %d  decimal 10진수 즉 숫자 출력
   %s  String 문자열 출력
   %f  float 실수 출력
   %c  char  문자 출력
 
    int age = 14;
    int year = 2021;
    System.out.printf("age:%d", age);
    System.out.printf("age:%d", age);
    System.out.printf("age:%d, year:%d", age, year);
    System.out.printf("age:%d%n, year:%d", age, year); 



*/










/*
 변수 타입
   주로 사용하는 값은 크게 문자(문자열,문자)와 숫자(정수,실수)
   값(data)의 종류(type)에 따라서 저장될 공간의 크기와 형식을 정하는 것이 자료형
   자료형은 크게 기본형과 참조형이 있다.

   기본형(primitive type) - 실제 값이 저장 (총 8가지)
    - 논리 boolean,  문자 char,  정수 int,long,byte,short  실수 double,float ...

   참조형(reference type) - 실제 값이 저장되어 있는 주소값을 저장
    - 기본형을 제외한 모든 것 (String, )
    

   기본형
     논리형 boolean : true or false, 조건식, 논리 계산(if) ...에 사용
     문자형 char : 변수 하나에 한 글자만 저장 (내부적으로는 숫자 정수로 저장된다. ascII)   
     정수형 int long (byte short) : 주로 int가 사용된다.
     실수형 double float :  주로 double이 사용된다.

     int              -2,147,483,648 ~             2,147,483,647 (이 크기만큼의 공간을 사용한다.)
     long -9,223,372,036,845,775,808 ~ 9,223,372,036,845,775,807



 # 상수 constant 
     변수와 마찬가지로 값을 저장할 수 있는 공간인 변수와는 달리 한 번 값을 저장하면 
     변경하지 않고 사용한다. 선언하는 방법도 변수와 동일하지만 final을 붙여서 상수를 나타낸다.
     암묵적인 관례이지만, 상수명은 대문자로 표기한다.
        final int MAX_SPEED = 100;    // 상수를 final로 선언하면 구조적으로 변경 불가능
              int MAX_SPEED = 100;    // 변경하지 않고 그냥 쓰기도 한다.

     상수 선언은 반드시 선언과 동시에 초기화 해야만 한다. 
        final int MIN_SPEED;       이렇게는 안된다. 무언가 값을 입력해줘야 한다.
                  MIN_SPEED = 30;  상수의 값은 변경할 수 없다. 
    

                  
    int i = 'A';       // 에러가 날 거 같지만 사실 그렇지는 않다.
                       // 문자 'A'의 코드 값(ascII)이 저장된다.
    long l = 123;      // int의 크기보다 long의 크기가 더 크다. 에러가 나지 않는다.
    double d = 3.14F;  // double의 크기가 float보다 더 크다. 에러가 나지 않는다.
    float f = 3.14;    // F를 생략하면 double이 된다. 크기와 상관 없이 double은 float에 넣을 수 없다.          
    int i = 32194032489301254319804321L;   // long을 int에 넣을 수는 없다.
    

*/







        // int curPos = 0;   // 현재 위치 current position을 의미
        // int lastPos = -1; // 마지막 위치 last position을 의미
      
    //     * 변수 선언 규칙 (반드시)
    //     1. 대소문자를 구분하며 길이에는 제한이 없다.
    //     2. 예약어를 사용할 수 없다. (println..)
    //     3. 숫자로 시작할 수 없다. (중간에 넣을 수는 있지만, top10은 가능함)
    //     4. 특수문자는 '_', '$' 만 허용한다.
     
    //   *. 클래스명의 첫글자는 항상 대문자로 시작을 권장
    //   *. 변수명과 메서드명의 첫글자는 항상 소문자로 시작을 권장
    //   *. 여러 단어를 사용할 때는 단어의 첫글자는 대문자 사용 권장
    //   *. 상수이름은 전부 대문자 사용을 권장







      
        // 두 변수의 값 교환 
        // int x = 10;
        // int y = 20;
        // int temp;
        // temp = x;    // temp 10  x10  y20
        // x = y;       // temp 10  x20  y20
        // y = temp;    // temp 10  x20  y10
        // System.out.println("x = " + x);
        // System.out.println("y = " + y);
        // x, y = y, x 
       

        // 두 변수의 값 교환 오류 
        // int x = 10;
        // int y = 20;

        // System.out.println("x = " + x);
        // System.out.println("y = " + y);
        
        // x = y;
        // y = x;
        // System.out.println("x = " + x);  // x = 20
        // System.out.println("y = " + y);  // y = 20
        
      






        // int year = 0;   // 초기화 
        // int age = 15;
        // System.out.println(year);  
        // System.out.println(age);

        // year = age + 2000;   // 15 + 2000 -> 2015 year
        // age = age + 1;       // 15 + 1    -> 16 age
        // System.out.println(year);
        // System.out.println(age);


    //         변수 variable 
    //   단 하나의 값을 저장할 수 있는 메모리 공간
    //   변수를 사용하기 위해서는 먼저 초기화 해야 한다.
    
    //   int age;   (int는 변수 타입 / age는 변수의 이름을 선언)
    //                         메모리 공간에 이름을 붙인다. 같은 이름이 여러 개 존재 x
    
    //   변수타입 : 변수에 저장될 값의 종류를 지정하는 것 (정수, 실수, 문자...)
    //       정수는 int,   실수는 double,  
    //       문자열은 String,   하나의 문자는 char, 
    
    //   int age = 25;  // age라는 변수를 선언하고, 숫자25로 초기화한다.

    //   int a;
    //   int b;  -> int a,b  이렇게 한 번에 할 수도 있다.

    //   int x = 0;
    //   int y = 0;  ->  int x = 0, y = 0;    이렇게 한 줄로 가능
    //   변수를 사용하기 전에 적절한 값(0, 1, " ")으로 초기화한다.
    
    //   변수의 초기화란,  
    //      변수를 사용하기 전에 처음으로 값을 저장하는 것을 말한다.



    }
}



/*






>>>>>>> 4801aee843c0fa98041e93d513809646248e636a
*/