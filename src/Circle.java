public class Circle {
     private int radius;

     public Circle(int radius) {
          this.radius = radius;
     }

     public int getRadius() {
          return radius;
     }


     public void setRadius(int radius) {
          this.radius = radius;
     }

     public double getArea() {
          return Math.PI * radius * radius;
     }
     public double getCircumference(){
          return (Math.PI * 2 * radius);
     }


     }
     /*   private static double area;
     private double circumference;*/
    //Circle деген класс түзүңүз, анын PI деген свойствасы, area жана circumference
     // деген статик методдору болсун.
    //areaны табуу үчүн: PI * (radius * radius)
    //circumferenceти табуу үчүн PI * 2 * radius деген формулалар колдонулат

