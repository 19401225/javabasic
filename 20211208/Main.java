/*
// 주석comment : 코드에 대한 설명을 적는다.
//              주석은 컴퓨터는 읽지 않는다.
//              코드의 실행을 잠시 멈추고 문제점을 파악하는 용도로도 사용

// 클래스 선언 (라인 주석)
// class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello world!");  // hello world를 출력한다.
//   } // 여기가 메서드 블록의 끝이다.
// }  // 여기가 클래스 블록의 끝이다.




// 클래스 블록 : 소스 코드의 가장 바깥쪽 블록 (자바는 모든 게 클래스)
class Main {
  // 클래스명은 파일명과 반드시 동일해야 한다.


 // 메서드(함수) 블록 (기능을 정의)
 // main 메서드가 프로그램 전체의 시작점이다.
  public static void main(String[] args) {
    // public 은 접근제어자, public은 모든 접근가능 
    // static 은 객체를 생성하지 않고도 사용가능
    // void 는 리턴값이 없음을 의미한다.
    // [] 은 배열을 의미하고, String은 문자열, args 는 변수들 
    System.out.println("Hello World!");
    // 명령문은 반드시 세미콜론(;)으로 구믄의 끝을 나타낸다.
    // print의 ln 은 line을 의미하고 없이 입력할 경우 출력 후 그 줄에 커서가 자리한다.
    // ln을 입력하여 출력 시 출력 후 다음 줄에 커서가 위치한다.
  } 


} 

/*  (블럭 주석)
여러 줄에 대한 주석은 이렇게,
작성자 : 홍길동
작성일 2021 12.08



*/



/*
변수 : 어떤 값을 보관하는 용도
int a;      a라는 변수명에 정수(integer)를 보관할 것이다.
String b;   b라는 변수명에 문자열(String)을 보관할 것이다.

변수명 선언 규칙
1. 변수명은 숫자로는 시작할 수 없다.  a100(o)  100a(x)
2. _ underscore, $ 는 사용 가능하지만 @, ! ..는 사용할 수 없다.
3. 예약어는 변수명으로 사용할 수 없다. int, class ... (X)

*. 한글은 사용하지 않는다. 가급적 소문자로 만든다.

잘못된 변수명 선언의 예
int 2nd;    숫자로 시작 불가능
String b#;  특수문자 사용 불가능
int main;   예약어 사용 불가능



자료형 (type) 선언
int a;     변수명 a는 int 자료형 변수임으로 a라는 변수에는 정수만 담을 수 있다. 1,2,10,300....
String b;  변수명 b는 String 자료형 변수임으로 b라는 변수에는 문자열만 담을 수 있다.
           "boy" , "Hello World"....


클래스 class - 자바는 클래스 단위로 프로그램을 구성한다.
              클래스명은 명사로 만든다.
              여러 개의 단어로 만들 경우 각 단어의 첫 문자는 대문자로 만든다. (띄어쓰기 X)
             예) class Raster {} 
                 class ImageSprite {}


메서드 Method - 하나의 클래스 안에는 메서드가 여러개 존재할 수 있다.
               메서드 명은 주로 동사로 만든다.
               여러 개의 단어로 만들 경우 처음 시작하는 문자는 소문자로 시작하고 
               두번째 단어부터는 대문자를 사용한다.
               예) run{}
                   runFast{}
                  getBackGround{}

      * 권장 사항 : 변수명은 짧지만 의미가 있게 만든다.
                   (변수명을 통해 사용 의도를 알 수 있다.)

# 숫자 자료형 (number , integer)
  정수 1, 10, 50... , 실수 3.14, 7.8...

  정수 
  int(***)   int age = 21;
  long       long countStar = 5943051243921043902143021L;  (끝에 L을 붙이면 long이구나.)

  실수 3.14 , 7.8 ...
  float             float pi = 3.14F;             (끝에 F를 붙이면 float이구나.) 
  double(***)       double morePi = 3.141592;     (double 은 그대로 사용한다.)



*/

//     int a = 10;   // a 라는 변수에 10을 넣는다.
//     int b = 5;
//     System.out.println(a+b);  // print에 ln이 붙으면 출력 후 줄을 바꾸라는 의미
//     System.out.println(a-b);
//     System.out.println(a*b);
//     System.out.println(a/b);
  
//     System.out.println(a%b);  // 나머지 연산자 (홀수, 짝수, 배수를 찾을 수 있다.)
//     System.out.println(7%2);  // 나머지가 1인, 홀수 찾기
//     System.out.println(6%2);  // 나머지가 0인, 짝수 찾기
//     System.out.println(6%3);  // 나머지가 0인 3의 배수 찾기
//   }

// }


