/*
하루에 3시간씩 영어 공부에 매진하라.
코딩보다 더 중요하다.
계획 세우고 실행 ㄱㄱ

*/

/*
Map 맵 - 파이썬의 딕셔너리와 같은 자료구조,  JS에서는 json
  데이터를 키 key 값과 밸류 value 값의 쌍으로 저장하는 구조
  순서(인덱스)가 없이 키값으로만 밸류값을 얻는다. 

  key      value
  name     홍길동
  age       16
  
*/

// import java.util.HashMap;   // java.util 안에 HashMap 기능을 가져온다.
// public class Main {
//   public static void main(String[] args) {
// //  HashMap map = new HashMap();
//     HashMap<String, String> map = new HashMap<String, String>(); // Generics를 걸었다 
//                                                                 // 키와 밸류값이 모두 문자열
//     map.put("people", "사람");     // 데이터를 넣을 때는 .put(키값, 벨류값); 입력해주면 된다.
//     map.put("baseball", "야구");

//     System.out.println(map.get("people"));   // 사람    출력할 때는, map.get(키값); 을 입력한다.
//     System.out.println(map.get("baseball")); // 야구     키값으로 밸류값 가져오기 .get()
 
//     System.out.println(map.containsKey("people"));  // true       키값의 존재 유무 확인
//     System.out.println(map.containsKey("Hello"));   // false  

//     System.out.println(map.size());   // 2    크기, map의 갯수를 확인 .size()

//     System.out.println(map.remove("people")); // 사람   .remove(키값) 입력하여 키값 삭제
//     System.out.println(map.size());   // 1 

//     // map의 가장 큰 특징은 배열처럼 순서에 의존하지 않고  
//     // key값으로 value값을 가져오는데 있다. 그렇지만 순서로 데이터를 가져올 필요가 있으면
//     // LinkedHashMap TreeMap 등을 사용한다. (순서를 가진 map)

//   }
// }



/*

Ada Lovelace (에이다 러브레이브)를 기억하자. 인공지능 때문에 다시 한 번더 이름이 드러날거야 

Alan Turing (앨런튜링) 
영국의 수학자·논리학자. 계산기가 어디까지 논리적으로 작동할 수 있는가에 대하여 처음으로 지적인 실험을 시도한 학자로 유명하며, 컴퓨터공학 및 정보공학의 이론적 토대를 마련하였다.

이미테이션(앨런튜링), 잡스 두 편의 영화보기, 책읽기
책읽기 : 선생님 사이트 > about > paper > 맨 아래 > 이름(책) 다운로드 (암호는 jesus)

사토시 나카모토 - 인공지능, 비트코인


*/


/* Ada Lovelace 를 기억하자.
if 
아래의 기본 형태는 외워두자.

*/

// public class Main {
//   public static void main(String[] args) {
    
//     if (true) {     // 또는 false, 괄호 안이 true일 경우 아래를 진행
//       System.out.println("Yes");
//     } else {            // false일 경우 아래를 진행
//       System.out.println("No");
//     }
//   }
// }



// public class Main {
//   public static void main(String[] args) {
    
//     boolean money = true;

//     if (money) {        // 이렇게 간접적으로 true 또는 false가 올 수 있다.
//       System.out.println("택시탄다");   // 택시탄다
//     } else {            // false일 경우 아래를 진행
//       System.out.println("걸어간다");
//     }
//   }
// }



// public class Main {
//   public static void main(String[] args) {
    
//     int money = 3000;

//     if (money >= 5000) {        // 이렇게 간접적으로 true 또는 false가 올 수 있다.
//       System.out.println("택시탄다");
//     } else {            // false일 경우 아래를 진행
//       System.out.println("걸어간다");   // 걸어간다
//     }
//   }
// }



// public class Main {
//   public static void main(String[] args) {
    
//     int money = 13000;

//     if (money >= 5000) {        // 이렇게 계산해서 true 와 false를 오게할 수 있다.
//       System.out.println("택시탄다");  // 택시탄다
//     } else {           
//       System.out.println("걸어간다");  
//     }
//   }
// }


// 조건이 두 개일 경우
// public class Main {
//   public static void main(String[] args) {
    
//     int money = 2000;
//     boolean card = true;

//     if (money >= 5000 || card) {        // shift + \  두 개(||)는, or 라는 의미
//       System.out.println("택시탄다"); // 택시탄다
//     } else {           
//       System.out.println("걸어간다");  
//     }
//     // ||, or 는 둘 중 하나만 만족해도 true가 된다. (or는 착하다.)
//   }
// }



