package sort;

public class InsertionSort {

	private static void insert(int i, Comparable[] data) {
		if (i < data.length - 1) {
			if (data[i].compareTo(data[i + 1]) > 0) {
				Comparable tmp = data[i];
				data[i] = data[i + 1];
				data[i + 1] = tmp;
				insert(i + 1, data);
			}
		}
	}

	public static void doSort(Comparable[] a) {
		for (int i = a.length - 2; i >= 0; --i) {
			insert(i, a);
		}
	}
}