// class Main {
//   public static void main(String[] args) {
//     int i = 0;
//     int j = 10;
    
//     // i++;   // 하나 증가 (정말 많이 사용한다.)    i = i + 1;      i += 1;      같은 의미
//     // j--;   // 하나 감소                        j = j - 1;      j -= 1;      같은 의미
  
//     // System.out.println(i);
//     // System.out.println(j);
//   }
// }



// class Main {
//   public static void main(String[] agrs) {
//     int i = 0;
//     // System.out.println(++i);   // 1   하나를 증가하고 출력 (선증가)
//     System.out.println(i++);   // 0      출력을 하고 하나 증가 (후증가)

//     System.out.println(i);     // 1  위에 i++의 영향을 받아 1을 출력
//   }
// }



/*
String 문자열(글자들)
              "Hello World"
              "a"
              "12345"

String a = new String("Hello World");  이와 같이 객체를 생성한 후 사용하는 게 원칙이다 
                                       new 는 생성자 Constructor

String a = "Hello World"   String은 자바에서 특별하여, 위에 처럼 객체를 생성하지 않고도 사용할 수 있다.
                             
*/

/* 문자열에서 많이 사용하는 메서드.
   equals (***) : 두 개의 문자열이 동일한지 비교하여 결과 리턴
   
SHA-256 이라는 알고리즘으로,
패스워드가 DB에 그대로 저장되는 게 아니라 암호화되어 저장
비교는 가능하지만, 복호화가 불가능하다. 블록체인에서도 사용됨
*/

// class Main {
//   public static void main(String[] args) {
//     String a = "hello";
//     String b = "java";
//     String c = "hello";

//     System.out.println(a.equals(b));   // false
//     System.out.println(b.equals(a));   // false  로그인 실패
//     System.out.println(a.equals(c));   // true   로그인 성공
//     System.out.println(c.equals(a));   // true
//     System.out.println(b.equals(c));   // false
//     System.out.println(c.equals(b));   // false

//   }
// }



 
// indexOf 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴
// class Main {
//   public static void main(String[] args) {
//     String a = "hello World";

//     System.out.println(a.indexOf("World"));  // 6    0부터 시작하여 띄어쓰기를 포함한 자릿수의 첫 번째
//     System.out.println(a.indexOf("hello"));  // 0
//     System.out.println(a.indexOf("e"));      // 1
//     System.out.println(a.indexOf("o"));      // 4  중복된다면 첫 번째 인자만 출력
//     System.out.println(a.indexOf("d"));      // 10
//     // 0에서 시작, 빈칸(띄어쓰기)도 글자, 이하보다는 미만을 표현
//     // 서울시 강남구, 서울시 서초구, 서울시 송파구     ...  숫자 4번째부터 그 이하를 한 번에 수정할 수 있겠지
//   }
// }


// replaceAll  문자열 중 특정 문자열을 다른 문자열로 치환, 무언가를 찾아 한 번에 변경할 수 있다.
// class Main {
//   public static void main(String[] args) {
//     String a = "hello World";

//     System.out.println(a.replaceAll("World", "java"));
//     System.out.println(a.replaceAll("World", "python"));
//     System.out.println(a.replaceAll("hello", "Dream"));
//     System.out.println(a.replaceAll("h", "Y")); 
//     System.out.println(a.replaceAll("orl", "oo"));
//   }
// }


// substring 문자열 중 특정 부분을 뽑아낼 경우 사용한다. 
             // 특정 지역에 있는 스타벅스를 찾아낼 때
// class Main {
//   public static void main(String[] args) {
//     String a = "Hello World";

//     System.out.println(a.substring(0,4));  //  Hell
//     System.out.println(a.substring(3,11)); // lo World 
//     System.out.println(a.substring(0,6));  // Hello 
//     System.out.println(a.substring(2,11)); // llo World
//    // 괄호 안은 인덱스 위치를 의미하고, 끝 위치는 포함하지 않는다. 즉, 이상~미만 
//   }
// }



// toUpperCase : 모든 문자열을 대문자로 변환
// toLowerCase : 모든 문자열을 소문자로 변환
// class Main {
//   public static void main(String[] args) {
//     String a = "Hello World";
//     System.out.println(a.toUpperCase());  // HELLO WORLD 
//     System.out.println(a.toLowerCase());  // hello world
//   }
// }

/*

.equals

*/


/*
 Bool (불 Boolean) true 1(0이 아닌 모든 것),  false 0      
              정말 많이 사용된다. 컴퓨터 자체가 0과 1이기 때문이다. 연계하여 사용된다.
*/

// class Main {
//   public static void main(String[] args) {

//     int base = 100;
//     int height = 185;
//     boolean isTall = height > base;