// public class Main {
//   public static void main(String[] args) {
    
//     int money = 2000;
//     boolean card = false;

//     if (money >= 5000 || card) {        // shift + \  두 개(||)는, or 라는 의미
//       System.out.println("택시탄다"); 
//     } else {           
//       System.out.println("걸어간다"); // 걸어간다  
//     }
//     // ||, or 는 둘 중 하나만 만족해도 true가 된다. (or는 착하다.)
//   }
// }



// public class Main {
//   public static void main(String[] args) {
    
//     int money = 2000;
//     boolean card = false;

//     if (money >= 5000 | card) {        // | 는 기본 or, || 두 개를 넣으면 
//       System.out.println("택시탄다"); 
//     } else {           
//       System.out.println("걸어간다"); // 걸어간다  
//     }
//     // ||, or 는 둘 중 하나만 만족해도 true가 된다. (or는 착하다.)
//     // | 는 기본 or, || 두 개를 넣으면 결과는 같지만 과정이 달라지는데
//     // 
//   }
// }


// public class Main {
//   public static void main(String[] args) {
    
//     int money = 10000;
//     boolean card = true;

//     if (money >= 5000 | card) {        // | 는 기본 or, || 두 개를 넣으면 
//       System.out.println("택시탄다"); 
//     } else {           
//       System.out.println("걸어간다"); 
//     }
//     // ||, or 는 둘 중 하나만 만족해도 true가 된다. (or는 착하다.)
//     // | 하나만 넣어도 진행이 되지만(모든 조건을 다 확인한다),
//     // || 두 개일 경우 첫 번째 조건이 참이면 뒤는 쳐다보지 않고 진행 (작업 속도 단축)
//   }
// }



// public class Main {
//   public static void main(String[] args) {
    
//     int money = 2000;
//     boolean card = true;

//     if (money >= 5000 && card) {        // | 는 기본 or, || 두 개를 넣으면 
//       System.out.println("택시탄다"); 
//     } else {           
//       System.out.println("걸어간다"); 
//     }
//     // &&, and 는 둘 다 만족해야만 true가 된다. 
//     // & 하나만 넣어도 진행이 되지만(모든 조건을 다 확인한다),
//     // && 두 개 넣을 경우, 첫 번째 조건이 false일 경우 뒤는 따지지 않고 바로 진행 (시간 단축)
//   }
// }



/* ArrayList를 이렇게 활용할 수 있다. */
// import java.util.ArrayList;
// public class Main {
//   public static void main(String[] args) {
    
//     ArrayList<String> pocket = new ArrayList<String>(); // Generics를 사용하여 문자열만 입력되도록
//                                                         // pocket이라는 객체를 하나 생성하고,
//     pocket.add("paper");
//     pocket.add("handphone");
//     pocket.add("money");


//     if (pocket.contains("money")) {      // .contains(); 안에 값이 포함하는지 확인한다.
//       System.out.println("택시탄다");    // 택시탄다
//     } else {           
//       System.out.println("걸어간다"); 
//     }

//   }
// }


// import java.util.ArrayList;
// public class Main {
//   public static void main(String[] args) {
    
//     ArrayList<String> pocket = new ArrayList<String>(); // Generics를 사용하여 문자열만 입력되도록
//                                                         // pocket이라는 객체를 하나 생성하고,
//     pocket.add("paper");
//     pocket.add("handphone");
//     pocket.add("money");


//     if (pocket.contains("card")) {      // .contains(); 안에 값이 포함하는지 확인한다.
//       System.out.println("택시탄다");    
//     } else {           
//       System.out.println("걸어간다"); // 걸어간다
//     }

//   }
// }


/*       이제 if문 경우의 수를 늘려보자     */
// import java.util.ArrayList;
// public class Main {
//   public static void main(String[] args) {
    
//     ArrayList<String> pocket = new ArrayList<String>(); // Generics를 사용하여 문자열만 입력되도록
//                                                         // pocket이라는 객체를 하나 생성하고,
//     pocket.add("paper");
//     pocket.add("handphone");
//     pocket.add("pan");

//   // 경우의 수가 여러 개일 때 if 안에 if형태로 구성하게 되면
//   // 가독성이 많이 저하된다. 결국 쓰지말자... 이 방법을 사용하자.

//     if (pocket.contains("card")) {    
//       System.out.println("택시탄다");
//     } else if (pocket.contains("money")) {
//       System.out.println("택시탄다");
//     } else {
//       System.out.println("걸어간다");  // 걸어간다.

