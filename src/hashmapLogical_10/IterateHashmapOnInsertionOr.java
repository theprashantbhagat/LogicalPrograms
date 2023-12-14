package hashmapLogical_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashmapOnInsertionOr {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<>();

		Map<String, Integer> lhm = new LinkedHashMap<>(hm);

		lhm.put("one", 1);
		lhm.put("three", 3);
		lhm.put("two", 2);
		lhm.put("four", 4);

		Iterator<Entry<String, Integer>> itr = lhm.entrySet().iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
