import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		int N = Integer.valueOf(line.split(" ", 0)[0]);
		int Q = Integer.valueOf(line.split(" ", 0)[1]);
		
		char[] alphas = new char[N];
		int i=0;
		for (char c='A'; c<'A'+N; c++) {
			alphas[i] = c;
			i++;
		}
		
		System.out.println(alphas);
		
		i=1;
		for (int ai=0; ai<Q; ai++) {
			// ai ->　試行回数
			
			char al1 = alphas[i-1];
			char al2 = alphas[i];
			
			System.out.println(String.format("? %c %c", al1, al2));
			
			char which = scanner.nextLine().charAt(0);
			
			
			if (which=='>') {
				char tmp;
				tmp = al1;
				alphas[i-1] = al2;
				alphas[i] = al1;
				System.out.println('>');
			} else if (which=='<') {
				System.out.println("<");
			}
			
			if (i==alphas.length-1) {
				i=0;
			}
			System.out.println(alphas);
			i++;
		}
		
		// System.out.println(String.format("N:%d Q:%d", N, Q));
	}
}