//     // if문의 특징, 걸리면 출력된다.(if문 탈출)

//     }
//   }
// }



// import java.util.ArrayList;
// public class Main {
//   public static void main(String[] args) {
    
//     ArrayList<String> pocket = new ArrayList<String>(); // Generics를 사용하여 문자열만 입력되도록
//                                                         // pocket이라는 객체를 하나 생성하고,
//     pocket.add("paper");
//     pocket.add("handphone");
//     pocket.add("money");

//   // 경우의 수가 여러 개일 때 if 안에 if형태로 구성하게 되면
//   // 가독성이 많이 저하된다. 결국 쓰지말자... 이 방법을 사용하자.

//     if (pocket.contains("card")) {    
//       System.out.println("택시탄다");
//     } else if (pocket.contains("money")) {
//       System.out.println("택시탄다");  // 택시탄다
//     } else {
//       System.out.println("걸어간다"); 
//     // if문의 특징, 걸리면 출력된다.(if문 탈출)
//     }
//   }
// }

// 조건문 : if, switch
// 반복문 : while, for


// public class Main {
//   public static void main(String[] args) {
//     int x = 50;
//     int y = 60;

//     if (x < y) {
//       System.out.println("x는 y보다 작습니다.");   // x는 y보다 작습니다.
//     }
//   }
// }



// public class Main {
//   public static void main(String[] args) {
//     int x = 50;
//     int y = 60;

//     if (x > y) {
//       System.out.println("x는 y보다 작습니다.");   // 아무것도 출력되지 않는다.
      // 조건을 만족했을 때만 실행이 된다.
//     }
//   }
// }




// public class Main {
//   public static void main(String[] args) {
//     int x = 50;
//     int y = 60;

//     if (x > y) {
//       System.out.println("x는 y보다 큽니다.");  
//       System.out.println("test 1");
//     }

//     if (x > y) // 여기에 {  이 중괄호가 하나 빠졌다.
//       System.out.println("x는 y보다 큽니다.");
//       System.out.println("test 2");     // test 2 가 출력되는데,
// // 두 번쨰 if문 다음에 중괄호가 빠졌다. 
// // 이럴 경우 첫 번째 구문만 if문으로 인정되고, 그 다음줄은 별개의 줄로 읽힌다.    
//   }
// }

// 위에 구문에서 중괄호를 정상적으로 입력하면
// public class Main {
//   public static void main(String[] args) {
//     int x = 50;
//     int y = 60;

//     if (x > y) {
//       System.out.println("x는 y보다 큽니다.");  
//       System.out.println("test 1");
//     }

//     if (x > y) {
//       System.out.println("x는 y보다 큽니다.");
//       System.out.println("test 2");     
//       // 이제 아무것도 실행되지 않는다.
//   }
// }
// }



// public class Main {
//   public static void main(String[] args) {
//     int x = 50;
//     int y = 60; 
//                      // != 은 같지 않다는 의미
//     if (x == y) {    // = 하나 일 경우 대입하여 넣는 의미, == 두 개일 경우 같다는 의미
//       System.out.println("x는 y와 같습니다.");
//     } else {
//       System.out.println("x는 y와 다릅니다.");  // x는 y와 다릅니다.
//     }
//   }
// }



// public class Main {
//   public static void main(String[] args) {
//     int x = 50;
//     int y = 60;

//     if (x == y) {
//       System.out.println("x는 y와 같습니다.");
//     } else if (x > y) {
//       System.out.println("x는 y보다 큽니다.");
//     } else if (x < y) {
//       System.out.println("x는 y보다 작습니다.");  // x는 y보다 작습니다.
//     }
//   }
// }



// public class Main {
//   public static void main(String[] args) {
//     int x = 50;
//     int y = 60;

//     if (x == y) {
//       System.out.println("x는 y와 같습니다.");
//     } else if (x > y) {
//       System.out.println("x는 y보다 큽니다.");
//     } else {
//       System.out.println("x는 y와 다릅니다.");  // x는 y와 다릅니다. 
//       // 마지막에는 걸릴 수 밖에
//     }
//   }
// }


//  인공지능, 튜링테스트 


// public class Main {
//   public static void main(String[] args) {
//     int value = 6;

//     if (value % 3 == 0) {
//       System.out.println(value+"는(은) 3의 배수입니다."); // 6는(은) 3의 배수입니다.
//     }
//   }
// }




