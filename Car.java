package javaSwing.problem;

public class Car {
    int speed;
    double regularPrice;
    String color;

    public void Car(int speed, double regularPrice, String color) {
        this.color = color;
        this.regularPrice = regularPrice;
        this.speed = speed;
    }

    public double getSalePrice() {
        return regularPrice;
    }

    public void show() {

        System.out.println("color:" + this.color);
        System.out.println("Speed:" + this.speed);
        // System.out.println("regular price:" + this.getSalePrice());
        // System.out.println("color"+this.color);
    }

}
