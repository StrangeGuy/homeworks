package workerThread;

import philosophes.Utils;

public class WorkerThread {

private final class TaskRunner implements Runnable{
	public void run() {
		while(true){
			tasks.take().run();
		}
		
	}}
	
	private Thread thread;
	
	BlockingQueue<Runnable> tasks =new BlockingQueue<>();

	public WorkerThread() {
		thread = new Thread(new TaskRunner());
		thread.start();
	}
	
	public void execute(Runnable runnable) {
		tasks.put(runnable);
	}

	public static void main(String[] args) {
		System.out.println("start");

		WorkerThread worker = new WorkerThread();

		Utils.pause(3000);

		worker.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("hello from "
						+ Thread.currentThread().getName());
			}
		});

	}
	}

