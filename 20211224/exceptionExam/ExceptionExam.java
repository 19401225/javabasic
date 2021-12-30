package exceptionExam;

public class ExceptionExam {
    public static void main(String[] args) {


    }
}













        // method1()과 main메서드 양쪽의 catch 블럭이 모두 실행되었다.
        // method1()에서 예외처리를 하고 throw문을 통해 다시 예외를 발생시켰다.
        // 새로 생성된 예외를 main으로 되던져서 throws가 한 번더 처리된다.     
//         try {
//             method1();
//         } catch (Exception e) {
//             System.out.println("Main에서 예외 처리");
//         }
//     }
//     static void method1() throws Exception {
//         try {
//             throw new Exception();
//         } catch (Exception e) {
//             System.out.println("method1에서 예외 처리");    // 예외 처리 완료
//             throw e;  // 에러 객체 e를 다시 되던지기 (main 메서드로)
//         }
//     }
// }
// 예외 되던지기 (Exception Re-throwing)
//   한 메서드에 발생 가능한 예외가 여러 개 있을 경우 몇 개는 메서드 내에서 자체적으로 처리하고
//   나머지는 호출한 곳으로 던져서 양쪽으로 나눠서 처리한다. 하나의 예외도 양쪽에서 처리할 수 있다.
//   예외처리 후 그 예외를 호출한 곳으로 다시 던져서 양쪽에서 모두 처리하는 방법이다. --> 예외 되던지기




//         try { 
//             throw new Exception();   // throw 에러 발생
//         } catch (Exception e) {
//             System.out.println("에러");
//         } finally {
//             System.out.println("항상 실행");
//         }
//     }
// }
// finally 블럭 - 예외의 발생 여부와는 상관 없이 어떤 경우에도 실행되는 코드들을 포함시킨다.
//                선택적으로 사용 여부를 결정할 수 있다. 필수는 아니고 생략할 수 있다.








//         try {
//             method1();    
//         } catch (Exception e) {
//             System.out.println("main에서 예외를 처리");
//         } 
//     }
//         static void method1() throws Exception { // 메서드에 throws를 걸어서 에러를 발생시키도록 했다.
//             throw new Exception();        
         
//             }
//         }
// 예외 처리 방법
// method1() 예외처리 - 예외가 발생한 그 해당 위치에서 바로 예외처리
//                     호출한 main은 method1()에서 에러가 발생했는지 조차 알 수가 없게 된다.

// main() 예외처리 - 예외 발생 메서드를 호출한 지점에서 예외를 받아서 처리
//                  예외를 돌려 받게 되면 예외를 인지할 수 있게 된다.        




    // public static void main(String[] args) throws Exception { // 메서드에 예외 선언 : 예외를 메서드에 선언하여 처리한다.
    //     method1();    // 같은 클래스 내에서 static이면 객체 생성 없이 바로 호출
    
    // }
    //     static void method1() throws Exception {
    //         try {
    //             throw new Exception();        // 여기서 throw를 통해 예외를 발생시키고
    //         } catch (Exception e) {
    //             System.out.println("method1에서 예외가 처리되었습니다.");
    //         }
    //     }
    // }















    // public static void main(String[] args) throws Exception { // 메서드에 예외 선언 : 예외를 메서드에 선언하여 처리한다.
    //     method1();    // 같은 클래스 내에서 static이면 객체 생성 없이 바로 호출
    
    
    // }
    //     static void method1() throws Exception {
    //         method2();
    //     }
    //     static void method2() throws Exception {
    //         throw new Exception();
    //     }
    // }
/* 이러한 에러 메시지가 나온다.
Exception in thread "main" java.lang.Exception
        at exceptionExam.ExceptionExam.method2(ExceptionExam.java:13)
        at exceptionExam.ExceptionExam.method1(ExceptionExam.java:10)
        at exceptionExam.ExceptionExam.main(ExceptionExam.java:5)
 1. 예외가 발생했을 때 3개의 메서드가 실행되었고
 2. 예외가 발생한 곳은 마지막 method2 메서드이며
 3. main메서드가 method1(), method2()를 호출했다는 것을 알 수 있다.


*/


