/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 27, 2023
 * @version 1.0
*/
package edu.fa;

public class ArraySample {
	public static void main(String[] args) {
		String words[] = new String[3];
		System.out.println(words.length);
		String[] languages = {"English","Vietnamese"};
		System.out.println(languages.length);
		String[] terms = words;
		System.out.println(terms.length);
		
		String[][] wordMatrix = new String[3][2];
		System.out.println(wordMatrix[0].length);
	}
}
