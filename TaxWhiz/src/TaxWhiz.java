package edu.buffalostate.cis425.sp17.exercises.marron;
/**
 *
 File: TaxWhiz.java
 Exercise 3 - Tax Whiz
 For: CIS 425 Object Oriented Programming
 Programmer: Jeffrey Marron
 Date Created:  12.20.2016
 Last Modified: 1.24.2017
 Description: This class stores a tax rate and
 computes the tax for a given purchase price.

  Assignment: 1) Add a method changeTax() that changes the current tax
                 rate by the amount in the parameter
              2) Add a main method
              3) In the main, create two instances of TaxWhiz with a tax
                 rates of 8.75 and 4.75 percent
              4) Compute the tax on two different purchases (one at the
                 8.75 and one at the 4.75 rates
              5) Print the total of two purchases, the total tax and the
                 total amount (purchases+tax)
                 (try to make it look like a store receipt as best as you
                 can, this actually could take trial/error)
              6) Repeat steps 4) and 5) but first increment the tax rate
                 by 1.0 percentage point
 */

public class TaxWhiz
{
    private double taxRate;
    String SaleAmt = "SALE AMOUNT", Tax = "TAX", Total = "TOTAL", Header = "------------------------",
            SaleId = "SALE ID#";
    /**
     * TaxWhiz() constructor creates an object with
     *  a given tax rate
     * @param t -- the given tax rate
     */
    public TaxWhiz(double t)
    {
        taxRate = t;
    }

    /**
     * calcTax() returns the tax for a given purchase
     * @param purchase -- the given purchase price
     */
    public double calcTax(double purchase)
    {

        return taxRate * purchase;
    }

    /**
     * changeTax() changes the current tax
     * @param t -- the change added to the current tax rate
     */
    public void changeTax(double t)
    {
        taxRate = taxRate + t;
    }

    /**
     * printTax() prints receipt. SALE ID is the current tax rate of the purchase
     * to keep track of what % is being calculated on that receipt
     * @param t -- an instance of TaxWhiz
     * @param p -- a purchase value
     */
    void printTax(TaxWhiz t, double p)
    {
        System.out.printf("%-19s %.2f %n", SaleId, (t.taxRate)*100);
        System.out.println(Header);
        System.out.printf("%-15s %s %6.2f %n", SaleAmt, "$", p);
        System.out.printf("%-15s %s %6.2f %n", Tax, "$", t.calcTax(p));
        System.out.printf("%-15s %s %6.2f %n", Total, "$", t.calcTax(p)+p);
        System.out.printf("%s %n %n", Header);
    }

    public static void main(String args[]) {

    double p1 = 17.00, p2 = 38.00;//local variables

    TaxWhiz TW1 = new TaxWhiz(.0875);//creates TaxWhiz objects
    TaxWhiz TW2 = new TaxWhiz(.0475);

    TW1.printTax(TW1, p1);
    TW2.printTax(TW2, p2);

    TW1.changeTax(.01);
    TW2.changeTax(.01);

    TW1.printTax(TW1, p1);
    TW2.printTax(TW2, p2);

    }//END main

} //END TaxWhiz
