

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton, equButton, delButton, clrButton, negButton;
	JPanel panel,panel2;
	JButton expButton,sinButton,cosButton,tenButton,xhalfButton,logButton,sinhButton,coshButton,tenhButton;
	JButton xpowyButton,ceButton,cButton,pieButton,x3Button,x2Button,factButton,sqrootButton;
	JToggleButton onButton;
	
	Font myFont = new Font("Ink Free",Font.BOLD,30);
	
	double num1=0,num2=0,result=0;
	char operator;
	
	Calculator(){
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 700);
		frame.setLayout(null);
		
		
		textfield = new JTextField();
		textfield.setBounds(18,60,400, 80);
		textfield.setFont(myFont);
		
	    JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
        rdbtnNewRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	numberButtons[0].setEnabled(true);
            	numberButtons[1].setEnabled(true);
            	numberButtons[2].setEnabled(true);
            	numberButtons[3].setEnabled(true);
            	numberButtons[4].setEnabled(true);
            	numberButtons[5].setEnabled(true);
            	numberButtons[6].setEnabled(true);
            	numberButtons[7].setEnabled(true);
            	numberButtons[8].setEnabled(true);
            	numberButtons[9].setEnabled(true);
            	addButton.setEnabled(true);
        		subButton.setEnabled(true);
        		mulButton.setEnabled(true);
        		divButton.setEnabled(true);
        		equButton.setEnabled(true);
        		decButton.setEnabled(true);
        		delButton.setEnabled(true);
        		clrButton.setEnabled(true);
        		negButton.setEnabled(true);
        		
        		sqrootButton.setEnabled(true);
        		expButton.setEnabled(true);
        		sinButton.setEnabled(true);
        		cosButton.setEnabled(true);
        		tenButton.setEnabled(true);
        		xhalfButton.setEnabled(true);
        		logButton.setEnabled(true);
        		sinhButton.setEnabled(true);
        		coshButton.setEnabled(true);
        		tenhButton.setEnabled(true);
        		xpowyButton.setEnabled(true);
        		ceButton.setEnabled(true);
        		cButton.setEnabled(true);
        		pieButton.setEnabled(true);
        		x3Button.setEnabled(true);
        		x2Button.setEnabled(true);
        		factButton.setEnabled(true);
            }
        });
        frame.add(rdbtnNewRadioButton);
        rdbtnNewRadioButton.setBounds(18, 160, 60, 40);
        frame.getContentPane().add(rdbtnNewRadioButton);
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
        rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                numberButtons[0].setEnabled(false);
                numberButtons[1].setEnabled(false);
                numberButtons[2].setEnabled(false);
                numberButtons[3].setEnabled(false);
                numberButtons[4].setEnabled(false);
                numberButtons[5].setEnabled(false);
                numberButtons[6].setEnabled(false);
                numberButtons[7].setEnabled(false);
                numberButtons[8].setEnabled(false);
                numberButtons[9].setEnabled(false);
                
                addButton.setEnabled(false);
        		subButton.setEnabled(false);
        		mulButton.setEnabled(false);
        		divButton.setEnabled(false);
        		equButton.setEnabled(false);
        		decButton.setEnabled(false);
        		delButton.setEnabled(false);
        		clrButton.setEnabled(false);
        		negButton.setEnabled(false);
        		
        		sqrootButton.setEnabled(false);
        		expButton.setEnabled(false);
        		sinButton.setEnabled(false);
        		cosButton.setEnabled(false);
        		tenButton.setEnabled(false);
        		xhalfButton.setEnabled(false);
        		logButton.setEnabled(false);
        		sinhButton.setEnabled(false);
        		coshButton.setEnabled(false);
        		tenhButton.setEnabled(false);
        		xpowyButton.setEnabled(false);
        		ceButton.setEnabled(false);
        		cButton.setEnabled(false);
        		pieButton.setEnabled(false);
        		x3Button.setEnabled(false);
        		x2Button.setEnabled(false);
        		factButton.setEnabled(false);
                
                
            }
        });
        frame.add(rdbtnNewRadioButton_1);
        rdbtnNewRadioButton_1.setBounds(100,160,60, 40);
        frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		
		textfield.setEditable(false);
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		equButton = new JButton("=");
		decButton = new JButton(".");
		delButton = new JButton("dlt");
		clrButton = new JButton("clr");
		negButton = new JButton("neg");
		
		sqrootButton = new JButton("sqrt");
		expButton = new JButton("EXP");
		sinButton = new JButton("sin");
		cosButton = new JButton("cos");
		tenButton = new JButton("ten");
		xhalfButton = new JButton("1/x");
		logButton = new JButton("log");
		sinhButton = new JButton("sinh");
		coshButton = new JButton("cosh");
		tenhButton = new JButton("tenh");
		xpowyButton = new JButton("x^y");
		ceButton = new JButton("ce");
		cButton = new JButton("nCr");
		pieButton = new JButton("π");
		x3Button=new JButton("x^3");
		x2Button = new JButton("x^2");
		factButton = new JButton("n!");
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setBounds(50, 11, 320, 40);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        frame.getContentPane().add(lblNewLabel);
		
		
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = equButton;
		functionButtons[5] = decButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		
		
		for(int i=0;i<8;i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			
			functionButtons[i].setFocusable(false);
		}
		
		for(int i=0;i<=9;i++) {
			
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		sqrootButton.addActionListener(this);
		sqrootButton.setFocusable(false);
		
		expButton.addActionListener(this);
		expButton.setFocusable(false);
		
		sinButton.addActionListener(this);
		sinButton.setFocusable(false);
		
	    cosButton.addActionListener(this);
		cosButton.setFocusable(false);
		
		tenButton.addActionListener(this);
		tenButton.setFocusable(false);
		
	    xhalfButton.addActionListener(this);
		xhalfButton.setFocusable(false);
		
		logButton.addActionListener(this);
		logButton.setFocusable(false);
		
		sinhButton.addActionListener(this);
		sinhButton.setFocusable(false);
		
		coshButton.addActionListener(this);
		coshButton.setFocusable(false);
		
		tenhButton.addActionListener(this);
		tenhButton.setFocusable(false);
		
		xpowyButton.addActionListener(this);
		xpowyButton.setFocusable(false);
		
		cButton.addActionListener(this);
		cButton.setFocusable(false);
		
		ceButton.addActionListener(this);
		ceButton.setFocusable(false);
		
		pieButton.addActionListener(this);
		pieButton.setFocusable(false);
		
		x3Button.addActionListener(this);
		x3Button.setFocusable(false);
		
		x2Button.addActionListener(this);
		x2Button.setFocusable(false);
		
		factButton.addActionListener(this);
		factButton.setFocusable(false);
		
		panel = new JPanel();
		panel.setBounds(18, 200, 400, 450);
		panel.setLayout(new GridLayout(7,9,1,1));
		
		
        
		
		panel.add(sqrootButton);
		panel.add(expButton);
		panel.add(sinButton);
		panel.add(cosButton);
		panel.add(tenButton);
		panel.add(xhalfButton);
		panel.add(logButton);
		panel.add(sinhButton);
		panel.add(coshButton);
		panel.add(tenhButton);
		panel.add(xpowyButton);
		panel.add(cButton);
		panel.add(pieButton);
		panel.add(negButton);
		panel.add(addButton);
		panel.add(x3Button);
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(subButton);
		panel.add(x2Button);
		
		
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		
		panel.add(mulButton);
		panel.add(factButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(divButton);
		
		panel.add(delButton);
		panel.add(clrButton);
		
		
		
		
		
		
		
		
		
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		
		
		
		frame.add(panel);
		
		
		
		frame.add(textfield);
		frame.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
	}
	public double ncr(double n , double r) {
		double ans = fact(n)/(fact(r)*fact(n-r));
		return ans;
	}
	public double fact(double n) {
		double sum =1;
		while(n>0) {
			sum = sum*n;
			n=n-1;
		}
		return sum;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<10;i++) {
			if(e.getSource() == numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		
		
		
		
	   if(e.getSource() == decButton) {
			textfield.setText(textfield.getText().concat("."));
	   }
	   
	   if(e.getSource()==addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='+';
			textfield.setText("");
		}
		if(e.getSource()==subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='-';
			textfield.setText("");
		}
		if(e.getSource()==mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='*';
			textfield.setText("");
		}
		if(e.getSource()==cButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='c';
			textfield.setText("");
		}
		
		if(e.getSource()==xpowyButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='^';
			textfield.setText("");
		}
		if(e.getSource()==pieButton) {
			textfield.setText(String.valueOf(Math.PI));
		}
		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='/';
			textfield.setText("");
		}
		if(e.getSource()==equButton) {
			num2=Double.parseDouble(textfield.getText());
			
			switch(operator) {
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num1/num2;
				break;
			case'^':
				result=Math.pow(num1, num2);
			case'c':
				result = ncr(num1,num2);
			}
			textfield.setText(String.valueOf(result));
			num1=result;
		}
		if(e.getSource()==clrButton) {
			textfield.setText("");
		}
		if(e.getSource()==delButton) {
			String string = textfield.getText();
			textfield.setText("");
			for(int i=0;i<string.length()-1;i++) {
				textfield.setText(textfield.getText()+string.charAt(i));
			}
		}
		if(e.getSource()==negButton) {
			double temp = Double.parseDouble(textfield.getText());
			temp*=-1;
			textfield.setText(String.valueOf(temp));
		}
		if(e.getSource()==factButton) {
			 double num = Double.parseDouble(textfield.getText());
			 double sum =1;
			 while(num>0) {
				sum=sum*num;
				num=num-1;
			}
			textfield.setText(String.valueOf(sum));
		}
		
		if(e.getSource()==x2Button) {
			double num = Double.parseDouble(textfield.getText());
			num = num *num;
			textfield.setText(String.valueOf(num));
		}
		if(e.getSource()==x3Button) {
			double num = Double.parseDouble(textfield.getText());
			num = num *num*num;
			textfield.setText(String.valueOf(num));
		}
		if(e.getSource()==sinButton) {
			double num = Double.parseDouble(textfield.getText());
			num = Math.sin(num);
			textfield.setText(String.valueOf(num));
		}
		if(e.getSource()==cosButton) {
			double num = Double.parseDouble(textfield.getText());
			num = Math.cos(num);
			textfield.setText(String.valueOf(num));
		}
		if(e.getSource()==tenButton) {
			double num = Double.parseDouble(textfield.getText());
			double num1 = Math.sin(num);
			double num2 = Math.cos(num);
			num = num1/num2;
			textfield.setText(String.valueOf(num));
		}
		if(e.getSource()==sqrootButton) {
			double num = Double.parseDouble(textfield.getText());
			num = Math.sqrt(num);
			textfield.setText(String.valueOf(num));
		}
		if(e.getSource()==xhalfButton) {
			double num = Double.parseDouble(textfield.getText());
			num = 1/num;
			textfield.setText(String.valueOf(num));
		}
		if(e.getSource()==sinhButton) {
			double num = Double.parseDouble(textfield.getText());
			num = Math.sinh(num);
			textfield.setText(String.valueOf(num));
		}
		if(e.getSource()==coshButton) {
			double num = Double.parseDouble(textfield.getText());
			num = Math.cosh(num);
			textfield.setText(String.valueOf(num));
		}
		if(e.getSource()==tenhButton) {
			double num = Double.parseDouble(textfield.getText());
			double num1 = Math.sinh(num);
			double num2 = Math.cosh(num);
			num = num1/num2;
			textfield.setText(String.valueOf(num));
		}
		if(e.getSource()==logButton) {
			double num = Double.parseDouble(textfield.getText());
			num = Math.log10(num);
			
			textfield.setText(String.valueOf(num));
		}
		if(e.getSource()==expButton) {
			double num = Double.parseDouble(textfield.getText());
			num = Math.exp(num);
			
			textfield.setText(String.valueOf(num));
		}
		  
		    
		
		
		
	}
}