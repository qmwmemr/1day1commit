package exam50;

import java.util.Arrays;
import java.util.Scanner;

public class dd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String input = scan.next();

		Character[] r = { 'L', 'R', 'U', 'D' };
		Character[] o = { 'R', 'U', 'D' };
		Character[] e = { 'L', 'U', 'D' };

		int cnt = 0;
		int cnt2 = 0;
		int cnt3 = 0;

		for (char a : input.toCharArray()) {
			if (Arrays.asList(r).contains(a))
				cnt++;
		}

		if (cnt == input.length()) {

			for (int i = 0; i < input.length(); i++) {
				if (i % 2 == 0) {
					if (Arrays.asList(o).contains(input.charAt(i)))
						cnt2++;
				} else {
					if (Arrays.asList(e).contains(input.charAt(i)))
						cnt3++;
				}
			}
			if (cnt2 + cnt3 == input.length())
				System.out.println("Yes");
			else
				System.out.println("No");

		}

	}
}
