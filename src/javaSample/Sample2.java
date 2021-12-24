package javaSample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//HashSet
		Set<String> set1 = new HashSet<String>();

		set1.add("data1");
		set1.add("data3");
		set1.add("data4");
		set1.add("data4");
		set1.add("data2");

		for (String str : set1) {
			System.out.println(str);
		}
		System.out.println();

		// TreeSet
		Set<String> set2 = new TreeSet<String>();

		set2.add("data1");
		set2.add("data3");
		set2.add("data4");
		set2.add("data4");
		set2.add("data2");

		for (String str : set2) {
			System.out.println(str);
		}
		System.out.println();

		// SortedSet,LinkedHashSet
		Set<String> set3 = new LinkedHashSet<String>();

		set3.add("data1");
		set3.add("data3");
		set3.add("data4");
		set3.add("data4");
		set3.add("data2");

		for (String str : set3) {
			System.out.println(str);
		}
	}

}
