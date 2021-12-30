package oopExam;

interface Repairable {}



class Unit {
    int hitPoint;
    final int MAX_HP;
    Unit (int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit {
    GroundUnit (int hp) {
        super(hp);
    }
}


class AirUnit extends Unit {
    AirUnit (int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {             // 클래스명과 동일하고 매개변수가 없다 그러면 기본 생성자 
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
}               // implements Repairable을 통해 관계 없는 class Tank와 Dropship이 
                // 간접적으로 관계가 생겼다.

class Dropship extends AirUnit implements Repairable {  
    Dropship() {     
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Dropship";
    }
}


class Marine extends GroundUnit {   // implements Repairable이 없다.
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}


class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }
    void repair(Repairable r) {
        if (r instanceof Unit) {
            Unit u = (Unit)r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}




public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        SCV scv = new SCV();
        
        scv.repair(tank);
        scv.repair(dropship);
     // scv.repair(marine);  // 에러, marine은 repairable을 구현안하고 있기 때문에 에러가 난다.  


    }
}


