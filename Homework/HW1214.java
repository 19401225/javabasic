// 주석을 위해 가로로 넓게 작성하였습니다.


// # 3-7
// import java.util.Scanner;             // 입력을 받는 기능을 위한 Scanner 클래스를 import
// public class Main {
//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in); // Scanner 클래스를 통해 scan 객체를 생성한다.
//     int a = scan.nextInt();    // 변수를 선언하고, 입력을 받기 위해 .nextInt() 메서드를 사용
//     int b = scan.nextInt();

//     System.out.println("변수 a:" + a);   // 변수 출력
//     System.out.println("변수 b:" + b);   // 입력받을 a,b 변수를 확인할 수 있다.

//     if (a > b) {                 // 각각 입력받은 a,b의 값에서, a가 b보다 클 경우
//       System.out.println("a가 크다.");
//     } else if (a < b) {          // 각각 입력받은 a,b의 값에서, a가 b보다 작을 경우
//       System.out.println("b가 크다.");
//     } else {                     // 각각 입력받은 a,b의 값에서, a가 b보다 크거나 작지도 않을 경우
//       System.out.println("a와 b가 같다.");
//     }
//   }
// }





// # 3-5
// import java.util.Scanner;        // 입력을 받는 기능을 위해 Scanner 클래스를 import 
// public class Main {
//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);  // import한 Scanner클래스로 scan이라는 객체 생성
//     int i;                    // int i라는 변수 선언

//     i = scan.nextInt();  //(변수i에 입력을 받기 위해)생성된 scan객체에 .nextInt() 메서드를 사용  
//     System.out.println("정숫값:"+ i);    // 입력받은 값에 대한 출력

//     if (i > 0) {                  // 입력받은 값이 0보다 클 경우
//       System.out.println("값이 양수입니다.");
//     } else if (i == 0) {          // 입력받은 값이 0과 같을 경우
//       System.out.println("값이 0입니다.");
//     } else {                      // 그 외, 입력받은 값이 0보다 크지 않거나 0도 아닐 경우
//       System.out.println("값이 음수입니다.");
//     }
//   }
// }





// # 3-3
// public class Main {
//   public static void main(String[] args) {
//     int a = 12;   // int a와 b라는 변수를 선언하고,
//     int b = 4;

//     System.out.println("변수A:" + a);  // 선언한 변수가 무엇인지에 대해 출력
//     System.out.println("변수B:" + b);

//     if ((a % b) == 0) {         // a에 b를 나눈 몫이 0일 경우
//       System.out.println("B는 A의 약수입니다.");
//     } else {                    // a에 b를 나눈 몫이 0이 아닐 경우
//       System.out.println("B는 A의 약수가 아니다.");
//     }
//  }
// }
  
    
    




// # 2-14
// import java.util.Scanner;     //  Scanner라는 클래스를 import한다.
// public class Main {
//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);  // import한 클래스를 이용해 객체 생성

//     String first;   // String first와 name이라는 변수를 선언
//     String name;

    
//     first = scan.next();   // 생성한 scan객체에, 문자열을 입력받기 위해 .next() 메서드를 사용
//     name = scan.next();    // 그 내용(입력받을)을 선언한 변수에 담는다.
    

//     System.out.println("성:" + first);       
//     System.out.println("이름:" + name);
//     System.out.println("안녕하세요. " + (first + name) + " 씨.");
//     }
// }
/*



*/








// # 2-11
// import java.util.Random;          // Random 클래스를 import 한다.
// public class Main {
//     public static void main(String[] args) {
//         Random rand = new Random();      // Random클래스를 이용하여 rand 객체를 생성
        
//         int a = rand.nextInt(10);        // 입력된 값에서 임의로 출력하기 위한 
//         int b = rand.nextInt(9)-9;       // Random클래스의 .nextInt() 메서드 사용 
//         int c = rand.nextInt(90)+10;     

//         System.out.println("3개의 난수를 생성했습니다.");
//         System.out.println("한 자리 양의 정수:" + a);
//         System.out.println("한 자리 음의 정수:" + b);
//         System.out.println("두 자리 양의 정수:" + c);
// }
// }

/* 선생님 풀이
난수를 생성한다.
int n1 =  1 + rand.nextInt(9);
int n2 = -1 - rand.nextInt(9);
int n3 = 10 + rand.nextInt(90);



*/
