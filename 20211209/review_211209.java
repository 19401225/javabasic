
/* 
import java.util.Calendar 
Calendar 클래스 : 날짜와 시간을 객체 모델링화 한 클래스 
                년, 월, 일, 요일, 시간, 분 등과 같은 정보를 제공

 추상 클래스이기 때문에 직접 new 하여 객체 생성이 불가하고, Calendar.getInstance() 메서드를 이용하거나
 Calendar 클래스를 상속받는 GregorianCalendar 클래스를 이용하여 객체를 생성할 수 있다.
 
  Calendar.YEAR     현재 년도           -> 상수 :    Static int YEAR
  Calendar.MONTH    현재 월 (1월 : 0)   -> 상수 :    Static int MONTH
  Calendar.DATE     현재 월의 날짜      -> 상수 :    Static int DATE
  등등 찾아보기 바란다.

*/
import java.util.Calendar;
public class Main {
  public static void main(String[] args) {
    int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // 0부터 시작하기 때문에 결과와 맞춤
    String season = "";

    switch (month) {
      case 12: case 1: case 2:
          season = "겨울";
          break;
      case 3: case 4: case 5:
          season = "봄";
          break;
      case 6: case 7: case 8:
          season = "여름";
          break;
      case 9: case 10: case 11:
          season = "가을";
          break;
    }
    System.out.println(season);   // 겨울 
  }
}






/*  
반복문 - while
 조건이 참일 동안 계속 반복 실행한다.

*/

// public class Main {
//   public static void main(String[] args) {
//     int i = 0;

//     while (i < 10) {        // i가 10미만일 동안만 실행하라. 마지막 10에서 올라와서 한 번더 확인한다.
//       System.out.println(i + " hi~");
//       i++;
//     }
//   }
// }





/*
break

*/

// public class Main {
//   public static void main(String[] args) {
//     int i = 0;
    
//     while (i < 10) {
//       i++;
//       System.out.println("나무를 " + i + "번 찍었습니다.");
//       if (i == 10) {
//         System.out.println("나무 넘어간다~");  // 다시 while문으로 올라가서 확인 후에 나간다.
//       }
//     }
//   }
// }

// 위 내용에서 break 를 활용하면 아래와 같다.
// public class Main {
//   public static void main(String[] args) {
//     int i = 0;

//     while (true) {
//       i++;
//       System.out.println("나무를 " + i + "번 찍었습니다.");
//       if (i == 10) {
//         System.out.println("나무 넘어갑니다!");
//         break;
//       }
//     }
//   }
// }

// 다시 한 번더 break 활용을 보자.  반복문을 실행하다가 break를 만나면 구문을 빠져 나간다.
// public class Main {
//   public static void main(String[] args) {
//     int coffee = 10;
//     int money = 300;

//     while (money > 0) {
//       System.out.println("커피를 드립니다.");
//       coffee --;
//       System.out.println("남은 커피는 " + coffee + " 입니다.");

//       if (coffee == 0) {
//         System.out.println("커피가 다 떨어졌습니다. 판매를 중단합니다.");
//         break;   // break를 하지 않을 경우 coffee는 -21321324 계속 진행된다.
//       }
//     }
//   }
// }




/*     
continue
  조건에 맞지 않는 경우 실행하지 않고 다시 반복문의 처음으로 돌아간다.

*/

// public class Main {
//   public static void main(String[] args) {
//     int i = 0;
//     while (i < 10) {            // 반복문의 범위를 정하고
//       i++;                      // 하나씩 증가하도록 설정하고,
//       if (i % 2 == 0) {
//         continue;               // 조건에 맞을 경우 실행되지 않고 반복문의 처음으로 돌아간다.
//       }                         // 맞지 않을 경우 아래로 진행
//       System.out.println(i);    // 출력
//     }                           // 이제 반복문의 처음으로 
//   }
// }


// 위 내용 연습 (중간에 추가 설명을 넣었다.)
// public class Main {
//   public static void main(String[] args) {
//     int i = 0;
//     while (i < 10) {
//       i++;
//       if (i % 2 == 0) {
//         System.out.println("i = " + i + " 입니다.");
//         continue;
//       }
//       System.out.println(i);
//     }
//   }
// }


// 1~100까지 숫자들을 모두 더하는 프로그램을 만들어보자.
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;
//     int i = 1;
    
//     while (i <= 100) {
//       sum += i;
//       System.out.println("i = " + i + ", sum = " + sum);
//       i++;
//     }
//     System.out.println(sum);
//   }
// }






/* 문제2) while문에 i를 이용하여 1~10까지 출력합니다.
        if문을 추가하여 i가 짝수일때만 i가 출력되도록 만드시오.    
*/
// public class Main {
//   public static void main(String[] args) {
//     int i = 1;
//     while (i < 11) {
//       if (i % 2 == 0) {
//         System.out.println(i);   // 짝수만 출력된다.
//       }
//       i++;
//     }
//   }
// }



/* 
반복문 do ~ while 
  조건이 참일 동안 반복 실행한다. (while)
  while문은 거짓일 경우 실행되지 않지만, do~while문은 무조건 한 번은 반드시 실행한다.

*/

