package exception;

public class service {

    public service() {

    }

    public void throwTest() throws Exception{

        int[] ints = new int[0];

        System.out.println("throwTest 이전");
        if(ints.length  < 1)
        {
            throw new CustomException("Too short length");
        }
        System.out.println("throwTest 이후");
    }
}
