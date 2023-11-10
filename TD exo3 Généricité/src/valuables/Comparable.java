package valuables;

public interface Comparable<T> {

	public default int compareTo(T obj){
		if (this.equals(obj)){
			return 1;
		}
		else{
			return 0;
		}
		
	}
	
}
