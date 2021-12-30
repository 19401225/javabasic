package oopExam;

public class recursiveExam {
	
	public static void main(String[] args) {
/* 재귀 호출 recursive call
	매서드 내부에서 자기 자신 매서드를 다시 호출
	무한히 자기 자신을 호출하기 때문에 무한 반복에 빠지게 된다. 따라서
	조건문을 통한 탈출이 필수적으로 따라다닌다. 
   
   void method(int n) {
	   if(n == 0) {
	   		return;
	   	}
	   System.out.println(n);
	   method(--n);
	   
	반복문은 같은 문장을 반복해서 수행하지만 재귀 호출은 반복문보다 몇 가지 과정
	예를 들면 매개변수 복사 종료 후 복귀할 주소 저장 등등 내부적으로 추가로 필요한
	것들이 많아서 일반적으로 반복문보다 재귀호출이 수행시간이 더 오래 걸린다.
	
	 왜 굳이 반복문 대신 재귀를 사용할까...큰 이유는 재귀의 논리적 간결함이다. 
	 
	 재귀 호출은 비효율적이므로 재귀 사용에 드는 비용보다 간결함이 주는 이득이 
	 월등히 충분히 큰 경우에만 사용할 것을 권장한다. 
	 
	 5! = 5*4*3*2*1
     3! = 3*2*1
     
     facfor(5)
     
*/
		System.out.println(recursiveExam.facfor(5));
		System.out.println(recursiveExam.facrecur(5));

	}

	static int facfor(int n) {
		
		int facto = 1;
		
		for(int i = 1 ; i <= n ; i++) {
			facto *= i; // focto = facto * i
			System.out.println("i = " + i + "   facto = "+ facto);
		}
	
		return facto;
	}
	
	
	static int facrecur(int n) {
		
		return 1;
	}

}
