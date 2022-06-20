import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
	private Frame f;
	private Panel p;
	private Button btn1, btn2, btnPlus, btnResult;
	private Button btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
	private TextField tf;
	private int num = 0;
	private int num1 = 0;
	private char op;
	
	public MainFrame implements ActionListener() {
		f = new Frame("계산기");
		tf = new TextField("0");
		p = new Panel();
		btn1 = new Button("1");
		btn2 = new Button("2");
		btn3 = new Button("3");
		btn4 = new Button("4");
		btn5 = new Button("5");
		btn6 = new Button("6");
		btn7 = new Button("7");
		btn8 = new Button("8");
		btn9 = new Button("9");
		btn0 = new Button("0");
		btnPlus = new Button("+");
		btnResult = new Button("=");
		
		p.setBackground(Color.darkGray);
		p.setLayout(new GridLayout(4, 0)); //2행2열로 지정됨
		p.add(btn7);
		p.add(btn8);
		p.add(btn9);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn0);
		p.add(btnPlus);
		p.add(btnResult);
		
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btnPlus.addActionListener(this);
		btnResult.addActionListener(this);
		
		f.add(p, BorderLayout.CENTER);
		f.add(tf, BorderLayout.NORTH);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}	

	public static void main(String[] args) {
		new MainFrame();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("0")) {
			System.out.println("0");
		}else if(e.getActionCommand().equals("1")) {
			if(tf.getText().equals("0")) {
				tf.setText("1");
			} else {
				String s = tf.getText();
				tf.setText(s + "1");
			}
		}else if(e.getActionCommand().equals("2")) {
			if(tf.getText().equals("0")) {
				tf.setText("2");
			} else {
				String s = tf.getText();
				tf.setText(s + "2");
			}
		}else if(e.getActionCommand().equals("+")) {
			System.out.println("+");
			num1 = Integer.parseInt(tf.getText());
			op = '+';
			tf.setText("0");
		}else if(e.getActionCommand().equals("=")) {
			int num2 = Integer.parseInt(tf.getText());
			int ret = 0;
			if (op == '+') {
				ret = num1 + num2;
			}
			tf.setText(ret + "");
		}
	}
}
