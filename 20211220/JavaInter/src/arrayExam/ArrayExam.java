package JavaInter.src.arrayExam;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayExam {
    public static void main(String[] args) {
        // int[] score = new int[5];  // 요소의 갯수(크기)를 수정할 수 없다.

        // for (int i = 0; i < 5; i++) {
        //     System.out.println(score[i]);  // 요소의 값을 정해주지 않으면 0으로 초기값이 설정된다.

        //     score[0] = 10;
        //     score[1] = 20;
        //     score[2] = 30;
        //     score[3] = 40;
        //     score[4] = 50;

        //     for (i = 0; i < score.length; i++) {
        //         System.out.println(score[i]);  // 값을 정해준 이후 정해진 값으로 출력이 된다.
        //    }  
        //    int[] math = new int[5];
        //    for (int j = 0; j < math.length; j++) {
        //        math[j] = j * 10 + 50;
        //        System.out.println(math[j]);
        //    }
           

        //    int[] arr = new int[5];
        //    for (int k = 0; k < arr.length; k++) {
        //        arr[k] = k + 1;
        //        System.out.println(arr[k]);
        //    }

        //    System.out.println("배열 수정 전");
        //    for (int k = 0; k < arr.length; k++) {
        //        System.out.println("arr[" + k + "] : " + arr[k]);
        //    }

        //    System.out.println();
        //    System.out.println("배열 수정 후");
        //    int[] tmp = new int[arr.length*2];

        //    for (int k = 0; k < arr.length; k++) {
        //        tmp[k] = arr[k];
        //    }
        //    for (int k = 0; k < tmp.length; k++) {
        //        System.out.println("tmp[" + k + "] : " + tmp[k]);
        //    }

        //    arr = tmp;
        //    System.out.println();
        //    System.out.println("배열 수정 후 arr");
        //    for (int k = 0; k < arr.length; k++) {
        //        System.out.println("arr[" + k + "] : " + arr[k]);
        //    }

           char[] abc = {'A','B', 'C', 'D'};
           char[] num = {'0','1','2','3','4','5','6','7','8','9'};

        //    System.out.println(abc);   // ABCD
        //    System.out.println(num);   // 0123456789

           char[] result = new char[abc.length + num.length]; 
           System.arraycopy(abc, 0, result, 0, abc.length);
           System.out.println(result); //  ABCD

           System.arraycopy(num, 0, result, abc.length, num.length);  
           System.out.println(result);  // ABCD0123456789

           System.arraycopy(abc, 0 ,num, 6, 3);
           System.out.println(num);   // 012345ABC9
        }
    }



// 학생 5명의 총점합계 점수와 평균, 최대값, 최소값을 구하시오.
//         int[] scores = {100,88,98,90,86};
//         int sum = 0;
//         int max = scores[0];
//         int min = scores[0];
//         for (int i : scores) {
//             sum += i;
//             if (max < i) {
//                 max = i;
//             } else if (min > i) {
//                 min = i;
//             }
//           }
//         System.out.println("총점 : " + sum);
//         System.out.println("평균 : " + (sum / (double)scores.length));
//         System.out.println("최대값 : " + max);
//         System.out.println("최소값 : " + min);
// }
// }


// // 학생들의 총점 합계 점수와 평균, 최대값, 최소값을 구하시오.
//     int[] scores = {78,88,98,90,96,67,65,87};
//     int sum = 0;
//     int max = scores[0];
//     int min = scores[0];

//     for (int i : scores) {
//         sum += i;
//         if (max < i) {
//             max = i;
//         } else if (min > i) {
//             min = i;
//         }
//     }
//     System.out.println("총점 : " + sum);
//     System.out.println("평균 : " + (sum / (double)scores.length));
//     System.out.println("최대값 : " + max);
//     System.out.println("최소값 : " + min);
// }
// }



// scores 동일한 이름으로 배열을 뒤집어보자.
//   int[] scores = {87,65,67,96,90,98,88,78};
//   int[] reverse = new int[scores.length];

//   for (int i = scores.length-1, j = 0; i >= 0; i--, j++) {
//       reverse[j] = scores[i];
//   }
//       scores = reverse;
//       System.out.println(Arrays.toString(scores)); // [78, 88, 98, 90, 96, 67, 65, 87]
// }
// }









// 배열의 길이를 수정하는 방법
// 1. 더 큰 배열을 새로 생성한다.
// 2. 기존 배열의 데이터들을 새로 생성한 배열로 복사한다.
// (길이 수정이 안되기 때문에 다른 큰 배열을 만들어 붙여넣는 방법을 사용한다.)




/*
Array 배열
 '같은 타입'의 여러 변수들을 하나의 묶음으로 다루는 방식
  배열은 생성 시 정한 갯수를 수정할 수 없다.
  배열의 크기를 먼저 정하고, 기본적으로 배열은 0으로 초기화되어 생성된다.

  int[] score = new int[5];        
  String[] name = new String[5];   // 대괄호가 String name[]  이렇게 뒤에 와도 상관은 없다.





*/