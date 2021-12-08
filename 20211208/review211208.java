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
*/




/*

변수 : 어떤 값을 보관하는 용도
int a;     a 라는 변수명에 정수(integer)를 보관할 것이다.
String b;  b 라는 변수명에 문자열(String)을 보관할 것이다.

변수명 선언 규칙
1. 변수명은 숫자로는 시작할 수 없다.  a100(o)  100a(x)
2. _ underscore, $ 는 사용 가능하지만 @, ! ..는 사용할 수 없다.
3. 예약어는 변수명으로 사용할 수 없다. int, class ... (X)

*. 한글은 변수명으로 사용하지 않는다. 가급적 소문자로 만든다.

 잘못된 변수명 선언의 예
 int 2nd;      숫자로 시작 불가능
 String b#     특수문자 사용 불가능
 int main;     예약어 사용 불가능
  
*/


/*
자료형 (type) 선언
 int a;      변수명 a는 int 자료형 변수, a라는 변수에는 정수만 담을 수 있다. 1,2,10.300...
 String b;   변수명 b는 String 자료형, b라는 변수에는 문자열만 담을 수 있다. "boy", "Hello World"...


클래스 class - 자바는 클래스 단위로 프로그램을 구성한다.
  클래스명은 명사로 만든다.
  여러 개의 단어로 만들 경우 각 단어의 첫 문자는 대문자로 만든다. (띄어쓰기 X)
  예) class Raster {}
      class ImageSprite {}


메서드 Method - 하나의 클래스 안에는 메서드가 여러 개 존재할 수 있다.
  메서드 명은 주로 동사로 만든다.
  여러 개의 단어로 만들 경우 처음 시작하는 문자는 소문자로 시작하고
  두번째 단어부터는 대문자를 사용한다.
  예) run {}
      runFast {}
      getBackground {}

  *. 권장 사항 : 변수명은 짧지만 의미 있게 만든다. 
               (변수명을 통해 사용 의도를 알 수 있다.)
*/



/*
숫자 자료형 (number , integer)
  정수 : 1, 20, 500...,   실수 : 3.14, 7.8...
   
   정수
   int(***)   int age =21;
   long       long countStar = 392132914839048320L; (long은 끝에 L을 붙인다.)

   실수
   float      float Pi = 3.14F;          (float은 끝에 F를 붙인다.)
   double     double morePi = 3.141592;   
*/

// public class Main {
//   public static void main(String[] args) {
//     int a = 10;      // a 라는 변수에 10을 넣는다.
//     int b = 5;
//     System.out.println(a+b);  // 15
//     System.out.println(a-b);  // 5
//     System.out.println(a*b);  // 50
//     System.out.println(a/b);  // 2

//     System.out.println(a%b);  // 0  나머지 연산자(홀수, 짝수, 배수를 찾을 수 있다.)
//     System.out.println(7%2);  // 1  나머지가 1인, 홀수 찾기
//     System.out.println(6%2);  // 0  나머지가 0인, 짝수 찾기
//     System.out.println(6%3);  // 0  3으로 나눈 나머지가 0인, 3의 배수 찾기
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     int i = 0;
//     int j = 10;

//     i++;    // 1 증가 (많이 사용된다.)
//     j--;    // 1 감소  

//     System.out.println(i); // 1
//     System.out.println(j); // 9  
// // i++;    i = i+1;    i += 1;   세 가지 방법 모두 같은 결과이다.
// // j--;    j = j-1;    j -= 1;
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     int i = 0;
//   //  System.out.println(++i);  // 1    1 증가하고 출력 (선증가)

//     // System.out.println(i++); // 0   우선 출력하고 1 증가 (후증가)
//     // System.out.println(i);   // 1   위에 i++하여 증가된 값이 i에 담기고 이제 1이 출력된다.

//   }
// }


// SHA-256 이라는 알고리즘으로 패스워드가 DB에 그대로 저장되는 게 아니라
// 암호화되어 저장. .equals 메서드를 통해 비교는 가능하지만, 복호화가 불가능하다.
// 블록체인에서도 사용된다. 



