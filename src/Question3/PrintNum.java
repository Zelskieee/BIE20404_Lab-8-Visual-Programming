package Question3;

import java.lang.*;

public class PrintNum implements Runnable
{
	private int lastNum;

	/** Construct a task for printing 1, 2, ... i */
	public PrintNum(int n)
	{
		lastNum = n;
	}

	@Override /** Tell the thread how to run */
	public void run()
	{
		Thread thread4 = new Thread(new PrintChar('c',40));
		thread4.start();
		for (int i = 1; i <= lastNum; i++)
		{
			System.out.print(" " + i);
			try {
				if(i>=50) {
					thread4.join();
				}
			} catch (InterruptedException ex) {}
		}
	}
}
