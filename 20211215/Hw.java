
// # 4-28
// import java.util.Scanner;
// public class Hw {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.printf("정수를 더합니다.%n몇 개를 더할까요?:");

//         int i = sc.nextInt();

//         if (i <= 0) {
//             System.out.println("음수는 더하지 않습니다.");
//         }

//         int a = sc.nextInt();
//         System.out.println("정수:" + a);
        
//         int b = sc.nextInt();
//         System.out.println("정수:" + b);
        
//         int c = sc.nextInt();
//         System.out.println("정수:" + c);
        

//         int sum = a+b+c;
//         int avg = (a+b+c)/3;
        
                 
//         System.out.println("합계는 " + sum + "입니다.");
//         System.out.println("평균은 " + avg + "입니다.");
//     }
// }





// 정숫값을 연달아 읽어서 음수가 아닌 값의 합계와 평균을 구하자.
// 음수의 개수는 평균을 구할 때 분모에서 제외할 것.
// 정수를 더합니다.
// 몇 개를 더할까요?:3
// 정수:2
// 정수:-5
// 음수는 더하지 않습니다.
// 정수:13
// 합계는 15입니다.
// 평균은 7입니다.




// # 4-27
import java.util.Scanner;
public class Hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("정수를 더합니다.%n몇 개를 더할까요?:");
        int i = sc.nextInt();
        
    
        
        int a = sc.nextInt();
        System.out.println("정수:" + a);
                
        int b = sc.nextInt();
        System.out.println("정수:" + b);
                
        int c = sc.nextInt();
        System.out.println("정수:" + c);

        int sum = a+b+c;
        int avg = (a+b+c)/3;

        if (sum > 999) {
            System.out.printf("합계가 1,000을 넘었습니다.%n마지막 값은 무시합니다.");
        }
    }
}

// 정숫값을 읽어서 합계와 평균을 구하는 프로그램 작성
// 단 정숫값의 입력은 합계가 1,000을 넘지 않은 범위에서 이루어질 것
// 정수를 더합니다.
// 몇 개를 더할까요?:5
// 정수:127
// 정수:534
// 정수:392
// 합계가 1,000을 넘었습니다.
// 마지막 값은 무시합니다.
// 합계는 661입니다.
// 평균은 330입니다.



















// # 4-26
// import java.util.Scanner;
// public class Hw {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.printf("정수를 더합니다.%n몇 개를 더할까요?:");
//         int i = sc.nextInt();
        
//         System.out.println("정수(0으로 종료):" );
//         int a = sc.nextInt();


//     }
// }
// // 정숫값을 연속해서 입력 받아 합계와 평균을 구하는 프로그램 작성
// // (0입력 시 프로그램 종료)
// // 정수를 더합니다.
// // 몇 개를 더할까요?:2
// // 정수(0으로 종료):15
// // 정수(0으로 종료):37
// // 합계는 52입니다.
// // 평균은 26입니다.

// // 정수를 더합니다.
// // 몇 개를 더할까요?:5
// // 정수(0으로 종료):82
// // 정수(0으로 종료):45
// // 정수(0으로 종료):0
// // 합계는 127입니다.
// // 평균은 63입니다.















// # 4-25
// import java.util.Scanner;
// public class Hw {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("2이상의 정숫값: ");
         
//         int i = sc.nextInt();
//         int a = 0;
        
//         for (int j = 1; j <= i; j++) {
//             if (i % j == 0) {
//                 a += 1;
//             } 
//         } if (a == 2){
//             System.out.println("소수입니다.");
//         } else {
//             System.out.println("소수가 아닙니다.");
//         }
//      }
// }

// 양의 정숫값을 읽어서 소수인지를 판정하는 프로그램 작성
// 소수란 2이상 n미만인 수중 어떤 수로도 나누어지지 않는 정숫값 n이다.
// 즉, 자기 자신과 1로만 나누어지는 수
/// 2이상의 정숫값:13
/// 소수입니다.
/// 2이상의 정숫값:14
/// 소수가 아닙니다.












// # 4-22
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.printf("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.%n단수는?:");
//         int i = sc.nextInt();

//         for (int a = 1; a <= i; a++) {
//             for (int b = i; b >= a; b--) {
//                 System.out.print("*");
//             }  System.out.println();
//         } 
//     }
// }



//         Scanner sc = new Scanner(System.in);
//         System.out.printf("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.%n단수는?:");
//         int i = sc.nextInt();
    
//         for (int a = 1; a <= i; a++) {
//             for (int b = 1; b <= a; b++) {
//                 System.out.print("*");
//             } System.out.println();
//         } 
//     }
// }




