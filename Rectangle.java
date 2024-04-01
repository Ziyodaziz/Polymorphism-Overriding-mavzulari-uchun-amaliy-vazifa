package PolymorphismOverriding;

public class Rectangle extends GeometricFigure{


    public Rectangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public void area() {
            area = sideA * sideB;
            perimeter = sideA + sideA + sideB + sideB;

            System.out.println("To'rtburchak yuzi: " + area);
            System.out.println("To'rtburchak perimetri: " + perimeter);
    }


    // Uchinchi tomoni nechi berilishidan qatiy nazar javoblar togri.
    // lekin qayerda xato qilganimni tushuna olmadim.

    public static void main(String[] args) {
        Rectangle rectangle =(Rectangle) new Rectangle(4,6,5);
        rectangle.area();

    }

}
