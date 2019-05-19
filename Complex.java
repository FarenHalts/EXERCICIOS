//Crie uma classe chamada Complex para realizar aritmética com números complexos. Os números complexos têm a 
//forma parteReal + parteImaginária * i, onde i é raíz quadrada de –1
//Escreva um programa para testar sua classe. Utilize variáveis de ponto flutuante para representar os dados private 
//da classe. Forneça um construtor que permita que um objeto dessa classe seja inicializado quando ele for declarado.
//Forneça um construtor sem argumento com valores padrão caso nenhum inicializador seja fornecido. Forneça métodos public 
//que realizam as seguintes operações:
//a) Somar dois números Complex: as partes reais são somadas de um lado e as partes imaginárias, de outro.
//b) Subtrair dois números Complex: a parte real do operando direito é subtraída da parte real do operando esquerdo e 
//a parte imaginária do operando direito é subtraída da parte imaginária do operando esquerdo.
//c) Imprima números Complex na forma (parteReal, parteImaginária).

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
