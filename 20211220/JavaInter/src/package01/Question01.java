<<<<<<< HEAD
package JavaInter.src.package01;

import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int fno = 0;
        int lno = 0;
        char ox = 'o';

        while (ox != 'x') {
            System.out.println("숫자를 입력하세요 >>");
            int a = sc.nextInt();
            System.out.println("숫자를 입력하세요 >>");
            int b = sc.nextInt();

            if (a > b) {
                System.out.println("앞 숫자가 큽니다.");
                count ++;
                fno ++;
            } else {
                System.out.println("뒤 숫자가 큽니다.");
                count ++;
                lno ++;
            } System.out.println("계속 할까요?(계속 : o, 중단 : x)");
              String t = sc.next();
              ox = t.charAt(0);
        } 
          System.out.println("프로그램을 종료합니다.");
          System.out.print("시도 횟수 : " + count + "\t");
          System.out.print("앞숫자가 큰 경우 : " + fno + "\t");
          System.out.print("뒷숫자가 큰 경우 : " + lno);
    }
}




    //     int count = 0;        // 전체 질문 횟수를 담을 변수
    //     int fno = 0;          // 앞 숫자 큰 경우의 변수
    //     int lno = 0;          // 뒷 숫자 큰 경우의 변수
    //     char ox = 'o';      // 계속 진행 여부 변수

    //     Scanner sc = new Scanner(System.in);       // 입력 객체 생성
        
    //     while (ox != 'x') {         // 반복 구문 시작 
    //         System.out.println("숫자를 입력하세요>>");  // 입력 구문 
    //         int a = sc.nextInt();
    //         System.out.println("숫자를 입력하세요>>");  // 입력 구문 
    //         int b = sc.nextInt();

    //         if (a > b) {
    //             System.out.println("앞숫자가 큽니다.");
    //             fno ++;
    //             count ++;
    //         } else {
    //             System.out.println("뒷숫자가 큽니다.");
    //             lno ++;
    //             count ++;
    //         }
    //         System.out.print("계속 할까요?(계속 : o, 중단 : x) : ");
    //         String tempo = sc.next();
    //         ox = tempo.charAt(0);

    //         }
    //         System.out.println("프로그램을 종료합니다.");

    //         System.out.print("시도횟수 : " + count + "\t");
    //         System.out.print("앞숫자가 큰 경우 : " + fno + "\t");
    //         System.out.print("뒷숫자가 큰 경우 : " + lno);
        
    //     }
    // }
/*
숫자를 입력하세요 >>
숫자를 입력하세요 >>

앞 숫자가 큽니다.
계속 할까요?(계속 : o, 중단은 : x);

프로그램을 종료합니다.

시도 횟수 : 00        앞숫자가 큰 경우 : 00      뒷숫자가 큰 경우 : 00



*/









//         Scanner sc = new Scanner(System.in); 

//         System.out.println("-------------------------");      
//         System.out.println("당신의 정보를 입력하세요.");
//         System.out.println("-------------------------");
        
//         System.out.println("당신의 부서는 >>>");
//         String a = sc.next();
//         System.out.println("당신의 소속은 " + a + "입니다.");

//         System.out.println("당신의 나이는 >>>");
//         int b = sc.nextInt();
//         System.out.println("당신의 작년 나이는 " + (b-1) + "이였습니다.");

//         System.out.println("당신의 키는 >>>");
//         int c = sc.nextInt();
//         if (c >= 180) {
//             System.out.println("당신은 키가 크다");
//         } else if (c >= 170) {
//             System.out.println("당신은 키가 보통이다."); 
//         } else {
//             System.out.println("당신은 키가 작다");
//         }
//     }
// }
/*
파일 > 자바 프로젝트 > 프로젝트 이름은 'p01'(임시) > src 패키지 > package01 패키지 생성 > 그 안에 Question01 클래스 생성

프로젝트명 : Study
패키지명 : JavaInter.src
자바파일명 : eee

-------------------------
당신의 정보를 입력하세요
-------------------------

당신의 부서는 >>>
당신의 소속은 ___입니다.
당신의 나이는 >>> 
당신의 작년 나이는 ___이였습니다.    (입력 받아서 계산해야겠지)
당신의 키는 >>>
당신의 키가 (크다/보통이다/작다)     키가 180이상이면 크다. 170이상이면 보통이다. 그 외는 작다
*/






