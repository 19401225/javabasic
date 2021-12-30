package JavaInter.src.package01;
import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("원하는 기호를 입력하세요 >> ");
       String s = sc.next();
       

       System.out.println("원하는 횟수를 입력하세요 >> ");
       int c = sc.nextInt();

       int i = 0;



       while (i < c) {
         System.out.println(s);
         i++;

         int count = 0; 

         while (count < 3) {
           System.out.println("1)증가  2)감소  3)종료 >> ");
           int num = sc.nextInt();
           if (num == 1) {
             count += 1;
             System.out.println("카운트 : " + count);
           } else if (num == 2) {
             count -= 1;
             System.out.println("카운트 : " + count);
           } else if (num == 3) {
             System.out.printf("프로그램 종료 %t최종 카운트 : %d", count);
             break;
         }     
       } 
       System.out.printf("프로그램 종료 /t 최종 카운트 : %d", count);
    }    
        
  }
}


//         System.out.println("원하는 기호를 입력하세요 >>");
//         String s = sc.next();
//         System.out.println("원하는 횟수를 입력하세요 >>");
//         int c = sc.nextInt();
//         int i = 0;

//         while (i < c) {
//             System.out.println(s);
//             i++;   

//             int count = 0;

//             while (count < 3) {
//                 System.out.println("1)증가 2)감소 3)종료 >>");
//                 int num = sc.nextInt();
//                 if (num == 1) {
//                     count += 1;
//                     System.out.println("카운트 : " + count);
//                 } else if (num == 2) {
//                     count -= 1;
//                     System.out.println("카운트 : " + count);
//                 } else if (num == 3) {
//                     System.out.printf("프로그램 종료 /t 최종 카운트 : %d", count);
//                     break;
//                 }
//             }
//             System.out.printf("프로그램 종료 /t 최종 카운트 : %d", count);
//         }              
//     }

// }
/*
1) 원하는 기호를 입력하세요 >> @
2) 원하는 횟수를 입력하세요 >> 5
@@@@@      이렇게 출력되도록 while을 사용하여 작성하시오.

1) 증가   2) 감소    3) 종료  >> 1
  카운트 : 1
1) 증가   2) 감소    3) 종료  >> 1
  카운트 : 2
1) 증가   2) 감소    3) 종료  >> 2
  카운트 : 1
1) 증가   2) 감소    3) 종료  >> 1
  카운트 : 2
1) 증가   2) 감소    3) 종료  >> 3
  프로그램 종료    최종 카운트 : 2








*/
