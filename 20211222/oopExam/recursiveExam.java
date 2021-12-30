<<<<<<< HEAD
package oopExam;

public class recursiveExam {
    public static void main(String[] args) {
      
        // System.out.println(recursiveExam.factor(5));
        // System.out.println(recursiveExam.facrecur(5));

        // // x^1 부터 x^n 의 합을 구하는 재귀 매서드를 만드세요.

        // System.out.println(recursiveExam.powRecur(2, 5));


        int x = 2;
        int n = 5;
        int result = 0;

        for (int i = 1; i < n; i++) {
            result = result + power(x, i);
        }
        System.out.println(result);
    }

    static int power (int x, int i) {
        if (i == 1) return x;
        return x * power(x, i-1);
    }
}

    //     }
    
    //     static int factor (int n) {

    //         int facto = 1;
            
    //         for (int i = 1; i <= n i++) {
    //             facto *= i; //       facto = facto * i;
    //             System.out.println("i = " +i+ ", facto = " + facto);

    //         }

    //         return facto;
    //     }

    //     static int facrecur (int n) {

    //         int result = 0;

    //         if (n == 1) result = 1;
    //         else result = n * facrecur(n-1);  // n = 5 ? 5*4*3*2*1

    //         return result;
    //     }
    // } 


// Quiz 
//  5! == 5 * 4 * 3 * 2 * 1
//  3! == 3 * 2 * 1
// factor(5) 이럴 경우 5! 이렇게 되도록 
// System.out.println(factor(5));

/*
재귀 호출 recursive call
 매서드 내부에서 자기 자신 매서드를 다시 호출
 무한히 자기 자신을 호출하기 때문에 무한 반복에 빠지게 된다.
 따라서 조건문을 통한 탈출이 필수적으로 따라다닌다.

 void method(int n) {
     if (n == 0) {
        return;
    } 
    System.out.println(n);
    method(--n);
 
 반복문은 같은 문장을 반복해서 수행하지만 재귀호출은 반복문보다 몇 가지 과정을 예를 들면서
 매개변수 복사 종료 후 복귀할 주소 저장 등등 내부에서 추가적으로 필요한 것들이 많아서 
 일반적으로 반복문보다 재귀호출이 수행시간이 더 오래 걸린다.

 왜 굳이 반복문 대신 재귀호출을 사용할까? 큰 이유는 재귀의 논리적 간결함 
 재귀호출은 비효율적이므로 재귀 사용에 드는 비용보다 간결함이 주는 이득이 월등히 큰 경우에만 
 사용할 것을 권장한다. 






=======
package oopExam;

public class recursiveExam {
    public static void main(String[] args) {
      
        // System.out.println(recursiveExam.factor(5));
        // System.out.println(recursiveExam.facrecur(5));

        // // x^1 부터 x^n 의 합을 구하는 재귀 매서드를 만드세요.

        // System.out.println(recursiveExam.powRecur(2, 5));


        int x = 2;
        int n = 5;
        int result = 0;

        for (int i = 1; i < n; i++) {
            result = result + power(x, i);
        }
        System.out.println(result);
    }

    static int power (int x, int i) {
        if (i == 1) return x;
        return x * power(x, i-1);
    }
}

    //     }
    
    //     static int factor (int n) {

    //         int facto = 1;
            
    //         for (int i = 1; i <= n i++) {
    //             facto *= i; //       facto = facto * i;
    //             System.out.println("i = " +i+ ", facto = " + facto);

    //         }

    //         return facto;
    //     }

    //     static int facrecur (int n) {

    //         int result = 0;

    //         if (n == 1) result = 1;
    //         else result = n * facrecur(n-1);  // n = 5 ? 5*4*3*2*1

    //         return result;
    //     }
    // } 


// Quiz 
//  5! == 5 * 4 * 3 * 2 * 1
//  3! == 3 * 2 * 1
// factor(5) 이럴 경우 5! 이렇게 되도록 
// System.out.println(factor(5));

/*
재귀 호출 recursive call
 매서드 내부에서 자기 자신 매서드를 다시 호출
 무한히 자기 자신을 호출하기 때문에 무한 반복에 빠지게 된다.
 따라서 조건문을 통한 탈출이 필수적으로 따라다닌다.

 void method(int n) {
     if (n == 0) {
        return;
    } 
    System.out.println(n);
    method(--n);
 
 반복문은 같은 문장을 반복해서 수행하지만 재귀호출은 반복문보다 몇 가지 과정을 예를 들면서
 매개변수 복사 종료 후 복귀할 주소 저장 등등 내부에서 추가적으로 필요한 것들이 많아서 
 일반적으로 반복문보다 재귀호출이 수행시간이 더 오래 걸린다.

 왜 굳이 반복문 대신 재귀호출을 사용할까? 큰 이유는 재귀의 논리적 간결함 
 재귀호출은 비효율적이므로 재귀 사용에 드는 비용보다 간결함이 주는 이득이 월등히 큰 경우에만 
 사용할 것을 권장한다. 






>>>>>>> 4801aee843c0fa98041e93d513809646248e636a
*/