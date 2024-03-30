package Question1;

public class ThreadB extends Thread {

	public void run() {
		for (int i=1; i<=500; i++)
		{
			System.out.println("\t From ThreadB : i = " + i );
		}

		System.out.println("Exit from B");
	}
}
