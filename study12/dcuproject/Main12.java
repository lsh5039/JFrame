package dcuproject;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main12 extends JFrame{
	private ImgP panel =new ImgP();
	public Main12() {
		setTitle("14106854 이승훈");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		panel.setFocusable(true);
		panel.requestFocus();
		setSize(500,500);
		setVisible(true);
	}
	class ImgP extends JPanel{
		private ImageIcon icon = new ImageIcon("C:\\\\dcu_java/실습_이미지/apple.jpg");
		private Image img = icon.getImage();
		int x,y =50;
		
		public void paintComponent(Graphics gr) {
			super.paintComponent(gr);
			Container con = getContentPane();
			gr.setClip(x,y,50,50);
			gr.drawImage(img, 0, 0, getWidth(), getHeight(),this);
			addKeyListener(new KeyAdapter() {
				
				public void keyPressed(KeyEvent e) {
					int keyCode = e.getKeyCode();
					switch(keyCode) {
					case 38://위쪽
						y-=10;
						break;
					case 40://아래
						y+=10;
						break;
					case 39://오른쪽
						x+=10;
						break;
					case 37://왼쪽
						x-=10;
						break;
					}
					repaint();
				}
			});
		}
	}
	public static void main(String[] args) {
		new Main12();
	}
}
