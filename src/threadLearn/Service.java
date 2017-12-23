package threadLearn;

public class Service {
	private String username;
	private String password;
	//private String newString=new String();
	public void setUsernamePassword(String username,String password){
		String newString =new String();
		synchronized(newString){
			
			try {
				System.out.println("线程名称为"+Thread.currentThread().getName()+" 在"+System.currentTimeMillis()+"进入同步快");
				this.username=username;
				Thread.sleep(1000);
				this.password=password;
				System.out.println("线程名称为"+Thread.currentThread().getName()+" 在"+System.currentTimeMillis()+"离开同步快");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
