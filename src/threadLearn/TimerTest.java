package threadLearn;

import java.util.Calendar;
import java.util.Timer;

public class TimerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTaskA a=new MyTaskA();
		MyTask task=new  MyTask();
		Calendar ca=Calendar.getInstance();
		ca.add(Calendar.SECOND, 10);
		Calendar ca1=Calendar.getInstance();
		ca1.add(Calendar.SECOND, 11);
		System.out.println("计划执行时间为："+ca.getTime());
		System.out.println("计划执行时间为："+ca1.getTime());
		Timer t=new Timer();
		t.schedule(a, ca.getTime());
		t.schedule(task, ca1.getTime(),4000);
		
	}

}
