package PolymorphismOverriding;

public class Triangle extends GeometricFigure{

    double p;



    public void area(){

        p = (sideA+sideB+sideC) / 2;
        area = p*((p-sideA)*(p-sideB)*(p-sideC));

        perimeter = sideA + sideB + sideC;

        System.out.println("Uchburchak yuzi: " + Math.sqrt(area));
        System.out.println("Uchburchak perimetri: " + perimeter);
    }
    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    public static void main(String[] args) {
        Triangle triangle =(Triangle) new Triangle(6,7,8);
        triangle.area();


    }
}
