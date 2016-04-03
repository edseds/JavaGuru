package perfectnumber;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfectNumber {

	public enum STATE {
		DEFICIENT, PERFECT, ABUNDANT;
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println(process(2)); }
	 */

	public static List<Integer> divisors(int n) {

		// Set<Integer> result;

		return IntStream.range(1, n + 1).filter((s) -> n % s == 0).boxed().collect(Collectors.toList());

		// Old solution:
		/*
		 * for (int i = 1; i <= n; i++) { if (n % i == 0) { result.add(i); } }
		 * 
		 * return result;
		 */
	}

	public static STATE process(int n) {
		// int sum = 0;

		// Set<Integer> result = divisors(n);
		int sum = divisors(n).stream().filter((s) -> s != n).reduce(0, (a, b) -> a + b);

		// .range(1, divisors(n))
		// .filter((s) -> s !=n);

		/*
		 * for (int i : divisors(n)) { if (i != n) sum += i; }
		 */

		if (sum < n) {
			return STATE.DEFICIENT;
		} else if (sum == n) {
			return STATE.PERFECT;
		} else {
			return STATE.ABUNDANT;
		}
	}

}
