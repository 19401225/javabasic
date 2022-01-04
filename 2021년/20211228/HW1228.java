import java.util.Scanner;
import java.util.Random;

// class Main {
//    static Scanner sc = new Scanner(System.in);
//     static int readPlusInt () {
        
//         int x;
//         // 양의 정숫값을 읽어서 반환 
//         do {
//             System.out.print("양의 정숫값:");
//             x = sc.nextInt();
//         } while (x <= 0);
//         return x;
//     }
//     public static void main(String[] args) {
//         int x;

//         do {
//             int n = readPlusInt();

//             System.out.print("반대로 읽으면 ");
//             while (n > 0) {
//                 System.out.print(n%10);   // n의 마지막 자릿수를 표시
//                 n /= 10;                  // n을 10으로 나눔
//             }
//             System.out.println("입니다.");

//             do {
//                 System.out.println("다시 한 번?<Yes...1/No...0>:");
//                 x = sc.nextInt();
//             } while (x != 0 && x != 1);
//         } while (x == 1);
// }
// }
/*
# 7-9
"양의 정숫값:" 이라는 메시지에 정숫값을 입력하면 값을 거꾸로 변환하는
readPlusInt 메서드를 작성하자. 0이나 음수(-)가 입력되면 재입력하도록 할 것
int readPlusInt()

실행 예
양의 정숫값:-125
양의 정숫값:0
양의 정숫값:521
반대로 읽으면 125입니다.
다시 한 번?<Yes...1/No...0>:

*/








// class MentalArithmetic {
//     static Scanner sc = new Scanner(System.in);

//     // 계속할지 여부 확인
//     static boolean confirmRetry() {
//         int cont; do {
//             System.out.println("다시 한 번? <Yes...1/No...0>:");
//             cont = sc.nextInt();
//         } while (cont != 0 && cont != 1);
//         return cont == 1;
//     }
// public static void main(String[] args) {
//     Random r = new Random();
//     System.out.println("암산 훈련!!");

//     do {
//         int x = r.nextInt(900) + 100;   // 3자리 수
//         int y = r.nextInt(900) + 100;   // 3자리 수
//         int z = r.nextInt(900) + 100;   // 3자리 수
//         int pattern = r.nextInt(4);   // 패턴번호

//         int answer;   // 정답
//         switch(pattern) {
//             case 0 : answer = x + y + z; break;
//             case 1 : answer = x + y - z; break;
//             case 2 : answer = x - y + z; break;
//             default : answer = x - y - z; break;
//         }
//         while (true) {
//         System.out.println(x + ((pattern < 2) ? " + " : " - ") +
//                         y + ((pattern % 2 == 0) ? " + " : " - ") +
//                         z + " = ");

//         int k = sc.nextInt();   // 입력한 답을 읽는다.
//         if (k == answer) break;
//         System.out.println("틀렸습니다!");
//      }
//     } while (confirmRetry());
// }
// }
/*
# 7-10
다음 4개 계산 문제 중 하나를 무작위로 출제하는 암산 훈련 프로그램을 작성하자.
이때 x,y,z에 3자리의 정숫값을 난수로 생성할 것.

실행 예
암산 훈련!!
341 + 616 - 742 = 215
틀렸습니다.
341 + 616 - 742 = 216
다시 한 번?<Yes...1/No...0>:1
674 + 977 + 760 = 2411
다시 한 번?<Yes...1/No...0>:1

*/









// class Main {
//     static int sumOf(int[] a) {
//         int sum = 0;
//         for (int i = 0; i < a.length; i++) 
//             sum += a[i];
//             return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
       
//         System.out.print("요소 수:"); int j = sc.nextInt();
//         int[] x = new int[j];   // 입력한 j의 값으로 요소의 수를 가지는 배열

//         for (int i = 0; i < j; i++) {
//         System.out.print("x["+i+"]:");  x[i] = sc.nextInt();       
//         } 

