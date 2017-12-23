package threadLearn;

public class SleepTest extends Thread{
	@Override
	public void run(){
		super.run();
		try{
			for(int i=0;i<100000;i++){
				System.out.println("i==="+(i+1));
			}
			System.out.println("run begin!");
			Thread.sleep(200000);
			System.out.println("run end !");
		}catch(Exception e){
			System.out.println("sleeping interrupted "+this.isInterrupted());
			e.printStackTrace();
		}
	}

}
