package src.ControlExam;
import java.util.Scanner;
public class ForExam {
    public static void main(String[] args) {
        

    }
}
//
//





//         int[] arr = {1,2,3,4,5};
//         int sum = 0;
//         int count = 0;
//         for (int i : arr) {
//             sum += i;          
//             count++;      // int count를 이렇게 표현할 수도 있다.

//         }  System.out.printf("총합은 %d입니다.%n", sum); // 15 (for문 밖에서)
//            System.out.printf("갯수는 %d입니다.", count);
//     }
// }
// // 배열 원소의 갯수






//         int[] arr = {1,2,3,4,5};
//         int sum = 0;

//         for (int i : arr) {
//             sum += i;          
//         }  System.out.printf("총합은 %d입니다.", sum); // 15 (for문 밖에서)
//     }
// }
// // 배열을 하나씩 꺼내서 모두 더한 값을 출력하시오.







//         int[] arr = {1,2,3,4,5};

//         for (int i : arr) {
//             System.out.println(i);
//         }
//     }
// }
// // 아래 내용을 for each를 사용하면 간략하게 표현할 수 있다.




//         int[] arr = {1,2,3,4,5};
        
//         for(int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }
// // 배열을 하나씩 꺼내서
// // 1
// // 2
// // 3
// // 4 
// // 5 를 출력하시오.
//for (타입 변수명 : 배열 또는 컬렉션) {







//         Scanner sc = new Scanner(System.in);
//         System.out.println("*을 출력할 라인의 수를 입력하세요. >");

//         int k = sc.nextInt();

//         for (int i = 1; i <= k; i++) {
//             for (int j = k; j >= i; j--) {
//                 System.out.print("*");
//             } System.out.println();  
//         }
//     }
// }
// // 역 삼각형 만드시오.






//         Scanner sc = new Scanner(System.in);
//         System.out.println("*을 출력할 라인의 수를 입력하세요. >");

//         int k = sc.nextInt();

//         for (int i = 1; i <= k; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             } System.out.println();    
//         }

//     }
// }
// // *을 출력할 라인의 수를 입력하세요. > 5
// // 갯수만큼 삼각형 별을 만드시오.
// // *
// // **
// // ***
// // ****
// // *****




//         for (int i = 2; i < 10; i++) {
//             for (int j = 1; j < 11; j++) {
//                 System.out.printf("%d * %d = %d\t", i,j,i*j); // 일정한 간격으로 정렬할 때 \t를 써보자                  
//             } System.out.println();
//         }  
//     }
// }
// Quiz 구구단을 출력하세요.
// 2 * 1 = 2      2 * 2 = 4   
// 3 * 1 = 3      3 * 2 = 6 
// 이렇게 일정한 간격으로 출력하시오. 제어문자 \t 커서를 그 줄의 일정한 값(tab)만큼 이동한다.







//         for (int i=1, j=10; i < 11; i++, j--) {
//             System.out.printf("%d \t% d%n", i, j);
//         }   
//         }             
//     }
// // Quiz 아래처럼 출력되도록 작성하시오.
// // 1      10
// // 2      9
// // 3      8
// // ...   
// // 9    2
// // 10   1 









//         int a = 0;
//         for (int i = 1; i < 11; i++) {
//             a += i;
//             System.out.printf("1부터 %d까지의 합: %d%n", i, a);
//             System.out.println("1부터 " + i + "까지의 합: " + a);
//         }
//     }
// }
// // Quiz 1부터 10까지의 합을 출력하시오.
// // 단 누계 값까지 출력하세요.
// // 1부터 1까지의 합: 1
// // 1부터 2까지의 합: 3
// // 1부터 3까지의 합: 6
// // 이런 방식으로 







//         for (int i = 1; i < 6; i++) {
//             System.out.println(i);
//         } for (int i = 1; i < 6; i++) {
//             System.out.print(i);
//         }
//     }
// }
// // Quiz 1부터 5까지를 
// // 1
// // 2
// // 3
// // 4
// // 5
// // 12345



/*
For 반복문 : 어떤 작업을 반복적으로 수행되도록 할 때 사용
     반복 횟수를 정확히 측정할 때 주로 사용된다.
     문법이 직관적이라 가독성이 좋다.
    
     for (초기값start; 조건식stop; 증감식step);
     
     초기값  -> 조건식 -> 수행할문장 ... -> 증감식 
             -> 조건식 -> 수행할문장 ... -> 증감식 
             -> 조건식 -> 수행할문장 ... -> 증감식 
             -> 조건식 -> 종료

            초기값 : 반복문에 사용할 변수를 초기화한다. 처음에 딱 한 번만 실행된다.
                    보통은 변수를 하나만 사용하지만 2개 이상도 사용 가능하다.
                    for (int i=1, j=0; i < 10; i++);   이런식으로

            조건식 : 조건식의 값이 참일 경우 계속 반복 실행하다가 거짓이 되는 경우 중단된다.
                    조건식을 잘못 설정할 경우 한 번도 실행되지 않는 경우가 발생할 수 있고,
                    for (int i=10, j=0; i < 10; i++);  이런식으로 
                    영원히 반복되는 경우가 발생할 수 있다.(무한루프)

            증감식 : i++, i--, i += 2(i = i + 2)
                    
            초기값, 조건식, 증감식은 전부 혹은 하나도 생략이 가능하다.
            for (;;);    모두 생략, 무한 반복된다. (탈출 지점을 만들어줄 수 있다.)



 향상된 for 구문 - for each 
     for (타입 변수명 : 배열 또는 컬렉션) {
         
     }


*/