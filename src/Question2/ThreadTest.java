package Question2;

import java.lang.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

public class ThreadTest {

	public static void main(String[] args) {
		
		Runnable thread1 = new ThreadA();
		Runnable thread2 = new ThreadB();
		Runnable thread3 = new ThreadC();
		
		ExecutorService threadExecutor = Executors.newFixedThreadPool( 3 ); 
		threadExecutor.execute(thread1);
		threadExecutor.execute(thread2);
		threadExecutor.execute(thread3);
		
		threadExecutor.shutdown();
	}
}
