import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class mainClass  {
	private static String [][] a = new String[][] {
		{"1","2","3","4"},{"5","6","7","8"},
		{"1","2","3","4"},{"5","6","7","8"}
		};

	public static void main(String[] args)throws MyArrayDataException, MyArraySizeException{
	try {
	int s = summ(a);
	System.out.print(s);
	}
	catch(IllegalArgumentException e) {
		Logger.getLogger(mainClass.class.getName()).log(new LogRecord(Level.WARNING,"Элемент массива не число"));
		throw new MyArrayDataException(e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		Logger.getLogger(mainClass.class.getName()).log(new LogRecord(Level.WARNING,"Массив не того размера"));
		throw new MyArraySizeException(e);
	}
	

	}
	public static int summ(String [][] ar) {
		int sum = 0;
		if(ar.length != 4 || ar[0].length != 4) throw new ArrayIndexOutOfBoundsException("the size of matrix isn't 4x4");
		for(int i = 0;i<ar.length;i++) {
			for(int j = 0;j<ar[0].length;j++) {
				String s = ar[i][j];
				if(numCheck(s)) {
				sum += Integer.parseInt(s);
				}
				else throw new IllegalArgumentException("the value of element 'x' и 'y' isn't number x = "+i+" y = "+j);
			}
		}
		
		return sum;
	}
	public static boolean numCheck(String str) {
		try {
			Integer.parseInt(str);
		}
		catch(NumberFormatException nfe) {
			return false;
		}
		return true;
	}

}
