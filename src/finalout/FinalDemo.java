package finalout;

//When a class is declared final, you cannot extend it.
final class FinalDemo {
	
	//A final variable will always have the same value
	//A final variable that is not initialized at the time of declaration is known as blank final variable
	final String subject="Andriod";
	
	//final method can be inherited but you cannot override it
	 final void work(){
		 System.out.println("I am in final Method of a Final Class with Final Variable subject whose value is "+subject);
	}  

}