/*
지난 토요일에 화이자 3차 맞고 
하루 종일 누워 계셨던 선생님 (열이 나고..) 
응급실가기 위해 119에 연락도 했었다."조심하길 바랍니다."

이클립스에서
javaInter > src > 우클릭하여 package 생성하여 제목을 edu.gt.cs 생성
edu패키지 안에 gt 패키지 안에 cs 패키지 안이라는 의미
그 패키지 안에 class를 생성한다. (class의 이름의 첫 글자는 대문자로 생성)

패키지는 여러 개가 있을 수 있고, 하나의 패키지 내에는 자바 클래스 파일을 여러 개 가질 수 있다.

자바에서의 데이터 종류에 대해
   논리형 boolean은 true와 false 값을 가진다.
   정수형 int, long, short, byte 이렇게 4가지가 있다.
   실수형 float, double 이 있다.
   문자형 char(하나를 표현), String(여러 문자를 표현) 
   
   for (int i = 0; i <= 3; i++) {
       System.out.println(i);
   }
   반복문 for 구문 안에서, 초기값 integer i는 0이고, i가 숫자3까지 순차적으로 (i++) 
   하나씩 증가하면서 for문을 반복하게 된다.
   
   ㄴㄴ 아래처럼 단계별로 다 적어야 한다.

   i = 0일때 조건 3보다 작거나 같음을 만족하므로 i값 0을 출력
   i = 1일때 조건 3보다 작거나 같음을 만족하므로 i값 1을 출력
   i = 2일때 조건 3보다 작거나 같음을 만족하므로 i값 2를 출력
   i = 3일때 조건 3보다 작거나 같음을 만족하므로 i값 3을 출력
   i = 4일때 조건 3보다 작거나 같음을 만족하지 못하므로 for문을 종료한다.

   0
   1
   2
   3
   (println에 ln이 없을 경우 0 1 2 3 이렇게 출력되겠지)

  
     

   int[] n1 = new int[5];
   n1(변수 : 주소)에 {0,1,2,3,4}  length(5)
   
   int[][] n2 = new int[2][2];  [행수(아래)][열수(옆)]
   n2(변수 : 주소)에 {{0,0},      length(2)
                      {0,0}}

   int[] n3 = {1,2,3};
   n3(변수 : 주소)에 {1,2,3} length(3)


   int x = 100;
   int y = 200;
   int z = x + y;
   
   메모리(Ram)에 있는 있는 변수들의 값을 CPU가 가져와서 '산술 연산'을 하여 다시 메모리에 저장한다.

   int age = 23;
   String name = "kim";
   String a = name + "의 나이는 " + age;       이거는 산술 연산이 아닌 붙이는 개념이다.
   메모리(Ram)에 있는 변수들의 값을 CPU가 가져와서 '결합 연산'을 하여 다시 메모리에 저장한다.



   Scanner sc = new Scanner(System.in);
   System.out.println("이름을 입력하세요>>");     - 1
   String name = sc.next();                      - 2
   System.out.println("나이를 입력하세요>>");
   int age = sc.nextInt();                        - 3

   Scanner 라는 클래스를 사용하여 입력받을 수 있는 sc라는 객체를 생성한다.
   먼저 받고 싶은 내용을 출력한다. "이름을 입력하세요>>"
   문자열을 받을 수 있는 name이라는 변수를 선언하고 직접 입력을 받을 수 있도록 sc객체에 .next();메서드를 사용한다.
   숫자를 받을 수 있는 age라는 변수를 선언하고 직접 입력을 받을 수 있도록 sc객체에 .nextInt();메서드를 사용한다.

   1. 화면에 사용자로부터 '입력'을 받도록 프롬프트를 출력한다.
   2. 사용자가 콘솔에서 String(문자열)으로 입력한 값을 변수 name에 저장한다.
   3. 입력한 String(문자열) 나이 데이터를 정수로 변경하여 age변수에 저장한다.


   String h = "안녕하세요";            메모리 크기가 한글은 한 글자당 2 byte
    10byte(String) + 10byte(char) = 20 byte      총 메모리 사용은 이러하다.


    int n = Integer.parseInt("100");            문자열을 숫자로 변경해주는 Integer.parseInt(); 
    Scanner sc = new Scanner(System.in);
    Random r = new Random(10);   랜덤,  (Random클래스의 생성자는 인자로 seed(초기값)를 받는다.)

    정수를 담을 수 있는 변수 n에 String(문자열) "100"을 숫자로 변경하여 다시 메모리에 저장한다.
    Scanner클래스로 sc 객체를 생성하여 사용자로부터 키보드로 직접 입력을 받을 수 있다.
    Random 클래스로 r 객체를 생성한다,

    100이라는 String(문자열)을 계산이 가능한 int 정수형으로 변경(변환)하여 변수명 n에 저장한다.
    키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc를 생성한다.
    seed(시드)값 10으로 랜덤한 값을 생성할 수 있는 객체 r을 생성한다.
    






=======
package JavaInter.src.package01;

import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int fno = 0;
        int lno = 0;
        char ox = 'o';

        while (ox != 'x') {
            System.out.println("숫자를 입력하세요");
            int a = sc.nextInt();
            System.out.println("숫자를 입력하세요");
            int b = sc.nextInt();

            if (a > b) {
                System.out.println("앞 숫자가 큽니다.");
                count ++;
                fno ++;
            } else {
                System.out.println("뒷 숫자가 큽니다.");
                count ++;
                lno ++;
            } System.out.println("계속 할까요?(계속 : o, 중단 : x)");
              String t = sc.next();
              ox = t.charAt(0);
        } System.out.println("프로그램을 종료합니다.");
          System.out.print("시도 횟수 : " + count + "\t");
          System.out.print("앞숫자가 큰 경우 : " + fno + "\t");
          System.out.print("뒷숫자가 큰 경우 : " + lno);
    }
}


    //     int count = 0;        // 전체 질문 횟수를 담을 변수
    //     int fno = 0;          // 앞 숫자 큰 경우의 변수
    //     int lno = 0;          // 뒷 숫자 큰 경우의 변수
    //     char ox = 'o';      // 계속 진행 여부 변수

    //     Scanner sc = new Scanner(System.in);       // 입력 객체 생성
        
    //     while (ox != 'x') {         // 반복 구문 시작 
    //         System.out.println("숫자를 입력하세요>>");  // 입력 구문 
    //         int a = sc.nextInt();
    //         System.out.println("숫자를 입력하세요>>");  // 입력 구문 
    //         int b = sc.nextInt();

    //         if (a > b) {
    //             System.out.println("앞숫자가 큽니다.");
    //             fno ++;
    //             count ++;
    //         } else {
    //             System.out.println("뒷숫자가 큽니다.");
    //             lno ++;
    //             count ++;
    //         }
    //         System.out.print("계속 할까요?(계속 : o, 중단 : x) : ");
    //         String tempo = sc.next();
    //         ox = tempo.charAt(0);

    //         }
    //         System.out.println("프로그램을 종료합니다.");

    //         System.out.print("시도횟수 : " + count + "\t");
    //         System.out.print("앞숫자가 큰 경우 : " + fno + "\t");
    //         System.out.print("뒷숫자가 큰 경우 : " + lno);
        
    //     }
    // }
/*
숫자를 입력하세요 >>
숫자를 입력하세요 >>

앞 숫자가 큽니다.
계속 할까요?(계속 : o, 중단은 : x);

프로그램을 종료합니다.

시도 횟수 : 00        앞숫자가 큰 경우 : 00      뒷숫자가 큰 경우 : 00



*/