/*
문자열에서 많이 사용하는 메서드들 
.equals       // 두 개의 문자열을 비교하여 결과 리턴. 같으면 true, 다르면 false
.indexOf      // 문자열의 인덱스 위치 출력
.replaceAll   // 문자열 변경(기존내용, 바꿀내용)
.substring    // 문자열을 뽑아낼 때 사용되고 인덱스 위치(이상, 미만)로 지정한다. (0, 4)
.toUpperCase  // 모든 문자열을 대문자로 변환 
.toLowerCase  // 모든 문자열을 소문자로 변환

*/


/*     .equals()     */
// public class Main {
//   public static void main(String[] args) {
//     String a = "hello";
//     String b = "java";
//     String c = "hello";

//     System.out.println(a.equals(b));  // false
//     System.out.println(b.equals(a));  // false
//     System.out.println(b.equals(c));  // false
//     System.out.println(c.equals(b));  // false
//     System.out.println(a.equals(c));  // true
//     System.out.println(c.equals(a));  // true
//   }
// }


/*     .indexOf()    */
// public class Main {
//   public static void main(String[] args){
//     String a = "hello World";

//     System.out.println(a.indexOf("World"));  // 6
//     System.out.println(a.indexOf("hello"));  // 0
//     System.out.println(a.indexOf("e"));   // 1
//     System.out.println(a.indexOf("r"));   // 8
//     System.out.println(a.indexOf("o"));   // 4
//     // 0부터 시작하여 띄어쓰기를 포함한 인덱스 위치를 나타낸다.
//     // 서울시 강남구, 서울시 서초구, 서울시 송파구 ... 인덱스 4번째부터 그 이하를
//     // 한 번에 수정할 수 있겠지
//   }
// }


/*     replaceAll()     */
// public class Main {
//   public static void main(String[] args){
//     String a = "hello World";

//     System.out.println(a.replaceAll("World", "java"));    // hello java
//     System.out.println(a.replaceAll("World", "python"));  // hello python
//     System.out.println(a.replaceAll("hello", "dream"));   // dream World
//     System.out.println(a.replaceAll("h", "y"));           // yello World 
//     System.out.println(a.replaceAll("rl", "o"));          // hello Wood
//     // 이렇게 a.replaceAll("기존값", "바꿀값"));  하여 변경할 수 변환할 수 있다.
//   }
// }


/*     .substring()     */
// public class Main {
//   public static void main(String[] args) {
//     String a = "Hello World";

//     System.out.println(a.substring(0,4));   // Hell
//     System.out.println(a.substring(3,11));  // lo World
//     System.out.println(a.substring(0,6));   // Hello
//     System.out.println(a.substring(2,11));  // llo World
//     // a.substring(이상, 미만);  안에는 인덱스 값을 넣어 해당 위치의 값을 출력한다.
//   }
// }


/*     .toUpperCase    */
/*     .tolowerCase    */
// public class Main {
//   public static void main(String[] args){
//     String a = "Hello World";
//     System.out.println(a.toUpperCase()); // HELLO WORLD
//     System.out.println(a.toLowerCase()); // hello World
//     // 모든 문자를 대문자 또는 소문자로 변환한다.
//   }
// }


/*
Bool (불, Boolean) 
  true or false 
  true는 1 또는 0이 아닌 모든 것,  false는 0
  컴퓨터 자체가 0과 1이기 때문에 연계하여 정말 많이 사용된다.
*/
// public class Main {
//   public static void main(String[] args) {
//     int base = 100;
//     int height = 185;
//     boolean inTall = height > base;

//     if (inTall) {            // if문,  내용이 참이면 아래 내용을 진행, 아닐 경우 아무 것도
//       System.out.println("키가 큽니다");
//     }
//   }
// }


/*
Ada Lovelace 1815.12.10. ~ 1852.11.27. 최초의 프로그래머
 아버지는 천재 시인 조지 고든 바이런. 컴퓨터란 기계 자체가 없던 시절에 프로그래밍 언어를
 고안해내고 미래의 컴퓨터가 할 수 있는 일을 예견까지 한 에이다 러브레이스는
 독특한 출생과 삶을 살아간 영국의 백작부인이었다.

*/


