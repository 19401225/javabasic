import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class HW1222 {
    public static void main(String[] args) {


//         Scanner sc = new Scanner(System.in);
//         System.out.print("요소 수:");
//         int input = sc.nextInt();  // 요소 수 입력
//         int[] a = new int[input];  // 입력된 값을 요소의 수로 하는 배열 a 선언
//         int[] b = new int[input];  // 역순으로 복사할 배열 b 선언

//         for (int i = 0; i < input; i++) {   
//             System.out.print("a["+i+"] = ");
//             a[i] = sc.nextInt();     // 입력된 값을 배열a에 담는다.
//         }
//         System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
//         for (int i = a.length-1, j = 0; i >= 0; i--, j++) {   
//             b[j] = a[i];                         // 배열a의 값을 배열b에 거꾸로 담는다.
//         } for (int i = 0; i < b.length; i++) {   // 배열b를 순차적으로 출력하여 확인한다.
//             System.out.println("b["+i+"] = " + b[i]);
//         }
//     }
// }
// # 6-14
// 배열a의 모든 요소를 역순으로 배열b에 복사하는 프로그램을 작성하자.
// 두 배열의 요소 수는 동일하다고 가정해도 좋다.
// 실행 예
// 요소 수:5
// a[0] = 11
// a[1] = 12
// a[2] = 13
// a[3] = 14
// a[4] = 15
// a의 모든 요소를 역순으로 복사했습니다.
// b[0] = 15
// b[1] = 14
// b[2] = 13
// b[3] = 12
// b[4] = 11




// Random r = new Random();
// Scanner sc = new Scanner(System.in);

// System.out.print("요소 수:");
// int n = sc.nextInt();
// int[] a = new int[n];

// for (int i = 0; i < n; i++) {
//     System.out.print("a["+i+"] = ");
//     a[i] = sc.nextInt();
// }
// for (int i = 0; i < 2*n; i++) {
//     int idx1 = r.nextInt(n);
//     int idx2 = r.nextInt(n);
//     int t = a[idx1];
//     a[idx1] = a[idx2];
//     a[idx2] = t;
// }
// System.out.println("요소를 섞었습니다.");
// for (int i = 0; i < n; i++) 
// System.out.println("a["+i+"] = " + a[i]);
//     }
// }

// # 6-13
// 배열의 나열 순서를 섞는(임의의 순서가 되도록 순서를 바꿈) 프로그램을 작성하자.
// 실행 예
// 요소 수:7
// a[0] = 22
// a[1] = 57
// a[2] = 11
// a[3] = 32
// a[4] = 91
// a[5] = 68
// a[6] = 70
// 요소를 섞었습니다.
// a[0] = 22
// a[1] = 32
// a[2] = 68
// a[3] = 11
// a[4] = 70
// a[5] = 57
// a[6] = 91






// Random r = new Random();
// Scanner sc = new Scanner(System.in);

// int n;  //요소 수
// do {
//     System.out.print("요소 수:");
//     n = sc.nextInt(); // 요소 수 읽기
// } while (n > 10);
// int[] a = new int[n];   // 배열 생성

// for (int i = 0; i < n; i++) {
//     int j;
//     do {
//         j = 0;
//         a[i] = 1 + r.nextInt(10);
//         for (; j < i; j++) 
//             if (a[j] == a[i]) break;
//     } while (j < i);
// }
// for (int i = 0; i < n; i++)
//     System.out.println("a["+i+"] = " +a[i]);

// }
// }
// # 6-12
// 서로 다른 요소가 동일한 값을 지니지 않도록 프로그램을 작성하자.
// 예를 들어 {1,3,5,6,1,2}가 되지 않아야 한다.(배열의 요소 수는 10이하일 것)
// 배열의 모든 요소를 1~10의 난수로 채울 것 (모든 요소가 중복돼서는 안 된다.)
// 실행 예
// 요소 수:7
// a[0] = 9
// a[1] = 10
// a[2] = 2
// a[3] = 7
// a[4] = 8
// a[5] = 6
// a[6] = 3









//         Random r = new Random();
//         Scanner sc = new Scanner(System.in);
        

//         System.out.print("요소 수:");
//         int input = sc.nextInt();   // 요소 수 입력
//         int[] a = new int[input];   // 입력한 수가 요소의 수가 되는 배열 생성

//         a[0] = 1 + r.nextInt(10);

//         for (int i = 1; i < input; i++) {     // 배열a의 위치를 위해 변수 i를 0부터 1씩 증가
//             do {
//                 a[i] = 1 + r.nextInt(10);  // 1~10 난수
//             } while (a[i] == a[i-1]);
//         }
//         for (int i = 0; i < input; i++)
//         System.out.println("a["+i+"] = " +a[i]);              
//     }
// }
    

// ## 6-11
// 인접하는 요소가 동일한 값을 가지지 않도록 프로그램을 작성하시오.
// 예를 들어 {1,3,5,5,3,2} 가 돼서는 안 된다.
// 실행 예
// 요소 수:7
// a[0] = 5
// a[1] = 7
// a[2] = 5
// a[3] = 9
// a[4] = 3
// a[5] = 10
// a[6] = 2











//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("요소 수:");
//         int input = sc.nextInt();   // 요소 수 입력
//         int[] a = new int[input];   // 입력한 수가 요소의 수가 되는 배열 생성

//         for (int i = 0; i < input; i++) {  // 요소의 위치가 될 i를 input의 전까지 1씩 증가시킨다.
//             System.out.print("a["+i+"] = " );
//             a[i] = sc.nextInt();           // 입력된 값을 배열a에 넣는다.
//         }
//         System.out.print("찾을 숫자:");
//         int num = sc.nextInt();

//         int i;
//         for (i = 0; i < input; i++)   // 배열의 위치 0부터 1씩 증가시켜 찾는다
//             if (num == a[i])             // 찾는 숫자와 일치하면 아래를 출력한다.
//                 break;

//             if (i < input) 
//                 System.out.println("그 값은 a["+i+"]에 있습니다.");
//             else 
//                 System.out.println("해당 값이 존재하지 않습니다.");
             
//     }
// }
// ####### 6-8
// 배열에서 특정 값을 가지는 요소를 찾아라. 동일 값의 요소가 여러 개 있으면
// 가장 앞에 위치한 요소를 찾는 프로그램과 가장 뒤에 있는 요소를 찾는 프로그램을 작성하자.
// 실행 예
// 요소 수:7
// a[0] = 22
// a[1] = 57
// a[2] = 11
// a[3] = 32
// a[4] = 91
// a[5] = 32
// a[6] = 70
// 찾을 숫자:32
// 그 값은 a[3]에 있습니다.