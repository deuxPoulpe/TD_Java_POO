package GemsSafe;

import java.util.HashSet;
import java.util.Iterator;


public class Safe {
	
	private int currentGemsNb;
	private final int capacity;
	private boolean opened;
	private HashSet<Gemstone> myContent;
	
	
	public Safe(int capacity) {
		this.capacity = capacity;
		this.currentGemsNb = 0;
		myContent = new HashSet<>();
	}
	
	public void open() {
		if (!this.opened){
			this.opened = true;
		}
		else {
			System.out.println("Safe already opened");
		}
	}
	
	public void close() {
		if (this.opened){
			this.opened = false;
		}
		else {
			System.out.println("Safe already closed");
		}
	}
	
	public boolean isFull() {
		if (this.capacity == this.currentGemsNb) {
			return true;
		}
		return false;
	}
	
	public void addGem(Gemstone gem) {
		if (!this.isFull()) {
			this.currentGemsNb ++;
			this.myContent.add(gem);
		}
		else {
			System.out.println("Safe is full");
		}
		
	}
	
	public void removeGem(Gemstone gem) {
		if (this.currentGemsNb > 0 && gem.getMySafe() == this) {
			this.currentGemsNb --;
			this.myContent.remove(gem);
		}
		
	}
	
	public double getValue() {
		double total = 0;
		Iterator<Gemstone> i = this.myContent.iterator();
		while(i.hasNext()) {
			total += i.next().getMyValue();
		}
		return total;
		
	}

}
