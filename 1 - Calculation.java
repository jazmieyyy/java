/* PROGRAM NO 1 
Write a program to find the sum, difference, product, quotient and remainder of two numbers 
passed as command line argument. */

import java.util.*;
class Calculation
{
 public static void main(String args[])
  {
    int N1 = Integer.parseInt(args[0]);
    int N2 = Integer.parseInt(args[1]);
    int Sum = N1+N2;
    int Difference = N1-N2;
    int Product = N1*N2;
    int Quotient = N1/N2;
    int Remainder = N1%N2;
    System.out.println("Sum = " + Sum);
    System.out.println("Difference =" + Difference);
    System.out.println("Product =" + Product);
    System.out.println("Quotient =" + Quotient);
    System.out.println("Remainder =" + Remainder); 
  }
}