/*     char 문자    */
// class Main {
//   public static void main(String[] args) {
//     char a = 'a';     // 문자 하나일 경우 작은 따옴표를 사용한다.
//     char b = 97;      
//     char c = 122;
//     char d = 90;
//     char e = 65;

//     System.out.println(a);  // a  
//     System.out.println(b);  // a   b~e는 char 를 통해 ascII 코드를 사용한다.
//     System.out.println(c);  // z
//     System.out.println(d);  // Z
//     System.out.println(e);  // A
//   }
// }




/*
array 배열 
 여러 개의 원소를 한 번에 담는 자료형, 자료의 집합이다.
 배열은 그 길이가 고정된다. 즉, 한 번 생성하면 길이를 수정할 수 없다.

 int[] engScore = {80, 90, 100, 95, 65}; 
 String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
 String[] names = {"kim", "park", "son", "yoon", "lee"};

 이렇게 자료형 다음에 []를 사용하여, 내용을 한 번에 담을 수 있다.

*/

// public class Main {
//   public static void main(String[] args) {
//     String[] weeks = new String[7];   // 7개의 배열을 가진 String 객체를 생성한다.
    
//     weeks[0] = "월";
//     weeks[1] = "화";
//     weeks[2] = "수";
//     weeks[3] = "목";
//     weeks[4] = "금";
//     weeks[5] = "토";
//     weeks[6] = "일";
    
//     System.out.println(weeks[1]); // 화
//     System.out.println(weeks[4]); // 금
//     // 배열의 길이를 먼저 설정하여 배열 변수를 생성한 다음,
//     // 값은 나중에 대입하는 방법이다.
//   }
// }

// 한 번에 담는 방법이다.
// public class Main {
//   public static void main(String[] args) {
//     String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

//     System.out.println(weeks[3]);     // 목
//     System.out.println(weeks.length); // 7 
//     // .length 를 이용하여 배열의 길이(갯수)를 구할 수 있다.
//   }
// }

/*
배열은 대부분 for문과 함께 사용된다. for문에 배열이 사용될 경우
배열의 길이만큼 for문을 돌리는 것이 중요한데 배열의 길이는
.length를 이용하여 구한다.

*/
// public class Main {
//   public static void main(String[] args) {
//     String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
    
//     for (int i = 0; i < weeks.length; i++) {
//       System.out.println(weeks[i]);  
//      // weeks 배열을 순서대로 출력하는 프로그램이다. 
//      // length를 어떻게 사용했는지 눈여겨 보도록 하자./
//     }
//   }
// }


/*
위의 내용에서 System.out.println(weeks[7]); 이렇게 없는 인덱스를 출력할 경우
ArrayIndexOutOfBoundsException 이라는 인덱스 에러가 나오는데 잘 기억해두자.
비슷한 인덱스 에러들이 있다. 이러한 에러들을 "예외"라고도 한다.
이 "예외"처리를 하는 게 굉장히 중요한데, 프로그래머의 역량을 볼 수 있는 게
"예외처리"이다. 어떤 에러가 어떻게 나오고, 어떨 경우에 나오는지 잘 이해하고
부드럽고 보기 좋게 처리하는 일이다.

*/


/*
반복문 (for, while, (do~while))
  for 문은 정확히 몇 번 반복시키겠다 라고 할 때 주로 사용되고,
 while 문은 언제까지 반복하라 할 때 주로 사용된다. 그렇지만 서로 혼용되어 사용한다.

*/



/* List 리스트 (파이썬의 리스트와는 이름만 같을 뿐이다.)
   배열과 비슷한 자료형, 크기가 정해지지 않고 동적으로 변한다.
   배열은 생성 시에 크기가 정해지지만, 리스트는 원하는 만큼 자유롭게 담을 수 있다.

*/
// import java.util.ArrayList;  // java.util에 있는 ArrayList 기능을 가져온다.
// public class Main {
//   public static void main(String[] args) {
//     ArrayList pitches = new ArrayList();    // 객체 생성

