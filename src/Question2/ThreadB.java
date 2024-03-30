package Question2;

public class ThreadB implements Runnable {

	public void run() {
		for (int i=1; i<=500; i++)
		{
			System.out.println("\t From ThreadB : i = " + i );
		}

		System.out.println("Exit from B");
	}

}
