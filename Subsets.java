
import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {

	public static void main(String[] args) {
		int[] num = {1, 2, 3};
		subsets(num);
	}
	
	static void subsets(int[] num) {
		ArrayList<Integer> path = new ArrayList<Integer>();
		Arrays.sort(num);
		subsetsHelper(path, num, 0);
	}
	
	static void subsetsHelper(ArrayList<Integer> path, int[] num, int pos) {
		outputToResult(path);
		
		for (int i = pos; i < num.length; i++) {
			path.add(num[i]);
			subsetsHelper(path, num, i + 1);
			path.remove(path.size() - 1);
		}
	}

	private static void outputToResult(ArrayList<Integer> path) {
		System.out.println(path);
	}
	
}
