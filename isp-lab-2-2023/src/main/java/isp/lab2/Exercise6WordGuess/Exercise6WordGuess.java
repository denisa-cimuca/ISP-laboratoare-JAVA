package isp.lab2.Exercise6WordGuess;

import java.util.Scanner;

public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     * @param c
     * @param word
     * @return
     */
    public static int countOccurence(char c, char[] word) {
        int nr = 0;
        for(int i =0; i< word.length; i++){
            if(word[i] == c){
                nr++;
            }
        }
        return nr;
    }
    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        return scanner.next();
    }
    public static void main(String[] args) {
        char c = 'a';
        char[] word = {'a', 'b', 'c', 'a', 'd', 'a'};
        int[] result = countOccurence(word, c);
        for (int string : result) {
            System.out.println(string);
        }
    }

}
