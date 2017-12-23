package threadLearn;

public class MyIsAlive extends Thread{
	@Override
	public void run(){
		System.out.println("run=="+this.isAlive());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyIsAlive ia=new MyIsAlive();
		System.out.println("begin==="+ia.isAlive());
		ia.start();
		System.out.println("end==="+ia.isAlive());
	}

}
