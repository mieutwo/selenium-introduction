import org.openjdk.jol.vm.VM;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// string is an object
		
		// string literal
//		String s = "Rahul Shetty Academy";
//		String s1 = "Rahul Shetty Academy";
//		System.out.println("The memory address is " + VM.current().addressOf(s));
//		System.out.println("The memory address is " + VM.current().addressOf(s1));
		// Because "Rahul Shetty Academy" already exists in memory, s1 uses the same address
		String s5 = "hello"; // because hello doesn't already exist, a new Object is created
		
		// string with new keyword
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
//		System.out.println("The memory address is " + VM.current().addressOf(s2));
//		System.out.println("The memory address is " + VM.current().addressOf(s3));
		// This will always create a new object if you use new
		// In Java, string is an Object representing a sequence of characters
		
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0].trim());
		System.out.println(splittedString[1].trim());
		//System.out.println(splittedString[2]);
		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