//         Scanner sc = new Scanner(System.in); 

//         System.out.println("-------------------------");      
//         System.out.println("당신의 정보를 입력하세요.");
//         System.out.println("-------------------------");
        
//         System.out.println("당신의 부서는 >>>");
//         String a = sc.next();
//         System.out.println("당신의 소속은 " + a + "입니다.");

//         System.out.println("당신의 나이는 >>>");
//         int b = sc.nextInt();
//         System.out.println("당신의 작년 나이는 " + (b-1) + "이였습니다.");

//         System.out.println("당신의 키는 >>>");
//         int c = sc.nextInt();
//         if (c >= 180) {
//             System.out.println("당신은 키가 크다");
//         } else if (c >= 170) {
//             System.out.println("당신은 키가 보통이다."); 
//         } else {
//             System.out.println("당신은 키가 작다");
//         }
//     }
// }
/*
파일 > 자바 프로젝트 > 프로젝트 이름은 'p01'(임시) > src 패키지 > package01 패키지 생성 > 그 안에 Question01 클래스 생성

프로젝트명 : Study
패키지명 : JavaInter.src
자바파일명 : eee

-------------------------
당신의 정보를 입력하세요
-------------------------

당신의 부서는 >>>
당신의 소속은 ___입니다.
당신의 나이는 >>> 
당신의 작년 나이는 ___이였습니다.    (입력 받아서 계산해야겠지)
당신의 키는 >>>
당신의 키가 (크다/보통이다/작다)     키가 180이상이면 크다. 170이상이면 보통이다. 그 외는 작다
*/






