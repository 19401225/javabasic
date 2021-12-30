import java.util.Scanner;

// class aryRmv {
//     // 배열 a에서 a[idx]를 삭제(뒤에 있는 요소들을 하나씩
//     static void aryRmv(int[] a, int idx) {
//         if (idx >= 0 && idx < a.length) {
//             for (int i = idx; i < a.length-1; i++) 
//                 a[i] = a[i + 1];
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("요소 수:"); int num = sc.nextInt();
//         int[] a = new int[num];    // 요소 수가 num인 배열
        
//         for (int i = 0; i < num; i++) {
//             System.out.print("a[" +i+ "]:");  a[i] = sc.nextInt();
//         }
//         System.out.print("삭제할 요소의 인덱스:"); int idx = sc.nextInt();

//         aryRmv(a, idx);  // 배열 a에서 a[idx]를 삭제
//         for (int i = 0; i < num; i++)  // 배열 a표시
//             System.out.println("a[" +i+ "]=" +a[i]);
//     }
// }
/*
# 7-18
배열 a로부터 요소 a[idx]를 삭제하는 aryRmv 메서드를 작성하자.
void aryRmv(int[] a, int idx)
a[idx]의 삭제는, 그 뒤에 있는 요소들을 앞으로 하나씩 이동해서 할 것.
이동한 후에 비게 되는 마지막 요소 a[a.length-1]의 값은 이동하기 전의 마지막 값을 유지할 것.
예) 배열 a의 요소가 {1,3,5,7,9,11}일 때에 aryRmv(a,2)라고 호출한 후에는 배열 a의 요소는
{1,3,7,9,11,11}이 된다.

실행 예
요소 수:6
a[0]:1
a[1]:3
a[2]:5
a[3]:7
a[4]:9
a[5]:11

삭제할 요소의 인덱스:2
a[0]:1
a[1]:3
a[2]:7
a[3]:9
a[4]:11
a[5]:11

*/


// class aryRmvN {
//     // 배열 a에서 a[idx] 부터 n개의 요소를 삭제
//     static void aryRmvN(int[] a, int idx, int n) {
//         if (n > 0 && idx >= 0 && idx + n < a.length) {
//             int idx2 = idx + n -1;
//             if (idx2 > a.length - n - 1)
//             idx2 = a.length - n - 1;
//             for (int i = idx; i <= idx2; i++) 
//             a[i] = a[i + n];
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("요소 수:"); int num = sc.nextInt();
//         int[] a = new int[num];

//         for (int i = 0; i < num; i++) {
//             System.out.print("a[" +i+ "]:");  a[i] = sc.nextInt();
//         }

//         System.out.print("삭제를 시작할 인덱스:"); int idx = sc.nextInt();
//         System.out.print("삭제할 요소의 수:");  int n = sc.nextInt();

//         aryRmvN(a, idx, n);  // 배열 a에서 a[idx]부터 n개의 요소를 삭제
//         for (int i = 0; i < num; i++)
//             System.out.println("a[" +i+ "]:" + a[i]);
//     }
//     }
/*
# 7-19
배열 a에서 요소 a[idx]부터 n개의 요소를 삭제하는 aryRmvN 메서드를 작성하자
void aryRmv(int[] a, int idx, int n)
삭제는 a[idx]보다 뒤에 있는 모든 요소를 하나씩 앞으로 이동해서 할 것.
이동 대상이 아닌 요소는 기존 값을 그대로 유지할 것
예) 배열 a의 요소가 {1,3,4,7,9,11} 일 때 aryRmvN(a,1,3) 이라고 호출하면 
    배열 a의 요소는 {1,9,11,7,9,11} 이 된다.
*/


// class AryIns {
//     // 배열 a의 a[idx]에 x를 삽입(뒤에 있는 요소를 하나씩 오른쪽으로 이동시킴)
//     static void aryIns(int[] a, int idx, int x) {
//         if (idx >= 0 && idx < a.length) {
//             for (int i = a.length-1; i > idx; i--) 
//             a[i] = a[i-1];
//             a[idx] = x;
//         }
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     System.out.print("요소 수:");  int num = sc.nextInt();
//     int[] a = new int[num];

//     for (int i = 0; i < num; i++) {
//         System.out.print("a[" +i+ "]:"); a[i] = sc.nextInt();
//     }
//     System.out.print("삽입할 요소의 인덱스:"); int idx = sc.nextInt();
//     System.out.print("삽입할 값:"); int x = sc.nextInt();

