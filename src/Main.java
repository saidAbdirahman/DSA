import ch9_classesAndobjects.Circle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The area of the circle1 of radius" + circle1.radius + " is " + circle1.getArea());

        Circle circle2 = new Circle(10);
        System.out.println("The area of the circle2 of radius" + circle2.radius + " is " + circle2.getArea());
    }
}