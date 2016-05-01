package workerThread;

import java.util.LinkedList;
import java.util.Queue;

import philosophes.Utils;

public class BlockingQueue<T> {

	
	int fullSize =10;
	private Queue<T> queue = new LinkedList<T>();
	
	public T take(){
		synchronized (queue) {
		while(queue.isEmpty()){
			try {
				queue.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return queue.poll();
		}
	}
	public void put(T item){
		if (queue.size()>fullSize){
			System.out.println("Unable to add any more tasks");
			Utils.pause(10_000);
		}
		else {
			synchronized (queue) {
				queue.offer(item);
				queue.notify();
			}
		}
	}
	
	public int size(){
		return queue.size();
	}
	
	
}
