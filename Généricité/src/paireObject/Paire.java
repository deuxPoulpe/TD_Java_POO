package paireObject;

public class Paire {
	protected Object first, second;

	public Object getFirst() {		return first;	}

	public void setFirst(Object first) {this.first = first;	}

	public Object getSecond() {		return second;	}

	public void setSecond(Object second) {	this.second = second;}

	public Paire(Object first, Object second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return "[" + first + ", " + second + "]";
	}
	
}
