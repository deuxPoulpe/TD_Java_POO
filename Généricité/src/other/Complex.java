package other;

public class Complex {
	private double re,im;

	public Complex(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}

	public Complex(double re) {
		this(re,0);
	}
	public Complex() {
		this(0,0);
	}
	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}

	public Complex add(Complex c) {
		return new Complex(re + c.re, im + c.im);
	}
}
