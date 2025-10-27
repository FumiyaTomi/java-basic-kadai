package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		String myChoice;
		String cpuChoice;
		Scanner sc = new Scanner(System.in);
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		myChoice = jyanken.getMyChoice(sc);
		cpuChoice = jyanken.getRandom();
		jyanken.playGame(myChoice, cpuChoice);
		sc.close();

	}
}
