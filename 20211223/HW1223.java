import java.util.*;

// class Min3 {
// // a,b,c의 최솟값 반환
//     static int min (int a, int b, int c) {
//         int min = a;
//         if (b < min) min = b;
//         if (c < min) min = c;
//         return min;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.printf("정수 a:"); int a = sc.nextInt();
//         System.out.printf("정수 b:"); int b = sc.nextInt();
//         System.out.printf("정수 c:"); int c = sc.nextInt();
//         System.out.println("최솟값은 " + min(a,b,c) + "입니다.");
//     }
// }
/*
 # 7-2
 3개의 int형 인수 a,b,c 중 최솟값을 구하는 min 메서드를 작성하자.
 int min (int a, int b, int c)
 실행 예
 정수 a:1
 정수 b:3
 정수 c:2
 최솟값은 1입니다.

*/











// import java.util.*;


// class SignOf1 {
//     // n의 부호 판정
//     static int signOf(int n) {
//         int sign = 0;

//         if (n > 0)
//         sign = 1;
//         else if (n < 0)
//         sign = -1;
//         return sign;   // sign 값 반환
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("정수 x:");
//         int x = sc.nextInt();

//         int s = signOf(x);  // return sign
//         System.out.println("signOf(x)는 " + s + "입니다.");
//     }
// }
/*
# 7-1
입력한 int형 정숫값이 음수이면 -1을, 0이면 0을, 양수이면 1을 반환하는
sighOf메서드를 작성하자.
실행 예1
정수 x:13
signOf(x)는 1입니다.
실행 예2
정수 x:0
signOf(x)는 0입니다.
실행 예3
정수 x:-15
signOf(x)는 -1입니다.

*/











//         Scanner sc = new Scanner(System.in);
//         int[][] a = new int[4][3];    // 4행 3열의 행렬
//         int[][] b = new int[3][4];    // 3행 4열의 행렬
//         int[][] c = new int[4][4];    // a와 b의 곱을 저장하는 행렬

//         System.out.println("행렬 a의 요소를 입력하세요.");
//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.printf("a[%d][%d] : ", i,j);
//                 a[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("행렬 b의 요소를 입력하세요.");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.printf("b[%d][%d] : ", i,j);
//                 b[i][j] = sc.nextInt();
//             }
//         }
        
//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 4; j++) {
//                 c[i][j] = 0;
//                 for (int k = 0; k < 3; k++) {
//                     c[i][j] += a[i][k] * b[k][j];
//                 }
//             }
//         }
//         System.out.println("행렬 a와 b의 곱");
//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 4; j++) 
//             System.out.printf("%5d", c[i][j]);
//             System.out.println();
//         }
//     }
// }
/*
# 6-18
4행 3열의 행렬과 3행 4열의 행렬을 곱하는 프로그램을 작성하자. 
각 요소의 값은 키보드를 통해 입력할 것.


*/








//         Random r = new Random();
//         Scanner sc = new Scanner(System.in);

//         String[] dayKorean = {"일","월","화","수","목","금","토"};
//         String[] dayEnglish = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

//         System.out.println("요일명을 영어 소문자로 입력하시오.");
        
//         int retry;      // 다시 한번
//         int last = -1;  // 이전 요일

//         do {
//             int day;   // 표시할 요일 : 0~6의 난수
//           do {
//               day = r.nextInt(7);
//           } while (day == last);
//           last = day;

//           while (true) {
//               System.out.print(dayKorean[day] + "요일:");
//               String s = sc.next();

//               if (s.equals(dayEnglish[day])) break;  // 정답
//               System.out.println("틀렸습니다.");
//           }
//           System.out.print("정답입니다. 다시 한번? 1...Yes/0...No:");
//           retry = sc.nextInt();
//     } while (retry == 1);
// }
// }
/*

# 6-16
요일을 표시하고 해당 요일의 영어 단어를 입력하는 영어 학습 프로그램을 작성하자.
. 요일은 난수를 사용해서 생성할 것
. 학습자가 원하는 만큼 반복할 것
. 동일 요일을 연속해서 표시하지 말 것
실행 예
요일명을 영어 소문자로 입력하시오.
일요일:sunday
정답입니다. 다시 한번? 1...Yes/0...No:1
수요일:wednesday
정답입니다. 다시 한번? 1...Yes/0...No:0

*/












//         Random r = new Random();
//         Scanner sc = new Scanner(System.in);

//         String[] monthString = {
//             "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
//         };

//         System.out.println("해당 월의 영어 단어를 입력하시오.");
//         System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");

//         int retry;      // 다시 한 번
//         int last = -1;  // 이전 월

//         do {
//             int month;      // 표시할 월:0~11의 난수
//           do {
//               month = r.nextInt(12);
//           } while (month == last);

//           while (true) {
//               System.out.print((month + 1) + "월:");
//               String s = sc.next();

//               if (s.equals(monthString[month])) break;  // 정답
//               System.out.println("틀렸습니다.");            
//           }
//           System.out.print("정답입니다. 다시 한번? 1...Yes/0...No:");

//           retry = sc.nextInt();
//     } while(retry == 1);
// }
// }
/* 

# 6-15
월을 1~12의 숫자로 표시하고 해당 월의 영어 단어를 입력하는 프로그램을 작성하자.
월은 난수로 생성할 것
학습자가 원하는 동안은 계속 반복해서 문제를 낼 것
동일 월을 연속해서 표시하지 말 것
문자열 s1과 s2가 같은지 판정(모든 문자가 동일)하는 것은 s1.equals(s2)를 사용한다.
실행 예
해당 월의 영어 단어를 입력하시오.
첫 글자는 대문자, 나머지는 소문자로 입력하세요.
12월:December
정답입니다. 다시 한번? 1...Yes/0...No:1
10월:March
틀렸습니다.
10월:October
정답입니다. 다시 한번? 1...Yes/0...No:0

*/





















































