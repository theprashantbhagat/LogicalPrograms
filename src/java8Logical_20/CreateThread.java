package java8Logical_20;


public class CreateThread {

	
	//using lambda create thread
	
	public static void main(String[] args) {
		
		Runnable thread1=()->{
			
			for(int i=0;i<=10;i++) {
				
				System.out.println("value of i is:"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t=new Thread(thread1);
		t.setName("Prashant");
		t.start();
		
		
		
		
	}
	
	
}
