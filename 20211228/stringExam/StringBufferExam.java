package stringExam;

public class StringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb);   // abc

        sb.append("123");
        System.out.println(sb);  // abc123

        StringBuffer sb2 = sb.append("zz");  // 기존의 sb("abc123")에 "zz"를 추가한다. 
        System.out.println(sb2); // abc123zz
        System.out.println(sb);  // abc123zz   와 기존 sb변수까지 변해버렸다...

        StringBuffer sb3 = new StringBuffer("abc");
        sb3.append("123").append("zz");   // 이렇게 연속으로 추가할 수도 있다.
        System.out.println("sb3 : " + sb3);  // sb3 : abc123zz

        String str1 = new String("abc");
        String str2 = new String("abc");  // 같은 값을 가지는 2개의 객체를 생성
        System.out.println(str1 == str2);       // false  ==는 주소값의 동일 여부를 확인한다.
        System.out.println(str1.equals(str2));  // true   문자에서 .equals는 데이터 값의 동일 여부를 확인한다.

        String str3 = new String("123");
        String str4 = new String("123");
        System.out.println(str3 == str4);       // false  메모리에 있는 메모리값이 다르다.
        System.out.println(str3.equals(str4));  // true   데이터 값은 동일하다.

// String 에서는 equals를 오버라이딩해서 문자열의 내용만 비교하도록 구현되어 있다. 
// StringBuffer에서는 equals를 오버라이딩하지 않아서 == 와 같은 결과를 출력한다.

        String str11 = new String("aaa");
        String str22 = str11.toString();

        System.out.println(str11.equals(str22));  // true
        System.out.println(str11 == str22);    // true
// 반면에 toString()은 오버라이드 되어 있어서 StringBuffer에 toString()을 호출하면
// 담고 있는 문자열을 String으로 반환한다.

        StringBuffer sbr1 = new StringBuffer("abc");
        StringBuffer sbr2 = new StringBuffer("abc");
        System.out.println(sbr1 == sbr2);         // false  메모리 위치도
        System.out.println(sbr1.equals(sbr2));    // false  데이터 값도 다르다.

        StringBuffer str33 = new StringBuffer("aaa");
        String str44 = str33.toString();
        System.out.println(str33.equals(str44));   // false
    }
}
/*
String 은 immutable 변경이 불가능하지만 StringBuffer는 변경이 가능하다.
StringBuffer는 String과 유사한 점이 많다. 객체를 생성할 때 적절한 길이의 char형 배열이 생성되고
이 배열은 문자열을 저장하고 편집하기 위한 공간으로 사용된다.

StringBuffer sb = new StringBuffer("abc");
sb.append("123");    // 원본 내용에 추가가 가능하다.
System.out.println(sb);   // abc123

sb에 새로운 문자열이 추가되면 sb 원래의 주소를 반환하고 주소를 다시 생성하는 개념이다.


*/
