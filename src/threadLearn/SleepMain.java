package threadLearn;

public class SleepMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SleepTest st=new SleepTest();
		st.start();
		//Thread.sleep(200);
		st.interrupt();
		System.out.println("end ");
		

	}

}
