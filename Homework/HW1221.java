import java.util.Random;
import java.util.Scanner;
public class HW1221 {
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("요소 수:");
    //     int l = sc.nextInt();

    //     int[] a = new int[l];

    //     for (int i = 0; i < l; i++) {
    //         System.out.print("요소의 값:");
    //         int s = sc.nextInt();
    //         a[i] = s;      
    //         System.out.println("a["+i+"] = " + s); 
    //     } 
    //     for (int j : a) 

    //         System.out.println("a = {" +j+ "}");
    //     }
    // }

// # 6-6
// 배열의 요소 수와 개별 요소의 값을 입력 받아서 표시하는 프로그램을 작성
// 표시 형식은 배열 초기값과 같은 형식으로, 각 요소의 값을 쉼표로 연결하고 {}로 감싼 형태이다.
// 실행 예
// 요소 수:3
// a[0] = 5
// a[1] = 7
// a[2] = 8
// a = {5, 7, 8}





//         double[] a = new double[5];             // 요소 개수가 5인 double형 배열 a 선언
//         double[] b = {1.1, 2.2, 3.3, 4.4, 5.5}; // 대입할 값을 가진 double형 배열 b 선언

//         for (int i = 0; i < a.length; i++) {   // 변수 i를 0부터 배열a의 크기까지 1씩 증가시킨다.
//             a[i] = b[i];                       // 배열 b의 값을 배열 a의 자리에 하나씩 담는다.
//             System.out.println("a["+i+"] = " + a[i]);
//         }

//     }
// }
// # 6-3
// 요소 개수가 5인 double형 배열을 만들고 앞에서부터 1.1, 2.2, 3.3, 4.4, 5.5를 대입해서
// 표시하는 프로그램을 작성하자.
// 실행 결과
// a[0] = 1.1
// a[1] = 2.2
// a[2] = 3.30000000000003
// a[3] = 4.4
// a[4] = 5.5






//         int[] a = new int[5];           // 5의 크기를 갖고 정수형 int를 담을 수 있는 배열의 변수 a선언
//         int[] b = {5,4,3,2,1};          // 대입할 값을 가진 int형 배열 변수 b 선언

//         for (int i = 0; i < a.length; i++) {  // a배열의 크기만큼 변수 i를 0부터 1씩 증가시킨다.
//             a[i] = b[i];                      // b배열의 있는 요소를 a배열로 넣는다.
//             System.out.println("a["+i+"] = " + a[i]);
//         }
//     }
// }
// # 6-2
// 요소 개수가 5개인 int형 배열에 순서대로 5,4,3,2,1을 대입하는 프로그램 작성
// 실행 결과
// a[0] = 5
// a[1] = 4
// a[2] = 3
// a[3] = 2
// a[4] = 1






//         double[] a = new double[5];   
//      // double자료형을 담을 수 있고 배열의 크기가 5인 변수 a선언
//         for (int i = 0; i < a.length; i++) {  // 변수 i를 0으로 초기화 하고 배열 a의 크기 만큼 1씩 증가시킨다.
            
//              System.out.println("a["+i+"] = " + a[i]);   
//         }      
//     }
// }
// # 6-1
// // 자료형은 double이고 요소 수가 5인 배열을 생성하고 이 배열의 모든 요소를 
// // 표시하는 프로그램을 작성하자.
// // 실행 결과
// // a[0] = 0.0
// // a[1] = 0.0
// // a[2] = 0.0
// // a[3] = 0.0
// // a[4] = 0.0






//         Scanner sc = new Scanner(System.in);
//         Random r = new Random();
//         int a = r.nextInt(100);     // 0~99까지의 난수 생성
//         int c = 10;                 // 남은 횟수
//         int count = 0;              // 몇 회만에 맞추었는지 확인하기 위한 변수 
//         int i;                      // 키보드로 입력받을 변수 선언

//         System.out.println("숫자 맞추기 게임 시작!");
//         System.out.println("0부터 99사이의 숫자를 맞추세요.");
        
//         do {
//             System.out.print("남은 횟수 " + c + ", 어떤 숫자일까?:");
//             i = sc.nextInt();           // 변수 i로 입력을 받는다.
//             count++;                    // 숫자를 입력할 때마다 count를 1씩 증가시킨다. 
            

//             if (i < a) {
//                 System.out.println("더 큰 숫자입니다.");
//                 System.out.println();                  // 콘솔창이 잘 구분되도록 줄 띄움
//             } else if (i > a) {
//                 System.out.println("더 작은 숫자입니다.");
//                 System.out.println();
//             }
//             c--;             // 입력할 때마다 남은 횟수에서 1씩 감소시킨다.
//             if (c == 0) {    // 남은 횟수가 0이 될 경우, 정답을 공개하고 게임을 종료한다.
//                 System.out.println("제한 횟수 내에 맞추지 못했습니다.");
//                 System.out.println("정답은 " + a + "입니다. 게임을 종료합니다.");
//                 break;
//             }
//         }
//         while (i != a);     // 입력된 값이 정답과 다를 경우
//         System.out.println(count + "회만에 맞추었습니다.");
//         System.out.println("정답은 " + a + "입니다. 게임을 종료합니다.");
     
//     }
// }
// # 4-30
// 숫자 맞추기 게임 
// 범위 0~99, 플레이어가 입력할 수 있는 횟수를 제한하도록 작성하라
// 제한 횟수 내에 맞추지 못한 경우 정답을 표시하고 게임을 종료할 것
// 숫자 맞추기 게임 시작!
// 0부터 99사이의 숫자를 맞추세요.

// 남은 횟수 6회, 어떤 숫자일까?:50
// 더 큰 숫자입니다.

// 남은 횟수 5회, 어떤 숫자일까?: 75
// 더 작은 숫자입니다.

// 남은 횟수 4회, 어떤 숫자일까?: 62
// 3회만에 맞추었습니다. 

