import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		int[] arr2 = {1, 2, 4, 3, -2, 20, 30, 10, 231, -1238};
		
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
				break;
			}
			else {
				System.out.println(arr2[i] + " is not even");
			}
		}
		
		ArrayList<String> a = new ArrayList<>();
		a.add("mandy");
		a.add("mieu");
		a.add("academy");
		a.add("selenium");
		System.out.println(a.get(3));
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("***********");
		for (String val : a) {
			System.out.println(val);
		}
		System.out.println(a.contains("selenium")); 
		
		
		// convert from array to List
		String[] name = {"rahul" , "shetty", "selenium"};
		System.out.println(name[0] == "rahul");
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("selenium"));
	}

}
