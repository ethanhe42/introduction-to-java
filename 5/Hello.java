import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Hello extends JFrame implements ActionListener {

	double previousnum, currentnum, res;
	boolean end, add, mul, sub, div, mod, sin, cos, tan, max, min,exp,  pow, sqrt, Hex, Oct, Bin;

	JTextField jtextfield = new JTextField("0");
	JButton button[] = new JButton[30];
	JPanel panel0 = new JPanel();
	JPanel panel1 = new JPanel();

	public Hello() {
		setTitle("calculator");
		setResizable(false);
		setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel0, "North");
		jtextfield.setEditable(false);
		jtextfield.setColumns(20);
		jtextfield.setHorizontalAlignment(JTextField.RIGHT);
		panel0.add(jtextfield);
		GridLayout gridlayout = new GridLayout(5, 0);
		gridlayout.setVgap(5);
		gridlayout.setHgap(5);
		panel1.setLayout(gridlayout);
		add(panel1, "Center");

		button[0] = new JButton("1");
		button[1] = new JButton("2");
		button[2] = new JButton("3");
		button[3] = new JButton("sin");
		button[3].setMargin(new Insets(0, 0, 0, 0));
		button[4] = new JButton("Oct");
		button[4].setMargin(new Insets(0, 0, 0, 0));
		button[5] = new JButton("+");
		button[6] = new JButton("4");
		button[7] = new JButton("5");
		button[8] = new JButton("6");
		button[9] = new JButton("cos");
		button[9].setMargin(new Insets(0, 0, 0, 0));
		button[10] = new JButton("Hex");
		button[10].setMargin(new Insets(0, 0, 0, 0));
		button[11] = new JButton("-");
		button[12] = new JButton("7");
		button[13] = new JButton("8");
		button[14] = new JButton("9");
		button[15] = new JButton("max");
		button[15].setMargin(new Insets(0, 0, 0, 0));
		button[16] = new JButton("Bin");
		button[16].setMargin(new Insets(0, 0, 0, 0));
		button[17] = new JButton("*");
		button[18] = new JButton("0");
		button[19] = new JButton(".");
		button[20] = new JButton("=");
		button[21] = new JButton("min");
		button[21].setMargin(new Insets(0, 0, 0, 0));
		button[22] = new JButton("pow");
		button[22].setMargin(new Insets(0, 0, 0, 0));
		button[23] = new JButton("/");

		button[24] = new JButton("AC");
		button[22].setMargin(new Insets(0, 0, 0, 0));
		
		button[25] = new JButton("C");
		button[26] = new JButton("exp");
		button[27] = new JButton("tan");
		button[29] = new JButton("%");
		button[28] = new JButton("sqrt");
		for (JButton x : button) {
			panel1.add(x);
			x.addActionListener(this);
		}
		JLabel ll = new JLabel();
		ll.setPreferredSize(new Dimension(10, 0));
		add(ll, "West");
		JLabel rl = new JLabel();
		rl.setPreferredSize(new Dimension(10, 0));
		add(rl, "East");
		setVisible(true);
	}

	public void number(int i) {
		String s = String.valueOf(i);
		if (end) {
			jtextfield.setText("0");
			end = false;
		}
		if ((jtextfield.getText()).equals("0")) {
			jtextfield.setText(s);
		} else {
			String str = jtextfield.getText() + s;
			jtextfield.setText(str);
		}
	}

	public void answer() {
		String s = "";
		currentnum = Double.parseDouble(jtextfield.getText());

		if (add)
			res = previousnum + currentnum;
		else if (mul)
			res = previousnum * currentnum;
		else if (sub)
			res = previousnum - currentnum;
		else if (div)
			res = previousnum / currentnum;
		else if (mod)
			res = previousnum % currentnum;
		else if (sin)
			res = Math.sin(Math.toRadians(currentnum));
		else if (cos)
			res = Math.cos(Math.toRadians(currentnum));
		else if (tan)
			res = Math.tan(Math.toRadians(currentnum));
		else if (Oct)
			s = Integer.toOctalString((int) previousnum);
		else if (Hex)
			s = Integer.toHexString((int) previousnum);
		else if (Bin)
			s = Integer.toBinaryString((int) previousnum);
		else if (max)
			res = Math.max(previousnum, currentnum);
		else if (min)
			res = Math.min(previousnum, currentnum);
		else if (pow)
			res = Math.pow(previousnum, currentnum);		
		else if (exp)
			res = Math.exp(currentnum);
		else if (sqrt)
			res = Math.sqrt(currentnum);
		if (!(Oct || Hex || Bin))
			s = String.valueOf(res);
		jtextfield.setText(s);
		end = true;
	}

	public void actionPerformed(ActionEvent e) {

		
		if (e.getSource() == button[0])
			number(1);
		else if (e.getSource() == button[1])
			number(2);
		else if (e.getSource() == button[2])
			number(3);
		else if (e.getSource() == button[6])
			number(4);
		else if (e.getSource() == button[7])
			number(5);
		else if (e.getSource() == button[8])
			number(6);
		else if (e.getSource() == button[12])
			number(7);
		else if (e.getSource() == button[13])
			number(8);
		else if (e.getSource() == button[14])
			number(9);
		else if (e.getSource() == button[18])
			number(0);
		else if (e.getSource() == button[19]){
			if (jtextfield.getText().indexOf('.') < 0)
				jtextfield.setText(jtextfield.getText() + ".");
		}
		else if (e.getSource() == button[20])
			answer();
		else if (e.getSource() == button[25] || e.getSource() == button[24])
			jtextfield.setText("");
		else {
			add = false;
			mul = false;
			sub = false;
			div = false;
			sin = false;
			cos = false;
			max = false;
			min = false;
			Hex = false;
			Oct = false;
			Bin = false;
			if (e.getSource() == button[5])
				add = true;
			else if (e.getSource() == button[11])
				sub = true;
			else if (e.getSource() == button[17])
				mul = true;
			else if (e.getSource() == button[23])
				div = true;
			else if (e.getSource() == button[3])
				sin = true;
			else if (e.getSource() == button[9])
				cos = true;
			else if (e.getSource() == button[15])
				max = true;
			else if (e.getSource() == button[21])
				min = true;
			else if (e.getSource() == button[10])
				Hex = true;
			else if (e.getSource() == button[4])
				Oct = true;
			else if (e.getSource() == button[16])
				Bin = true;
			else if (e.getSource() == button[22])
				pow = true;		
			else if (e.getSource() == button[29])
				mod = true;		
			else if (e.getSource() == button[26])
				exp = true;		
			else if (e.getSource() == button[28])
				sqrt = true;	
			else if (e.getSource() == button[27])
				tan = true;			
			previousnum = Double.parseDouble(jtextfield.getText());
			end = true;
		}
	}

	public static void main(String args[]) {
		@SuppressWarnings("unused")
		Hello calculator = new Hello();
	}
}
