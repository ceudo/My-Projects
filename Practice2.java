/* Create a class called Rectangle with a width and height attribute, calculate the 
area of the object declare if it is a Square*/
import java.util.Scanner;
class Rectangle{
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double width){
        this.width=width;
    }
    void setHeight(double height){
        this.height=height;
    }
    double area(){
        return width*height;
    }
    String square(){
        if(width==height){
            return "It is a square.";
        }
        else{
            return "It is not a square";
        }
    }
}
public class Practice2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Calculate area of rectangle: ");
        System.out.println("Insert width: ");
        double width=sc.nextDouble();
        System.out.println("Insert height: ");
        double height=sc.nextDouble();
        Rectangle shape=new Rectangle(width, height);
        System.out.println("Rectangle area: "+ shape.area());
        System.out.println(shape.square());
    }
}
