package dcuproject;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class HangMan {
	 public static void main(String[] args) {
	        int random;
	        Vector<String> wordVector = new Vector<String>();
	        char reGame = 'y'; // 
	        String query="";//랜덤 단어
	        Scanner s = new Scanner(System.in);
	        try {
	            while(reGame=='y') {
	            	Scanner scanner = new Scanner(new FileReader("C:\\Users\\이승훈\\Downloads\\words.txt"));
	            	  while(scanner.hasNext()) {
	              		String word = scanner.nextLine();
	              		wordVector.add(word);
	              	}
	                random = (int)(Math.random()*25143);//난수로 단어 선정
	                for(int i=0;i<random-1;i++) {
	                	query = wordVector.elementAt(random);
	                }
	                System.out.println("지금부터 행맨 게임을 시작합니다.");
	              int result = startGame(query);
	                if(result == 1) {
	                	System.out.println("정답입니다.");
	                	System.out.println("정답은 : "+query);
	                }else if(result == -1) {
	                	System.out.println("5번 실패 하였습니다.");
	                	System.out.println("정답은 : "+query);
	                }
	                System.out.print("Next(y/n)?");
	                reGame=s.next().charAt(0);
	            }
	        }catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	   public static int startGame(String str) {
	        int fail=0; // 실패 cnt
	        int success=0; // 성공 cnt
	        int level=2; //몇 글자를 숨길 것인가
	        char word[] = str.toCharArray();
	        char hidden[] = str.toCharArray();
	        int tmp[] = new int[level];
	        Scanner s = new Scanner(System.in);
	        char ch; // 플레이어에게 입력받는 한 글자
	        for(int i=0;i<level;i++) { // 숨길 인덱스 랜덤 생성
	            tmp[i]=(int)(Math.random()*str.length());
	            for(int j=0;j<i;j++) { // 중복 제거
	                if(tmp[j]==tmp[i]) {
	                    tmp[i]=(int)(Math.random()*str.length());
	                    j=-1;
	                }
	            }
	            hidden[tmp[i]]='-';
	        }
	        int i;
	        while(fail!=5) {
	            System.out.println(hidden);
	            System.out.print(">>");
	            ch=s.next().charAt(0);
	            for(i=0;i<tmp.length;i++) {//글자가 있는가 
	                
	                if(word[tmp[i]]==ch) {
	                    hidden[tmp[i]]=ch;
	                    success++; // 성공 카운트
	                }
	            }
	            if(i==tmp.length) { 
	                fail++; // 실패 
	            }
	            if(success==level) { 
	                break;
	            }
	        }
	        if(fail==5) { 
	            return -1; // 실패
	        } else { 
	            return 1; // 성공
	        }
	    }
}
