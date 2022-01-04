<<<<<<< HEAD
package src.JavaInter.variableExam;
import java.util.Scanner;
public class TriExam {
    public static void main(String[] args) {
       int x, y, z;
       int absX, absY, absZ;
       char signX, signY, signZ;

       x = 10;
       y = -5;
       z = 0;

       absX = x >= 0 ? x : -x;  // 10    // x가 음수일 경우, -를 붙인다 그러면 양수가 된다.
       absY = y >= 0 ? y : -y;  // 5     // 
       absZ = z >= 0 ? z : -z;  // 0     // 
       
       signX = x > 0 ? '+': x == 0 ? ' ' : '-';
       signY = y > 0 ? '+': y == 0 ? ' ' : '-';
       signZ = z > 0 ? '+': z == 0 ? ' ' : '-';

       System.out.printf("x = %c%d%n", signX, absX);
       System.out.printf("y = %c%d%n", signY, absY);
       System.out.printf("z = %c%d%n", signZ, absZ);
   }
}




      
           

// Quiz 1 삼항 연산자를 사용하여 
// 100점 미만 90점이상이면 "A" 
// 90점 미만 80점 미만이면 "B"
// 80점 미만 70점 이상 "C"
// 나머지 전부는 "D"



// x = x + (y < x ? 1 : 2)
// 

// Scanner in = new Scanner(System.in);
// 		int A = in.nextInt();
// 		in.close();
		
// 		System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
// Scanner scan = new Scanner(System.in);
//         int i = scan.nextInt();
//         scan.close();

//         System.out.println(i>=90?"A":i>=80?"B");


/*
  삼항 연산자 (조건)
   
     첫 번째 피연산자 조건식의 평가 결과에 따라 
     true면 두 번째 항, false면 세 번쨰의 항의 값이 결과가 된다.
     조건식의 괄호가 필수는 아니다.
     여러 번 중첩하면 가독성이 떨어지므로 꼭 필요한 경우에만 사용한다.


     if (조건식) {   
        true;
     } else {
        false;
     }         // 웹 개발에서, 이렇게 네 줄을 
        
               // 한 줄로(삼항 연산자)하여 사용하는 일이 많을 것이다.
        (조건식) ? true : false           ? 는 참이면,    : 는 거짓이면,


// 여러 개의 조건을 삼항 연산자로 표현하면 이러하다.
(조건식1) ? "A" : (조건식2) ? "B" : (조건식3) ? "C" : "D"  
        
     if (조건식1) {   
        "A";
     } else if (조건식2) {
        "B";
     } else if (조건식3) {
        "C";
     } else {
        "D";
     }  










=======
package src.JavaInter.variableExam;
import java.util.Scanner;
public class TriExam {
    public static void main(String[] args) {
       int x, y, z;
       int absX, absY, absZ;
       char signX, signY, signZ;

       x = 10;
       y = -5;
       z = 0;

       absX = x >= 0 ? x : -x;  // 10    // x가 음수일 경우, -를 붙인다 그러면 양수가 된다.
       absY = y >= 0 ? y : -y;  // 5     // 
       absZ = z >= 0 ? z : -z;  // 0     // 
       
       signX = x > 0 ? '+': x == 0 ? ' ' : '-';
       signY = y > 0 ? '+': y == 0 ? ' ' : '-';
       signZ = z > 0 ? '+': z == 0 ? ' ' : '-';

       System.out.printf("x = %c%d%n", signX, absX);
       System.out.printf("y = %c%d%n", signY, absY);
       System.out.printf("z = %c%d%n", signZ, absZ);
   }
}




      
           

// Quiz 1 삼항 연산자를 사용하여 
// 100점 미만 90점이상이면 "A" 
// 90점 미만 80점 미만이면 "B"
// 80점 미만 70점 이상 "C"
// 나머지 전부는 "D"



// x = x + (y < x ? 1 : 2)
// 

// Scanner in = new Scanner(System.in);
// 		int A = in.nextInt();
// 		in.close();
		
// 		System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
// Scanner scan = new Scanner(System.in);
//         int i = scan.nextInt();
//         scan.close();

//         System.out.println(i>=90?"A":i>=80?"B");


/*
  삼항 연산자 (조건)
   
     첫 번째 피연산자 조건식의 평가 결과에 따라 
     true면 두 번째 항, false면 세 번쨰의 항의 값이 결과가 된다.
     조건식의 괄호가 필수는 아니다.
     여러 번 중첩하면 가독성이 떨어지므로 꼭 필요한 경우에만 사용한다.


     if (조건식) {   
        true;
     } else {
        false;
     }         // 웹 개발에서, 이렇게 네 줄을 
        
               // 한 줄로(삼항 연산자)하여 사용하는 일이 많을 것이다.
        (조건식) ? true : false           ? 는 참이면,    : 는 거짓이면,


// 여러 개의 조건을 삼항 연산자로 표현하면 이러하다.
(조건식1) ? "A" : (조건식2) ? "B" : (조건식3) ? "C" : "D"  
        
     if (조건식1) {   
        "A";
     } else if (조건식2) {
        "B";
     } else if (조건식3) {
        "C";
     } else {
        "D";
     }  










>>>>>>> 4801aee843c0fa98041e93d513809646248e636a
*/