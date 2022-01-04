package JavaInter.variableExam;

public class CastingExam {
    public static void main(String[] args) {




        


        


    }
}













//     }
// }

/*
  형변환 Casting - 자료형의 타입을 일치시킨다.
    변수 또는 상수의 타입을 다른 타입으로 변환하는 것
    예) int 값과 double값을 계산하려면 먼저 두 값을 같은 타입으로 변환한 후 
        계산할 수 있다. 

    (타입)피연산자      // 괄호는 '캐스트 연산자' = '형변환 연산자'
    double d = 85.4;
    int score = d;       에러 발생
    int score = (int)d;  이렇게 해야 하고
    int score = 85;      int(정수)형만 받을 수 있기 때문에 .4는 날아간다.
    
    double d = 85.4;
    int score = (int)d;

    System.out.println(score);  // 85   double의 .4 는 잘려나가 손실이 됐다.

    
    boolean을 제외한 나머지 타입들은 서로 형변환이 가능하다.
    기본형(int,Str,double,float,short ... 8가지) 과 참조형간의 형변환은 불가능하다.

    정수형간의 형변환 ...
      큰 타입에서 작은 타입으로 변환, 예를 들면 int의 값을 byte타입으로 변환하는 경우에는
      그 크기의 차이 만큼 잘려나간다. (값 손실 'loss of data'이 발생할 수도 있다.)
      반대로 작은 타입에서 큰 타입으로의 형변환, 예를 들면 byte에서 int으로의 변환하는 경우는
      잘려나가는 일이 없다. 따라서 값 손실이 발생하지 않는다.
      나머지 빈공간들은 0 또는 1로 채워진다.

      byte 00001010
      int 00000000...... 00001010 (이렇게 된다.)  

        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int] -> [byte] i = %d -> b = %d%n", i, b); 
                         // [int] -> [byte] i = 10 -> b = 
                         
        i = 300;
        b = (byte)i;     // 담을 수 없다 b = 44가 최대이다. 이거를 Overflow 라고 한다.
        System.out.printf("[int] -> [byte] i = %d -> b = %d%n", i, b); 
                         // [int] -> [byte] i = 300 -> b = 44

        b = 10;
        i = b;    // i = (int)b; 이렇게 하지 않아도 괜찮다. 어차피 int가 byte보다 크다.
        System.out.printf("[byte] -> [int] b = %d -> i = %d%n", b, i); 
                         // [byte] -> [int] b = 10 -> i = 10


        b = -2;
        i = b;    // i = (int)b;  이렇게 하지 않아도 상관없다.
        System.out.printf("[byte] -> [int] b = %d -> i = %d%n", b, i); 


    실수형간의 형변환 
        float f = 9.1234567f;
        double d = 9.1234567;

        double d2 = f;
        double d3 = (double)f;

        System.out.println(d2);  // 9.123456954956055
        System.out.println(d3);  // 9.123456954956055
        System.out.printf("d = %f%n", d2);      // d = 9.123457
        System.out.printf("d = %.2f%n", d2);    // d = 9.12          .2f 는 소숫점2자리까지
        System.out.printf("d = %10.2f%n", d2);  // d =       9.12   10.2f는 총 10자리수의 소숫점2자리까지
        System.out.printf("d = %-10.2f%n", d2); // d = 9.12  %-10.2f는 총10자리수의 왼쪽정렬


    정수와 실수 간의 형변환
       자료형이 완전히 다르기 때문에 정수형 간의 형변환처럼 간단히 처리할 수 없다.
       조금 더 복잡한 과정을 거친다.

       정수를 실수형으로 형변환
       실수를 정수형으로 형변환
    //     int i = 91234567;     // int < float 

    //     float f = i;      // int를 float에 넣었다
    //     int i2 = f;       // float을 int에 넣을 수는 없다
    //     int i2 = (int)f;  // float을 int에 넣으려면 (int)f; 이렇게 int로 형변환 해줘야 한다.

    //     double d = i;     // int 를 double에 넣었는데, 
    //     int i3 = d;       // double을 int에 넣을 수는 없다.
    //     int i3 = (int)d;  // double을 int에 넣으려면 (int)d; 하여 형변환을 해줘야 한다.



    
    자동 형변환
       서로 다른 타입간에 대입이나 연산을 할 때는 형변환을 통해 일치시키는 것이 원칙이다. 
       하지만 경우에 따라 생략할 수도 있다. 그렇다고 형변환을 하지 않는 것은 아니고 
       자바가 형변환을 해주는 것이다.

    //     float f = 1234;         // int 를 넣는다.
    //     System.out.println(f);  // 1234.0  정수를 넣었지만 출력 시 보면 자동으로 f으로 형변환되었다.

    // //  byte b = 1234;          // byte 의 최대크기는 128이다. 담을 수 없기에 에러가 뜬다.
    //     byte b = (byte)1234;    // (byte)1234; 이렇게 byte로 형변환해주자.
    //     System.out.println(b);  // -46 출력 내용은 자동으로 형변환되었다.

            int i = 3;
        double d = 1.0;

        double s = i + d;   // int형과 double형을 더한다.(서로 다른 자료형)
        System.out.println(s);  // 4.0    변수s는 double이기 때문에 .0 도 같이 나온다.
        // 특히 계산할 때 자동 형변환이 많이 일어난다.
        // 형변환이 이루어지는 것을 '산술변환'이라고 한다.
        // 자동 형변환은 값을 최대한 보존할 수 있는 타입으로 자동 형변환된다.
*/