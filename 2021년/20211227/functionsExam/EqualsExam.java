package functionsExam;

public class EqualsExam {
    public static void main(String[] args) {
        String a = "password";
        String b = "password";

        if (a.contentEquals(b)) {
            System.out.println("비밀번호가 일치합니다. 로그인 허용");
        } else {
            System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
        }
    }
}
