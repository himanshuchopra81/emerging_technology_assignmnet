package activity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OddEven {
	public static void main(String args[]) {
		Scanner scan = new Scanner (System.in);
		init();
		
	}
	public static void init() {
		JFrame jf = new JFrame();
		JLabel enter = new JLabel("Enter any number");
		JLabel ans = new JLabel("**");
		JTextField jt = new JTextField();
		JButton calc = new JButton("CHECK");
		jf.setLayout(null);
		jf.setBounds(70, 0, 300, 210);
		enter.setBounds(70, 10, 100, 20);
		jt.setBounds(180, 10, 100, 20);
		calc.setBounds(70, 70, 80, 30);
		ans.setBounds(40,40,60,20);
		jf.add(enter);
		jf.add(jt);
		jf.add(calc);
		jf.add(ans);
		jf.setVisible(true);
		calc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(jt.getText());
				if(checkIfOddEven(a))
					ans.setText("Even");
				else
					ans.setText("odd");
			}
		});
		
		
	}
	public static boolean checkIfOddEven(int a) {
		return a%2==0;
	}
}
