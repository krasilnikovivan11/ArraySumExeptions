
public class MyArraySizeException extends Exception {
public MyArraySizeException(Throwable e) {
	initCause(e);
}
}