/*
Scanner 클래스
  기본적인 데이터 타입들을 Scanner의 메소드를 사용하여 입력을 받을 수 있다.
  String 을 입력받고 싶으면 next() 또는 nextLine()을 사용하고,
  int를 입력받고 싶다면 nextint() 를 사용하여 입력을 받으면 알아서 해당 타입으로 입력된다.

  기본적으로 import 하여 기능을 가져온다.   java.util 패키지에 Scanner 클래스가 있다.
  import java.util.Scanner; 입력하여 해당 경로를 호출하도록 한다.

  공백 또는 줄 바꿈을 기준으로 읽는다.
  클래스이름 객체이름 = new 클래스이름(); 이렇게 객체를 생성하는데
  = new 클래스이름(System.in)이 들어가는데 
  System.in은 사용자로부터 입력을 받기 위한 입력 스트림이다.

 자바에서 Scanner 클래스의 입력 메소드는 다음과 같은 종류들이 있다
 in.nextByte();   // Byte 형 입력 및 리턴
 in.nextShort();  // short 형 입력 및 리턴
 in.nextInt();    // int 형 입력 및 리턴
 in.nextLong();   // long 형 입력 및 리턴
 in.nextFloat();   
 in.nextDouble();
 in.nextBoolean();
 in.next();     // String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
 in.nextLine(); // String 형 입력 및 리턴 (줄 바꿈을 기준으로 한 줄을 읽음)

 클래스이름 객체이름 = new 클래스이름();    이렇게 만든다.

*/
// import java.util.Scanner;  // 사용자로부터 직접 입력을 받는 기능을 불러온다.
// public class Main {
//   public static void main(String[] args) {
//     int i = 0;
//     Scanner scan = new Scanner(System.in); // (System.in)은 입력받기 위한 스트림
    
//     do {
//       i = scan.nextInt();
//       System.out.println("입력받은 값:" + i);
//     } while (i != 0);
//     System.out.println("종료");
//   }
// }


// import java.util.Scanner;    // Scanner 클래스를 불러온다.
// public class Main {
//   public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);  //   불러온 클래스를 이용하여 scan 이라는 객체 생성
//      int value = 0;
//      int sum = 0;

//      do {
//        value = scan.nextInt();
//        sum += value;
//      } while (value < 100); // 100미만의 숫자가 나올 동안 (100이상의 숫자가 나오면 아래로 진행)
//      System.out.println("sum : " + sum);
//   }
// }





/*  반복문 for 를 이용하여 1~100까지 숫자들을 모두 더하시오. */
// 우선, while문을 사용하면 아래와 같다.
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;
//     int i = 1;

//     while (i <= 100) {
//       sum += i;
//       i++;
//     }
//     System.out.println(sum);  // 5050
//   }
// }

/* 위 내용에 중간 과정을 넣으면 */
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;
//     int i = 1;

//     while (i <= 100) {
//       sum += i;
//       i++;
//       System.out.println("i = " + i + ", sum= " + sum); 
//       // while문은 끝에서, 처음으로 한 번더 돌아가 확인한다.
//     }
//     System.out.println(sum);  // 5050
//   }
// }




/*   이제 for문을 사용하여  1~100까지 더해보자.        */
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;

//     for (int i = 1; i <= 100; i++) {   // for문 (Start; Stop; Step) {
//       sum += i;
//     }
//     System.out.println(sum); // 5050
//   }
// }

/* 위 내용에서 중간 과정을 넣으면 */
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;

//     for (int i = 1; i <= 100; i++) {   // for문 (Start; Stop; Step) {
//       sum += i;
//       System.out.println("i = " + i + " sum = " + sum);
//     }
//     System.out.println(sum); // 5050
//   }
// }




/* 문제) 1~100까지의 숫자에서 홀수들의 누적 합계를 구하시오. continue를 사용하여 */
// public class Main{
//   public static void main(String[] args) {
//     int sum = 0;
    
//     for (int i = 1; i <= 100; i++) {   // for문 (Start; Stop; Step) {
//       if (i % 2 == 0) {
//       continue;
//     }
//     sum += i;
//   }
//   System.out.println(sum);  // 2500
// }
// }


/* 위처럼 for문을 사용중 continue가 아닌 break;를 사용하면  */
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;

//     for (int i = 1; i <= 100; i++) {  // for문 (Start; Stop; Step) {
//       sum += i;
//       if (i == 50) {
//         break;
//       }
//     }
//     System.out.println(sum); // 1275
//   }
// }







/* for each    for문을 다르게 사용하는 방식이다. */
// public class Main {
//   public static void main(String[] args) {
//     String[] number = {"one", "two", "three"};
//     for (int i = 0; i < number.length; i++) {  // for문(Start, Stop, Step);
//       System.out.println(number[i]);
//     } 

//   }
// }

/* 위 구문을 for each를 사용하면 */
// public class Main {
//   public static void main(String[] args) {
//     String[] number = {"one", "two", "three"};

//     for (String num: number) {  // number에서 하나씩 꺼내 num에 담는다는 의미
//       System.out.println(num);  // 반복문이니 반복해서 꺼내어 출력한다.
//     }
//   }
// }







/* if 없이 if를 사용하는 방법  */
// public class Main {
//   public static void main(String[] args) {
//     if (5 > 4) {
//       System.out.println(50);
//     } else {
//       System.out.println(40);
//     }
//   }
// }

/* 위 내용을 if를 사용하지 않고 표현하면 > 삼항연산자 */
// public class Main {
//   public static void main(String[] args) {
//     System.out.println((5>4) ? 50 : 40);   // 50
//          //((조건) ? (true일경우) 값 : (false일경우) 값);
//   }
// }
