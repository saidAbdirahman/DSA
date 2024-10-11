package ch9_classesAndobjects;

public class TestCircleStatic {
    public static void main(String[] args) {
        System.out.println("Before Creating An Object");
        System.out.println(CircleStatic.getNumberOfObjectes());
        CircleStatic cs1 = new CircleStatic();
        System.out.println("After Creating An Object");
        System.out.println(CircleStatic.getNumberOfObjectes());
    }
}

 class CircleStatic{
    double radius;
    static int numberOfObjectes = 0;
    CircleStatic(){
        radius = 1;
        numberOfObjectes+=1;
    }

    CircleStatic(double newRadius){
        radius = newRadius;
        numberOfObjectes++;
    }
    static int getNumberOfObjectes(){
        return numberOfObjectes;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
 }
