package java20features;

public class PatternMatchingForSwitchExample {
    public static void main(String[] args) {
        Object name = "Abd";
        Object num = 5448;
        Object other = null;
        switch (other)
        {
            case String s -> System.out.println("Name is " + s);
            case Integer i -> System.out.println("The number is  " + i);
            case null -> System.out.println("the value is empty");
            default -> System.out.println("none");
        }
    }
}
