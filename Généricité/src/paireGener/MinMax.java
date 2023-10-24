package paireGener;


public class MinMax<T extends Comparable<T>> extends Paire<T, T> implements Comparable<MinMax<T>>{

	public MinMax() {
		super();
	}

	public MinMax(T first, T second) {
		super(first, second);
		if (first.compareTo(second)>0) {
			T tmp;
			tmp = this.first;
			this.first= this.second;
			this.second = tmp;
		}
	}

	@Override
	public int compareTo(MinMax<T> mmt) {
		if(first.compareTo(mmt.first)==0)
			return second.compareTo(mmt.second);
		return first.compareTo(mmt.first);
	}

	
}
