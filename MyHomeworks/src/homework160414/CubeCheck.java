package homework160414;

public class CubeCheck {

	public static void main(String[] args) {
		
		int[][][] cube = {{ 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
			}, 
				{ 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
				{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
		},        
				{ 
			{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
			{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
			{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
			{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
			{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
			{ (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26), (int)(Math.random()*26) }, 
		}};        
	OUTER : for (int layer = 0; layer < cube.length; layer++) {
		for (int row = 0; row < cube[layer].length; row++) {
			for (int col = 0; col < cube[layer][col].length; col++) {
				System.out.print(cube[layer][row][col] + " ");
				if(cube[layer][row][col] == 0){
					System.out.println("Zero at layer " + layer);
					continue OUTER;
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	}

}
