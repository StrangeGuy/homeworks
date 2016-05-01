package inheritance;

public class VariationExample {
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
	
	static class Orc extends Monster{

		
		public void scarePunyHumanOrcishStyle() {
			System.out.println("ME GONNA KILL YAAAAH!!!");
			scarePunyHuman();
		}

	
	
}
}
