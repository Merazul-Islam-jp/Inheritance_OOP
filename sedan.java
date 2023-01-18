package javaSwing.problem;

public class sedan extends Car {
    private int length;

    public sedan(int Speed, double regularPrice, String color, int length) {
        super.Car(Speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() - (0.05 * super.getSalePrice());
        } else {
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }
    }

    public void showSedan() {
        System.out.println("This is sedan car....\n");

        super.show();
        System.out.println("GetsalerPrice:" + getSalePrice());
        System.out.print("lenght:" + length);

    }

}
