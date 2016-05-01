package inheritance;

public class RestrictionExample {
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
	static class Goblin extends Monster{
		public void crush(){
			throw new UnsupportedOperationException();
		}
	}
}
