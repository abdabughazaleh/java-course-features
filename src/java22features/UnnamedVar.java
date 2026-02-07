package java22features;

public class UnnamedVar {
    record Point(int x, int y){}

    public static void main(String[] args) {
       /* String num = "10x";
        try {
            int x = Integer.parseInt(num);
            System.out.println("the value of x = " + x);
        }catch (Exception _){
            System.out.println(" the number not correct ");
        }*/

        var p = new Point(10,20);
        if (p instanceof Point(int x, int _)){
            System.out.println("yes it is" + x);
        }
    }
}
