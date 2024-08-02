package q.thread.ex2;

public class Task2 extends Thread {
	// 20미만 짝수 출력
	@Override
	public void run() {
		try {
			for(int i=0; i<20; i++) {
					if(i % 2 == 0) {
						System.out.println(i + " ");
					}
					Thread.sleep(200); // 0.1초동안 지금 쓰레드를 재운다.
				}	
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
		} 
	
}