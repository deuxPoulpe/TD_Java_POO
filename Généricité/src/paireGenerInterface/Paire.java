package paireGenerInterface;

public class Paire<T1, T2> implements UselessInterface<T1>{
	protected T1 first;
	protected T2 second;
	
	public T1 getFirst() {
		return first;
	}
	public void setFirst(T1 first) {
		this.first = first;
	}
	public T2 getSecond() {
		return second;
	}
	public void setSecond(T2 second) {
		this.second = second;
	}
	public Paire(T1 first, T2 second) {
		this.first = first;
		this.second = second;
	}
	public Paire() {
		this.first = null;
		this.second = null;
	}
	@Override
	public String toString() {
		return "[" + first + ", " + second + "]";
	}
	
	public <T> boolean sameFirst(Paire<T1,T> pt1t) {
		return (first.equals(pt1t.getFirst()));
	}
	@Override
	public T1 getValue() {
		return this.first;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paire other = (Paire) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}
	

}
