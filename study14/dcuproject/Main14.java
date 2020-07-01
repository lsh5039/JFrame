package dcuproject;

import java.util.Scanner;

class CountRun implements Runnable{

	@Override
	public void run() {
		System.out.println("14106854 이승훈");
		System.out.println("스레드 실행 시작");
		for(int i=0;i<11;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("종료");
		
	}
	
}


public class Main14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("키 입력>>");
		sc.nextLine();
		
		CountRun cr =new CountRun();
		Thread td = new Thread(cr);
		td.start();
	}
}
