package inheritance;

public class ExtentionExample {
   
	static class Car{
		public void startCar(){
			System.out.println("Car started");
		}
		public void stopCar(){
			System.out.println("Car stoped");
		}
	}

	static class SportCar extends Car{
		public void goTurbo(){
			System.out.println("Going turbo! Yaaa-hooooee!");
		}
	}
	
	
}
