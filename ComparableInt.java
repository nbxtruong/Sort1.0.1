import sort.Comparable;

public class ComparableInt implements Comparable {
	private int i;

	public ComparableInt(int i) {
		this.i = i;
	}

	public int compareTo(Object o) {
		if (!(o instanceof ComparableInt)) {
			throw new IllegalArgumentException();
		}
		ComparableInt ci = (ComparableInt) o;
		return i - ci.i; //not clean !
	}

	public String toString() {
		return Integer.toString(i);
	}
}
