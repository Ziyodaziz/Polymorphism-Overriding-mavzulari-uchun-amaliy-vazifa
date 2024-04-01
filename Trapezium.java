package PolymorphismOverriding;

public class Trapezium extends GeometricFigure{

    double c;
    double d;



    // sideC = h = balandlik
    // Trapetsiya perimetri formulasi P = a + b + c + d,  c = d  bo'lsa  c^2 = (h^2) + ((a+b)/2)^2

    public void area(){
            area = (sideC / 2) * (sideA + sideB);

            c = (sideC * sideC) + (((sideA-sideB)/2) * ((sideA-sideB)/2));
            d = Math.sqrt(c);

            perimeter = sideA + sideB + d + d;

            System.out.println("Trapetsiya yuzi: " + area);
            System.out.println("Trapetsiya perimetri: " + perimeter);

    }
    public Trapezium(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }


    public static void main(String[] args) {
        Trapezium trapezium =(Trapezium) new Trapezium(7,3,10);
        trapezium.area();

    }
}
