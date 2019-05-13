public class Complex {
    
    private double a;
	private double b;
	
	public Complex (double a, double b) {
	    this.a = a; this.b = b;
	}
	
	public Complex () {
	    this.a = 0.0; this.b = 0.0;
	}
	
	public static Complex somar (Complex x, Complex y) {
	    return new Complex (x.a + y.a, x.b + y.b);
	}
	
	public static Complex subtrair (Complex x, Complex y) {
	    return new Complex (x.a - y.a, x.b - y.b);
	}
	
    public String toString() {
	    return "(" + a + ", " + b + ")";
	}
}
class TesteComplex {
    public static void main (String[] args) {
	    Complex abc = new Complex (7.3, 4.2);
		Complex def = new Complex (6.2, -5.7);
	    Complex zero = new Complex();
		System.out.println ("-----------------------RESULTADOS-----------------------");
                System.out.println ("RESULTADO ABC: " + abc);
		System.out.println ("RESULTADO DEF: " + def);
		System.out.println ("RESULTADO SOMA ABC + DEF: " + Complex.somar (abc, def));
		System.out.println ("RESULTADO SUBTRAÇÃO ABC - DEF: " + Complex.subtrair (abc, def));
                System.out.println ("--------------------------------------------------------");
	}
}