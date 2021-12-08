package greeter;

public class Greeter {
	private String format;
	
	public String greet(String guest) {
		System.out.println("greet("+guest+")");
		return String.format(format, guest);
	}
	
	public void setFormat(String format) {
		System.out.println("setFormat("+format+")");
		this.format = format;
	}
	
	
}
