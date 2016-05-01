package inheritance;
interface Pet{
	public void scratch();
}
public class MultipleExample {
static class Animal{
	public void move(){
		
	}
}
static class Dog extends Animal implements Pet{

	@Override
	public void scratch() {
		// TODO Auto-generated method stub
		
	}
	
}
}
