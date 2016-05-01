package inheritance;

import java.util.ArrayList;

public class ConstructionExample {
static class CatsList extends ArrayList<Cat>{

	@Override
	public Cat get(int index) {
		int random =(int) Math.random()*index;
		return super.get(random);
	
	}

}
static class Cat{
	public void meow(){
		System.out.println("Meooooow");
	}
}}
