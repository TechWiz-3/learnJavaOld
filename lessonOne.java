import java.awt.*;

public class lessonOne {
    public static void main(String[] args) {
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
        //this demonstrates how primitive type
        //variables are independent of eachother
        
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        
    }
}
