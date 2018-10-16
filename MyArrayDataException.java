
public class MyArrayDataException extends Exception {
public MyArrayDataException(Throwable e) {
	initCause(e);
}
}
