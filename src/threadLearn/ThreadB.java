package threadLearn;

public class ThreadB extends Thread{
	private Service service;
	public ThreadB(Service s){
		this.service=s;
	}
	@Override
	public void run(){
		service.setUsernamePassword("b", "bb");
	}

}
