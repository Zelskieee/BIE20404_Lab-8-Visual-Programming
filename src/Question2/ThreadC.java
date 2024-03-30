package Question2;

public class ThreadC implements Runnable {

	public void run() {
		for (int i=1; i<=500; i++)
		{
			System.out.println("\t From ThreadC : i = " + i );
		}

		System.out.println("Exit from C");
	}

}
