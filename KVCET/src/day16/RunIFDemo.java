package day16;

public class RunIFDemo implements Runnable
{

	public static void main(String[] args) 
	{
		RunIFDemo t = new RunIFDemo();
		RunIFDemo t1 = new RunIFDemo();
		Thread thr = new Thread(t);
		Thread thr1 = new Thread(t1);
		thr.start();
		thr1.start();
		System.out.println("In main Method");
	}
	
	public void run()
	{
		System.out.println("In Run Method");
	}

}
