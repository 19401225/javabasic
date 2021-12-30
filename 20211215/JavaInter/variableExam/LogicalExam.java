package JavaInter.variableExam;
import java.util.Scanner;
public class LogicalExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 하나 입력하세요.>");
        String a = sc.nextLine();
        char ch = ' ';
        ch = a.charAt(0);

        
        if (ch >= '0' && ch <= '9') {
            System.out.println("입력하신 문자는 숫자입니다.");
        } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println("입력하신 문자는 영문자입니다.");
        }
        }
    }
// Quiz 2 
// 문자를 하나 입력 받아서, 그 문자가 숫자인지 문자인지를 확인하는 프로그램을 만드시오.
// "문자를 하나 입력하세요.>"
// "입력하신 문자는 숫자입니다."
// "입력하신 문자는 영문자입니다."







/*
        논리 연산자는 둘 이상의 조건을 and 또는 or로 연결하여 하나의 식으로 표현한다.
        || (or) 피연산자의 어느 한쪽만 true일 경우 결과는 true로 반환
        && (and) 피연산자의 '양쪽' 모두 true일 경우에 결과가 true로 반환 
        

        x > 10  &&  x  < 20;        
        10 > x  &&  x  < 20;   둘 다 사용가능하다. 그런데
        10 < x < 20;   이런 형식은 안 된다.  && 또는 || 를 사용하도록 되어 있다.
        
        i % 2 == 0 || i % 3 == 0;   2의 배수도 가능  or 3의 배수도 가능 








*/