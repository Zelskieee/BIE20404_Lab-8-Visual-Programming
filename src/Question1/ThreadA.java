package Question1;

public class ThreadA extends Thread {

	public void run() {
		for (int i=1; i<=500; i++)
		{
			System.out.println("\t From ThreadA : i = " + i );
		}

		System.out.println("Exit from A");
	}

}

