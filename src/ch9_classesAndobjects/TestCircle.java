package ch9_classesAndobjects;

public class TestCircle {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        System.out.println(c1.numberOfObjects);
    }
}

class Circle2{
    double radius;
    static int numberOfObjects = 0;
    Circle2(){
        radius = 1;
        numberOfObjects++;
    }
    Circle2(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    static  int getNumberOfObjects(){
        return  numberOfObjects;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
}