//     pitches.add("123");
//     pitches.add("234");
//     pitches.add("789");
//     pitches.add("5555");
//     System.out.println(pitches); // [123, 234, 789, 5555]

//     pitches.add(0,"133");   // 이렇게 인덱스 값을 줘 원하는 위치에 놓을 수 있다.
//     pitches.add(1,"311");   // .add(위치, 원하는값);
//     System.out.println(pitches); // [133, 311, 123, 234, 789, 5555]

//     System.out.println(pitches.get(1));     // 311
//     System.out.println(pitches.size());     // 6
//     System.out.println(pitches.contains("234"));  // true  포함되어 있다
//     System.out.println(pitches.remove("789"));    // true  삭제되었다.
//     System.out.println(pitches.remove(0));      // 133

//     System.out.println(pitches); // [311, 123, 234, 5555]
//     // .get() 메서드를 이용하여 특정 인덱스 값을 추출
//     // .remove() 메서드를 이용하여 특정 인덱스의 객체를 삭제
//     // .remove() 메서드를 이용하여 해당 객체를 삭제하고 결과를 리턴 true or false
//     // .size() 메서드를 이용하여 리스트의 갯수 확인
//     // .contains() 메서드를 이용하여 리스트 내에 포함 여부 확인
//   }
// }



/*    Generics - 입력되는 객체의 자료형을 강제한다.    */ 
// import java.util.ArrayList;
// public class Main {
//   public static void main(String[] args) {
    
//     ArrayList aList = new ArrayList();    // ArrayList로 객체를 생성한다.


//     aList.add("hello");   // 문자열 "hello"가 들어가는게 아닌 List안에 객체로 들어간다.
//     aList.add("java");

//     String hello = (String)aList.get(0);  // hello 변수(String만 담을 수 있는)에 담으려는
//                                           //   List안의 객체가 문자열이 아니기 떄문에
//     String java = (String)aList.get(1);   // 앞에 (String) 곧, Casting(강제 형변환)을 해줘야 
//                                           // 한다. 그래야 에러가 안생긴다.
//     System.out.println(hello);  // hello
//     System.out.println(java);   // java
//     System.out.println(aList.get(0));  

//    }
// }




// 위 내용에서 Generics를 사용하면 아래와 같다. 
/* Generics - 입력되는 객체의 자료형을 강제한다 */
// import java.util.ArrayList;
// public class Main {
//   public static void main(String[] args) {   // public 은 접근 제한자 

//     ArrayList<String> aList = new ArrayList<String>(); 
                                                          
//     aList.add("hello");  // "hello"가 객체로 들어가지만
//     aList.add("java");   // Generics를 사용하여 <String> 입력해줬으니 
//                          // 강제로 문자열로 입력된다.

//     String hello = aList.get(0);   // 리스트 안에 0번째 객체를 hello라는 변수(String만 넣을 수 있는)에 넣는다.
//     String java = aList.get(1);    // java라는 변수 안에(String만 넣을 수 있는) aList의 1번째 객체를 넣는다. 
//                                    // 위에 aList 객체를 생성할 때 Generics를 사용하여
//                                   //  문자열로 입력이 되었기 때문에, Casting(강제 형변환)이 필요 없다.
//     System.out.println(hello);   // hello
//     System.out.println(java);    // java   잘 출력이 된다.
//     // Generics를 사용하여, 문자열 추가 시 ""를 실수로 못하였거나, 관련된 에러를 미리 방지할 수도 있다.
//   }
// }






/*
유용한 단축키
- Moving the Current line
  alt + up   or   alt + down    위치를 바꾼다.

- Copying the Current Line 
  shift + alt + up    or   shift + alt + down   한 줄을 복사한다.

- Selecting Lines 
  ctrl + i          한 줄을 모두 선택한다.

- Deleting Lines 
  ctrl + shift + k    한 줄을 모두 삭제한다.

*/