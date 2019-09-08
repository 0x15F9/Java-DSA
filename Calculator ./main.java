import java.awt.Color;

import javax.swing.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame calc= new calculator();
		calc.setSize(350,600);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setBackground(Color.black);
		calc.setVisible(true);
		calc.setTitle("Calculator");
		calc.setLayout(null);
		calc.getContentPane().setBackground(Color.decode("0xB9F6EB"));
	}

}
