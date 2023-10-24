package BoiteGener;
import paireGenerInterface.UselessInterface;
import other.Gemstone;

public class RedefBoite<T1 extends UselessInterface<Double>> implements UselessInterface<Double> {
	public RedefBoite(T1 element) {
		this.myelement = element;
	}
	
	private boolean opened=true;

	public RedefBoite() {
		System.out.println("Nouvelle boite");
	}
	
	public boolean isOpened() {return opened; 	}


	
	public void open(){
		if(opened)System.err.println("Trying to open an opened safe...");
		this.opened=true;
	}

	
	public Double getValue() {
		if (!isFull()) {
			return null;
		}
		return myelement.getValue();
	}
	
	
	public void close(){
		if(!isOpened())System.err.println("Trying to close a closed safe...");
		this.opened=false;
	}

	private T1 myelement;
	
	
	
	
	public boolean isFull(){
		return this.myelement !=null;			
	}


	
	
	public void addElement(T1 element){
		if ( !isOpened()) {
			System.out.println("My box is closed: cannot add any element");
			return ;
		}
		if (myelement!= null)
			System.out.println("MyBox has already an element, remove it before adding another");
		else
		{
			myelement = element;
		}

	}
	
	
	public T1 removeElement(){
		if(!isOpened()) return null;
		T1 el = myelement;
		myelement = null;
		return el;
	}
}
