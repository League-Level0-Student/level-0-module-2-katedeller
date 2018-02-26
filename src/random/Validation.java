//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		int randomNumber = new Random().nextInt(5);
		
		// 2303234323  2. On paper, write all the numbers that get printed when you run this class 10 times
		
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
		

		// 4. Repeat all the code above 10 times
		for(int i = 0; i<5; i++) {
				int numb = new Random().nextInt(5);
				if(numb == 3) {JOptionPane.showMessageDialog(null, "You are doing a great job ");}
				if(numb == 0) {JOptionPane.showMessageDialog(null, "You are doing a subpar job ");}
				if(numb == 1) {JOptionPane.showMessageDialog(null, "You are doing an eh job ");}
				if(numb == 2) {JOptionPane.showMessageDialog(null, "You are doing a good job ");}
				if(numb == 4) {JOptionPane.showMessageDialog(null, "You are doing a fine job ");}
				
			

		// 5. Find someone to test out your program. They will like it :)
	}
}}
