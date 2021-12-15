package JavaInter.variableExam;
import java.util.Scanner;
public class OperatorExam {
    public static void main(String[] args) {
        String str1 = "abc";             
        String str2 = new String("abc"); 
        String str3 = "abc";             

                               // \를 붙여 "를 글자화한다.   ? 는 같니?라는 의미  %d, %b 다 사용가능하다.
        System.out.printf("\"abc\" == \"abc\" ? %b%n", ("abc" == "abc"));  // "abc" == "abc" ? true
        System.out.printf("abc == \"abc\" ? %b%n", (str1 == "abc")); // abc == "abc" ? true
                            
        System.out.println(" ");

        System.out.printf("\"abc\" == \"abc\" ? %b%n", ("abc" == "abc"));// "abc" == "abc" ? true
        System.out.printf("str1 == \"abc\" ? %b%n", (str1 == "abc")); // str1 == "abc" ? true
        System.out.printf("str2 == \"abc\" ? %b%n", (str2 == "abc")); // str2 == "abc" ? false

        System.out.printf("\"abc\".equals(\"abc\") ? %b%n", "abc".equals("abc")); // "abc".equals("abc") ? true
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); // str1.equals("abc") ? true
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); // str2.equals("abc") ? true
   
        
        System.out.printf("str1 == str3 ? %b%n", str1 == str3);      // true
        System.out.printf("str2 == str3 ? %b%n", str2 == str3);      // false  음????
        System.out.printf("str1 == str3 ? %b%n", str1.equals(str3)); // true
        System.out.printf("str2 == str3 ? %b%n", str2.equals(str3)); // true
        
        System.out.println(System.identityHashCode(str1));  // 1804094807
        System.out.println(System.identityHashCode(str2));  // 951007336  
        System.out.println(System.identityHashCode(str3));  // 1804094807 
        // new String(); 하여 선언한 값과 메모리 위치 값이 다르다.
        // 결국, == 은 메모리 주소 값을 묻는 내용이고,
        // 결국, .equals();는 데이터 값을 묻는 내용이다.
        // 글자를 비교할 때는 .equals(); 를 사용하도록 하자.
    }
}



    //     Scanner scan = new Scanner(System.in);
    //     int i = 0;
    //     i = scan.nextInt();

    //     if ((i % 2) == 1) {
    //         System.out.printf("입력하신 수 %d는(은) 홀수입니다.%n", i);
    //     } else if ((i % 2) == 0) {
    //         System.out.printf("입력하신 수 %d는(은) 짝수입니다.%n", i);
    //      // quiz 1. 정수를 하나 키보드로 입력 받아 그 수가 홀수인지 짝수인지를 출력하는 프로그램 ㅏㅈㄱ성
    //      // "입력하신 수 ??는 홀수입니다."
    //     }
    //   }
    // }


         



        // int x = 10,  y = 7;
        // System.out.printf("x를 2로 나눈 나머지는 %d입니다.%n", (x%2));
        //                 // x를 2로 나눈 나머지는 0입니다.  언제나 짝수구나.
        // System.out.printf("y를 2로 나눈 나머지는 %d입니다.%n", (y%2));
        //                 // y를 2로 나눈 나머지는 1입니다.  언제나 홀수구나.
        // System.out.printf("x를 5로 나눈 나머지는 %d입니다.%n", (x%5));
        //                 // x를 5로 나눈 나머지는 0입니다.  언제나 5의 배수구나





        // int x = 10,   y = 8;
        // System.out.printf("%d을 %d로 나누면%n", x, y);    // 10을 8로 나누면
        // System.out.printf("몫은 %d, 나머지는 %d입니다.%n", (x/y), (x%y));
        //                       // 몫은 1, 나머지는 2입니다.


// 나머지 연산자 %는 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후 나머지만 결과로 반환하는 연산자
// 나머지 연산자는 홀수, 짝수, 배수 검사에 엄청 아주 많이 사용된다.
        





/*
 연산자 Operator 
   연산자는 연산을 수행하는 기호 +, -, *, /, % ....
   
   피연산자는 작업 대상(연산 대상인 변수, 상수, 수식 ...)을 의미한다.
   연산자는 피연산자로 연산을 수행하고 나서 항상 그 결과값을 반환한다.
   연산자와 피연산자를 조합하여 계산을 표현한 것을 식이라고 하고,
   그 식을 계산하여 결과를 얻는 것을 '평가 evaluation'이라고 한다.
   예) x + 3 
       +는 연산자이고,     x,3은 피연산자이고,     x + 3  자체를 식이라고 한다.

   연산자의 종류
     - 산술 연산자 : +  -  *  /(나눈몫)  %(나눈나머지, 홀짝배수를 구하기 위해 많이 사용)
     - 비교 연산자 : >  <  <=  >=  ==(같다)  !=(같지않다)  
     - 대입 연산자 : = (우변의 내용을 좌변으로 저장)
     - 논리 연산자 : ||(or)  &&(and)  |  &
     - 기타 연산자 : 삼항연산자(if없이 조건문)   

    연산자의 갯수에 따라서는
     - 단항 연산자 
         증가 연산자 ++ : 피연산자의 값을 1 증가 시킨다.
         증감 연산자 -- : 피연산자의 값을 1 감소 시킨다.
            i++;  값이 먼저 참조되고 나서 증가 (후위형)
            ++i;  값이 먼저 증가되고 나서 참조 (전위형)  
               단항 연산자 하나만 단독으로 사용될 때는 전/후위 차이가 없다.
                    int i = 5;
                    i++;
                    System.out.println(i);  // 6

                    i = 5;
                    ++i;
                    System.out.println(i);  // 6


             // int i = 5;
             // int j = 0;
             // j = ++i; // i를 1증가 시킨 후 j에 넣는다.
             // System.out.println("j = ++i 실행 후, i = " + i + ", j = " + j);
                                // j = i++ 실행 후, i = 6, j = 6

            // int i = 5;
            // int j = 0;
            // j = i++; // j에 i를 넣고 나서 =+ 증가 된다.
            // System.out.println("j = i++ 실행 후, i = " + i + ", j = " + j);
                                // j = i++ 실행 후, i = 6, j = 5




            // int i = 5, j = 5;
            // System.out.println(i++);   // 5  출력하고 증가시키고
            // System.out.println(++j);   // 6  증가시키고 출력하고,
            // System.out.println("i = " + i + ", j = " + j);  // i = 6, j = 6   
         


         등가비교 연산자 ==    !=
             두 개의 피연산자의 값이 같은지(==) 또는 다른지 (!=)를 비교하여 
             == 같으면 true, 다르면 false
             != 다르면 true, 같으면 false
             
                    System.out.println(1 == 0); // false
                    System.out.println(1 != 0);  // true 
             문자열 비교 .equals();
                 문자열을 비교할 때는 ==를 쓰지 않고 반드시 .equals()를 사용하자.


     - 이항 연산자
     - 삼항 연산자 (조건식) ? true : false           예) a = (i < a; ? 50 : 40);   

    연산자의 우선순위
       일반 수학 계산 순서와 동일하게 상식적인 선에서,  
       곱셉이 덧셈보다 먼저 수행하고, 괄호 안에 내용을 먼저 계산하고,
       5 + 3 * 4 
            1) 3 * 4 = 12
            2) 5 + 12 = 17





*/