// public class Main {
//   public int IfTest(int value) {
//     int ret = 0;
//     if (value % 3 == 0) {
//       ret = 3;
//     } else if (value % 4 == 0) {
//       ret = 4;
//     }
//     return ret;
//   }

//   public static void main(String[] args) {
//     Main exam = new Main();   // Main 클래스로 exam이라는 객체를 찍어낸다.
//     System.out.println(exam. IfTest(6)); // 3    IfTest 메서드를 호출한다.
//     System.out.println(exam. IfTest(8)); // 4 
//     System.out.println(exam. IfTest(12));// 3   우선 걸리면 나간다.
//   }
// }



/*    

switch-case 구문 - if문과 비슷하지만 좀 더 절차를 단순화시키는 조건 판단문이다.

*/

// public class Main {
//   public static void main(String[] args) {

//     int month = 12;
//     String monthString="";

//     switch (month) {
//       case 1: monthString = "jan";
//              break;
//       case 2: monthString = "feb";
//              break;
//       case 3: monthString = "mar";
//              break;
//       case 4: monthString = "apr";
//              break;      
//       case 5: monthString = "may";
//              break;      
//       case 6: monthString = "jun";
//              break;
//       case 7: monthString = "jul";
//              break;  
//       case 8: monthString = "aug";
//              break;
//       case 9: monthString = "sep";
//              break;
//       case 10: monthString = "oct";
//              break;
//       case 11: monthString = "nov";
//              break;    
//       case 12: monthString = "dec";
//              break;              // break; 를 만나는 순간 탈출한다.
//     }
//     System.out.println(monthString);  // dec
//   }
// }
// 그리고 마지막에 default 구문을 사용할 수 있습니다. value 값이 1, 2, 3 중 아무것도 아니라면 “그 외 다른 숫자”라고 출력하겠습니다. if 문에서 마지막 else와 비슷한 역할이죠? else와 마찬가지로 default는 생략할 수도 있습니다.






// 위 내용을 if문을 이용하여 나타내면 아래와 같다.
// public class Main {
//   public static void main(String[] args) {
//     int month = 2;

//     if (month == 1) {
//       System.out.println("jan");
//     } else if (month == 2) {
//       System.out.println("feb");
//     } else if (month == 3) {
//       System.out.println("mar") ;
//     } else if (month == 4) {
//       System.out.println("apr");
//     } else if (month == 5) {
//       System.out.println("may");
//     } else if (month == 6) {
//       System.out.println("jun");
//     } else if (month == 7) {
//       System.out.println("jul");
//     } else if (month == 8) {
//       System.out.println("aug");
//     } else if (month == 9) {
//       System.out.println("sep");
//     } else if (month == 10) {
//       System.out.println("oct");
//     } else if (month == 11) {
//       System.out.println("nov");
//     } else {
//       System.out.println("dec");
//     }
//   }
// }




// public class Main {
//   public static void main(String[] args) {

//     int month = 1;
//     String monthString="";

//     switch (month) {
//       case 1: monthString = "jan";
//            //  break;
//       case 2: monthString = "feb";
//            //  break;
//       case 3: monthString = "mar";
//            //  break;
//       case 4: monthString = "apr";
//            //  break;      
//       case 5: monthString = "may";
//              break;      // break; 를 만나는 순간 탈출한다.
//       case 6: monthString = "jun";
//              break;
//       case 7: monthString = "jul";
//              break;  
//       case 8: monthString = "aug";
//              break;
//       case 9: monthString = "sep";
//              break;
//       case 10: monthString = "oct";
//              break;
//       case 11: monthString = "nov";
//              break;    
//       case 12: monthString = "dec";
//              break;              
//     }
//     System.out.println(monthString);  // may 
//     // switch는 break; 를 넣지 않으면 계속 진행된다.
//   }
// }




// 계절 출력하는, 모두의 자바에서 문제를 확인해보자
// import java.util.Calendar;
// public class Main {
//   public static void main(String[] args) {
//     int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // 0부터 시작해서 결과와 맞춰줌
//     String season = "";

//     switch (month) {
//       case 12: case 1: case 2:
//              season = "겨울";
//              break;
//       case 3: case 4: case 5:
//              season = "봄";
//              break;
//       case 6: case 7: case 8:
//              season = "여름";
//              break;
//       case 9: case 10: case 11: 
//              season = "가을";
//              break;   
//     }
//       System.out.println(season);
//   }
// }



// import java.util.Calendar;
// public class Main {
//   public static void main(String[] args) {
//     int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
//     String season = "";

