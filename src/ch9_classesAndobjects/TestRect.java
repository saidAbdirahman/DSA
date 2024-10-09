package ch9_classesAndobjects;

public class TestRect {
    public static void main(String[] args) {
        Rectangular r1 = new Rectangular();
        System.out.println(r1.length);
        System.out.println(r1.width);
        System.out.println(r1.getArea());
        System.out.println("end r1");
        Rectangular r2 = new Rectangular(2.0,5.0);
        System.out.println(r2.length);
        System.out.println(r2.width);
        System.out.println(r2.getArea());
        System.out.println("end r2");
    }
}
class Rectangular{
    double width;
    double length;

    Rectangular(){
        width = 1.0;
        length = 1.0;
    }
    Rectangular(double newWidth,double newLength){
        width = newWidth;
        length = newLength;
    }
    double getArea(){
        return width * length;
    }
}