package threadLearn;

public class CountOperate extends Thread{
	
	public CountOperate(){
		System.out.println("CountOperate ----begin");
		System.out.println("Thread.currentThread.getName()"+Thread.currentThread().getName());
		System.out.println("this.getName()"+this.getName()+" this.getclass=="+this.getClass());
		System.out.println("CountOperate -----end");
	}
	@Override
	public void run(){
		System.out.println("run ----begin");
		System.out.println("Thread.currentThread.getName()"+Thread.currentThread().getName());
		System.out.println("this.getName()"+this.getName()+" this.getclass=="+this.getClass());
		System.out.println("run -----end");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOperate co=new CountOperate();
		co.setName("T");
		co.start();

	}

}
