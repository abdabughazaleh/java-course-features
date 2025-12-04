package java19features;

public class Main {

    public static void main(String[] args)  throws Exception{
        Object name = "abd";
        Object name2 = "abd abughazaleh";
        Object name3 = "abd abughazalehx";
        Object num = 45;
        Object num2 = 45.16;
        Object num3 = 45.16f;
        switch (name3){
            case String n when (n.length() > 3 && n.contains("x")) -> System.out.println("The full name is :" + n);
            //case String n -> System.out.println("The first name is :" + n);
            case Double d -> System.out.println("this is double number : " + d);
            case Integer i -> System.out.println("this is integer number : " + i);
            case Float f -> System.out.println("this is float number : " + f);
            default -> System.out.println("none");
        }
    }
}