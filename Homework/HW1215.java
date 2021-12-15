// # 4-21
// package JavaInter;
// import java.util.Scanner;
// public class HW {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int i;                   // 숫자를 담을 변수 i 선언
        
//         i = scan.nextInt();      // .nextInt() 메서드를 사용하여 입력 받은 숫자를 변수 i에 담는다.
        
//         System.out.println("정방형을 표시합니다.");
//         System.out.printf("단수는:%d%n", i);     // 입력 받은 값을 출력한다.

//         for (int j = 1; j <= i; j++)  {       // 변수 j,k를 1로 초기화 한다.
//             for (int k = 1; k <= i; k++) {    // 입력 받은 값까지 1씩 순차적으로 증가하는 반복문 for
//                 System.out.print("*");        // 입력 받은 숫자의 값까지 *을 찍어준다.
//             }
//             System.out.println();             // 입력 받은 숫자의 값의 줄까지 *을 찍어준다.
//         }
//     }
// }
// 기호 문자 '*'을 나열해서 n단의 정방형을 표시하는 프로그램 작성
// 정방형을 표시합니다.
// 단수는:3
// ***
// ***
// ***






// # 4-14
// package JavaInter;
// import java.util.Scanner;
// public class HW {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n;                // 입력받을 변수 n 선언
//         int j = 0;            // n까지의 합(결과값)을 모두 더하여 넣을, 변수 j를 0으로 초기화하여 선언

//         n = scan.nextInt();                    // .nextInt();메서드를 사용하여 입력받은 값을 변수 n에 넣는다.
//         System.out.printf("1부터 %d까지의 합을 구합니다.n의 값:%d%n", n,n);  // 입력된 값을 출력하여 확인한다.
        

//         for (int i = 1; i <= n; i++) {   // 변수 i를 1로 선언하여, 1부터 n까지 순차적으로 1씩 증가하는 반복문 for 선언
//             j += i;                      // 1부터 n까지 1씩 순차적으로 증가한 숫자를 모두 더하여, 변수 j에 넣는다.
//         } System.out.printf("1부터 %d까지의 합은 " + j + "입니다.\n", n);     // 결과를 출력해준다.
//     }
// }
// 1부터 n까지의 합을 구하는 프로그램을 for문을 사용해 작성하자.
// 1부터 n까지의 합을 구합니다.n의 값:5
// 1부터 n까지의 합은 15입니다.







// # 4-2
// package JavaInter;
// import java.util.Scanner;
// public class HW {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);   // 객체 생성
//         int i;                           // 입력받을 변수 선언
 
//         while (true) {                             // 반복문 while 
//             i = scan.nextInt();                    // 입력받을 값을 변수i에 담는다.
//             System.out.println("세 자리의 정숫값:" + i);  // 받은 값을 출력

//             if (i < 1000 && i > 99) {      // if문으로 3자릿수 범위를 정해준다.(100~999)
//                 System.out.println("입력한 값은 " + i + "입니다."); 
//                     break;                 // 범위 내의 값(100~999)이 입력될 경우, 내용을 출력 후 while문을 빠져 나온다.
//             } else {                       // 범위 내의 값(100~999)이 아닐 경우 while문을 반복한다.
//                   continue;
//         }
//     }
// }
// }
// 3자리의 양의 정숫값(100~999)을 읽는 프로그램을 작성
// (입력한 값이 3자리 양의 정숫값이 아니면 다시 입력하게 할 것)
// 세 자리의 정숫값:59
// 세 자리의 정숫값:1052
// 세 자리의 정숫값:235
// 입력한 값은 235입니다.









// # 3-21
// package JavaInter;
// import java.util.Scanner;
// public class HW {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int i;                          // 사용할 변수 초기화
       
//         i = scan.nextInt();             // 입력받을 값을 출력해준다.
//         System.out.println("몇 월입니까?:" + i);  
//                                         // 각 계절마다 월의 범위를 정해준다.                 
//         if (i < 6 && i > 2) {                    // 봄은 3~5월
//             System.out.println("봄");   
//         } else if (i < 9 && i > 5) {             // 여름은 6~8월
//             System.out.println("여름");
//         } else if (i < 12 && i > 8) {            // 가을은 9~11월
//             System.out.println("가을"); 
//         } else if (i < 3 && i > 0 || i == 12) {  // 겨울은 1~2월과 12월
//             System.out.println("겨울");
//         } else {                        // 정해진 범위(1~12)가 아닌 값이 들어올 경우를 출력해준다.
//             System.out.println("그런 월은 없습니다.");
//         }
//     }
// }
// 월을 1~12의 정숫값으로 읽어서 해당하는 계절을 표시하는 프로그램 작성
// 몇 월입니까?:6
// 여름
// 몇 월입니까?:11
// 가을
// 몇 월입니까?:13
// 그런 월은 없습니다.
// 3,4,5월은 봄 / 6,7,8월은 여름 / 9,10,11월은 가을 / 12,1,2월은 겨울








// # 3-15
// package JavaInter;
// import java.util.Scanner;  
// public class HW {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a,b,c,min;            // 입력받을 3개의 변수(a,b,c)와 최솟값을 구하기 위한 변수(min) 초기화
       
//         a = sc.nextInt();
//         b = sc.nextInt(); 
//         c = sc.nextInt();         // 입력을 받기 위해 Scanner클래스의 .nextInt() 메서드 사용

//         System.out.println("정수 a:" + a);    // 입력받은 3개의 값들을 차례로 출력하여 확인한다.
//         System.out.println("정수 b:" + b);   
//         System.out.println("정수 c:" + c);    

//         min = a;                 // 입력된 a의 값을 최솟값으로 가정하고
//         if (b < min) min = b;    // 입력된 b,c 값과 비교하여 최솟값을 정의해준다.
//         if (c < min) min = c;

//         System.out.println("최솟값은 " + min + "입니다.");
//     }
// }
// 키보드에서 입력한 3개의 정수 중 최솟값을 구하는 프로그램
// 정수 a:3
// 정수 b:1
// 정수 c:2
// 최솟값은 1입니다.