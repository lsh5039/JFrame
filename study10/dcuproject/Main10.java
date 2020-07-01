package dcuproject;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main10 extends JFrame {
	String[] str = { "사과", "바나나", "체리", "키위", "망고","배" };
	ImageIcon[] imgs = {
			new ImageIcon("C:\\dcu_java/실습_이미지/apple.jpg"),
			new ImageIcon("C:\\dcu_java/실습_이미지/banana.jpg"),
			new ImageIcon("C:\\dcu_java/실습_이미지/cherry.jpg"),
			new ImageIcon("C:\\dcu_java/실습_이미지/kiwi.jpg"),
			new ImageIcon("C:\\dcu_java/실습_이미지/mango.jpg"),
			new ImageIcon("C:\\dcu_java/실습_이미지/pear.jpg") 
			};
	JLabel la = new JLabel();

	Main10() {
		setTitle("14106854 이승훈");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JComboBox<String> combo = new JComboBox<String>(str);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		la.setIcon(imgs[0]);
		c.add(combo);
		c.add(la);
		setVisible(true);
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = combo.getSelectedIndex();
				la.setIcon(imgs[index]);
			}
		});
	}

	public static void main(String[] args) {
		new Main10();
	}
}

