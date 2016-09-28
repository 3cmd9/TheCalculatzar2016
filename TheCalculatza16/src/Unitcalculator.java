
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 340917830
 */
public class Unitcalculator {
    
    

    
    public static void temperature(){
    
    System.out.println("Do you have the Celcius or Fahrenheit?");
    Scanner kbScan = new Scanner(System.in);
    
    String answer = kbScan.next(); 
            


    if (answer.equals("Celcius")){

    System.out.println ("What's the temperature?");
    int cel = kbScan.nextInt();

    System.out.println (cel * 1.8 + 32); 



    } else if (answer.equals("Fahrenheit")){
    
    System.out.println ("What's the temperature?");
    int fahr = kbScan.nextInt();

    System.out.println ((fahr - 32) * 1.8);

}
    
    
    
    
    }
public static void main(String[] args){
    temperature();
}    
}
