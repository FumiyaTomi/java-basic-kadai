package kadai_021;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
	private final Map<String, String> dictionary = new HashMap<>();
	{
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "イチゴ");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	public void searchDictionary(String[] words) {
		if(words == null)return;
		
		for(String word : words) {
			if(word == null) {
				System.out.println(word+"は調べられません。");
				continue;
			}
			
			if(dictionary.containsKey(word)) {
				System.out.println(word+"の意味は"+dictionary.get(word)+"です。");
			}else {
				System.out.println(word+"は辞書に存在しません。");
			}
		}
	}
}