//     if (month == 12 || month == 1 || month == 2) {
//       System.out.println("겨울");
//     } else if (month == 3 || month == 4 || month == 5) {
//       System.out.println("봄");
//     } else if (month == 6 || month == 7 || month == 8) {
//       System.out.println("여름");
//     } else if (month == 9 || month == 10 || month == 11) {
//       System.out.println("가을");
//     }
//   }
// }




// 위의 내용을 if문을 사용하면
// import java.util.Calendar;
// public class Main {
//   public static void main(String[] args) {
//     int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // 0부터 시작해서 결과와 맞춰줌
//     String season = "";

//     if (month <= 2) {
//           System.out.println("겨울");  // 이미 1,2는 겨울로 나왔어
//     } else if (month <= 5) {
//           System.out.println("봄");
//     } else if (month <= 8) {
//           System.out.println("여름");
//     } else if (month <= 11) {
//           System.out.println("가을");
//     } else {
//           System.out.println("겨울");
//     }
//     }  
//   }


/* 
반복문 - while 
  while은 조건이 참일 동안 계속 반복 실행한다.
  


*/


// public class Main {
//   public static void main(String[] args) {
      
//       int i = 0;
      
//       while(i < 10) {   // i가 10미만일 동안만 실행하라. 마지막 10에서 올라와서 한 번더 확인을 한다.
//         System.out.println(i+" hi~");
//         i++;
//         // while은 무한반복되어 탈출지점을 만들어야 한다.
//       }
//   }
// }




// public class Main {
//   public static void main(String[] args) {
      
//       int i = 0;
      
//       while(i < 10) {  
//         i++;      //    i = i + 1;   //   i += 1;       같은 방식이다.
//         System.out.println("나무를 " + i +" 번 찍었습니다. ");
//         if (i == 10) {
//           System.out.println("나무 넘어간다~"); 
//           // 이후 나가는 게 아니라 다시 while문으로 올라가서 확인 후에 나간다.
//         }
//       }
//   }
// }



// break; 를 활용하면 아래와 같다.
// public class Main {
//   public static void main(String[] args) {
      
//       int i = 0;
      
//       while(true) {  
//         i++;      //    i = i + 1;   //   i += 1;       같은 방식이다.
//         System.out.println("나무를 " + i +" 번 찍었습니다. ");
//         if (i == 10) {
//           System.out.println("나무 넘어간다~"); 
//           break;
//         }
//       }
//   }
// }



// 반복문을 실행하다가 break;를 만나면 구문을 빠져 나간다.

// public class Main {
//   public static void main(String[] args) {
      
//       int coffee = 10;
//       int money = 300;

//       while(money > 0) {  
//         System.out.println("커피를 드립니다.");
//         coffee --;
//         System.out.println("남은 커피는 " + coffee + "입니다. ");

//         if (coffee == 0) {
//           System.out.println("커피가 다 떨어졌습니다. 판매를 종료합니다." ); 
//           break;
//         }
//       }
//   }
// }




// continue 
// 조건에 맞지 않는 경우 실행하지 않고 다시 반복문의 처음으로 돌아가는 방법

// public class Main {
//   public static void main(String[] args) {
      
//     int i = 0;
    
//     while (i < 10) {      // 반복문의 범위를 정하고,
//       i++;                // 계속 증가하도록 설정하고, 
//       if (i % 2 == 0) {
//         continue;              // 조건에 맞지 않을 경우 반복문 처음으로 돌아간다. 
//       }                        // 맞을 경우 밑으로 진행
//       System.out.println(i);   // 1을 출력 후 다시 반복문 처음으로 돌아간다.
//     }
//   }
// }




// 아래는 추가 설명이다.
// public class Main {
//   public static void main(String[] args) {
      
//     int i = 0;
    
//     while (i < 10) {      // 반복문의 범위를 정하고,
//       i++;                // 계속 증가하도록 설정하고, 
//       if (i % 2 == 0) {
//         System.out.println("continue로 인쇄를 하지 않는 수:" + i);
//         continue;              // 조건에 맞지 않을 경우 반복문 처음으로 돌아간다. 
//       }                        // 맞을 경우 밑으로 진행
//       System.out.println(i);   // 1을 출력 후 다시 반복문 처음으로 돌아간다.
//     }
//   }
// }




// public class Main {
//   public static void main(String[] args) {
    
//     int total = 0;
//     int i = 1;

