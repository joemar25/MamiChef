import java.util.Scanner;

class VOLCONTROL {

	static void check(int x, int y) {
		if (x > y)
			System.out.println(x - y);
		else
			System.out.println(y - x);
	}

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t > 0) {
			int x = in.nextInt();
			int y = in.nextInt();
			check(x, y);
			t--;
		}
		in.close();
	}
}