
class Hi1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
class Hello1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
public class Thread_Demo1 {

	public static void main(String[] args) 
	{
		Hi1 obj1=new Hi1();
		Hello1 obj2=new Hello1();
		
	    //Thread t1=new Thread(obj1);
	  
	    //Thread t2=new Thread(obj2);
		obj1.start();
		try{Thread.sleep(1000);}catch(Exception e) {}
		
		obj2.start();
	}

}


