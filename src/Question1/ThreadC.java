package Question1;

public class ThreadC extends Thread {

	public void run() {
		for (int i=1; i<=500; i++)
		{
			System.out.println("\t From ThreadC : i = " + i );
		}

		System.out.println("Exit from C");
	}
}
