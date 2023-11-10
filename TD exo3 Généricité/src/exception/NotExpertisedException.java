package exception;

import valuables.Gemstone;

public class NotExpertisedException extends Exception{

		Gemstone g = null;

		public NotExpertisedException(){
			super();
		}
	
		public NotExpertisedException(String message){
			super(message);
		}

		public NotExpertisedException(Gemstone g){
			super("Trying to get the value of a gemstone that has not been expertised yet" + g);
		}
}
