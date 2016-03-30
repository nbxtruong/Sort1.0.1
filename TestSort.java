import sort.InsertionSort;

public class TestSort {

	public static void printArray(Object[] a) {
		for (Object o : a) {
			System.out.print(o + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int t[] = { 4, 8, 4, 2, 0, 7, 2, 6 };
		ComparableInt[] tci = new ComparableInt[t.length];
		for (int i = 0; i < t.length; i++) {
			tci[i] = new ComparableInt(t[i]);
		}
		InsertionSort.doSort(tci);
		printArray(tci);
	}

}