//     if (isTall) {         // true면 아래를 실행,  false일 경우 아무것도 출력되지 않는다.
//       System.out.println("키가 큽니다");
//     }
//   }
// }


//  Ada Lovelace  1815.12.10. ~ 1852.11.27. 최초의 프로그래머, 아버지는 천재 시인 조지 고든 바이런.
// 컴퓨터란 기계자체가 없던 시절에 프로그래밍 언어를 고안해내고 미래의 컴퓨터가 할 수 있는 일을 예견까지 한 에이다 러브레이스는 독특한 출생과 삶을 살아간 영국의 백작부인이었다.


// char 문자 
// class Main {
//   public static void main(String[] agrs) {
//     char a = 'a';  // 문자 하나일 경우 작은 따옴표
//     char b = 97;   // ascII 97 = a       char 97 = a
//     char c = 122;
//     char d = 90;
//     char e = 65;

//     System.out.println(a);  // a  
//     System.out.println(b);  // a
//     System.out.println(c);
//     System.out.println(d);
//     System.out.println(e);
//   }
// }


/*
 배열 array : 여러 개의 원소를 한 번에 담는 자료형. 자료의 집합이다.
              배열은 그 길이가 고정된다. 즉, 한 번 생성하면 길이를 수정할 수 없다.
   int hongeng = 90;
   int hongmath = 80;    변수의 갯수가 계속 많아진다.
   int hongsci = 70;

  int engScoreKim = 80;  한 개만 저장
  int[] engScore = {80, 90, 70, 65, 100};                  이렇게 [] 를 사용하여 한 번에 담을 수 있다.
  String[] names = {"kim", "park", "son", "yoon", "lee"}  

*/
// class Main {
//   public static void main(String[] args) {
//     String[] weeks = new String[7];  // 7개의 배열을 가진 String을 새로 만든다. (갯수를 먼저 정한다.)
    
//     weeks[0] = "월";
//     weeks[1] = "화";
//     weeks[2] = "수";
//     weeks[3] = "목";
//     weeks[4] = "금";
//     weeks[5] = "토";
//     weeks[6] = "일";  // 이 내용을 배열을 사용하여 한 줄로 나타내면 아래와 같다.

//     // String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
    
//     // System.out.println(weeks[1]);  // 화
//     // System.out.println(weeks[3]);  // 목
    
//     // 반복문 (for, while, (do~while))
//     //       for문은 정확히 몇 번 반복시키겠다 라고 할 때 사용되고,
//     //       while문은 언제까지 반복하라 라고 할 때 사용된다.  서로 혼용되어 사용한다.

//      for (int i = 0; i < weeks.length; i++) {   // 배열의 갯수.length는 7
//         System.out.println(weeks[i]); // 월~일까지 하나씩 모두 출력된다.
//      }       

//     System.out.println(weeks[7]);
//       // ArrayIndexOutOfBoundsException 이라는 인덱스 에러가 나오는데 잘 기억해두자. 비슷한 인덱스 에러들이 있다.
//       // 인덱스가 없는 위치를 지정할 경우에 나온다. 이러한 에러를 "예외"라고도 한다.
//       // 이 "예외"처리를 하는 게 굉장히 중요하다. 프로그래머의 역량을 볼 수 있는 게 "예외처리"이다.
//       // 어떤 에러가 나오고 어떻게, 어떨 경우에 나오는지 이해하고 부드럽고 보기 좋게 처리하는 일이다.
//   }
// }

/*
 리스트 List (파이썬의 리스트와는 이름만 같을 뿐이다.)
  배열과 비슷한 자료형, 크기가 정해지지 않고 동적으로 변한다. 배열은 그 크기가 생성 시에 정해지지만
  리스트는 그 크기가 정해지지 않아 원하는 만큼 자유롭게 담을 수 있다.

  ArrayList 
 
*/
// import java.util.ArrayList;  // 만들어 놓은 기능을 가져와 사용한다. java.util에 있는 ArrayList기능을 가져온다.
// public class Main {
//   public static void main(String[] args) {
    
//     ArrayList pitches = new ArrayList(); // 객체 생성

//     pitches.add("123");
//     pitches.add("234");
//     pitches.add("789");
//     pitches.add("5555");
//     pitches.add(0,"133");  // 이렇게 인덱스 위치를 같이 줘서 원하는 위치에 놓을 수도 있다.
//     pitches.add(1,"311");
//     System.out.println(pitches);             // [133, 311, 123, 234, 789, 5555]
//     System.out.println(pitches.get(1));   // 311      
//     // get() 메서드를 이용하여 특정 인덱스 값을 추출

