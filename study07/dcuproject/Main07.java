package dcuproject;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
 
 
//JLavel을 활용하여 "Lobe Java"를 출력하고, "Love Java" 글자 위에 마우스를 올려 마우스 휠을 위로 굴리면 글자가 작아지고,
//아래로 굴리면 글자가 커지도록 프로그램을 작성하라. 폰트 크기는 한 번에 5픽셀씩 작아지거나 커지도록 하고, 5픽셀 이하로 작아지지않도록 하라.
 
public class Main07 extends JFrame{
    JLabel label; 

    Main07(){
        setTitle("14106854 이승훈"); // 제목 지정
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 닫기 버튼을 눌렀을 시 화면 닫기
         
        label= new JLabel("Love Java");
        
        label.setSize(200,50);
        label.setFont(new Font("Arial",Font.PLAIN,16));
        // Arial 폰트로 16픽셀 크기로 초기화
         
        label.addMouseWheelListener(new MyMouseWheelEvents());

         
        add(label);
        setSize(400,200);
        setVisible(true);
        label.requestFocus();
        // 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
         
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Main07();
    }
     
    class MyMouseWheelEvents implements MouseWheelListener{
        Font font = null;
        int size; // label의 font size 구하기
        int wheel = 0;
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {//마우스 휠 이벤트 제어

        	font = label.getFont();
            size =font.getSize();
            wheel = e.getWheelRotation();//휠 이 양수면 위로, 음수면 아래
            
            if (wheel<0 && size>5) {label.setFont(new Font("Arial", Font.PLAIN,size-5));}
            else  {label.setFont(new Font("Arial", Font.PLAIN,size+5));}
        }
         
    }
 
}