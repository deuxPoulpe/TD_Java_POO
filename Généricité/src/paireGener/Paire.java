package paireGener;

public class Paire<T1, T2> {
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
	

}
