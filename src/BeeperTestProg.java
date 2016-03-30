import acm.program.ConsoleProgram;

public class BeeperTestProg extends ConsoleProgram{

	public void run(){
		int[] arr = new int[4];
		readArray(arr);
		printArray(arr);
	}

	private void readArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = readInt("?: ");
		}
	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
