package src.ControlExam;
import java.util.Scanner; 
// import java.util.*;  (import 가 너무 많을 경우 이렇게 하나만 입력하면 된다.)
public class ifExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요 >");

        String i = sc.nextLine();
        char gender = i.charAt(7);

        switch (gender) {
            case '1', '3': System.out.println("당신은 남성입니다."); break;
            case '2', '4': System.out.println("당신은 여성입니다."); break;
        }    
      }
  }
// 주민등록번호를 입력하세요 > 
// 000000 - 0000000
// "당신은 남성입니다."
// "당신은 여성입니다."








//         Scanner scan = new Scanner(System.in);
//         Random rand = new Random();
//         System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요> ");
       
//         int p = scan.nextInt();
//         int c = 1 + rand.nextInt(3);   // 난수가 0부터 생성되기 때문에 앞에 1을 더해준다.

//         System.out.printf("당신은 %d이고 컴퓨터는 %d입니다.%n", p, c);  

//         switch (p-c) {
//             case 2 : case -1:
//                 System.out.println("컴퓨터가 이겼습니다."); break;
//             case 1 : case -2:
//                 System.out.println("당신이 이겼습니다."); break;
//             case 0 : 
//                 System.out.println("비겼습니다.");
//         }  
//     }
// }
// p 1,2,3 과 c 1,2,3 에서 p기준으로 빼주면(p-c)
// p가 이기는 숫자는  1, -2
// c가 이기는 숫자는 -1,  2
// 그리고 비기는 경우가 0으로 나온다.   이렇게 경우의 수를 5개로 줄였다.
//
// Quiz (컴퓨터가 난수를 발생하도록, )
// 가위(1) 바위 (2) 보 (3) 중 하나를 입력하세요>    1 
// 당신은 1이고 컴퓨터는 2입니다.
// 컴퓨터가 이겼습니다.

// 가위(1) 바위 (2) 보 (3) 중 하나를 입력하세요>    1 
// 당신은 1이고 컴퓨터는 3입니다.
// 당신이 이겼습니다.

// 가위(1) 바위 (2) 보 (3) 중 하나를 입력하세요>    1 
// 당신은 1이고 컴퓨터는 1입니다.
// 비겼습니다.






//         Scanner scan = new Scanner(System.in);
//         int i = scan.nextInt();
//         String season = "";
        
//         switch (i) {
//             case 12: case 1: case 2: season = "겨울"; break;
//             case 3: case 4: case 5: season = "봄"; break;
//             case 6: case 7: case 8: season = "여름"; break;
//             case 9: case 10: case 11: season = "가을"; break;
//         } System.out.printf("%d월의 계절은 %s입니다.", i, season);
//     }
// }
// 특정 월을 입력 받아서 3,4,5봄 / 6,7,8 여름, 9,10,11 가능 / 12,1,2 겨울
// "?월의 계절은 ?입니다."
// 조건 : switch 구문의 총 줄의 수는 10줄 이내로 작성하시오.









// Scanner scan = new Scanner(System.in);
// System.out.println("점수를 입력하세요 : ");
// int score = scan.nextInt();
// String grade;

// if (score >= 90) {
//     System.out.println(score >= 98? "A+" : score >= 94? "A" : "A-");
// } else if (score >= 80) {
//        System.out.println(score >= 88? "B+" : score >= 84? "B" : "B-");
// } else if (score >= 70) {
//        System.out.println(score >= 78? "C+" : score >= 74? "C" : "C-");
// } else if (score >= 60) {
//        System.out.println(score >= 68? "D+" : score >= 66? "D" : "D-");
// } else {
//        System.out.println("F");
// }
// }
// }
 // Quiz 2 점수를 입력 받아 
//  98점이상이면 A+, 94점이상이면 A,   90점이상 이면 A-          
//  88점이상이면 B+, 84점이상이면 B,   80점이상 이면 B-          
//  78점이상이면 C+, 74점이상이면 C,   70점이상 이면 C-          
// else if 를 7개 정도만 사용하여 작성
 
 

    


/*
제어문 Control Statement - if, switch, 
   코드의 제일 위에서부터 아래로 한 문장씩 순차적으로 진행되는 프로그램의 흐름을 조절하여 
   일부분은 건너 뛰기도 하고 다시 위에서부터 내려올 수 있게 제어한다.
   

    if (score > 60) {                       // 조건 하나
        System.out.println("합격입니다.");   // true 케이스
    }

(90 <= x && x <= 100)           점수 x가 90점이상 100점 이하 동시 만족
(x < 0 || x > 100)              점수 x가 0 미만 또는 x가 100초과의 경우에서 하나만 만족
(x % 3 == 0 && x % 2 != 0)       x가 3의 배수이기는 하지만, 2의 배수는 아닌 조건
depar == "영업부" || depar == "기획부"        영업부와 기획부만 조건


// if (false)                             // if문에 중괄호를 안쓸 경우 위에 한 줄만 실행된다.
    //     System.out.println("welcome");  // true여서 출력되고(또는 false여서 출력되지 않고)
    //     System.out.println("Hello");    // 전체 구문에서 그냥 출력되고(if와 상관없는 구문)



    // int score = 80;
    // if (score > 60) {         // if문에서 중괄호를 안써도 되지만 꼭 사용하도록 하자.                 
    //     System.out.println("합격입니다.");  
    //     }
//     }
// }



  if - else 구문
     else는  그 밖의 나머지 모든 것을 의미한다.
     
     if (조건식) {
         true ...
     } else {         // else 는 그외 나머지이기 때문에 조건식이 따로 없다.
         else ...
     }


  if - else if 구문
     if else 는 분기가 2개로 수행되는 구조인 반면 처리해야 할 경우의 수가 3개 이상이면
     else if 구문을 사용한다. 조건식을 만족하면 더 이상 다른 조건식은 확인하지 않는다. (걸리면 끝)
     
     if (조건식1) {
         true ...
     } else if (조건식2) {
         true ...
     } else {        
         else ...
     }


     //// if문을 중첩하여 사용할 수 있지만, 가독성이 떨어져 권장하지는 않는다.
     if (조건식1) {           // 기본 if문
         true ...
     } else {        
         if (조건식 {         // else 안의 if문
             true ...
         } else {
             else ...
         }
     }

   switch 구문
     if 문의 경우의 수 항목이 많아질수록 코드의 가독성이 많이 떨어지게 된다.
     평균적인 처리 시간도 항목이 늘어갈수록 길어지게 된다.
     이러한 if문과 달리 switch는 보다 간결하고 알아보기 쉽다.
     보통 처리해야 하는 경우의 수가 아주 많을 경우에 switch를 사용한다.
     switch로 만든 모든 구문은 if로 구현할 수 있지만 
     if로 만든 모든 구문을 switch로 구현할 수는 없다.

     1. 조건식을 계산
     2. 조건식을 만족하는 case문으로 이동한다.
     3. 해당 case문의 구문들을 실행한다.
     4. break; 를 만나기 전까지는 모든 구문을 전부 실행한다.
     
     *. switch 구문 조건식의 결과는 정수 또는 문자열이다.




*/
