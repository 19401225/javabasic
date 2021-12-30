package exceptionExam;

public class ChainedExceptionExam {
    public static void main(String[] args) {
        
        try {
            install();
        } catch (InstallException e) {
            System.out.println("InstallException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
    static void install() throws InstallException {

        try {
            startInstall();           // 메서드 호출
            copyFiles();              // 메서드 호출
        } catch (SpaceException se) {   // 용량 부족 에러
            InstallException ie = new InstallException("설치중 예외 발생");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException ("설치중 예외 발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }
    static void startInstall() throws SpaceException, MemoryException { // 두 개를 다 
        if(!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");  
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
         // throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
        }
    }
    static void copyFiles() {

    }
    
    static void deleteTempFiles() {

    }
    static boolean enoughSpace() {
        return false;
    }
        static boolean enoughMemory() {
            return true;
        }
    }
    
class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
/*
예외가 예외를 발생시킨다. (chained exception)
    예외A가 예외B를 발생시킨다면 A를 B의 '원인 예외(cause exception)'라고 한다.
     
    try {
        startInstall();   // 에러가 발생...
        copyFiles();      // 건너뛰고,
    } catch (SpaceException e) {           //
        installException ie = new InstallException("설치중 예외 발생");   // 예외 생성
        ie.initCause(e);    // InstallException의 원인 예외를 지정
        throw ie;
    } catch (MemoryException me) {
        ........
    }













*/