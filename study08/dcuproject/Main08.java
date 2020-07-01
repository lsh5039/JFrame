package dcuproject;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//스윙으로 간단한 갬블링 게임을 만들어보자. 아래 그림과 같이 3개의 레이블 컴포넌트가 있다.
//이 컴포넌트에는 각각 0~4까지의 한자리 수가 출력된다. <Enger> 키를 입력할 때마다 3개의 수를 랜덤하게 발생시키고 이 수를 각 레이블에 출력한다.
//그러고 나서 모두 동일한 수인지 판단하여 모두 동일한 수이면 "축하합니다!!"를, 아니면 "아쉽군요"를 출력한다.

public class Main08 extends JFrame{
	JLabel first,second,third, answer;
	Main08(){
		setTitle("14106854 이승훈 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		
		
		setLayout(null); 
		addKeyListener(new MyKeyAdapter());
		
		first = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);//1~3개의 상자에 랜덤 수 지정
		second = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);
		third = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);
		answer = new JLabel("Start Game",SwingConstants.CENTER);//시작화면
		
		first.setBackground(Color.PINK);//컬러
		first.setSize(100,50);
		first.setLocation(40,80);
		first.setFont(new Font("Arial",Font.PLAIN,30));
		first.setOpaque(true);
		
		second.setBackground(Color.PINK);
		second.setSize(100,50);
		second.setLocation(180,80);
		second.setFont(new Font("Arial",Font.PLAIN,30));
		second.setOpaque(true);
		
		third.setBackground(Color.PINK);
		third.setSize(100,50);
		third.setLocation(320,80);
		third.setFont(new Font("Arial",Font.PLAIN,30));
		third.setOpaque(true);
		
		answer.setSize(300,50);
		answer.setLocation(80,150);
		
		
		add(first);
		add(second);
		add(third);
		add(answer);
		
		setVisible(true);
		requestFocus();
		// 포커스 설정
	}
	public static void main(String[] args) {
		new Main08();
	}
	
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == '\n') {//엔터 키 이벤트 핸들러, 0~4의 임의숫자를 비교하여 분기 setText는 str이므로 +""
				first.setText((int)(Math.random()*5)+"");
				second.setText((int)(Math.random()*5)+"");
				third.setText((int)(Math.random()*5)+"");
				
				first.setText((int)3+"");
				second.setText((int)3+"");
				third.setText((int)3+"");
				
				if(first.getText().equals(second.getText())) {//2개의 수가 같다면
					if(second.getText().equals(third.getText()))//하나를 더 비교해 같으면 a=b=c->축하합니다.
						answer.setText("축하합니다.");
					else//a=b, b!=c, 아쉽군요
						answer.setText("아쉽군요");
				}
				else//애초에 틀림 아쉽군요
					answer.setText("아쉽군요");
			
						
			}
		}
	}
	
}