//     while(i <= 100) {
//       total = total + i;
//       System.out.println("현재 total의 값은" + total + " 입니다.");
//       i++;
//     }
//     System.out.println(total);
// }
// }




// public class Main {
//   public static void main(String[] args) {
    
//     int total = 0;
//     int i = 1;

//     while(i <= 100) {
//       total = total + i;
//       System.out.println("i = "+ i + " total ="+ total);
//       i++;
//     }
//     System.out.println(total);
// }
// }



/* 문제2) while문에 i를 이용하여 1~10까지 출력합니다.
         if 문을 추가하여 i가 짝수일때만 i가 출력되게 하세요.

 */
// public class Main {
//   public static void main(String[] args) {
//     int i = 1;
//     while (i < 11) {
//       if (i % 2 == 0) {
//         System.out.println(i);  // 짝수들만 출력된다.
//       }
//       i++;
//     }
//   }
// }


/* 
반복문 = do~while  
  조건이 참일 동안 반복 실행한다. 
  while문은 거짓일 경우 아예 실행되지 않지만, do~while문은 무조건 한 번은 반드시 실행된다.
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

*/


// import java.util.Scanner;  // 키보드로 직접 입력을 받는 기능을 불러온다.
// public class Main {
//   public static void main(String[] args) {
//     int i = 0;
//     Scanner scan = new Scanner(System.in);   // 객체 생성해주고,
//                     //  클래스이름 객체이름 = new 클래스이름();
//     do {
//         i = scan.nextInt();                  // 실제 입력받도록 하는 내용
//         System.out.println("입력받은 값:" + i);
//     } while (i != 0);
//      System.out.println("종료");
     
//   }
// }




// import java.util.Scanner;
// public class Main {
// public static void main(String[] args) {
//   Scanner scan = new Scanner(System.in);   
//   int value = 0;
//   int sum = 0;

//   do {
//     value = scan.nextInt();
//     sum += value;
//   } while (value < 100);  
//   System.out.println("sum :" + sum);
// }
// }




// 반복문 for 문



// public class Main {
//   public static void main(String[] args) {
    
//     int total = 0;
//     int i = 1;

//     while(i <= 100) {
//       total = total + i;
//       System.out.println("i = "+ i + " total ="+ total);
//       i++;
//     }
//     System.out.println(total);
// }
// }



/* for문을 활용하여 1~100까지 모두 더해보자 */
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;

//     for (int i = 1; i <= 100; i++) {   // for문은 기본적으로 인수가 3개이다.(Start; Stop; Step;)
//     sum += i;
//     }
//     System.out.println(sum); // 5050
//   }
// }


/* 중간 과정을 넣으면 */
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;

//     for (int i = 1; i <= 100; i++) {   
//     sum += i;
//     System.out.println("i = " + i + " sum = " + sum);
//     }
//     System.out.println("1부터 100까지 숫자의 모든 합은 " + sum + " 입니다"); // 5050
//   }
// }





// 1부터 100까지의 수중 홀수들의 누적 합계 구하시오. continue 를 사용하여,
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;

//     for (int i = 1; i <= 100; i++) {   
//       if (i % 2 == 0) {
//         continue;
//       }
//       sum += i;
//     }
//     System.out.println(sum);  // 2500 
//   }
// }


// 1부터 100까지의 수중 홀수들의 누적 합계를 구하는 중 break;를 사용하시오.
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;

//     for (int i = 1; i <= 100; i++) {     // for문은 (Start 초기문,  Stop 조건문,  Step 증강문)
      
//       sum += i;

//       if (i == 50) {
//         break;
//       }
      
//     }
//     System.out.println(sum);  // 1275
//   }
// }


/*  for each  
    for문을 다르게 사용하는 방식이다.  */


// public class Main {
//   public static void main(String[] args) {
//     String[] number = {"one", "two", "three"};
//     for (int i = 0; i < number.length; i++) {   // for문 (Start, Stop, Step)
//       System.out.println(number[i]);
//     }

//   }
// }


// 위 구문을 for each를 사용하여
// public class Main {
//   public static void main(String[] args) {
//     String[] number = {"one", "two", "three"};
    
//     for (String num: number){    // number에서 하나씩 꺼내서 num으로 담는다.
//       System.out.println(num);
//     }
 
//     } 
//   }






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




// 위 내용을 if를 사용하지 않고 조건문 -> 삼항연산자
// public class Main {
//   public static void main(String[] args){
//     System.out.println((5>4) ? 50 : 40);
//                 //     (조건) ?(맞으면) 값 :(아니면) 값;
//   }
// }
