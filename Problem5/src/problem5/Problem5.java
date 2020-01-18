/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

/**
 *
 * @author chris
 */
public class Problem5 {

    String[] words;

    int[] index;

    public Problem5() {

        words = new String[100_000];
        index = new int[26];

        BufferedReader br = null;

        for (int i = 0; i < index.length; i++) { 
            index[i] = -1;
        }
        index[0] = 0;

        try {

            br = new BufferedReader(new FileReader("wordListWindows.txt"));

            String contentLine = br.readLine();
            int counter = 0;
            while (contentLine != null && counter < 100_000) {
                char letter = contentLine.charAt(0);
                words[counter] = contentLine;
                int r = letter - 'a';

                if (index[r] == -1) {
                    index[r] = counter;
                }
                counter++;
                contentLine = br.readLine();
            }

        } catch (IOException ioe) {

            ioe.printStackTrace(System.out);

        } finally {

            try {

                if (br != null) {

                    br.close();

                }

            } catch (IOException ioe) {

                System.out.println("Error in closing the BufferedReader");

                ioe.printStackTrace(System.out);

            }

        }

    }

    public static void main(String[] args) {

    }

    public int search(String word) {
        int start = index[word.charAt(0) - 'a'];
        int end;
        if (word.charAt(0) == 'z') {
            end = words.length - 1;
        } else {
            end = index[(word.charAt(0) - 'a') + 1];
        }

        return binarySearchRecursive(words, start, end, word);

    }

    public int binarySearchRecursive(String[] data, int start, int end, String n) {
        if (end < start) {

            return -1;

        }

        int middle = (start + end) / 2;

        if (n == null ? data[middle] == null : n.equals(data[middle])) {

            return middle;

        } else if (n.compareTo(data[middle]) < 0) {

            return binarySearchRecursive(data, start, middle - 1, n);

        } else {

            return binarySearchRecursive(data, middle + 1, end, n);

        }

    }

}
