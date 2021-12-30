
public class p01 {
    public static void main(String[] args) {
        String src = "ABCDE";
        char[] chArr = src.toCharArray();

        System.out.println(chArr); // ABCDE 어떻게 달라졌는지는 확인할 수 없지
                                   //
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt("+i+"):" + ch);
        }
    


    }
}
// src 라는 String에 "ABCDE" 를 만들어
// chArr 이라는 char[]로 변환하여 출력하시오.



//         char[] chArr = {'A', 'B', 'C'};  // 이거를 String 으로 바꾼다고 하면
//         String str = new String(chArr);  // String 변수를 생성하며 변환해준다.
//         System.out.println(str);    // ABC
//         System.out.println(chArr);  // ABC

//         char[] tmp = str.toCharArray();  // 다시 String을 CharArray로 변경
//         System.out.println(tmp);  // ABC

//     }
// }
// char 배열과 String 배열 변환








//         String[] name = new String[3]; // 길이가 3인 String 배열 생성
//         name[0] = "Kim";
//         name[1] = "Song";
//         name[2] = "Park";


//         String[] name2 = {"Kim", "Song", "Park"};
//         String[] name3 = new String[] {"Kim", "Song", "Park"};   

//         // 객체를 생성한 후에 데이터를 넣는 name3이 정석이다.
//         // name2는 생성하면서 값이 넣는다.
        
//         for (int i = 0; i < name2.length; i++) {
//             System.out.println(name2[i]);
//         }  // for each 구문을 사용하면 더 간단하다.
//         for (String each : name) {           
//             System.out.print(each + " "); // 옆으로 출력하면서 공간을 비워둔다.
//         }

//     }
// }





//         int[] numArr = {4,4,4,6,5,7,9,7,5,3};
//         int[] counter = new int[10];  // {0,0,0,0,0,.. 10개의 값들}

//         for (int i = 0; i < numArr.length; i++) {
//             counter[numArr[i]]++;
//     // counter[numArr[i]] = counter[numArr[i]] + 1;
//         }
//         for (int i = 0; i < counter.length; i++) {
//             System.out.println(i + "의 갯수 : " + counter[i]);
//         }
//         }
// }
// 배열 : 444657953
// 0의 갯수 : 
// 1의 갯수 : 
// 2의 갯수 : 
//