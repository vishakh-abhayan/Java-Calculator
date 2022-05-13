import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Calculator implements ActionListener {
	
	JFrame jf;

	
	public Calculator() {
		jf=new JFrame("Calculator");
        jf.setLayout(null);
		jf.setSize(450,600);
		jf.setLocation(350, 130);
		
		
		
		JLabel dl=new JLabel();
		dl.setBounds(30, 40, 390, 65);
		dl.setBackground(Color.LIGHT_GRAY);
		dl.setOpaque(true);
		dl.setHorizontalAlignment(SwingConstants.RIGHT);
		dl.setForeground(Color.BLACK);
		jf.add(dl);
		
		
		
		JButton seven=new JButton("7");
		seven.setBounds(30, 130, 80, 80);
		seven.setFont(new Font("Arial", Font.PLAIN, 40));
		seven.addActionListener(this);
		jf.add(seven);
		
		
		JButton eight=new JButton("8");
		eight.setBounds(130, 130, 80, 80);
		eight.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(eight);
		
		
		JButton nine=new JButton("9");
		nine.setBounds(230, 130, 80, 80);
		nine.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(nine);
		
		
		
		
		

		JButton four=new JButton("4");
		four.setBounds(30, 230, 80, 80);
		four.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(four);
		
		
		JButton five=new JButton("5");
		five.setBounds(130, 230, 80, 80);
		five.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(five);
		
		
		JButton six=new JButton("6");
		six.setBounds(230, 230, 80, 80);
		six.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(six);
		
		
		
		

		JButton one=new JButton("1");
		one.setBounds(30, 330, 80, 80);
		one.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(one);
		
		
		JButton two=new JButton("2");
		two.setBounds(130, 330, 80, 80);
		two.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(two);
		
		
		JButton three=new JButton("3");
		three.setBounds(230, 330, 80, 80);
		three.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(three);
		
		
		
		JButton dot=new JButton(".");
		dot.setBounds(30, 430, 80, 80);
		dot.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(dot);
		
		
		JButton zero=new JButton("0");
		zero.setBounds(130, 430, 80, 80);
		zero.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(zero);
		
		
		JButton equal=new JButton("=");
		equal.setBounds(230, 430, 80, 80);
		equal.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(equal);
		
		
		
		
		
		
		JButton div=new JButton("÷");
		div.setBounds(330, 130, 80, 80);
		div.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(div);
		

		
		JButton mul=new JButton("x");
		mul.setBounds(330, 230, 80, 80);
		mul.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(mul);
		
		
		
		JButton min=new JButton("-");
		min.setBounds(330, 330, 80, 80);
		min.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(min);
		
		JButton plu=new JButton("+");
		plu.setBounds(330, 430, 80, 80);
		plu.setFont(new Font("Arial", Font.PLAIN, 40));
		jf.add(plu);
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		new Calculator();
		
		
		}


	@Override
	public void actionPerformed(ActionEvent e) {
       
		jf.getContentPane().setBackground(Color.gray);
		
	}
	

}
