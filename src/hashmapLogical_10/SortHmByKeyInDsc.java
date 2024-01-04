package hashmapLogical_10;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class SortHmByKeyInDsc {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("prash", 45);
		hm.put("kun", 18);
		hm.put("amit", 34);
		hm.put("rah", 12);

		System.out.println(hm);

		TreeMap<String, Integer> tm = new TreeMap<>(Collections.reverseOrder());
		tm.putAll(hm);
		System.out.println("reverse sorting: " + tm);
	}
}
