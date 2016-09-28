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
     // Sample simple interest to calculate money owed from loan. Money owed - percent as whole number, time in years)   
     //Scanner kbScan = new Scanner(System.in);
     //System.out.println ("Amount borrowed, percent, time in years");
     //double sumBorrowed = kbScan.nextInt();
     //double percent = kbScan.nextInt();
     //double time = kbScan.nextInt();
     //System.out.println (simple(sumBorrowed,percent, time)); 
        
        //System.out.println(mortgage(100000, 0.005, 12, 15));
        //
        
        System.out.println(profit(12.50, 5.23));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
    public static double simple (double sumBorrowed, double percent, double time) {
    double totAmount = 0;    
    percent = percent/100;
    totAmount = (sumBorrowed*percent*time) + sumBorrowed;
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




























}
