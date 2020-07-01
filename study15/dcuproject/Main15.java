package dcuproject;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

class myThread extends Thread{
	private JLabel label;
	public myThread(JLabel label) {
		this.label = label;
	}
	
	public void run() {
		Calendar cal = Calendar.getInstance();
		
		int h = cal.get(Calendar.HOUR_OF_DAY);//시
		int m = cal.get(Calendar.MINUTE);//분
		int s = cal.get(Calendar.SECOND);//초
		
		String time = Integer.toString(h);//시간 파싱
		time = time.concat(" : ");
		time = time.concat(Integer.toString(m));//분 파싱
		time = time.concat(" : ");
		time = time.concat(Integer.toString(s));//초 파싱
		label.setText(time);
	}
}
public class Main15 extends JFrame{
	public Main15() {
		super("14106854 이승훈");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel();
		label.setFont(new Font("Gothic",Font.ITALIC,80));
		con.add(label);
		
		myThread th = new myThread(label);
		setSize(500,500);
		setVisible(true);
		th.start();
		
	}
	
	public static void main(String[] args) {
		new Main15();
	}
}