/*
지난 토요일에 화이자 3차 맞고 
하루 종일 누워 계셨던 선생님 (열이 나고..) 
응급실가기 위해 119에 연락도 했었다."조심하길 바랍니다."

이클립스에서
javaInter > src > 우클릭하여 package 생성하여 제목을 edu.gt.cs 생성
edu패키지 안에 gt 패키지 안에 cs 패키지 안이라는 의미
그 패키지 안에 class를 생성한다. (class의 이름의 첫 글자는 대문자로 생성)

패키지는 여러 개가 있을 수 있고, 하나의 패키지 내에는 자바 클래스 파일을 여러 개 가질 수 있다.

자바에서의 데이터 종류에 대해
   논리형 boolean은 true와 false 값을 가진다.
   정수형 int, long, short, byte 이렇게 4가지가 있다.
   실수형 float, double 이 있다.
   문자형 char(하나를 표현), String(여러 문자를 표현) 
   
   for (int i = 0; i <= 3; i++) {
       System.out.println(i);
   }
   반복문 for 구문 안에서, 초기값 integer i는 0이고, i가 숫자3까지 순차적으로 (i++) 
   하나씩 증가하면서 for문을 반복하게 된다.
   
   ㄴㄴ 아래처럼 단계별로 다 적어야 한다.

   i = 0일때 조건 3보다 작거나 같음을 만족하므로 i값 0을 출력
   i = 1일때 조건 3보다 작거나 같음을 만족하므로 i값 1을 출력
   i = 2일때 조건 3보다 작거나 같음을 만족하므로 i값 2를 출력
   i = 3일때 조건 3보다 작거나 같음을 만족하므로 i값 3을 출력
   i = 4일때 조건 3보다 작거나 같음을 만족하지 못하므로 for문을 종료한다.

   0
   1
   2
   3
   (println에 ln이 없을 경우 0 1 2 3 이렇게 출력되겠지)

  
     

   int[] n1 = new int[5];
   n1(변수 : 주소)에 {0,1,2,3,4}  length(5)
   
   int[][] n2 = new int[2][2];
   n2(변수 : 주소)에 {{0,0},      length(2)
                      {0,0}}

   int[] n3 = {1,2,3};
   n3(변수 : 주소)에 {1,2,3} length(3)


   int x = 100;
   int y = 200;
   int z = x + y;
   
   메모리(Ram)에 있는 있는 변수들의 값을 CPU가 가져와서 '산술 연산'을 하여 다시 메모리에 저장한다.

   int age = 23;
   String name = "kim";
   String a = name + "의 나이는 " + age;       이거는 산술 연산이 아닌 붙이는 개념이다.
   메모리(Ram)에 있는 변수들의 값을 CPU가 가져와서 '결합 연산'을 하여 다시 메모리에 저장한다.



   Scanner sc = new Scanner(System.in);
   System.out.println("이름을 입력하세요>>");     - 1
   String name = sc.next();                      - 2
   System.out.println("나이를 입력하세요>>");
   int age = sc.nextInt();                        - 3

   Scanner 라는 클래스를 사용하여 입력받을 수 있는 sc라는 객체를 생성한다.
   먼저 받고 싶은 내용을 출력한다. "이름을 입력하세요>>"
   문자열을 받을 수 있는 name이라는 변수를 선언하고 직접 입력을 받을 수 있도록 sc객체에 .next();메서드를 사용한다.
   숫자를 받을 수 있는 age라는 변수를 선언하고 직접 입력을 받을 수 있도록 sc객체에 .nextInt();메서드를 사용한다.

   1. 화면에 사용자로부터 '입력'을 받도록 프롬프트를 출력한다.
   2. 사용자가 콘솔에서 String(문자열)으로 입력한 값을 변수 name에 저장한다.
   3. 입력한 String(문자열) 나이 데이터를 정수로 변경하여 age변수에 저장한다.


   String h = "안녕하세요";            메모리 크기가 한글은 한 글자당 2 byte
    10byte(String) + 10byte(char) = 20 byte      총 메모리 사용은 이러하다.


    int n = Integer.parseInt("100");            문자열을 숫자로 변경해주는 Integer.parseInt(); 
    Scanner sc = new Scanner(System.in);
    Random r = new Random(10);   랜덤,  (Random클래스의 생성자는 인자로 seed(초기값)를 받는다.)

    정수를 담을 수 있는 변수 n에 String(문자열) "100"을 숫자로 변경하여 다시 메모리에 저장한다.
    Scanner클래스로 sc 객체를 생성하여 사용자로부터 키보드로 직접 입력을 받을 수 있다.
    Random 클래스로 r 객체를 생성한다,

    100이라는 String(문자열)을 계산이 가능한 int 정수형으로 변경(변환)하여 변수명 n에 저장한다.
    키보드 입력을 콘솔을 통해 받을 수 있는 Scanner 객체 sc를 생성한다.
    seed(시드)값 10으로 랜덤한 값을 생성할 수 있는 객체 r을 생성한다.
    






>>>>>>> 4801aee843c0fa98041e93d513809646248e636a
*/