import static java.lang.Math.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double First;
	double Second;
	double result;
	String operation;
	String ans;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 403, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(37, 11, 329, 29);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(10, 51, 367, 67);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnTan = new JButton("tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTan.setBounds(312, 160, 65, 55);
		frame.getContentPane().add(btnTan);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setBounds(237, 160, 65, 55);
		frame.getContentPane().add(btnCos);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSin.setBounds(162, 160, 65, 55);
		frame.getContentPane().add(btnSin);
		
		JButton btnRoot = new JButton("\u221A");
		btnRoot.setEnabled(false);
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRoot.setBounds(12, 160, 65, 55);
		frame.getContentPane().add(btnRoot);
		
		JButton btnE = new JButton("e^x");
		btnE.setEnabled(false);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnE.setBounds(87, 160, 65, 55);
		frame.getContentPane().add(btnE);
		
		JButton btnDividebyX = new JButton("1/X");
		btnDividebyX.setEnabled(false);
		btnDividebyX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnDividebyX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDividebyX.setBounds(12, 219, 65, 55);
		frame.getContentPane().add(btnDividebyX);
		
		JButton btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLog.setBounds(87, 219, 65, 55);
		frame.getContentPane().add(btnLog);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSinh.setBounds(162, 219, 65, 55);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCosh.setBounds(237, 219, 65, 55);
		frame.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTanh.setBounds(312, 219, 65, 55);
		frame.getContentPane().add(btnTanh);
		
		JButton btnPow = new JButton("X^Y");
		btnPow.setEnabled(false);
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnPow.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPow.setBounds(12, 278, 65, 55);
		frame.getContentPane().add(btnPow);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPercent.setBounds(87, 278, 65, 55);
		frame.getContentPane().add(btnPercent);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(162, 278, 65, 55);
		frame.getContentPane().add(btnClear);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.setEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace = str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBack.setFont(new Font("Wingdings", Font.PLAIN, 18));
		btnBack.setBounds(237, 278, 65, 55);
		frame.getContentPane().add(btnBack);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdd.setBounds(312, 278, 65, 55);
		frame.getContentPane().add(btnAdd);
		
		JButton btnCube = new JButton("X^3");
		btnCube.setEnabled(false);
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCube.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCube.setBounds(12, 337, 65, 55);
		frame.getContentPane().add(btnCube);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(87, 337, 65, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(162, 337, 65, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(237, 337, 65, 55);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSub.setBounds(312, 337, 65, 55);
		frame.getContentPane().add(btnSub);
		
		JButton btnSquare = new JButton("X^2");
		btnSquare.setEnabled(false);
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSquare.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSquare.setBounds(12, 394, 65, 55);
		frame.getContentPane().add(btnSquare);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(87, 394, 65, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(162, 394, 65, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(237, 394, 65, 55);
		frame.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMul.setBounds(312, 394, 65, 55);
		frame.getContentPane().add(btnMul);
		
		JButton btnFact = new JButton("n!");
		btnFact.setEnabled(false);
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact =1;
				while(a!=0)
				{
					fact = fact * a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnFact.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFact.setBounds(12, 455, 65, 55);
		frame.getContentPane().add(btnFact);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(87, 455, 65, 55);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(162, 455, 65, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(237, 455, 65, 55);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDivide.setBounds(312, 455, 65, 55);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMod = new JButton("+/-");
		btnMod.setEnabled(false);
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMod.setBounds(12, 516, 65, 55);
		frame.getContentPane().add(btnMod);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(87, 516, 140, 55);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDot.setBounds(237, 516, 65, 55);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Second = Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result = First + Second;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				else if(operation=="-")
				{
					result = First - Second;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				else if(operation=="*")
				{
					result = First * Second;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				else if(operation=="/")
				{
					result = First / Second;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				else if(operation=="%")
				{
					result = First % Second;
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
				else if(operation=="X^Y")
				{
					double result =1;
					for(int i=0;i<Second;i++)
					{
						result = First * result;
					}
					
					ans = String.format("%.2f",result);
					textField.setText(ans);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEqual.setBounds(312, 516, 65, 55);
		frame.getContentPane().add(btnEqual);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnDot.setEnabled(true);
				btn0.setEnabled(true);
				btnDivide.setEnabled(true);
				btnMul.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnPercent.setEnabled(true);
				btnSin.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCos.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTan.setEnabled(true);
				btnTanh.setEnabled(true);
				btnSquare.setEnabled(true);
				btnBack.setEnabled(true);
				btnClear.setEnabled(true);
				btnRoot.setEnabled(true);
				btnMod.setEnabled(true);
				btnEqual.setEnabled(true);
				btnLog.setEnabled(true);
				btnE.setEnabled(true);
				btnCube.setEnabled(true);
				btnPow.setEnabled(true);
				btnDividebyX.setEnabled(true);
				btnFact.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(10, 130, 65, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnDot.setEnabled(false);
				btn0.setEnabled(false);
				btnDivide.setEnabled(false);
				btnMul.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnPercent.setEnabled(false);
				btnSin.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCos.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTan.setEnabled(false);
				btnTanh.setEnabled(false);
				btnSquare.setEnabled(false);
				btnBack.setEnabled(false);
				btnClear.setEnabled(false);
				btnRoot.setEnabled(false);
				btnMod.setEnabled(false);
				btnEqual.setEnabled(false);
				btnLog.setEnabled(false);
				btnE.setEnabled(false);
				btnCube.setEnabled(false);
				btnPow.setEnabled(false);
				btnDividebyX.setEnabled(false);
				btnFact.setEnabled(false);
				
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnOff.setBounds(87, 130, 65, 23);
		frame.getContentPane().add(rdbtnOff);
	}
}
