//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;
import javax.swing.JOptionPane;
public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(10-1+1) + 1;
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber ==1) {
			JOptionPane.showMessageDialog(null, "You have cool talents!");
		} else if (randomNumber ==2) {
			JOptionPane.showMessageDialog(null, "You are super smart!");
		} else if (randomNumber ==3) {
			JOptionPane.showMessageDialog(null, "You are kind");
		} else if (randomNumber ==4) {
			JOptionPane.showMessageDialog(null, "You are cool");
		} else if (randomNumber ==5) {
			JOptionPane.showMessageDialog(null, "You are funny");
		} else if (randomNumber ==6) {
			JOptionPane.showMessageDialog(null, "You are an awesome person");
		} else if (randomNumber ==7) {
			JOptionPane.showMessageDialog(null, "You make everybody happier");
		} else if (randomNumber ==8) {	
			JOptionPane.showMessageDialog(null, "You're a natural at whatever you do");
		} else if (randomNumber ==9) {
			JOptionPane.showMessageDialog(null, "You are creative");
		} else if (randomNumber ==10){
			JOptionPane.showMessageDialog(null, "You have good energy");
		}

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
