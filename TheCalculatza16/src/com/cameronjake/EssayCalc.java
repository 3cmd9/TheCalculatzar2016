/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cameronjake;

import java.util.Scanner;

/**
 *
 * @author 068786730
 */
public class EssayCalc {

    public static void main(String[] args) {
        String essay;
        int wordCount = 0;
        int sentenceCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your essay. Seperate each paragraph by a double space");
        essay = input.nextLine();
        System.out.println(wordsAndSentences(essay, wordCount, sentenceCount));
        System.out.println("Number of vowels:" + numVowel(essay));
        System.out.println("Number of paragraphs:" + numParagraph(essay));
    }
    //Jake = words, word length and sentences

    public static int wordsAndSentences(String essay, int wordCount, int sentenceCount) {
        for (int i = 0; i <= essay.length() - 1; i++) {
            if (essay.charAt(i) == ' ') {
                wordCount++;
            }
            
        }
        return wordCount + 1;
    }
    
      /////////////////////////////JAKE ON TOP, CAMERON ON BOTTOM/////////////////////
     public static int numVowel(String essay) {
        int numVowel = 0;
        for (int i = 0; i <= essay.length() - 1; i++) {
            switch (essay.charAt(i)) {
                case 'a':
                    numVowel++;
                    break;
                case 'e':
                    numVowel++;
                    break;
                case 'i':
                    numVowel++;
                    break;
                case 'o':
                    numVowel++;
                    break;
                case 'u':
                    numVowel++;
                    break;

            }
        }
        return numVowel;
    }
    
    public static int numParagraph(String essay)
    {
     int numParagraph = 0;
        for (int i = 0; i <= essay.length() -1; i++)
        {
            if (essay.charAt(i) == ' '&& essay.charAt(i+1) == ' ') 
            {
              numParagraph++;  
            }

        }    
        
        return numParagraph;
    }
    
}
