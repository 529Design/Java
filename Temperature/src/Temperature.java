package edu.buffalostate.cis425.sp17.exercises.marron;
/**
 File: Temperature.java
 Exercise 2 - Temperature
 For: CIS 425 Object Oriented Programming
 Programmer: Jeffrey Marron
 Date Created:  12.20.2016
 Last Modified: 1.24.2017
 Description: This class stores the current temperature.
    It contains access methods to set and get the temperature.

 Assignment: 1) Add two new methods:
                   incrementTemp()
                   decrementTemp()
                 that increment and decrement the current temperature value
                 by one degree respectively
              2) Add a method: changeTemp( double t ) that adds t to the
                 current temperature
              3) Add a main() method to this class
              4) In the main method: create two instances of the Temperature
                 object each with a different
                 temperature
              5) Call the getTemp() method in each of the temperature objects
                 and print the result to the users screen
              6) Call the incrementTemp(), decrementTemp() and changeTemp(t)
                 methods several times from the main() (use getTemp() to see
                 if the temperature did change)
              Remember that there should not be any print statements in the
              Temperature class

 */

public class Temperature
{
    private double currentTemp;

    /**
     * setTemp() sets the temperature to the given value
     * @param t -- the given value
     */
    public void setTemp(double t)
    {
        currentTemp = t;
    }//END setTemp

    /**
     * getTemp() returns the current temperature
     */
    public double getTemp()
    {
        return currentTemp;
    }//END getTemp

    /**
     * incrementTemp() returns the (new) current temperature
     */
    public void incrementTemp(){
        currentTemp ++;
    }//END incrementTemp

    /**
     * decrementTemp() returns the (new) current temperature
     */
    public void decrementTemp(){
        currentTemp --;
    }//END decrementTemp

    /**
     * changeTemp( double t ) adds t to current temperature and
     * then returns the (new) temperature
     */
    public void changeTemp(double t){
        currentTemp = currentTemp + t;
    }//END changeTemp

    /** main - creates multiple Temperature objects and
     * performs various calculations on them*/
    public static void main( String args[] ) {
    Temperature Temp1 = new Temperature();//creates Temperature objects
    Temperature Temp2 = new Temperature();

    Temp1.setTemp(17);//sets the temperature of both objects
    Temp2.setTemp(38);

    System.out.println("Temp1 initial: " + (Temp1.getTemp()) + " °F");
         for (int i =0; i<15; i++){
             Temp1.incrementTemp();}
    System.out.println("Temp1 after 15 increments: " + (Temp1.getTemp()) + " °F");
        for (int i =0; i<7; i++){
            Temp1.decrementTemp();}
    System.out.println("Temp1 after 7 decrements: " + (Temp1.getTemp()) + " °F");
            Temp1.changeTemp(23);
    System.out.println("Temp1 after adding 23: " + (Temp1.getTemp()) + " °F");

    System.out.println();//break line

    System.out.println("Temp2 initial: " + (Temp2.getTemp()) + " °F");
        for (int i =0; i<20; i++){
            Temp2.incrementTemp();}
    System.out.println("Temp2 after 20 increments: " + (Temp2.getTemp()) + " °F");
        for (int i =0; i<37; i++){
            Temp2.decrementTemp();}
    System.out.println("Temp2 after 37 decrements: " + (Temp2.getTemp()) + " °F");
            Temp2.changeTemp(45);
    System.out.println("Temp2 after adding 45: " + (Temp2.getTemp()) + " °F");

    }//END main
}//END Temperature