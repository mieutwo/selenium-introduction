
public class MethodsDemo {

	public static void main(String[] args) {
//		MethodsDemo d = new MethodsDemo();
//		String name = d.getData();
		
		String name = getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
	}

	// static gives class-level access to method
	public static String getData() {
		System.out.println("hello world");
		return "rahul shetty";
	}
}
