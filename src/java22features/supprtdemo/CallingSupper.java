package java22features.supprtdemo;

public class CallingSupper extends Database {

    public CallingSupper(String dbName) {
        String num = "10x";
        try {
            int x = Integer.parseInt(num);
        } catch (Exception e) {
            System.out.println("error...");
        }
        super(dbName);
    }
}
