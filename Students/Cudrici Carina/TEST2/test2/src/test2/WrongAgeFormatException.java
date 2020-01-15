package test2;

public class WrongAgeFormatException extends FileReadException{

	
	public WrongAgeFormatException() {
		super("Varsta nu este valida");
	}
	
}
