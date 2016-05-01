package philosophes;

public class Utils {
	public static void pause(int par) {
		try {
			Thread.sleep(par);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}}