//         // throw new Exception();
//         System.out.println("예외 발생");
//         throw new RuntimeException();     // 실행 중의 예외
//     }
// }



//         try {
//             // Exception e = new Exception("예외 강제 발생");
//             // throw e;             // 강제로 예외가 발생했다.
//             throw new Exception("예외 강제 발생");
//         } catch (Exception e) {
//             System.out.println("에러 메시지 : " + e.getMessage());
//         }
//         System.out.println("프로그램 종료");

//     }
// }




    //     System.out.println(1);
    //     System.out.println(2);

    //     try {
    //         System.out.println(3);
    //         System.out.println(0/0);     // 예외 발생하는 순간 catch로 넘어간다.
    //         System.out.println(4);       // 실행되지 않는다.
    //     } catch (ArithmeticException ae) {          
    //         if (ae instanceof ArithmeticException) 
    //             System.out.println("에러메시지 : " + ae.getMessage());   // 에러메시지 : / by zero
    //     }                          // .getMessage();를 통해 에러 내용을 담은 ae객체의 메시지를 꺼낼 수 있다.
    //     System.out.println(6);
    // }   





    //     System.out.println(1);
    //     System.out.println(2);

    //     try {
    //         System.out.println(3);
    //         System.out.println(0/0);   // 예외 발생하는 순간 catch로 넘어간다.
    //         System.out.println(4);     // 실행되지 않는다.
    //     } catch (ArithmeticException ae) {             // 특정 에러가 우선시 된다.
    //         if (ae instanceof ArithmeticException) 
    //             System.out.println("true");
    //             System.out.println("ArithmeticException");
    //     } catch (Exception e) {      // Exception 은 모든 종류의 에러를 받는다. 에러 객체
    //         System.out.println("Exception");   
    //     }
    //     System.out.println(6);
    // }   











//         System.out.println(1);
//         System.out.println(2);

//         try {
//             System.out.println(3);
//             System.out.println(0/0);   // 예외 발생하는 순간 catch로 넘어간다.
//             System.out.println(4);     // 실행되지 않는다.
//         } catch (Exception e) {      // Exception 은 모든 종류의 에러를 받는다.
//             System.out.println(5);   
//         }
//         System.out.println(6);
//     }   
// }    








//         System.out.println(1);
//         System.out.println(2);

//         try {
//             System.out.println(3);
//             System.out.println(4);
//         } catch (Exception e) {      // Exception 은 모든 종류의 에러를 받는다.
//             System.out.println(5);   // 5는 출력되지 않는다. 예외가 없다.
//         }
//         System.out.println(6);
//     }   
// }




        
//         int num = 100;
//         int result = 0;

//         for (int i = 0; i < 10; i++) {
//             try {
//             result = num / i;          // 100을 0으로 나누려하면 에러가 발생한다.
//             System.out.println(result);
//             } catch (ArithmeticException e) {
//                 System.out.println("0으로는 나눌 수 없습니다.");
//             }
//             }
// // 이러한 에러가 발생한다.
// // Exception in thread "main" java.lang.ArithmeticException: / by zero
// // at exceptionExam.ExceptionExam.main(ExceptionExam.java:10)

//         }
//     }