//     aryIns(a, idx, x);
//     for (int i = 0; i < num; i++) {
//         System.out.println("a[" + i + "]:" + a[i]);
//     }
// }
// }
/*
# 7-20
배열 a의 요소 a[idx]에 x를 삽입하는 aryIns 메서드를 작성하자.
void aryIns(int[] a, int idx, int x)
삽입 시에는 a[idx] ~ a[a.length-2]를 하나씩 뒤로 이동시켜야 한다.
예) 배열 a의 요소가 {1,3,4,7,9,11}일 때에 aryIns(a, 2, 99)라고 호출하면 
    배열 a의 요소가 {1,3,99,4,7,9} 가 된다.

실행 예
요소 수:6
a[0]:1
a[1]:3
a[2]:4
a[3]:7
a[4]:9
a[5]:11
삽입할 요소의 인덱스:2
삽입할 값:99
a[0]:1
a[1]:3
a[2]:99
a[3]:4
a[4]:7
a[5]:9
*/




// class aryExchng {
//     // 배열 a와 b의 전체 요소값을 교환
//     static void aryExchng(int[] a, int[] b) {
//         int n = a.length < b.length ? a.length : b.length;
//         for (int i = 0; i < n; i++) {
//             int t = a[i]; 
//             a[i] = b[i];
//             b[i] = t;
//         }
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("배열 a의 요소 수:");  int na = sc.nextInt();
//     int[] a = new int[na];
//     for (int i = 0; i < na; i++) {
//         System.out.print("a[" + i + "]:");  a[i] = sc.nextInt();
//     }
//     System.out.print("배열 b의 요소 수:");  int nb = sc.nextInt();
//     int[] b = new int[nb];
//     for (int i = 0; i < nb; i++) {
//         System.out.print("b[" + i + "]:");  b[i] = sc.nextInt();
//     }

//     aryExchng(a, b);
//     System.out.println("배열 a와 b의 전체 요소를 교환했습니다.");

//     for (int i = 0; i < na; i++) 
//     System.out.println("a[" + i + "]:" + a[i]);
//     for (int i = 0; i < nb; i++) 
//     System.out.println("b[" + i + "]:" + b[i]);
// }
// }
/*
# 7-21
배열 a와 배열 b의 전체 요소값을 교환하는 aryExchng 메서드를 작성하자.
void aryExchng(int[] a, int[] b)
두 배열의 요소 수가 같지 않다면 작은 쪽의 배열 수에 맞추어 교환할 것
예) 배열 a의 요소가 {1,2,3,4,5,6,7} 이고 배열 b의 요소가 {5,4,3,2,1} 일 때에,
aryExchange(a,b)를 호출하면 배열 a는 {5,4,3,2,1,6,7}이 되고 
배열 b는 {1,2,3,4,5}가 되어야 한다.
실행 예
배열 a의 요소 수:7
a[0]:1
a[1]:2
a[2]:3
a[3]:4
a[4]:5
a[5]:6
a[6]:7
배열 b의 요소 수:5
b[0]:5
b[1]:4
b[2]:3
b[3]:2
b[4]:1
배열 a와 b의 전체 요소를 교환했습니다.
a[0]:5
a[1]:4
a[2]:3
a[3]:2
a[4]:1
a[5]:6
a[6]:7
b[0]:1
b[1]:2
b[2]:3
b[3]:4
b[4]:5
*/






// class arrayClone {
//     // 배열 a의 복사본을 생성해서 반환
//     static int[] arrayClone(int[] a) {
//         int[] c = new int[a.length];        // 요소 수가 a와 같다
//         for (int i = 0; i < c.length; i++)  // 전체 요소 복사
//             c[i] = a[i];
//             return c;
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("요소 수:"); int num = sc.nextInt();
//     int[] x = new int[num];

//     for (int i = 0; i < num; i++) {
//         System.out.print("x[" +i+ "]:");  x[i] = sc.nextInt();
//     }
//     int[] y = arrayClone(x);  // 배열 x복사
//     System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
//     for (int i = 0; i < num; i++)   // 배열 y 표시
//         System.out.println("y[" + i + "]:" + y[i]);
// }
// }
/*
# 7-22
배열 a와 같은 배열(요소 수가 같고 모든 요소의 값이 같은 배열)을 생성해서 반환하는
arrayClone 메서드를 작성하자.
int[] arrayClone(int[] a)

실행 예
요소 수:5
x[0]:11
x[1]:22
x[2]:33
x[3]:44
x[4]:55
배열 x를 복사해서 배열 y를 생성했습니다.
y[0]:11
y[1]:22
y[2]:33
y[3]:44
y[4]:55
*/


