package cross;

public class CrossMatrix {

	public static void main(String[] args) {
		if (args.length == 0){
			System.out.println("Incorrect usage of the program. No parmeter");
			System.exit(0);
		}
		int size = Integer.parseInt(args[0]);
		char[][] matrix = new char[size][size];
		for(int i = 0; i<size; i++){
			for(int j =0;j<size; j++){
				matrix [i][j] = i==size/2? '-' : j==size/2? '|': '0';
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	
}
