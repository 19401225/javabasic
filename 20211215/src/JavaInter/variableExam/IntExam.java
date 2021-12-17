package src.JavaInter.variableExam;

public class IntExam {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax =  32767;

        System.out.printf("sMin : %d%n", sMin);  // 이렇게 사용해봤다.
        System.out.println("sMax : " + sMax);
        
    }
}

/*
  정수형  byte < short < int < long
           1       2      4     8    이렇게, 각각 2배씩 증가한다.

           오버 플로우 Overflow 라고 한다.
           작은 형의 값을 큰 형으로 넣을 수 있지만
           큰 형의 값을 작은 형에는 넣을 수 없다.



%n, \n 줄바꿈이다.

*/