package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

	    // FLOAT
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + myMinFloatValue);
        System.out.println("Float Max Value = " + myMaxFloatValue);

        // DOUBLE
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " + myMinDoubleValue);
        System.out.println("Double Max Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloutValue = 5f / 3f;
        // OR
        float mySecondFloutValue = (float) 5.25;
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloutValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);



        // Double Challenge
        double oneLbsinKilos = 0.45359237d;
        double lbsToBeConverted = 87.5d;
        double lbsToKilo = lbsToBeConverted * oneLbsinKilos;

        System.out.println(lbsToBeConverted + " lbs equals " + lbsToKilo + " kilograms");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(anotherNumber);
    }
}
