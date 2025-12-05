package java20features;

record Point(int x, int y) {
}

record Rectangle(Point p1, Point p2) {
}

public class NestedPatternMatchingExample {

    public static void main(String[] args) {
        var obj = new Rectangle(new Point(10, 50), new Point(77, 99));
        if (obj instanceof Rectangle( Point(int x1,int y1) , Point(int x2,int y2)   )){
            System.out.println("Rectangle : " + x1 +" - " + y1+ " ==> "+ x2 +" - " + y2);
        }
    }
}
