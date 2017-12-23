package threadLearn;

public class RunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service s=new Service();
		ThreadA a=new ThreadA(s);
		a.setName("A");
		a.start();
		ThreadB b=new ThreadB(s);
		b.start();

	}

}