//     System.out.println(pitches.size());   // 6  
//     // size()메서드를 이용하여 리스트의 갯수를 확인

//     System.out.println(pitches.contains("234"));   // true
//     // .contains() 메서드를 이용하여 포함 여부 확인 : true or false 

//     System.out.println(pitches.remove("789"));
//     // remove() 메서드를 이용하여 해당 객체를 삭제하고 결과를 리턴 : true or false 
//     System.out.println(pitches); // [133, 311, 123, 234, 5555]

//     System.out.println(pitches.remove(0)); // 133
//     // remove() 메서드를 이용하여 해당 인덱스의 객체를 삭제
//     System.out.println(pitches); // [311, 123, 234, 5555]
//   }
// }





/*
 Generics - 입력되는 객체의 자료형을 강제한다.
           

ArrayList pitches = new ArrayList();  이렇게 기본에서, Generics를 사용하면  아래와 같다.

ArrayList<String> pitches = new ArrayList<String>();
       pitches 라는 ArrayList에 담을 수 있는 자료형은 String 뿐이다.
       이 List에는 반드시 문자열만 들어와라 곧 자료형을 강제한다.

    pitches.add("123");
    pitches.add("234");
    pitches.add(789);   이렇게 실수로 하였을 경우도 그렇지, 에러를 미리 방지할 수도 있고, 


*/
// import java.util.ArrayList;
// public class Main {
//   public static void main(String[] args) {   // public은 접근 제한자, 나중에 중요하다

//     // ArrayList aList = new ArrayList();   // ArrayList로 객체를 생성하고,
//     ArrayList<String> aList = new ArrayList<String>();  //    위 내용을 Generic을 사용하면 이와 같다. 




//     aList.add("hello");  // 글자로 들어가는게 아닌 객체로 들어간다.
//     aList.add("java");
    
//     // String hello = aList.get(0);  // 이 객체를 문자열에 넣으라? 그러면 
//                                         에러가 생겨서 강제 형변환을 아래와 같이 수정한다. 
//                                         Stirng만 들어가는 hello라는 변수기 때문이다
//     String hello = (String)aList.get(0);  // Casting 강제 형변환.... (String)aList.get(0);
//     String java = (String)aList.get(1);

   
//     // 제네릭스를 사용하여 자료형을 선언하면 그 이후로는 자료형에 대한 형변환 casting이 필요없다.
//     // 이미 자바가 aList에는 반드시 String 자료형만 추가된다는 것을 알고 있다.
//     // 제네릭스를 사용하면 형변환에 대한 불필요한 코딩과 잘못된 형변환 등의 예외를 방지할 수 있다.
//     // String hello = aList.get(0);
//     // String java = aList.get(1);

//     System.out.println(hello);
//     System.out.println(java);

        
//   }
// }





// 다시 정리해보면, 아래는 Generics를 사용하지 않고 작성해보면 이렇다.
// import java.util.ArrayList;
// public class Main {
//   public static void main(String[] args) {
    
//     ArrayList aList = new ArrayList();    // ArrayList로 객체를 생성한다.


//     aList.add("hello");   // 문자열 "hello"가 들어가는게 아닌 List안에 객체로 들어간다.
//     aList.add("java");

//     String hello = (String)aList.get(0);  // hello 변수(String만 담을 수 있는)에 담으려는
//                                              List안의 객체가 문자열이 아니기 떄문에
//     String java = (String)aList.get(1);   // 앞에 (String) 곧, Casting(강제 형변환)을 해줘야 한다.그래야 에러가 안생긴다.

//     System.out.println(hello);  // hello
//     System.out.println(java);   // java

//    }
// }

// 위 내용에서 Generics를 사용하면 아래와 같다. (Generics - 입력되는 객체의 자료형을 강제한다.)
// import java.util.ArrayList;
// public class Main {
//   public static void main(String[] args) {

//     ArrayList<String> aList = new ArrayList<String>();  // Generics(입력되는 객체의 자료형을 강제한다. 여기에서는 문자열)
//                                                                   를 사용했다.
//     aList.add("hello");  // "hello"가 문자열로 들어가는게 아니라 List안에 객체로 들어간다.
//     aList.add("java");


//     String hello = aList.get(0);   // 리스트 안에 0번째 객체를 hello라는 변수(String만 넣을 수 있는)에 넣는다.
//     String java = aList.get(1);    // java라는 변수 안에(String만 넣을 수 있는) aList의 1번째 객체를 넣는다. 
//                                    // 위에 aList 객체를 생성할 때 Generics를 사용하였기 때문에 Casting(강제 형변환)이 필요 없다.
//     System.out.println(hello);   // hello
//     System.out.println(java);    // java   잘 출력이 된다.
//   }
// }




