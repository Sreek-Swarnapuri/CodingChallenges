import java.util.Scanner;

public class CountingValleys {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	static int countingValleys(int n, String s) {
		
		if(n<=1)
			return 0;
		
		int seaLevel = 0;
		int valleyCount = 0;
		
		for(int i=0; i<n; i++) {
			if(s.charAt(i) == 'U')
				seaLevel++;
			else
				seaLevel--;
			
			if(seaLevel==0 && i>=1 && s.charAt(i) == 'U')
				valleyCount++;
		}
		
		return valleyCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of steps: ");
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		System.out.println("Enter the steps taken:");
		String s = scanner.nextLine();
		
		int result = countingValleys(n, s.toUpperCase());
		
		System.out.println("Number of vallues are " + result);
		
		scanner.close();
		
	}

}
