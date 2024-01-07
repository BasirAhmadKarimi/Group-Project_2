package Projec_2;

public class InterfaceShape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and
calculatePerimeter. Create 2 classes Circle & Square that implements
functionality defined in the Shape Interface. Test your code
     */
    public interface Shape{
     double calculateArea(double num);
     double calculatePerimter(double num1);

    }
    static class Circle implements Shape{


        @Override
        public double calculateArea(double num) {
            return (Math.PI * num * num);
        }

        @Override
        public double calculatePerimter(double num1) {
            return (2*Math.PI*num1);
        }
    }
    static class Square implements Shape{
        @Override
        public double calculateArea(double num) {
            return num*num;
        }

        @Override
        public double calculatePerimter(double num1) {
            return 4*num1;
        }
    }

    public static void main(String[] args) {
        Circle cercle=new Circle();
        double m=cercle.calculateArea(44.3);
        System.out.println("the area of cercle is "+m);

        double n=cercle.calculatePerimter(10.8);
        System.out.println("The perimeter of the cercle is "+n);

        Square square=new Square();

        double x=square.calculateArea(44.3);
        System.out.println("The area of square is "+x);
        double y=square.calculatePerimter(14.66);
        System.out.println("The perimeter of the square is "+y);
    }
}
