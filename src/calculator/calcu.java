package calculator; /*learn tutorial(with added modification): https://youtu.be/mZVD5OssHQM?feature=shared*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calcu {

	private JFrame frame;
	private JTextField textField;
	
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcu window = new calcu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 388, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Monospaced", Font.BOLD, 24));
		textField.setBounds(10, 10, 351, 71);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setFont(new Font("Windings", Font.BOLD, 18));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setBounds(10, 107, 85, 65);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Verdana", Font.BOLD, 18));
		btn7.setBounds(10, 172, 85, 65);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Verdana", Font.BOLD, 18));
		btn4.setBounds(10, 238, 85, 65);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Verdana", Font.BOLD, 18));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(10, 308, 85, 65);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Verdana", Font.BOLD, 18));
		btn0.setBounds(10, 374, 85, 65);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Verdana", Font.BOLD, 18));
		btnClear.setBounds(99, 107, 85, 65);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Verdana", Font.BOLD, 18));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(99, 172, 85, 65);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Verdana", Font.BOLD, 18));
		btn5.setBounds(99, 238, 85, 65);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Verdana", Font.BOLD, 18));
		btn2.setBounds(99, 308, 85, 65);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Verdana", Font.BOLD, 18));
		btnDot.setBounds(99, 374, 85, 65);
		frame.getContentPane().add(btnDot);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Verdana", Font.BOLD, 18));
		btn00.setBounds(188, 107, 85, 65);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Verdana", Font.BOLD, 18));
		btn9.setBounds(188, 172, 85, 65);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Verdana", Font.BOLD, 18));
		btn6.setBounds(188, 238, 85, 65);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Verdana", Font.BOLD, 18));
		btn3.setBounds(188, 308, 85, 65);
		frame.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean perC = false;
				String number = textField.getText()+btnEqual.getText();
				textField.setText(number);
				String input = textField.getText();
				int equalIndex = input.indexOf('=');
				
				 if (equalIndex != -1 && equalIndex < input.length() - 1) {
					 input = input.substring(equalIndex + 1);
				        
				 }
				
		        // Remove the equal sign from the input
		        input = input.replace("=", "");
		        if(input.contains("%")) {
		        	perC = true;
		        	input = input.replace("%","");
		        }
		        
		        String[] parts = input.split("[+\\-*/]");
		        char[] operators = input.replaceAll("[0-9]", "").toCharArray();

		        double result = Double.parseDouble(parts[0]);
		        int operatorIndex = 0;

		        for (int i = 1; i < parts.length; i++) {
		            char operator = operators[operatorIndex];
		            double num = Double.parseDouble(parts[i]);

		            switch (operator) {
		                case '+':
		                    result += num;
		                    break;
		                case '-':
		                    result -= num;
		                    break;
		                case '/':
		                    result /= num;
		                    break;
		                case '*':
		                    result *= num;
		                    break;
		                	
		            }

		            operatorIndex++;
		        }
		        String addon = "";
		        if(perC) {
		        	addon = "%";
		        }
		        
		        textField.setText(textField.getText()+result+addon);
			}
		});
		btnEqual.setFont(new Font("Verdana", Font.BOLD, 18));
		btnEqual.setBounds(188, 374, 85, 65);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnPlus.getText();
				String txtField = textField.getText();
				if(txtField.length() > 0) {
				char cha = txtField.charAt(txtField.length()-1);
				if(cha !='+') {
					textField.setText(number);
				}
				}
				
			}
		});
		btnPlus.setFont(new Font("Verdana", Font.BOLD, 18));
		btnPlus.setBounds(276, 107, 85, 65);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnSub.getText();
				String txtField = textField.getText();
				if(txtField.length() > 0) {
				char cha = txtField.charAt(txtField.length()-1);
				if(cha !='-') {
					textField.setText(number);
				}
				}
			}
		});
		btnSub.setFont(new Font("Verdana", Font.BOLD, 18));
		btnSub.setBounds(276, 172, 85, 65);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnMul.getText();
				String txtField = textField.getText();
				if(txtField.length() > 0) {
				char cha = txtField.charAt(txtField.length()-1);
				if(cha !='*') {
					textField.setText(number);
				}
				}
			}
		});
		btnMul.setFont(new Font("Verdana", Font.BOLD, 18));
		btnMul.setBounds(276, 238, 85, 65);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDivide.getText();
				String txtField = textField.getText();
				if(txtField.length() > 0) {
				char cha = txtField.charAt(txtField.length()-1);
				if(cha !='/') {
					textField.setText(number);
				}
				}
			}
		});
		btnDivide.setFont(new Font("Verdana", Font.BOLD, 18));
		btnDivide.setBounds(276, 308, 85, 65);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnPercent.getText();
				String txtField = textField.getText();
				if(txtField.length() > 0) {
				char cha = txtField.charAt(txtField.length()-1);
				if(cha !='%') {
					textField.setText(number);
				}
				}
			}
		});
		btnPercent.setFont(new Font("Verdana", Font.BOLD, 18));
		btnPercent.setBounds(276, 374, 85, 65);
		frame.getContentPane().add(btnPercent);
	}
}
