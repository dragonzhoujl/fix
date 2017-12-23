package threadLearn;

public class ThreadA extends Thread{
	private Service service;
	public ThreadA(Service s){
		this.service=s;
	}
	@Override
	public void run(){
		service.setUsernamePassword("a", "aa");
	}

}
