<<<<<<< HEAD
package oopExam;
public class overloadingExam {
public static void main(String[] args) {
// 가변인자 오버로딩 - JDK 1.5부터 매개변수의 갯수를 동적으로 지정할 수 있다. 
// 가변인자 variable arguments  

    String[] strArr = {"10","20","30"};
    String[] strArr2 = {"10","20","30","40","50"};
    int[] intArr1 = {1,2,3};
    int[] intArr2 = {1,2,3,4,5};

// 102030
// 10 20 30
// 10-20-30
// 10 20 30 40 50  이렇게들 출력하고 싶을 때가 있지

System.out.println(concat("",strArr));
System.out.println(concat("",strArr2));

System.out.println(concat("-",strArr));
System.out.println(concat("/",strArr2));

System.out.println(arrCal("+",intArr1));
System.out.println(arrCal("*",intArr2));

}
static int arrCal (String a, int... args) {  // 여러 개의 값이 들어올 경우 int... args 이런식으로 표현한다.
    int result = a.equals("+") ? 0 : 1;
    
    for (int arg : args) {
        
        if (a.equals("+")) {   // 문자를 비교할 땐 == 가 아닌 .equals를 사용한다.
            result += arg;
        } else if (a.equals("*")) {
            result *= arg;    
        }
    }    return result;
}

// 이제 매서드를 만들자
static String concat(String a, String... args) {
    String result = "";

    for (String str : args) {
        result += str + a;  
    }
    return result;
}
}











// Overloading
//  자바에서는 한 클래스 내에 이미 사용중인 이름과 동일한 이름의 메서드가 있더라도
//  매개변수의 갯수가 다르거나 타입이 다르면 같은 이름을 사용하여 매서드를 정의할 수 있다.

//     System.out.println(add(2,3));
//     System.out.println(add(2,3,4));
//     add("홍길동", 990);           // void add 클래스 안에 print가 있기에 그냥 불러주기만 하면 된다.
// }

// static int add(int a, int b) {
//     int result = a + b;
//     return result;                        // return 하면 println 하여 출력값을 나타낸다
// }

// static int add(int a, int b, int c) {
//     int result = a + b + c;
//     return result;
// }

// static void add(String a, int b) {                  // 출력이 없는 void
//     System.out.println(a + "님의 토익 점수는 " + b); // void는 print매서드를 사용한다.
    
// }
// }





/*


오버로딩의 사전적인 의미는 '과적하다' 즉, 많이 싣는 것을 말한다.
보통 하나의 매서드 이름에 하나의 기능만을 구현하는데 하나의 이름으로 여러 기능을 구현하고자 할 떄 사용된다.

 1. 매서드명이 동일해야 한다.
 2. 매개변수의 개수 또는 타입이 달라야 한다.
 *. 오버로딩에서 반환타입은 오버로딩 구현에 있어서 아무런 영향을 주지 못한다.

 println();              내용이 없어서 print 매서드가 잘 구현된다.
 println(int x);         
 println(String a, b);   입력에 상관없이 잘 동작을 한다.
 println(long a);

 매서드 오버로딩을 사용하면 사용자가 단 하나의 매서드 명으로 다양한 처리 결과를 얻을 수 있도록
 구성할 수 있다. (매번 다른 이름의 매서드들을 생성할 필요가 없다.)

 printlnline()
 printlnint1()
 printlnstr2()
 printlnstr3() 매서드 오버로딩은 이렇게 비슷한 동작을 하는 매서드들을 각각 따로 만들 필요없이
               println() 처럼 입력된 값에 상관 없이 잘 동작한다. 









=======
package oopExam;
public class overloadingExam {
public static void main(String[] args) {
// 가변인자 오버로딩 - JDK 1.5부터 매개변수의 갯수를 동적으로 지정할 수 있다. 
// 가변인자 variable arguments  

    String[] strArr = {"10","20","30"};
    String[] strArr2 = {"10","20","30","40","50"};
    int[] intArr1 = {1,2,3};
    int[] intArr2 = {1,2,3,4,5};

// 102030
// 10 20 30
// 10-20-30
// 10 20 30 40 50  이렇게들 출력하고 싶을 때가 있지

System.out.println(concat("",strArr));
System.out.println(concat("",strArr2));

System.out.println(concat("-",strArr));
System.out.println(concat("/",strArr2));

System.out.println(arrCal("+",intArr1));
System.out.println(arrCal("*",intArr2));

}
static int arrCal (String a, int... args) {  // 여러 개의 값이 들어올 경우 int... args 이런식으로 표현한다.
    int result = a.equals("+") ? 0 : 1;
    
    for (int arg : args) {
        
        if (a.equals("+")) {   // 문자를 비교할 땐 == 가 아닌 .equals를 사용한다.
            result += arg;
        } else if (a.equals("*")) {
            result *= arg;    
        }
    }    return result;
}

// 이제 매서드를 만들자
static String concat(String a, String... args) {
    String result = "";

    for (String str : args) {
        result += str + a;  
    }
    return result;
}
}











// Overloading
//  자바에서는 한 클래스 내에 이미 사용중인 이름과 동일한 이름의 메서드가 있더라도
//  매개변수의 갯수가 다르거나 타입이 다르면 같은 이름을 사용하여 매서드를 정의할 수 있다.

//     System.out.println(add(2,3));
//     System.out.println(add(2,3,4));
//     add("홍길동", 990);           // void add 클래스 안에 print가 있기에 그냥 불러주기만 하면 된다.
// }

// static int add(int a, int b) {
//     int result = a + b;
//     return result;                        // return 하면 println 하여 출력값을 나타낸다
// }

// static int add(int a, int b, int c) {
//     int result = a + b + c;
//     return result;
// }

// static void add(String a, int b) {                  // 출력이 없는 void
//     System.out.println(a + "님의 토익 점수는 " + b); // void는 print매서드를 사용한다.
    
// }
// }





/*


오버로딩의 사전적인 의미는 '과적하다' 즉, 많이 싣는 것을 말한다.
보통 하나의 매서드 이름에 하나의 기능만을 구현하는데 하나의 이름으로 여러 기능을 구현하고자 할 떄 사용된다.

 1. 매서드명이 동일해야 한다.
 2. 매개변수의 개수 또는 타입이 달라야 한다.
 *. 오버로딩에서 반환타입은 오버로딩 구현에 있어서 아무런 영향을 주지 못한다.

 println();              내용이 없어서 print 매서드가 잘 구현된다.
 println(int x);         
 println(String a, b);   입력에 상관없이 잘 동작을 한다.
 println(long a);

 매서드 오버로딩을 사용하면 사용자가 단 하나의 매서드 명으로 다양한 처리 결과를 얻을 수 있도록
 구성할 수 있다. (매번 다른 이름의 매서드들을 생성할 필요가 없다.)

 printlnline()
 printlnint1()
 printlnstr2()
 printlnstr3() 매서드 오버로딩은 이렇게 비슷한 동작을 하는 매서드들을 각각 따로 만들 필요없이
               println() 처럼 입력된 값에 상관 없이 잘 동작한다. 









>>>>>>> 4801aee843c0fa98041e93d513809646248e636a
*/