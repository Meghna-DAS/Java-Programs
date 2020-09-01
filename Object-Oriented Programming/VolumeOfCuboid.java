import java.util.Scanner;

public class VolumeOfCuboid {
	private static Scanner sc;

	public static void main(String[] args) {
		float depth, width, height, SA, Volume;
		sc = new Scanner(System.in);
		
		System.out.println("\n Please Enter the Depth of a Cuboid : ");
		depth = sc.nextFloat();
		System.out.println("\n Please Enter the Width of a Cuboid : ");
		width = sc.nextFloat();
		System.out.println("\n Please Enter the Height of a Cuboid : ");
		height = sc.nextFloat();
		
		SA = 2 * (depth * width + depth * height + width * height);
		Volume = depth * width * height;
		
		
		System.out.format("\n The Surface area of a Cuboid = %.2f", SA);
		System.out.format("\n The Volume of a Cuboid = %.2f", Volume);
	}
}