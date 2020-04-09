import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(9);
		arrayList.add(9);
		arrayList.add(8);
		arrayList.add(10);
		arrayList.add(7);
		arrayList.add(7);
		arrayList.add(15);
		arrayList.add(22);
		arrayList.add(15);

		System.out.println(removeDuplicates(arrayList));
	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
		Set<Integer> set = new LinkedHashSet<>(list);
		list.clear();
		list.addAll(set);
		return list;
	}
}
