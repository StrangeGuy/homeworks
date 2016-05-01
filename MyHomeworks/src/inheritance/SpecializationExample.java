package inheritance;

public class SpecializationExample {
static class Monster{
boolean angry;
	public void scarePunyHuman(){
		System.out.println("Arrgh");
	}
	public void getAngry(){
		angry = true;
	}
	public void crush(){
		System.out.println("Crushing!");
	}
}
static class Dragon extends Monster{
	@Override
	public void scarePunyHuman() {
		// TODO Auto-generated method stub
		super.scarePunyHuman();
		breathFire();
	}

	@Override
	public void getAngry() {
		// TODO Auto-generated method stub
		super.getAngry();
		breathFire();
	}
	
	private void breathFire() {
		// TODO Auto-generated method stub
		
	}
}
}
