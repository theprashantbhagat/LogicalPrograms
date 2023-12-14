package singleTonDesignPattern;

public class Example {

	
	public static void main(String[] args) {
		
	    Samosa samosa = Samosa.getSamosa();
	    System.out.println(samosa.hashCode());
	}
}
