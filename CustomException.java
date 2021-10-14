package practice_24;



class Custome_Exception extends Exception {
	
	public Custome_Exception(){
		super();
	}
 
}
public class CustomException {
	
	static void meth(String a) throws Custome_Exception {
		
		if(a.length() <5) {
			throw new Custome_Exception();
		}
	}
	
	public static void main(String[] args) throws Custome_Exception {
		meth("ro");
	}

}
