
public interface Hello {
	
	String sayHello();
	
	default String sayBye() {
		return "Goodbye";
	}
	
	static void greet() {
		System.out.println("Bonjur le monde");
	}

}
