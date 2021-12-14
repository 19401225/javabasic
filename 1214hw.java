// # 3-3
public class Main {
  public static void main(String[] args) {
    int a = 12;
    int b = 4;

    System.out.println("변수 A:" + a);
    System.out.println("변수 B:" + b);

    if (int i = 1; i <= a; i++) {
        else if (a % i == 0) {
          System.out.println("B는 A의 약수이다.");
      } else {
          System.out.println("B는 A의 약수가 아니다.");
      }
    }
  
    
    

// 변수 A:12
// 변수 B:4
// B는 A의 약수입니다.





// # 2-14
// import java.util.Scanner;
// public class Main {
//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);

//     String first;
//     String name;

    
//     first = scan.next();
//     name = scan.next();
    

//     System.out.println("성:" + first);
//     System.out.println("이름:" + name);
//     System.out.println("안녕하세요. " + (first + name) + " 씨.");
//     }
// }










// # 2-11
// import java.util.Random;
// public class Main {
//     public static void main(String[] args) {
//         Random rand = new Random();

//         int a = rand.nextInt(10);
//         int b = rand.nextInt(-9,0);
//         System.out.println("3개의 난수를 생성했습니다.");
//         System.out.println("한 자리 양의 정수:" + a);
//         System.out.println("한 자리 음의 정수:" + b);

       

// }
// }
    




// 3개의 난수를 생성했습니다.
// 한 자리 양의 정수:7
// 한 자리 음의 정수:-5
// 두 자리 양의 정수:34

// rd.nextInt(랜덤정수개수)
// for (int j = -9; j < -1; j++) 
// for (int k = 10; k < 100; k++)

// Math.random()     Math클래스의 random() 매서드를 사용하여 난수를 발생시킬 수 있다.
// random() 은 double 타입의 0~1까지의 실수를 랜덤으로 표시