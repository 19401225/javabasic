package functionsExam;

class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person)obj).id;  // obj Object 타입이므로 id 값을 참조하기 위해 Person 타입으로 형변환
        } else {
            return false;  // 타입이 Person이 아니면 값을 비교할 필요가 없다.
        }
    }
        Person(long id) {
            this.id = id;
        }
    }


public class EqualsExam2 {
    
}
