package threadLearn;

public class MySleep extends Thread{

	public void run(){
		
		try {
			System.out.println("run threadName=="+this.currentThread().getName()+" begin");
			Thread.sleep(2000);
			System.out.println("run threadName=="+this.currentThread().getName()+" end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySleep ms=new MySleep();
		System.out.println("begin=="+System.currentTimeMillis());
		ms.run();
		System.out.println("end=="+System.currentTimeMillis());

	}

}
