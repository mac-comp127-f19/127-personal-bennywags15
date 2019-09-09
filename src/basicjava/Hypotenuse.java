package basicjava;

import java.util.Scanner;

public class Hypotenuse {
    public static double calculateHypotenuse(double length1, double length2) {
        return Math.sqrt((length1*length1)+(length2*length2));
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println("What is the first side length?:");
        double y = in.nextDouble();
        System.out.println("What is the second side length?:");
        System.out.println(" The length of the hypotenuse is " + calculateHypotenuse(x,y));
    }


}
