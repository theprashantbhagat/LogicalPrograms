package hashmapLogical_10;

import java.util.Comparator;
import java.util.HashMap;

import java.util.TreeMap;

public class SortHmByLenthOfKeys {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("prash", 45);
		hm.put("manoj", 18);
		hm.put("rajkumar", 34);
		hm.put("nayanthara", 12);

		System.out.println(hm);

		TreeMap<String, Integer> tm = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else
					return o1.length() - o2.length();
			}
		});
		tm.putAll(hm);
		System.out.println(tm);

	}
}
