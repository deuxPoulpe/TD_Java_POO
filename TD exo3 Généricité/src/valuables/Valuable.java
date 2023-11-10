package valuables;

import exception.NotExpertisedException;

public interface Valuable {
	public abstract double getValue() throws NotExpertisedException;

	default void appraisal(){}
}
