package javaSwing.problem;

public class Ford extends Car {

    private int year;
    private int manufactureDiscount;

    Ford(int year, int speed, double regularPrice, String color, int manufactureDiscount) {
        super.Car(speed, regularPrice, color);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
        this.manufactureDiscount = manufactureDiscount;

    }

    public double getSelaPrice() {
        return regularPrice = regularPrice - manufactureDiscount;
    }

    public void FordkShow() {
        System.out.println("This is Ford car....\n");
        super.show();

        System.out.println("Sale price:" + this.getSelaPrice());
    }

}
