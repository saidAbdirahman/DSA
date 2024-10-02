package ch9_classesAndobjects;

public class Circle {
     public double radius = 1;
    public Circle (){
    }
    public  Circle(double newRadius){
        radius = newRadius;
    }

    public double getArea(){
        return  radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}
