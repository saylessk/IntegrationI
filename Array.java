import java.util.Scanner;

public class Array {
	
	public static void main(int x) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int y = reader.nextInt();
		int[] ia = new int [y];
		for (int i = 0; i < ia.length; i++) ia[i] = i;
		int sum = 0;
		for (int e : ia) sum += e;
		
		System.out.println("If you added every number from 1-" + y + " you would get...");
		
		System.out.println(sum);
	}
	
	public static void main1(String args[]) {
		int x, y, z;
		System.out.println("Enter three integers ");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		if (x > y && x > z)
			System.out.println(x + " is the largest number.");
		else if (y > x && y > z)
			System.out.println(y + " is the largest number.");
		else if (z > x && z > y)
			System.out.println(z + " is the largest number.");
	}
	

}
