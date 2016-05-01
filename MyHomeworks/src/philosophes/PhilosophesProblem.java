package philosophes;

import java.util.ArrayList;
import java.util.List;

public class PhilosophesProblem {
	static class Philosoph implements Runnable{
    String name;
		Chopstick right;
    
		Chopstick left;

	@Override
	public void run() {
		while(true){
		synchronized (right) {synchronized (left) {
			
			eat();}
		}
		rest();}
		
	}

	private void rest() {
		System.out.println(name + " rests");
		Utils.pause(20_000);
		System.out.println(name + " done resting");
		
	}

	private void eat() {
		System.out.println(name + " is eating. He uses chopsticks # " + right.number+  " and "+ left.number);
		Utils.pause(10_000);
		System.out.println(name + " has finished eating");
		
	}
	public Philosoph(String name,Chopstick right,Chopstick left){
		this.name = name;
		this.right = right;
		this.left = left;
	}
	}

	public static void main(String[] args) {
		List<Chopstick> chopsticks = new ArrayList<>();
		chopsticks.add(new Chopstick(0));
		chopsticks.add(new Chopstick(1));
		chopsticks.add(new Chopstick(2));
		chopsticks.add(new Chopstick(3));
		chopsticks.add(new Chopstick(4));
		
		List<Philosoph> philosophes = new ArrayList<>();
		philosophes.add(new Philosoph("Socrates",chopsticks.get(0),chopsticks.get(1)));
		philosophes.add(new Philosoph("Plato",chopsticks.get(1),chopsticks.get(2)));
		philosophes.add(new Philosoph("Aristoteles",chopsticks.get(3),chopsticks.get(2)));
		philosophes.add(new Philosoph("Seneca",chopsticks.get(3),chopsticks.get(4)));
		philosophes.add(new Philosoph("Diogenes",chopsticks.get(0),chopsticks.get(4)));
		
		Thread[] threads = new Thread[5];
		
		for (int i = 0; i < threads.length; i++) {
			Thread t = new Thread(philosophes.get(i));
			t.start();
		}
	}
}
