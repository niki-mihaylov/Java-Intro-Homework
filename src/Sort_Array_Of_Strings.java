import java.util.Arrays;

public class Sort_Array_Of_Strings {

	public static void main(String[] args) {
		System.out.print("Enter n: ");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int n = scanner.nextInt();
		String[] arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.next();
		}
		Arrays.sort(arr);
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
