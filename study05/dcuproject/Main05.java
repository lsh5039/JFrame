package dcuproject;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class Main05 extends JFrame{
 
	Main05(){
        setTitle("14106854 이승훈"); // 제목 지정
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 닫기 버튼을 눌렀을 시 화면 닫기
         
        JLabel label = new JLabel("Love Java");//초기생성
         
        
        label.addMouseListener(new MyMouseAdapter());
         
        label.setSize(200,50);
        add(label);
        setSize(400,200);
        setVisible(true);
         
    }
    public static void main(String[] args) {
        new Main05();
    }
 
}
class MyMouseAdapter extends MouseAdapter{
    public void mouseEntered(MouseEvent e) {
        JLabel l = (JLabel)e.getSource();//마우스가 hover했을때 이벤트 제어
        l.setText("사랑해");
    }
    public void mouseExited(MouseEvent e) {//마우스가 leave했을떄의 이벤트 제어
        JLabel l = (JLabel)e.getSource();
        l.setText("Love Java");
    }
}
 