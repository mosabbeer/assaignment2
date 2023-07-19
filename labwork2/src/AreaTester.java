
import java.awt.Rectangle;
public class AreaTester {
    public static void main(String[] args){
        Rectangle rec=new Rectangle(15,20,18,28);
        double area;
        area=rec.getWidth()*rec.getHeight();
        System.out.println("the expected area is 504");
        System.out.println("The actual area is "+area);
    }
}
