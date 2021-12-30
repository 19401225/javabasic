<<<<<<< HEAD
package src.JavaInter.variableExam;
import java.util.Scanner;
public class ScannerExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 자리 정수 하나만 입력하세요>>>");

        String input = sc.nextLine();      // 문자열 입력 받기 위해 .nextLine(); 메서드 사용
        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변경 Integer.parseInt(입력받은 변수)
        
        System.out.println("입력 내용 : " + input);  // 입력 내용 : 56
        System.out.printf("숫자로 : %d%n", + num);   // 숫자로 : 56  (%d를 사용한 다음에는 ,를 넣는다)
  
    }
}
// %n, \n 줄바꿈이다.

/*
  Scanner() 사용자로부터 입력을 받아 변수로 활용
  
  import java.util.Scanner;            Scanner 클래스 사용을 위해 import 한다.
  Scanner sc = new Scanner(System.in); Scanner 클래스로 객체 생성 

  String input = sc.nextLine();  // 문자열 입력을 받기 위해 .nextLine(); 메서드 사용
  int num = sc.nextInt();        // 정수 입력을 받기 위해 .nextInt(); 메서드 사용
  
  - 문자열로 입력 받아 숫자로 변경하기(숫자 여러 개 입력받기에 용이하다.)
  String input = sc.nextLine();       // 문자열로 여러 개를 받은 후
  int num = Integer.parseInt(input);  // 숫자로 변경하여 사용한다.




=======
package src.JavaInter.variableExam;
import java.util.Scanner;
public class ScannerExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 자리 정수 하나만 입력하세요>>>");

        String input = sc.nextLine();      // 문자열 입력 받기 위해 .nextLine(); 메서드 사용
        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변경 Integer.parseInt(입력받은 변수)
        
        System.out.println("입력 내용 : " + input);  // 입력 내용 : 56
        System.out.printf("숫자로 : %d%n", + num);   // 숫자로 : 56  (%d를 사용한 다음에는 ,를 넣는다)
  
    }
}
// %n, \n 줄바꿈이다.

/*
  Scanner() 사용자로부터 입력을 받아 변수로 활용
  
  import java.util.Scanner;            Scanner 클래스 사용을 위해 import 한다.
  Scanner sc = new Scanner(System.in); Scanner 클래스로 객체 생성 

  String input = sc.nextLine();  // 문자열 입력을 받기 위해 .nextLine(); 메서드 사용
  int num = sc.nextInt();        // 정수 입력을 받기 위해 .nextInt(); 메서드 사용
  
  - 문자열로 입력 받아 숫자로 변경하기(숫자 여러 개 입력받기에 용이하다.)
  String input = sc.nextLine();       // 문자열로 여러 개를 받은 후
  int num = Integer.parseInt(input);  // 숫자로 변경하여 사용한다.




>>>>>>> 4801aee843c0fa98041e93d513809646248e636a
*/