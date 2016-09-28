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
        essay = input.nextLine();
        System.out.println(wordsAndSentences(essay, wordCount, sentenceCount));
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
}
