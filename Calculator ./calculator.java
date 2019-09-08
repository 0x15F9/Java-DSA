import java.lang.Math;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import java.text.DecimalFormat;

public class calculator extends JFrame implements ActionListener{
	private JTextField first, second, answer;
	private JButton add, minus, mult,divide, modulo, cube;
	private JButton square, power, sin ,cos, tan, log;
	private JLabel displayanswer, option;
    //private static DecimalFormat df4= new DecimalFormat("#.####");
	
	public calculator() {
		first=new JTextField();
		second=new JTextField();
		answer=new JTextField();
		first.setBounds(25, 25, 100, 50);
		second.setBounds(25, 100, 100, 50);
		answer.setBounds(200,50, 100, 75);
		answer.setEditable(false);
		add(first);
		add(second);
		add(answer);
		
		add=new JButton("+");
		//add.setBackground(Color.decode("0x7be721"));
		add.setBounds(25, 200, 60,60);
		add.addActionListener(this);
		add(add);
		
		minus=new JButton("-");
		minus.setBounds(135,200,60,60);
		minus.addActionListener(this);
		add(minus);
		
		mult=new JButton("X");
		mult.setBounds(245,200,60,60);
		mult.addActionListener(this);
		add(mult);
		
		divide=new JButton("/");
		divide.setBounds(25, 285, 60,60);
		divide.addActionListener(this);
		add(divide);
		
		modulo=new JButton("%");
		modulo.setBounds(135, 285, 60, 60);
		modulo.addActionListener(this);
		add(modulo);
		
		cube=new JButton("x^3");
		cube.setBounds(245,285,60,60);
		cube.addActionListener(this);
		add(cube);
		
		square=new JButton("x^2");
		square.setBounds(25,370,60,60);
		square.addActionListener(this);
		add(square);
		
		power=new JButton("^");
		power.setBounds(135,370,60,60);
		power.addActionListener(this);
		add(power);
		
		sin=new JButton("sin");
		sin.setBounds(245,370,60,60);
		sin.addActionListener(this);
		add(sin);
		
		cos=new JButton("cos");
		cos.setBounds(25,455,60,60);
		cos.addActionListener(this);
		add(cos);
		
		tan=new JButton("tan");
		tan.setBounds(135,455,60,60);
		tan.addActionListener(this);
		add(tan);
		
		log=new JButton("log");
		log.setBounds(245,455,60,60);
		log.addActionListener(this);
		add(log);
		
		displayanswer= new JLabel("<html>Choose an operation. Unary ops use only the first box</html>");
		displayanswer.setSize(280,25);
		displayanswer.setLocation(25, 165);
		add(displayanswer);
		
		//due to a bug
		option= new JLabel(".");
		option.setSize(100,50);
		option.setLocation(25, 80);
		add(option);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String a=first.getText();
		String b=second.getText();
		double num1=Double.parseDouble(a);
		double num2=Double.parseDouble(b);
		double result=0.0;
		if(e.getSource()==add)
			result=num1+num2;
		else if(e.getSource()==minus)
			result=num1-num2;
		else if(e.getSource()==mult)
			result=num1*num2;
		else if(e.getSource()==divide)
			result=num1/num2;
		else if(e.getSource()==modulo)
			result=num1%num2;
		else if(e.getSource()==cube)
			result=Math.pow(num1, 3);
		else if(e.getSource()==square)
			result=Math.pow(num1, 2);
		else if(e.getSource()==power)
			result=Math.pow(num1, num2);
		else if(e.getSource()==sin)
			result=Math.sin(num1);
		else if(e.getSource()==cos)
			result=Math.cos(num1);
		else if(e.getSource()==tan)
			result=Math.tan(num1);
		else if(e.getSource()==log)
			result=Math.log(num1);
			//System.out.println(Math.log(num1));
		
		String display=String.valueOf(result);
		answer.setText(display);
	}
}
