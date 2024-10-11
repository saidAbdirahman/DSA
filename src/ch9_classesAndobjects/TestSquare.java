package ch9_classesAndobjects;

public class TestSquare {
    public static void main(String[] args) {
        Square sq1 = new Square(4);
        System.out.println("The Area of Square Sq1 is " + sq1.getArea());

        Square sq2 = new Square();
        System.out.println("The Area of Square Sq2 is " + sq2.getArea());
    }
}
class Square{
    int side;
    Square(){

    }
    Square(int newSide){
        side = newSide;
    }
    int getArea(){
        return  side * side;
    }
}
