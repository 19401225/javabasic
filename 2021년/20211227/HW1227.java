

// import java.util.Scanner;
// import java.util.Random;

// class Main {
//     // a 이상 b이하의 난수 생성
//     static int random(int a, int b) {
//         if (b <= a)
//         return a;
//         else {
//             Random r = new Random();
//             return a + r.nextInt(b - a + 1);
//         }
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("난수를 생성합니다.");
//     System.out.print("하한값:"); int min = sc.nextInt();
//     System.out.print("상한값:"); int max = sc.nextInt();
//     System.out.println("생성한 난수는 " + random(min,max) + "입니다.");
// }
// }
/*
# 7-8
난수(a <= 난수 <= b)를 생성해서 반환하는 random 메서드를 작성하자.
메서드 안에서 난수를 생성하는 표준 라이브러리를 호출할 것
(참고, b <= a 인 경우 a값을 그대로 반환할 것)
int random(int a, int b)

실행 예
난수를 생성합니다.
하한값:10
상한값:99
생성한 난수는 52입니다.

*/











// import java.util.*;

// class Main {
//     // 문자 c를 n개 연속 표시
//     static void putChars(char c, int n) {
//         while (n-- > 0)
//         System.out.print(c);
//     }
//     // 문자 '*'을 n개 연속 표시
//     static void putStars(int n) {
//         putChars('*', n);
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
//     System.out.print("단수는:");
//     int n = sc.nextInt();
//     for (int i = 1; i <= n; i++) {
//         putStars(i);
//         System.out.println();
// }
// } 
// }
/*
# 7-7
문자 c를 n개 표시하는 putChars 메서드와 이 메서드를 내부에서 호출해서
문자 '*'을 n개 연속으로 표시하는 putStars 메서드를 작성하자.
또한 이 메서드들을 사용해서 직삼각형을 만드는 프로그램을 작성하자.

실행 예
왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.
단수는:4
*
**
***
****
*/














// import java.util.*;

// class Main {

//     static void printSeason(int m) {
        
//         switch(m) {
//             case 12: case 1: case 2: System.out.println("겨울"); break;
//             case 3: case 4: case 5: System.out.println("봄"); break;
//             case 6: case 7: case 8: System.out.println("여름"); break;
//             case 9: case 10: case 11: System.out.println("가을"); break;      
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
       
//         int month;
//         do {
//             System.out.print("몇 월입니까(1 ~ 12):");
//             month = sc.nextInt();
//         } while (month < 1 | month > 12);
//         System.out.print("해당 월의 계절은 "); printSeason(month);
//         System.out.print("입니다.");
//     }
// }
/*
# 7-6
인수 m에 지정한 달(월)의 계절을 표시하는 printSeason 메서드를 작성하자.
m값에 따라 봄(3,4,5), 여름(6,7,8), 가을(9,10,11), 겨울(12,1,2)을 표시하고
이외의 값이 오면 아무것도 표시하지 않는다.
void printSeason(int m)

실행 예
몇 월입니까(1 ~ 12):4
해당 월의 계절은 봄입니다.

*/













// import java.util.*;

// class Main {
//     static int sumUp(int n) {
//         int sum = 0;

//         for (int i = 0; i <= n; i++) 
//             sum += i;
//             return sum; 
//         } 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("1부터 x까지의 합을 구하자.");
//         System.out.print("x의 값:");
//         int a = sc.nextInt();
//         System.out.println("1부터 " + a + "까지의 합은 " + sumUp(a) + "입니다.");
//     }
// }

//// 선생님 풀이
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("1부터 x까지의 합을 구하자.");
//         int x;
//         do {
//             System.out.print("x의 값:");
//             x = sc.nextInt();
//         } while (x <= 0);

//         System.out.println("1부터 " + x + "까지의 합은 " + sumUp(x) + "입니다.");
//     }     
//  }
/*
# 7-4
1부터 n까지의 정수의 합을 구해서 반환하는 메서드를 작성하자.
int sumUp(int n)

실행 예
1부터 x까지의 합을 구하자.
x의 값:5
1부터 5까지의 합은 15입니다.

*/



















// import java.util.*;

// class Med00 {
//     static int md(int a, int b, int c) {

//     if (a >= b)
//         if (b >= c)
//             return b;
//         else if (a <= c)
//             return a;
//         else 
//             return c;
//     else if (a > c)
//         return a;
//     else if (b > c)
//         return c;
//     else 
//         return b;
// }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("정수 a:"); int a1 = sc.nextInt();
//         System.out.print("정수 b:"); int b1 = sc.nextInt();
//         System.out.print("정수 c:"); int c1 = sc.nextInt();
//         System.out.println("중간값은 " + md(a1,b1,c1) + "입니다.");


//     }
// }
/*
# 7-3
3개의 int형 인수 a,b,c에서 중간값을 구하는 med 메서드를 작성하자.
int med(int a, int b, int c)

실행 예
정수 a:1
정수 b:3
정수 c:2
중간값은 2입니다.
*/
