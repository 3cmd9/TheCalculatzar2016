/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrAnalyser;

import java.util.Scanner;

/**
 *
 * @author 072753874
 */
public class String {

    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter the sentence that you would like to analyse");
        java.lang.String Sentence=i.nextLine();
        System.out.println("What would you like to do? (1=Shift 2=Vowel Count 3=To ASCII)");
        switch(i.nextInt()){
             case 1:{//Ceasar Cipher
                 Shift();
            }case 2:{
                vowelCount(Sentence);
            }case 3:{
                
            }
    }

    public static String Shift() {

                //Input
        Scanner i= new Scanner(System.in);
        boolean go=true;
        for (;;){
        System.out.println("What would you like to do? (0=Encode, 1=Decode, 2=Break, 3=Exit)");
        switch (i.nextInt()) {
            case 0:
                { //Encode(0)
                    i.nextLine();//Clear input
                    System.out.println("Enter the phrase that you wish to encode");
                    java.lang.String phrase= i.nextLine();
                    System.out.println("Enter the amount that you wish to shift");
                    int shift=i.nextInt();
                    System.out.println("Your code is: "+ Cipher(phrase,shift));
                    break;
                }
            case 1: //Decode (1)
                {
                    i.nextLine();//Clear input
                    System.out.println("Enter the phrase that you wish to decode");
                    java.lang.String phrase= i.nextLine();
                    System.out.println("Enter the amount that you wish to shift");
                    int shift=26-i.nextInt();//A decode is moving a negative number so just subtract that from 26
                    System.out.println("Your code is: "+ Cipher(phrase,shift));
                    break;
                }
            case 2://Break (2)
            {
                i.nextLine();//Clear input
                System.out.println("Enter the code thats needs to be decoded");
                java.lang.String phrase = i.nextLine();
                for (int x=0;x<26;x++){
                   //Call the Cipher method with shift=1 all the way to shift=26
                 System.out.println("Shift of " +x+ " is "+ Cipher(phrase,x));
         }
                break;
            }
            case 3://Exit (3)           
                return;                                
        }
        }
    }

    public static String vowelCount(String Sentence) {

    }

    public static String toASCII(String Sentence) {

    }

     public static java.lang.String Cipher(java.lang.String Sentence, int shift){
        //Safety measures
        if (shift>26)
            shift=shift%26;
        else if (shift<0){
            shift=shift%26;
            shift=26+shift;
        }

        //Initiate the alphabet
        java.lang.String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        java.lang.String nonValidCharacter="123456789,.;:!@#$%^&*()-_=+{}[]?/><`~ ";
        //Create an alphabet where the normal alphabet lines up with where they want to shift to
        java.lang.String cipherAlphabet=alphabet.substring(26-shift, 26)+ alphabet.substring(0, 26-shift);
        java.lang.String lowerCipher=cipherAlphabet.toLowerCase();
        java.lang.String coded="";

            for (int x=0;x<Sentence.length(); x++){
                //Add special characters without shifting them
                if (nonValidCharacter.indexOf(Sentence.charAt(x) )>0){
                   coded+=Sentence.charAt(x);
                   continue;}
                else if (0<=lowerCipher.indexOf(Sentence.charAt(x) )){
                   coded+=(alphabet.toLowerCase().charAt(lowerCipher.indexOf(Sentence.charAt(x))));
                   continue;}

                //Add the shifted letter to the String coded
                coded+=(alphabet.charAt(cipherAlphabet.indexOf(Sentence.charAt(x))));
            }

        return coded;//Return the coded phrase
    }
    
    
}
}
