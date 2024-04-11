
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		int num = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(num + " is the value stored in the num variable");
		System.out.println(website);
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 3;
		arr[4] = -2;
		
		int[] arr2 = {1, 2, 4, 3, -2, 20, 30, 10, 231, -1238};
		
		System.out.println(arr2[2]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] name = {"mandy", "mieu", "selenium"};
		
//		for (int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//		}
		
		for (String s : name) {
			System.out.println(s);
		}
	}

}
