package threadLearn;

public class InterruptedTest extends Thread{
	@Override
	public void run(){
		super.run();
		for(int i=0;i<500000;i++){
			if(this.interrupted()){
				System.out.println("已经是停止状态了，我要退出了！");
				break;
			}
			System.out.println("i=="+(i+1));
		}
		System.out.println("i am outside for circle");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InterruptedTest it=new InterruptedTest();
			it.start();
			Thread.sleep(1000);
			it.interrupt();
			//System.out.println("is stop1?==="+it.interrupted());
			//System.out.println("is stop2?==="+it.interrupted());
			System.out.println("is stop1?==="+it.isInterrupted());
			System.out.println("is stop2?==="+it.isInterrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		
	}

}
