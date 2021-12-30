package etcExam;

import java.util.*;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] argArr = null;
		
		while(true) {
			String input = sc.nextLine();
			                             // import java.util.regex.*'  정규표현식을 사용하였다.
			argArr = input.split(" +");  // 입력받은 내용을 공백으로 자른다. (공백의 갯수는 무관)
			
			if(input.equals("q")) {
				break;
			} else {
				for (String item: argArr) {
					System.out.println(item.toLowerCase());
				}
			}
		}			
	}

}
/*
Scanner는 문자 데이터를 입력받는 목적으로 JDK1.5부터 추가 되었다.
다양한 형태의 입력을 받아 처리할 수 있다. 정규 표현식과 함께 쓸 수 있다.

1. hello    123
hello
123



2. HELLO   123      456
hello
123
456

q를 입력하면 종료







*/