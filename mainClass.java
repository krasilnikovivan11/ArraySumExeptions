import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class mainClass  {
	private static String [][] a = new String[][] {
		{"1","2","3","4"},{"5","6","7","8"}
		};
		
	private String [][] b = new String[][] {
		{"1","2","3"},{"3","4","8","3"}
		};
	public static void main(String[] args){
	
	int s = summ(a);
	System.out.print(s);

	}
	public static int summ(String [][] ar) {
		int sum = 0;
		for(int i = 0;i<ar.length;i++) {
			for(int j = 0;j<ar[1].length;j++) {
				String s = ar[i][j];
				sum += Integer.parseInt(s);
			}
		}
		
		return sum;
	}
	public boolean numCheck(String str) {
		try {
			Integer.parseInt(str);
		}
		catch(NumberFormatException nfe) {
			return false;
		}
		return true;
	}

}
