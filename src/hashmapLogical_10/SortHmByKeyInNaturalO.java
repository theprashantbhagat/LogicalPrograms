package hashmapLogical_10;

import java.util.HashMap;
import java.util.TreeMap;

public class SortHmByKeyInNaturalO {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("prash", 45);
		hm.put("kun", 18);
		hm.put("man", 34);
		hm.put("rah", 12);

		System.out.println(hm);

		TreeMap<String, Integer> tm = new TreeMap<>(hm);
		System.out.println("natural sorting: " + tm);
	}
}
