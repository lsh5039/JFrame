package dcuproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main09 extends JFrame {
	JRadioButton[] rb = new JRadioButton[6];
	ImageIcon[] icon = {//이미지 절대주소를 담는 배열
			new ImageIcon("C:\\dcu_java/실습_이미지/apple.jpg"),
			new ImageIcon("C:\\dcu_java/실습_이미지/banana.jpg"),
			new ImageIcon("C:\\dcu_java/실습_이미지/cherry.jpg"),
			new ImageIcon("C:\\dcu_java/실습_이미지/kiwi.jpg"),
			new ImageIcon("C:\\dcu_java/실습_이미지/mango.jpg"),
			new ImageIcon("C:\\dcu_java/실습_이미지/pear.jpg") 
			};
	String[] str = { "사과", "바나나", "체리", "키위", "망고","배" };
	JLabel imgLa;

	Main09() {
		setTitle("14106854 이승훈");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setBackground(Color.GRAY);
		ButtonGroup g = new ButtonGroup();
		MyItemListener l = new MyItemListener();
		imgLa = new JLabel(icon[0]);
		for (int i = 0; i < rb.length; i++) {
			rb[i] = new JRadioButton(str[i]);
			rb[i].addItemListener(l);
			g.add(rb[i]);
			p.add(rb[i]);
		}
		rb[0].setSelected(true);
		add(p, BorderLayout.NORTH);
		add(imgLa);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main09();
	}
	
	
	
	class MyItemListener implements ItemListener {
		@Override public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.DESELECTED)
				return;
			if(rb[0].isSelected()) {//선택됐을때의 해당 배열의 이미지 값 출력
				imgLa.setIcon(icon[0]);
			}else if(rb[1].isSelected()) {
				imgLa.setIcon(icon[1]);
			}else if(rb[2].isSelected()) {
				imgLa.setIcon(icon[2]);
			}else if(rb[3].isSelected()) {
				imgLa.setIcon(icon[3]);
			}else if(rb[4].isSelected()) {
				imgLa.setIcon(icon[4]);
			}else if(rb[5].isSelected()) {
				imgLa.setIcon(icon[5]);
			}
		}
	}
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			if(str.equals("추가")) {
				
			}else if(str.equals("취소")) {
				
			}
			
		}
		
	}
		
	}

		
	
	
	

