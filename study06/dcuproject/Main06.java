package dcuproject;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
 
 
public class Main06 extends JFrame{
 
    JLabel label; 
    String str = "Love Java";
    Main06(){
        setTitle("14106854 이승훈"); // 제목 지정
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 닫기 버튼을 눌렀을 시 화면 닫기
         
        label= new JLabel("Love Java");
         
        // Jabel 컴포넌트 생성 후 KeyListener를 단다.
        label.addKeyListener(new MyKeyController());
         
        label.setSize(200,50);
        add(label);
        setSize(400,200);
        setVisible(true);
        label.requestFocus();
        // 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
         
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Main06();
    }
    class MyKeyController extends KeyAdapter{//키보드 keyonpress 제어
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) { 
                case 37: //key이벤트가 왼쪽이였다면
                    label.setText(str); // str 한칸씩 앞으로 당김
                    str = str.substring(1)+str.substring(0, 1);
                    break;
                default:
                    break;
            }
        }
    }
 
}