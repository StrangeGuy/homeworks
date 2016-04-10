package homework160410;

import java.util.Arrays;

public class BinaryColumn {

	public static void main(String[] args) {
		if(args == null){
			System.out.println("An error occured! No args at all. Please, contact me");
			System.exit(1);
		}
		if(args.length == 0){
			System.out.println("Usage: BinaryColumn<number>");
			System.exit(0);
		}
		else{
			System.out.println(Arrays.toString(args));
			for(int argument = Integer.parseInt(args[0]);argument!=0;){
				System.out.println(argument%2);
				argument >>= 1;
			}
			
		}

	}

}
