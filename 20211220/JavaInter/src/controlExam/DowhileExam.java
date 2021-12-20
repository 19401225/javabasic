package JavaInter.src.controlExam;
import java.util.Random;
import java.util.Scanner;  
public class DowhileExam {
    public static void main(String[] args) {
//         for (int i = 2; i <= 9; i++) {
//             for (int j = 1; j <= 10; j++) {
//                 if (j == 5)
//                     break;               // 이럴 경우 처음의 for 문으로 돌아가 j == 5의 전까지 i가 반복된다.
//                     System.out.println(i + "*" + j + "=" + i*j);
//             }
//             System.out.println();
//         }

//     }
// }         // 아래와 같이 loop를 정해놓고 break문을 걸 수 있다.

//     loop:             // loop1: loop2: 이런식으로 숫자를 정해줄 수도 있다.
//     for (int i = 2; i <= 9; i++) {
//         for (int j = 1; j <= 10; j++) {
//          if (j == 5)
//              break loop;               // 이럴 경우 처음 for문 바깥의 loop: ~ break loop; 까지 break된다.
//              System.out.println(i + "*" + j + "=" + i*j);
//         }
//         System.out.println();
//     }

//     }   
// }       

/*
이름 붙은 반복문 
break문은 근접한 단 하나의 반복문만 벗어날 수 있다.
여러 개의 반복문이 중첩된 경우 break 만으로는 완전히 벗어날 수 없다.

while () {
    while () {     // 여기만 벗어나지만 위에 while문으로 돌아가서 다시 원래의 자리로 돌아오게 된다.

        break;
    }
}  그럴 경우에는,

loop:
while() {
    while() {
        break loop;        이렇게 while문의 처음에 loop를 입력하고, break loop; 를 주면 빠져나올 수 있다.
    }                      loop 또는 loop1, loop2 이렇게 정해줄 수 있다.
}
*/





//// continue;를 사용하여 1~100까지 3의 배수만을 출력하시오.
//     for (int i = 1; i <= 100; i++) {
//         if ((i % 3) != 0) 
//             continue;
//             System.out.println("3의 배수는 : " + i);   
//     }
//     System.out.println("100이 되었습니다. 프로그램을 종료합니다.");
//     }
// }


//// while문을 사용하여, 1부터 차례로 숫자를 더했을 때, 더한 값이 100이 넘을 경우 break문으로 빠져 나오기.
//     int sum = 0;
//     int i = 0;

//     while (true) {
//         if (sum > 100) {
//             break;
//         }
//         i++;
//         sum += i;
//         System.out.println("i = " + i + " sum = " + sum);  
//     }
//     System.out.println("i = " + i);
//     System.out.println("sum = " + sum);
        
// }
// }






/*
while은 경우에 따라 단 한 번도 실행되지 않을 수 있지만
do ~ while은 while의 변형으로 반드시 한 번은 무조건 실행되도록 한다.
 
1 ~ 100사이의 난수를 하나 생성해서 
1과 100사이의 정수를 입력하세요 >> 50
더 작은 값으로 다시 입력하세요

1과 100사이의 정수를 입력하세요 >> 35

더 작은 값으로 다시 입력하세요 or 더 큰 값으로 다시 입력하세요

1과 100사이의 정수를 입력하세요 >>
정답입니다. 총 시도한 횟수는 00번입니다.
*/

//         Random rand = new Random();
//         Scanner sc = new Scanner(System.in);
//         int r = rand.nextInt(99)+1;
//         int count = 0;
//         int i;

//         do {
//             System.out.print("1과 100사이의 정수를 입력하세요");
//             i = sc.nextInt();

//             if (i > r) {
//                 System.out.println("더 작은 값으로 다시 입력하세요");
//             } else if (i < r) {
//                 System.out.println("더 큰 값으로 다시 입력하세요");
//             }
//             count ++;
//             System.out.println();
//         } while (r != i);          // while문 { 안에 내용이 없다. } ()안에 내용이 거짓이면 즉 일치하면 아래로 
//         System.out.printf("정답입니다. ");
//         System.out.println(" 총 시도한 횟수는 " + count + "번입니다.");

//     }
// }





/*
369게임
100이하에서 3의 배수일 때 "짝"을 출력하시오.
1
2       (숫자는 모두 표시되도록)
3 짝
4
5
6 짝
13 짝
32 짝
36 짝짝
99 짝짝 (한 글자마다 "짝"을 출력)
*/
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            
            int tmp = i;
            do {
                if ((tmp%10) % 3 == 0 && tmp % 10 != 0) {
                    System.out.println(i + " 짝");
                }

            } while ((tmp /= 10) != 0);  //
       

}











