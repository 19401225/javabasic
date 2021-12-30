package JavaInter.variableExam;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        i = scan.nextInt();

        if ((i % 2) == 1) {
            System.out.printf("입력하신 수 %d는 홀수입니다.%n", i);
        } else if ((i % 2) == 0) {
            System.out.printf("입력하신 수 %d는 짝수입니다.%n", i);
        }
    }
}



// Scanner scan = new Scanner(System.in);
// a = scan.nextInt();

// if ((a % 2) == 1) {
//     System.out.printf("입력하신 수 %d는 홀수입니다.%n", a);
// } else ((a % 2) == 0) {
//     System.out.printf("입력하신 수 %d는 짝수입니다.%n", a);
//  // quiz 1. 정수를 하나 키보드로 입력 받아 그 수가 홀수인지 짝수인지를 출력하는 프로그램 ㅏㅈㄱ성
//  // "입력하신 수 ??는 홀수입니다."
// }
// }
// }