package simplejavaproblems;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author Jitesh 
 *
 */
public class ExecutorServiceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		for (int i = 0; i <= 10; i++) {
			executorService.execute(new ExamRunnable(i));
		}

		executorService.shutdown();

		while (!executorService.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}
}

class ExamRunnable implements Runnable {
	int i;

	public ExamRunnable(int i) {
		this.i = i;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + ": " + i);

	}

}
