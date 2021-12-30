package src.ControlExam;
import java.util.Scanner;
public class WhileExam {
    public static void main(String[] args) {

    }
}


//         Scanner sc = new Scanner(System.in);
//         System.out.println("누적 합계를 원하는 숫자를 입력하세요. >");

//         int i = sc.nextInt();
//         int j = 1;
//         int sum = 0;
        

//         while (j <= i) {
//             sum += j;
//             System.out.printf("%d - %d%n", j, sum);
//             j++;
//         }
//     }
// }
// "누적 합계를 원하는 숫자를 입력하세요. > 10"
// 1 - 1
// 2 - 3
// 3 - 6
// 4 - 10
// 10 - 55
// 이렇게 출력하시오.






//         Scanner sc = new Scanner(System.in);
//         System.out.println("숫자를 입력하세요. ");

//         int i = sc.nextInt();
//         int sum = 0;

//         while (i != 0) {
//             sum += i % 10;    // +1   +2   +3(몫이 0 이고, 나머지가 3)
//             i /= 10;          // 321를 10으로 나눠 몫인 32를 다시 10으로 나눠서 나머지 2
//         } System.out.println("각 자리수의 합 : " + sum);
//     }
// }
// // 숫자를 입력하면 그 각각의 숫자들의 합을 계산하여 출력하시오.
// // 숫자를 입력하세요. >321
// // 각 자리수의 합 : 6












//         System.out.println("카운트 다운 시작");
//         int i = 10;
//         while(i >= 1) {     
//             System.out.println(i);   
//             i--; 

//             long j = 99_999_999_999_999_999L;    // 숫자를 자리 표시할 때 _를 사용할 수 있다.
//             while(j >= 0) {
//                 j--;
//             }
//         } 
//         System.out.println("Awesome!!!");

//     }
// }
// // Quiz 
// // while문을 사용하여 카운트 다운 시작 
// // 10
// // 9
// // 8
// // 7
// // 1 
// // Awesome!!!   이렇게 출력하시오.
// // 카운트 다운을 하는 중간 중간 쉬었다가 다음 카운트로 넘어가도록 추가 설정하시오.




/*
 while 반복문은 for에 비해서 구조가 간단하다.
     조건식이 참일 동안 반복 수행한다.
     조건식을 생략할 수 없다. 보통 조건식에 true를 넣어 무한 반복 수행
     for(::)    while(true) 
     각각의 제어문에서 무한 반복이다.
     무한 반복 설정 시에는 반드시 종료 조건을 만들어야 한다.

     while (조건식) {
         수행할문장
     }


    
     for (초기화; 조건식; 증감식);   
     for (int i = 0; i < 5; i++);   이 for문을 while으로 표현하면

     
     int i = 0;  초기화
     while (i < 5 조건식) {
        수행할문장
        i++; 증감식
     }



*/