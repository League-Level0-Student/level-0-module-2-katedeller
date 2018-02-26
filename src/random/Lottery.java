package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	String lotto = "";
	for(int i = 0; i<6; i++) {
		int num = new Random ().nextInt(100);
		lotto = lotto + num + " "; 
	}
	JOptionPane.showMessageDialog(null, lotto);
}
}

