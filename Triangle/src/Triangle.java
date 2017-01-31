package edu.buffalostate.cis425.sp17.exercises.marron;
/**
 *
 File: Triangle.java
 Exercise 6 - Triangle
 For: CIS 425 Object Oriented Programming
 Programmer: Jeffrey Marron
 Date Created:  12.22.2016
 Last Modified: 1.24.2017

  Create a Java class named Triangle that represents a "triangle"
  with the following characteristics:

  1) The class has three private integer instance variables
     (S1, S2, S3) to store the sides of the triangle.
  2) This class has two constructors:
     Constructor #1 - has no parameters and initializes the
     triangle's sides to 0
     Constructor #2 - has three integer parameters that
     initializes the triangle's sides
  3) This class has a method calculatePerimeter( ) which
     returns the perimeter (s1+s2+s3) of the triangle as an
     integer
  4) This class contains a main( ) method which creates an
     instance of the triangle object with
     S1=10, S2=5, S3=2 and computes the object's perimeter
     (via calculatePerimeter) and outputs the result to the
     user's screen.

 */

public class Triangle {

    private int S1, S2, S3;

    /** Default Triangle class constructor */
    public Triangle ( ) {
        S1 = S2 = S3 = 0;
    }

    /**Triangle class constructor with 3 int arguments */
    public Triangle ( int s1, int s2, int s3 ) {
        S1 = s1;
        S2 = s2;
        S3 = s3;
    }

    /** calculatePerimeter() calculates the perimeter of the triangle object */
    public int calculatePerimeter( ) {
        return S1+S2+S3;
    }//END calculatePerimeter

    /**main - creates a triangle object and calculates it's perimeter */
    public static void main( String args[] ) {
        Triangle t = new Triangle(5, 7, 9);//declares Triangle object

        System.out.println("The perimeter of t is: " + t.calculatePerimeter() );
    }//END main
}//END Triangle
