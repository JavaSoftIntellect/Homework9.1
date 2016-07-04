import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		String[] words = { "car", "red","bus","people","mercedes","car","sometimes","apple","Iphone","car",
				"green","people","mercedes","audi","bus","pink","car","people","green" };

		Map<String, Integer> wordCounter = new HashMap<String, Integer>();
		for (String word : words) {
			Integer count = wordCounter.get(word);
			if (count == null) {
				count = 0;
			}
			wordCounter.put(word, count + 1);
		}

		Set<String> wordTimes = wordCounter.keySet();
		for (String word : wordTimes) {
			int count = wordCounter.get(word);
			if(count==1){
				System.out.println(word+ ": "+count+" time");
			}else
			System.out.println(word + ": " + count + " times");
		}
	}
}