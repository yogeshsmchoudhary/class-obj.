public class Q9 {
    public static void main(String[] args){
    Circle c1=new Circle();
    //setter method call
    c1.setredias(9);
    System.out.println("Area of Circle = "+c1.getArea());
    System.out.println("Circumference of Circle = "+c1.getCircumference());

    }  
}
class Circle{
    int redias;
    public void setredias(int r){redias=r;}
    public float getArea(){return redias*redias*22/7 ;}
    public float getCircumference(){return 2*22/7*redias ;}
    
}