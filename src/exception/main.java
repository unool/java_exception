package exception;

public class main {

    public static void main(String[] args){
        service ser = new service();
        System.out.println("main 이전");
        try{
            ser.throwTest();
        }
        catch (Exception e)
        {
            System.out.println("예외처리");
        }
        System.out.println("main 이후");
    }
}
