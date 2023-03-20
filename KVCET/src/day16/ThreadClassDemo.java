package day16;

public class ThreadClassDemo extends Thread
{

	public static void main(String[] args) 
	{
		ThreadClassDemo thread = new ThreadClassDemo(); //new
		ThreadClassDemo thread1 = new ThreadClassDemo();
		thread.start();
		thread1.start();
		System.out.println("In Main Method");
	}
	
	public void run()
	{
		System.out.println("In Run Method");
	}

}
