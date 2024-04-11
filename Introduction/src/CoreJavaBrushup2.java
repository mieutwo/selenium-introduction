
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
	}

}
