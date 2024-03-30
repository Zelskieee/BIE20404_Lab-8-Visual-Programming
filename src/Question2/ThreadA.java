package Question2;

public class ThreadA implements Runnable {

	public void run() {
		for (int i=1; i<=500; i++)
		{
			System.out.println("\t From ThreadA : i = " + i );
		}

		System.out.println("Exit from A");
	}

}
