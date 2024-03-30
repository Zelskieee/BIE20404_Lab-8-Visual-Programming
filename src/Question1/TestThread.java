package Question1;

import java.lang.*;
import java.util.concurrent.*;

public class TestThread {

	public static void main(String[] args) {
		
	// Create threads
	Thread thread1 = new ThreadA();
	Thread thread2 = new ThreadB();
	Thread thread3 = new ThreadC();
	
	// Start threads
	thread1.start();
	thread2.start();
	thread3.start();
	} 
}

