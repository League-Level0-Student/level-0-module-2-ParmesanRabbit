package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {

	public static void main(String[]args) {
		
		Random ran = new Random();
				
		int firstNumber = ran.nextInt(100);
		
		int secondNumber = ran.nextInt(100);
		
		int thirdNumber = ran.nextInt(100);
		
		int fourthNumber = ran.nextInt(100);
		
		int fifthNumber = ran.nextInt(100);
		
		int sixthNumber = ran.nextInt(100);
		
		JOptionPane.showMessageDialog(null, ""+firstNumber+" "+secondNumber+" "+thirdNumber+" "+fourthNumber+" "+fifthNumber+" "+sixthNumber+"");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
