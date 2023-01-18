package javaSwing.problem;

public class won {
    // (int Speed,double regularPrice,String color, int year, int
    // manufacturerDiscount) ;
    public static void main(String[] args) {
        sedan s = new sedan(120, 15000, "balck", 5);
        Ford f = new Ford(2021, 125, 125000, "yellow", 5000);
        Trank t = new Trank(21, 150, 2000, "black");
        t.trankShow();
        System.out.println("\n\n");
        s.showSedan();
        System.out.println("\n\n");
        f.FordkShow();
    }

}
