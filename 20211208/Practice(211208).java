/*
주석 comment : 코드에 대한 설명을 적는다.
               주석은 컴퓨터는 읽지 않는다.
              코드의 실행을 잠시 멈추고 문제점을 파악하는 용도로도 사용한다.

클래스 선언 
class Main {
  public static void main(String[] args) {
    System.out.pringln("Hello World!");
  }  여기가 메서드 블록의 끝
} 여기가 클래스 블록의 끝


클래스 블록 : 소스 코드의 가자아 바깥쪽 블록 (자바는 모든게 클래스)
class Main {}   클래스명은 파일명과 반드시 동일해야 한다.

메서드(함수) 블록 : 기능을 정의한다.
 main 메서드가 프로그램 전체의 시작점이다.
 public static void main(String[] args) {}   여기에서 저 main을 말한다.
   public은 접근제어자, public은 모두 접근 가능
   static은 객체를 생성하지 않고도 사용 가능하다.
   void는 리턴값이 없음을 의미한다.
   []은 배열을 의미하고, String은 문자열, args는 변수들을 의미한다.

  System.out.println("Hello World!");
    명령문은 반드시 세미콜론(;)dmfh 구문의 끝을 나타낸다.
    println의 ln은 line을 의미하고 출력 후 커서는 다음 줄로 위치하게 된다.
    ln을 빼고 입력 시 출력한 이후 커서는 그 줄에 위치하게 된다.


변수 : 어떤 값을 보관하는 용도
int a;     a 라는 변수명에 정수(integer)를 보관할 것이다.
String b;  b 라는 변수명에 문자열(String)을 보관할 것이다.

변수명 선언 규칙
1. 변수명은 숫자로는 시작할 수 없다.  a100(o)  100a(x)
2. _ underscore, $ 는 사용 가능하지만 @, ! ..는 사용할 수 없다.
3. 예약어는 변수명으로 사용할 수 없다. int, class ... (X)

*. 한글은 변수명으로 사용하지 않는다. 가급적 소문자로 만든다.

*/


/*
문자열에서 많이 사용하는 메서드들 
.equals       // 두 개의 문자열을 비교하여 같으면 true, 다르면 false
.indexOf      // 문자열의 인덱스 위치 출력
.replaceAll   // 문자열 변경(기존내용, 바꿀내용)
.substring    // 문자열을 뽑아낼 때 사용되고 인덱스 위치(이상, 미만)로 지정한다. (0, 4)
.toUpperCase  // 모든 문자열을 대문자로 변환 
.toLowerCase  // 모든 문자열을 소문자로 변환


Bool (불, Boolean) 
  true or false 
  true는 1 또는 0이 아닌 모든 것,  false는 0
  컴퓨터 자체가 0과 1이기 때문에 연계하여 정말 많이 사용된다.



*/



/*
char 문자 

*/

class Main {
  public static void main(String[] args) {
    char a = 'a';
    char b = 97;
    char c = 122;
    char
  }
}




/*
array 배열 
 여러 개의 원소를 한 번에 담는 자료형, 자료의 집합이다.
 배열은 그 길이가 고정된다. 즉, 한 번 생성하면 길이를 수정할 수 없다.

 int[] engScore = {80, 90, 100, 95, 65}; 
 String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
 String[] names = {"kim", "park", "son", "yoon", "lee"};

 이렇게 자료형 다음에 []를 사용하여, 내용을 한 번에 담을 수 있다.


*/









/*
반복문 (for, while, (do~while))
  for 문은 정확히 몇 번 반복시키겠다 라고 할 때 주로 사용되고,
 while 문은 언제까지 반복하라 할 때 주로 사용된다. 그렇지만 서로 혼용되어 사용한다.



*/



/* List 리스트 (파이썬의 리스트와는 이름만 같을 뿐이다.)
   배열과 비슷한 자료형, 크기가 정해지지 않고 동적으로 변한다.
   배열은 생성 시에 크기가 정해지지만, 리스트는 원하는 만큼 자유롭게 담을 수 있다.

   ArrayList




*/




/* 
Generics - 입력되는 객체의 자료형을 강제한다.


*/ 