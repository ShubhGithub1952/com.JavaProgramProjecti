package patternProgram;

public class DiamondPatternTest2 {
	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n-1 ; j++) {
				if (j>=i) {
					System.out.print(" *");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
