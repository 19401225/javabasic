package stringExam;

public class StringExam {
    public static void main(String[] args) {
/*
다른 언어에서는 문자열을 char형의 배열로 다루었으나 자바에서는 문자열 클래스를 별도로 제공한다.
String 클래스는 문자열을 다루는데 필요한 메서드들을 함께 제공한다.
지금까지는 String의 기본적인 몇 가지만 사용했지만 아주아주 중요하므로 자세히 공부해보자.

1. immutable 클래스 (변경 불가능)
    한번 생성한 String 은 읽어올 수만 있고 변경할 수 없다.
    만약 + 연산자를 이용해서 문자열을 결합하는 경우 문자열 자체가 바뀌는 것이 아니라
    결합된 새로운 문자열이 생성되는 것이다.
    String a = "a";
    String b = "b";
    String c = a + b;
    연산 시 새로운 문자열을 가진 String 객체가 생성되어 메모리 공간을 차지하게 된다.
    가능한 한 결합 횟수를 줄이는 것이 좋다.
    문자열 값의 결합 추출 등 문자열 작업이 많은 경우에는 String 대신 StringBuffer를 사용하는 것이 좋다.

    String 문자열의 비교는 언제나 a.equals(b)를 사용한다. (==는 숫자에서만)

    빈 문자열
    String s = ""; // 참조변수s가 참조하고 있는 String 객체는 내부에 new char[0]과 같이
                      길이가 0인 char형 배열을 저장하고 있는 것과 같다.

    char[] chArr = new char[0];    길이가 0인 char배열
    char c = '';   char형 변수에는 반드시 하나의 문자를 지정해야만 한다. (안그러면 에러)
    char c = ' ';  char형 변수에는 빈칸이라도 넣어줘야 한다. 그래야 에러가 발생하지 않는다.
*/
        char[] cArr = new char[0];
        String s = new String(cArr);   // String s = new String(""); 이거와 같다.

        System.out.println(cArr.length);       // 0
        System.out.println("@@@" + s + "@@@"); // @@@@@@    비어있는 변수 s

        
        String a = new String("Hello");
        char[] b = {'H','e','l','l','o'};
        String c = new String(b);
        System.out.println(c);  // Hello  이렇게 배열을 문자열 변수에 담아 출력할 수 있다.

        // charAt() 지정된 위치(index)에 있는 문자를 반환한다.
        String a1 = "Hello";
        String a2 = "012345";
        char b1 = a1.charAt(4);   // 많이 사용된다. char 형으로 뽑아낸다.
        char b2 = a2.charAt(2);
        
        System.out.println(b1);  // o
        System.out.println(b2);  // 2
        

    }
}