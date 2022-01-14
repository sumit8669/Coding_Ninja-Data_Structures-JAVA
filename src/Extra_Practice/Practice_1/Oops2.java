package Extra_Practice.Practice_1;

public class Oops2 {

}
class ThrowsExecp {
    static void fun() throws Exception
    {
        throw new Exception();
    }
    public static void main(String[] args) throws Exception {
        try {
            fun();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        catch (Exception e) {
//            System.out.print("caught in Main.");
//        }
        System.out.print("All is well");
    }
}