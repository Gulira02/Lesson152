import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

       Circle circle=new Circle(4);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
        System.out.println(circle.getRadius());
    }
}