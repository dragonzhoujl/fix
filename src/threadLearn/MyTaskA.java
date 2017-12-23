package threadLearn;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("begin time ==="+new Date());
			Thread.sleep(2000);
			System.out.println("end time ===="+new Date());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
