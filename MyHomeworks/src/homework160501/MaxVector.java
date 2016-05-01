package homework160501;

import java.util.Arrays;

public class MaxVector {

	public static void main(String[] args) {
		int[][] matrix = generateMatrix(5, 4, 100, -100);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		int[] vectorMax = calculateVector(matrix);
		System.out.println(Arrays.toString(vectorMax));

	}

	
	public static int[][] generateMatrix(int length,int height, int max,int min){
		
		int[][] matrix = new int[height][length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j]= min + (int)(Math.random()*(max-min));
			}
		}
		return matrix;
		
	}
	
	static int[] calculateVector(int[][] matrix) {
		int[] vector = new int[matrix.length];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if( matrix[i][j]>max) max = matrix [i][j];
			}
			
			vector[i] = max;
			max = Integer.MIN_VALUE;
		}
		
		return vector;
		
	}
	
}
