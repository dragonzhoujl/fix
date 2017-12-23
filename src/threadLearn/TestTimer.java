package threadLearn;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TestTimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTask task1=new MyTask();
		MyTask task2=new MyTask();
		System.out.println("当前时间为："+new Date());
		Calendar ca=Calendar.getInstance();
		ca.add(Calendar.SECOND, 10);
		Calendar ca2=Calendar.getInstance();
		ca2.add(Calendar.SECOND, 15);
		//ca.set(Calendar.SECOND, ca.get(Calendar.SECOND)-10);
		//Timer t=new Timer(true);
		System.out.println("计划执行时间为："+ca.getTime());
		System.out.println("计划执行时间为："+ca2.getTime());
		Timer t=new Timer();
		t.schedule(task1, ca.getTime());
		t.schedule(task2, ca2.getTime());
		
	}

}
