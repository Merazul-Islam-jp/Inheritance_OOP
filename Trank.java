package javaSwing.problem;

public class Trank extends Car {

    private int weight;

    public Trank(int weight, int speed, double regularPrice, String color) {
        super.Car(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getselaPrice() {

        if (weight > 200) {
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        } else {
            return super.getSalePrice();
        }

    }

    public void trankShow() {
        System.out.println("This is Trank car....\n");
        super.show();
        System.out.println("Car Weight:" + weight);
        System.out.println("Sale price:" + this.getselaPrice());
    }

}
