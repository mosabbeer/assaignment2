import java.awt.Rectangle;
public class PerimeterTester {
    public static void main(String[] args){
        Rectangle rec=new Rectangle(15,20,9,19);
        double perimeter;
        perimeter =(rec.getWidth()*2)*(rec.getWidth()*2);
        System.out.println("Expected perimeter = 324");
        System.out.println("Got perimeter = "+perimeter);
    }

}
