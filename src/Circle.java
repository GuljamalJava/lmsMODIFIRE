public class Circle {
 private static  double PI ;
 private static double radius;

    public Circle() {
    }

    public Circle(double PI, double radius) {
        this.PI = PI;
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    public static double  getArea()  {

       return    PI * (radius * radius);



    }


   public static double getCircumference(){

        return  PI * 2 * radius;


   }

}
