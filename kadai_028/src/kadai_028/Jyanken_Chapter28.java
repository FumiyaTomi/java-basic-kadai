package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice(Scanner sc) {
		String myChoice;
		
		System.out.println("自分のじゅんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		do {
			myChoice = sc.next();
			if (!("r".equals(myChoice) || "s".equals(myChoice) || "p".equals(myChoice))) {
				System.out.println("正しい値を再度入力してください！");
				continue;
			}
		} while (!("r".equals(myChoice) || "s".equals(myChoice) || "p".equals(myChoice)));
		return myChoice;
	}

	public String getRandom() {
		String[] pattern = { "r", "s", "p" };
		int i = (int) Math.floor(Math.random() * 3);
		String cpuChoice = pattern[i];
		return cpuChoice;
	}

	public void playGame(String myChoice,String cpuChoice) {
		Map<String, String> Lists = new HashMap<>();
		{
			Lists.put("r", "グー");
			Lists.put("s", "チョキ");
			Lists.put("p", "パー");
		};
			
		System.out.println("自分の手は"+Lists.get(myChoice)+"対戦相手の手は"+Lists.get(cpuChoice));
		String result;
		if(myChoice.equals(cpuChoice)) {
			result = "あいこです";
		}else if(
				(myChoice.equals("r") && cpuChoice.equals("s")) ||
				(myChoice.equals("s") && cpuChoice.equals("p")) ||
				(myChoice.equals("p") && cpuChoice.equals("r"))
				) {
			result = "自分の勝ちです";
		}else {
			result = "自分の負けです";
		}
		System.out.println(result);
	}
}
