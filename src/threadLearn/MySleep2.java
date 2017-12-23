package threadLearn;

public class MySleep2 extends Thread{
	@Override
	public void run(){
	try {
		System.out.println("run threadName=="+this.currentThread().getName()+" begin==="+System.currentTimeMillis());
		Thread.sleep(2000);
		System.out.println("run threadName=="+this.currentThread().getName()+" end==="+System.currentTimeMillis());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySleep2 ms=new MySleep2();
		System.out.println("begin=="+System.currentTimeMillis());
		ms.start();
		System.out.println("end=="+System.currentTimeMillis());
	}

}
