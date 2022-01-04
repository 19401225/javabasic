<<<<<<< HEAD
import java.util.Random;
import java.util.Scanner;
public class HW1221 {
    public static void main(String[] args) {

// (선생님 풀이)
//      Scanner sc = new Scanner(System.in);

//      System.out.print("요소 수:");
//      int input = sc.nextInt();   // 요소 수 입력
//      int[] a = new int[input];   // 입력한 수가 요소의 수가 되는 배열 생성

//      for (int i = 0; i < input; i++) {
//          System.out.print("a["+i+"] = " );
//          a[i] = sc.nextInt();
//      } 
//      System.out.print("a = {");
//      if (input >= 2)
//         for (int i = 0; i < input-1; i++)
//          System.out.print(a[i] + ", ");    // 앞에서부터 input -1개 요소
//      if (input >= 1) 
//         System.out.print(a[input-1]);      // 마지막 요소 표시
//        System.out.print("}"); 

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





// (선생님 풀이)
//         double[] a = new double[5];     // 배열 선언

//         for (int i = 0; i < a.length; i++) 
//             a[i] = (i+1) * 1.1;

//         for (int i = 0; i < a.length; i++) 
//             System.out.println("a["+i+"] = " + a[i]);
        
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

// a[0] = 1.10000000000001  // 왜 이렇게 안되지?
// a[1] = 2.20000000000002  // 십진수로 이진수를 정확히 표현하기 어렵다고 함
// a[2] = 3.30000000000003  // 근사치의 값을 나타내는데 이렇게 특이한 경우들이 있다.
// a[3] = 4.40000000000004
// a[4] = 5.50000000000005


// (선생님 풀이)
//     int[] a = new int[5];   // 배열선언
    
//     for (int i = 0; i < a.length; i++) 
//         a[i] = 5 - i;     // 이런 방법이...

//     for (int i = 0; i < a.length; i++) 
//         System.out.println("a["+i+"] = " + a[i]);  // 와 이런 방법이...
        
// }
// }



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








// (선생님풀이)
//     double[] a = new double[5];  // 배열 선언
 
//     System.out.println("a["+0+"] = " +a[0]);  // 모든 요서의 값을 표시
//     System.out.println("a["+1+"] = " +a[1]);
//     System.out.println("a["+2+"] = " +a[2]);
//     System.out.println("a["+3+"] = " +a[3]);
//     System.out.println("a["+4+"] = " +a[4]);
// }
// }



//         double[] a = new double[5];    // 배열 선언
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







// (선생님 풀이)
//     Scanner sc = new Scanner(System.in);
//     Random r = new Random();

//     final int MAX_NO = 10;    // 최대 입력 횟수 (이 횟수와 감소한 횟수를 빼서 몇 회를 입력했는지 확인한다.)
//     int leftNo = MAX_NO;     // 최대 입력 횟수를 넣은 남은 횟수 (1씩 감소할 것이다.)
//     int a = r.nextInt(100);  // 맞춰야 하는 숫자 : 0~99의 난수
    
//     System.out.println("숫자 맞추기 게임 시작!");
//     System.out.println("0부터 99사이의 숫자를 맞추세요.");

//     int i;   // 입력할 값 선언

//     do {
//         System.out.println("남은 횟수 " + (leftNo--) + "회, 어떤 숫자일까?:");
//         i = sc.nextInt();  // 변수 i로 입력한 값을 담는다.

//         if (i > a) 
//         System.out.println("더 작은 숫자입니다.");
//         else if (i < a) 
//         System.out.println("더 큰 숫자입니다.");
//     } while(i != a && leftNo > 0);

//     if (i == a) 
//         System.out.println((MAX_NO - leftNo) + "회만에 맞추었습니다.\n정답은 "+a+"입니다.");
//     else
//         System.out.println("아쉽네요. 정답은 "+a+"입니다."); 
// }
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

=======
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

>>>>>>> 4801aee843c0fa98041e93d513809646248e636a