//         System.out.println("모든 요소의 합은 " + sumOf(x)  + "입니다.");
//     }
//     }
/*
# 7-15
배열 a가 가진 모든 요소의 합을 구하는 sumOf() 메서드를 작성하자
int sumOf(int[] a)

실행 예
요소 수:5
x[0]:22
x[1]:5
x[2]:11
x[3]:32
x[4]:120
모든 요소의 합은 190입니다.

*/



// class Main {
//     static int minOf(int[] a) {
//         int min = a[0];
//         for (int i = 1; i < a.length; i++) 
//             if (a[i] < min)
//                 min = a[i];
//             return min;
//     }
//  public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);

//      System.out.print("사람 수는:");
//      int num = sc.nextInt();   // 사람 수를 읽는다.

//      int[] height = new int[num];   // 신장 배열 생성
//      int[] weight = new int[num];   // 체중 배열 생성

//      System.out.println(num + "명의 신장과 체중을 입력하자.");
//      for (int i = 0; i < num; i++) {
//          System.out.print((i + 1) + "번의 신장:"); height[i] = sc.nextInt();
//          System.out.print((i + 1) + "번의 체중:"); weight[i] = sc.nextInt();  
//      }
//      System.out.println("가장 키가 작은 사람의 신장은:" + minOf(height) + "cm");
//      System.out.println("가장 마른 사람의 체중:" + minOf(weight) + "kg");
//  }
//  }
/*
# 7-16
배열 a의 요소 중에서 최솟값을 구하는 minOf 메서드를 작성하자
int minOf(int[] a)

실행 예
사람 수는:2
2명의 신장과 체중을 입력하자.
1번의 신장:175
1번의 체중:72
2번의 신장:163
2번의 체중:82
가장 키가 작은 사람의 신장은:163cm
가장 마른 사람의 체중:72Kg

*/





// class Main {
//     //  배열 a의 요소로부터 key와 일치하는 가장 앞에 있는 요소를 선형 탐색
//     static int linearSearch(int[] a, int key) {
//         for (int i = 0; i < a.length; i++)
//            if (a[i] == key)
//              return i;   // 탐색 성공(인덱스 반환)
//             return -1;   // 탐색 실패(-1 반환)
//     }
//     static int linearSearchR(int[] a, int key) {
//         for (int i = a.length -1; i >= 0; i--) 
//             if (a[i] == key)
//                 return i;   // 탐색 성공 (인덱스 반환)
//             return -1;      // 탐색 실패 (-1 반환)
//     } 
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("요소 수:");
//     int num = sc.nextInt();
//     int[] x = new int[num];    // 요소 수 num의 배열
//     for (int i = 0; i < num; i++) {
//         System.out.print("x[" +i+ "]:"); x[i] = sc.nextInt();
//     }
//     System.out.print("찾는 값:");   int ky = sc.nextInt();

//     int idxTop = linearSearch(x, ky);  // 배열 x에서 ky를 탐색
//     int idxBtm = linearSearchR(x, ky); // 배열 x에서 ky를 탐색

//     System.out.println("가장 앞에 위치한 값은 x[" + idxTop + "]에 있습니다.");
//     System.out.println("가장 뒤에 위치한 값은 x[" + idxBtm + "]에 있습니다.");
// }
// }
/*
# 7-17
배열 a로부터 key와 같은 값을 가지는 요소를 탐색하는 linearSearch 메서드와 linearSearchR 메서드를
작성하자. 단, 키와 같은 값을 가지는 요소가 여러 개인 경우 linearSearch는 가장 앞에 위치한 요소를 찾으며,
linearSeachR은 가장 뒤에 위치한 요소를 찾을 것.
int linearSearch(int[] a, int key)
int linearSearchR(int[] a, int key)

실행 예
요소 수:6
x[0]:5
x[1]:22
x[2]:74
x[3]:32
x[4]:120
x[5]:22
찾는 값:22
해당 값의 요소가 여러 개 존재합니다.
가장 앞에 위치한 값은 x[1]에 있습니다.
가장 뒤에 위치한 값은 x[5]에 있습니다.

*/