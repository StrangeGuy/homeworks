package inheritance;

public class SpecificationExample {
static abstract class Animal{
	abstract void move();
	abstract void makeNoize();
	}
static class Lion extends Animal{

	@Override
	void move() {
		System.out.println("Runing");
		
	}

	@Override
	void makeNoize() {
		System.out.println("Roaring");
	}
	
}
}
