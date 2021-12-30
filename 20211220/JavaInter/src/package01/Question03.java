package JavaInter.src.package01;
import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("왼쪽 아래(위)가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는?: ");
        String i = sc.next();
        int j = Integer.parseInt(i);

        for (int x = 1; x <= j; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            } System.out.println();
        }  
        
        for (int x = 1; x <= j; x++) {
            for (int y = j; y >= x; y--) {
                System.out.print("*");
            } System.out.println();
        }

    }
}


//         Scanner sc = new Scanner(System.in);
//         System.out.println("왼쪽 아래(위)가 직각인 이등변 삼각형을 표시합니다.");
//         System.out.print("단수는?: ");
//         String i = sc.next();
//         int j = Integer.parseInt(i);

//         for (int x = 1; x <= j; x++) {
//             for (int y = 1; y <= x; y++) {
//                 System.out.print("*");
//         } System.out.println();

//     }


//         for (int x = 1; x <= j; x++) {
//             for (int y = j; y >= x; y--) {
//                 System.out.print("*");
//             } System.out.println();
//         }
// }
// }


/*
(단수는 문자열로 입력받아 숫자로 변환)
왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.
단수는?:5
*
**
***
****
*****

왼쪽 위가 직각인 이등변 삼각형을 표시합니다.
단수는?:3
***
**
*
int n = Integer.parseInt("100");   문자열을 숫자로 변경해주는 Integer.parseInt(); 
*/


