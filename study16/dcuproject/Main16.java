package dcuproject;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



class myGameThread extends Thread{
	private JLabel label;
	private Container con;
	int x;
	int y;
	public myGameThread(Container con, JLabel label, int x, int y) {
		this.label = label;
		this.con = con;
		this.x = x;
		this.y =y;
	}
	public void run() {
		label.setLocation(x,y);
		con.add(label);
		while(true) {
			try {
				if(y>=-50) {
					y-=5;
					label.setLocation(x,y);
					sleep(20);
				} else if(y<-50) {
					con.remove(label);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}


public class Main16 extends JFrame{
	JLabel label[] = new JLabel[40];
	ImageIcon icon = new ImageIcon("C:\\dcu_java/실습_이미지/apple.jpg");
	myGameThread items[] = new myGameThread[40];
	int i = 0;
	public Main16() {
		super("14106854 이승훈 ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(null);
		setSize(800,800);
		setVisible(true);
		
		for(int i = 0; i <40; i++) {
			label[i] = new JLabel();
			label[i].setIcon(icon);
			label[i].setSize(50,50);
		}
		
		con.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				items[i] = new myGameThread(con, label[i], e.getX(), e.getY());
				items[i].start();
				i++;
			}
		});
		con.requestFocus();
	}
	public static void main(String[] args) {
		new Main16();
	}
}
