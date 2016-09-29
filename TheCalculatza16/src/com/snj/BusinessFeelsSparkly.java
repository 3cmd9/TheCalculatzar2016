/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snj;
import java.util.Scanner;
/**
 *
 * @author 073685844
 */
public class BusinessFeelsSparkly {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     String calc = "";
     double a;
     double b;
     double c;
     double d;
     double e;

        
        System.out.println("Enter letter of calculator wanted");
        System.out.println("m - Mortgage Calculator");
        System.out.println("p - profit calculator");
        System.out.println("c - currency converter");
        System.out.println("si - simple interest");
        System.out.println("ci - compound interest");
        
        calc = scan.nextLine();
        
        
        
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }    
    //WE NEED:
    // James - Profit calculator (175 onwards) - Mortgage (after my other one.)
    //  Nate - Currency
    // Spencer - Interest calculator
    //
    //
    //
    //  
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    //spencer
    /**
     * Simple Interest program to calculate interest on a bank loan
     * 
     *@param loan amount loaned from bank
     *@param percent percent interest of the loan per year
     *@param time time in years the loan is borrowed
     *@return total amount owed to bank 
     */
    public static double simple (double loan, double percent, double time) {
    double totAmount = 0;    
    percent = percent/100;
    totAmount = (loan*percent*time) + loan;
    return totAmount;
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    public static String profit(double moMade, double moExp) {    
    double profit;
    String statement;
    double percentage;
    
    //find the profit
    profit = moMade - moExp;
    
    //find the profit percentage
    percentage = (Math.round(((profit * 100) / moExp) * 100))/100;
    
    
    
    
    statement = "You made: " + profit + "$. In percentage that is a profit of " + percentage + "%.";
    return statement;
}
public static double mortgage(double princ, double inRa, double payOft, double payLong) {    
    double nuPa = payOft * payLong;
    double monthPay;
    
    monthPay = princ * ((inRa*Math.pow(1 + inRa, nuPa))/(Math.pow(1+inRa, nuPa)-1));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    





    return monthPay;
}














































//nate
public static double currency(String original, String exchange ){
  Scanner input = new Scanner(System.in);
  System.out.println("Type the amout of money u want to exchange");
  
  
  String[] currency = new String[5];
  double[] rate = new double [5];
  currency [0] = "USD";
  currency [1] = "GBP";
  currency [2] = "CAD";
  currency [3] = "EUR";
  currency [4] = "AUD";
  if(original.equals("USD")){  
    rate[0] = 1; 
    rate[1] = 0.65915;
    rate[2] = 1.33860;
    rate[3] = 0.89076;
    rate[4] = 1.43111;   
  }else if(original.equals("CAD")){
    rate[0] = 1.51710; 
    rate[1] = 1;
    rate[2] = 2.03080;
    rate[3] = 1.35081;
    rate[4] = 2.17088;
  }
 
  
    
    
    
  return 1;//exchange; 
      
}




























}
