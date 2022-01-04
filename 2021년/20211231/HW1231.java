import java.util.Scanner;

class ArraySearchIndex {
    // 배열 a에서 x와 일치하는 모든 요소의 인덱스를 추출한 배열 반환
    static int[] arraySrchIdx(int[] a, int x) {
        int count = 0;
        for (int i = 0; i < a.length; i++)
            if(a[i] == x) count++;

        int[] c = new int[count--];
        for (int i = a.length-1; count >= 0; i--)
            if(a[i] == x)
                c[count--] = i;
        return c;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("요소 수:");  int num = sc.nextInt();
    int[] x = new int[num];

    for (int i = 0; i < num; i++) {
        System.out.print("x[" +i+ "]:");  x[i] = sc.nextInt();
    }

    System.out.print("탐색할 값:");  int n = sc.nextInt();
    int[] b = arraySrchIdx(x,n);

    if (b.length == 0)
        System.out.println("일치하는 요소가 없습니다.");
        else {
            System.out.println("일치하는 요소의 인덱스");
            for (int i = 0; i < b.length; i++)   // 배열 y표시
                System.out.println(b[i]);
        }
    }

}
/*
# 7-23
배열 a의 요소 중에서 값이 x인 모든 요소의 인덱스를 앞에서부터 순서대로 반환하는
arraySrchIdx 메서드를 작성하자.
int[] arraySrchIdx(int[] a)
예) 배열 a의 요소가 {1,5,4,8,5,5,7}이고 arraySrchIdx(a, 5)를 호출한 경우,
반환할 배열은 {1,4,5}가 된다. (값이 5인 요소의 인덱스를 나열한 것)

실행 예
요소 수:7
x[0]:1
x[1]:5
x[2]:4
x[3]:8
x[4]:5
x[5]:5
x[6]:7
탐색할 값:5
일치하는 요소의 인덱스
1
4
5
*/