/*
예외 처리 (Exception Handling)
 프로그램이 실행 중 어떤 원인에 의해 오작동하거나 비정상적인 종료가 되는 경우가 있다.
 이러한 결과를 초래하는 원인을 에러 또는 오류라고 한다. --> 이것을 예외처리한다.

 컴파일 에러 : 컴파일 시 발생하는 에러 - 프로그램 진입 불가 (멈춤, 파일 이름이 빨갛게 된다.)
              오타 혹은 잘못된 구문이나 자료형 등 기본적인 검사를 수행하는 중 확인된 에러

 런타임 에러 : 실행 중 발생하는 에러 - 프로그램 진입 후 동작 중에 발생 (멈춤)
              컴파일 시 에러가 발생하지 않았다고 하더라도 프로그램 동작 중에 에러가 발생할 수 있다.
              프로그램 실행 중 동작을 멈춤 상태로 오랜시간 지속되거나 갑자기 프로그램 실행을 멈추고
              강제 종료되는 경우 등

 (논리적 에러 : 실행은 되는데 의도와 다르게 동작하는 것, 무언가 진행은 된다.)


 자바에서는 발생할 수 있는 오류를 Exception과 Error 클래스로 정의하고 있다. (둘 다 클래스)
 에러 error     : 프로그램 코드에 의해 수습될 수 없는 심각한 오류
 예외 exception : 프로그램 코드에 의해 수습될 수 있는 다소 미약한 오류
 (발생하는 에러가 곧 객체가 된다.)


 try- catch 구문
 에러는 어쩔 수 없지만 (프로그래머가 수습 불가) 예외는 프로그래머가 그에 대한 처리를 미리 해주어야 한다.
 예외처리 : 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성하는 것을 말하며
           예외 처리의 목적이 예외의 발생으로 인한 프로그램의 비정상적인 종료를 막고 정상적인 실행상태를
           유지할 수 있도록 하는 것이다.
 
 try {
            // 예외 발생 가능성이 있는 문장들을 넣는다.
 } catch (Exception e) {  
            // 예외 발생 시 예외 처리 구문
 } finally {
            // 예외 발생 유무와 상관 없이 항상 실행 (생략 가능)
 }


 1. 발생한 예외와 일치하는 catch블록이 있는지 확인한다. (catch가 여러 개 존재 가능)
 2. 일치하는 catch 블록을 찾게되면 그 블록의 문장을 수행하고 빠져나온다.

  예외가 발생하지 않는 경우는 catch를 거치지 않고 빠져나온다.


 예외 강제 발생시키기 : throw
  
 메서드에 예외 선언 : 예외를 메서드에 선언하여 처리한다.

 예외 처리 방법

 method1() 예외처리 - 예외가 발생한 그 해당 위치에서 바로 예외처리
                     호출한 main은 method1()에서 에러가 발생했는지 조차 알 수가 없게 된다.

 main() 예외처리 - 예외 발생 메서드를 호출한 지점에서 예외를 받아서 처리
                  예외를 돌려 받게 되면 예외를 인지할 수 있게 된다.

 finally 블럭 - 예외의 발생 여부와는 상관 없이 어떤 경우에도 실행되는 코드들을 포함시킨다.
                선택적으로 사용 여부를 결정할 수 있다. 필수는 아니고 생략할 수 있다.



 예외 되던지기 (Exception Re-throwing)
     한 메서드에 발생 가능한 예외가 여러 개 있을 경우 몇 개는 메서드 내에서 자체적으로 처리하고
     나머지는 호출한 곳으로 던져서 양쪽으로 나눠서 처리한다. 하나의 예외도 양쪽에서 처리할 수 있다.
     예외처리 후 그 예외를 호출한 곳으로 다시 던져서 양쪽에서 모두 처리하는 방법이다. --> 예외 되던지기




 예외가 예외를 발생시킨다. (chained exception)
     예외A가 예외B를 발생시킨다면 A를 B의 '원인 예외(cause exception)'라고 한다.
     
     try {
        startInstall();   // 에러가 발생...
        copyFiles();      // 건너뛰고,
     } catch (SpaceException e) {           //
        installException ie = new InstallException("설치중 예외 발생");   // 예외 생성
        ie.initCause(e);    // InstallException의 원인 예외를 지정
        throw ie;
     } catch (MemoryException me) {
        ........
     }






*/
