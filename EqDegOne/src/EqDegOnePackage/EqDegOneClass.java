package EqDegOnePackage;

public class EqDegOneClass {
	
	private float a;
	private float b;
	private float solution;
	private boolean solved;
	
	
	//Seter
	/**
	 * Modifie la valeur du coefficient 'a'.
	 *
	 * @param new_a Nouvelle valeur du coefficient 'a'.
	 */
	public void setA(float new_a) {
		this.a = new_a;
	}
	
	 /**
	 * Modifie la valeur du coefficient 'b'.
	 *
	 * @param new_b Nouvelle valeur du coefficient 'b'.
	 */
	public void setB(float new_b) {
		this.b = new_b;
	}
	
	/**
	 * Vérifie si l'équation a été résolue.
	 *
	 * @return true si l'équation a été résolue, sinon false.
	 */
	public boolean isSolved() {
		return this.solved;
	}
	
	/**
	 * Résout l'équation du premier degré "ax + b = 0" et retourne la solution.
	 *
	 * @return La solution de l'équation si elle a été résolue, sinon 0.
	 */
	public float solve() {
		
		if(this.solved) {
			this.solution = (-this.b)/this.a;
		}
		return this.solution;
		
		
	}


}
