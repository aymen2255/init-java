package fr.treeptik.initjava.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("aaa");
		liste.add("bbb");
		liste.add("ccc");
		liste.add("ddd");
		liste.add("");

		List<String> uneautreliste = Arrays.asList("hhhh", "iiiii", "ghgfgf", "kjhkjhk");
		List<String> test = Arrays.asList("ef", "lkj");
		
		// SET
		HashSet<String> testSet = new HashSet<String>();
		testSet.add("jjjj");
		testSet.add("dfb");
		testSet.add("jjjj");
		
		for (String string : testSet) {
			System.out.println(string);
		}
		//map
		HashMap<String, String> mapString = new HashMap<String, String>();
		mapString.put("cle1","valeur1");
		mapString.put("cle2","valeur2");
		mapString.put("cle3","valeur3");
		mapString.put("cle1","valeur7");
		System.out.println(mapString.get("cle1"));
		
		Set<String> key = mapString.keySet();
		for (String string : key) {
			System.out.println(mapString.get(string));
		}

	}

}