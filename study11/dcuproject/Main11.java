package dcuproject;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main11 extends JFrame{
	private MyImg img = new MyImg();
	public Main11() {
		setTitle("14106854 이승훈");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(img);
		setSize(600,400);
		setVisible(true);
	}
	class MyImg extends JPanel{
		private ImageIcon icon = new ImageIcon("C:\\dcu_java/실습_이미지/apple.jpg");
		private Image image = icon.getImage();
		
		public void paintComponent(Graphics gr) {
			super.paintComponent(gr);
			int width =this.getWidth();
			int height = this.getHeight();
			int imgWidth = image.getWidth(this);
			int imgHeight = image.getHeight(this);
			//이미지의 각 각의 부분
			gr.drawImage(image, 0, 0,	width/2-5, height/2-5, 0, 0, imgWidth/2, imgHeight/2, this);
			gr.drawImage(image, width/2+5, 0,	width, height/2-5, imgWidth/2, 0, imgWidth, imgHeight/2, this);
			gr.drawImage(image, 0, height/2+5,	width/2-5, height, 0, imgHeight/2, imgWidth/2, imgHeight, this);
			gr.drawImage(image, width/2+5, height/2+5,	width, height, imgWidth/2, imgHeight/2, imgWidth, imgHeight, this);
		}
	}
	public static void main(String[] args) {
		new Main11();
	}
}
