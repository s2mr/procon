import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int ans=0;
		String str = scanner.nextLine();
		ans += Integer.parseInt(str);
		
		str = scanner.nextLine();
		String[] arr = str.split(" ", 0);
		ans += Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
		
		str = scanner.nextLine();
		
		System.out.println(String.format("%d %s", ans,str));
	}
}
