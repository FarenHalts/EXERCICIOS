import java.util.Scanner;
public class Retangulo {
	private float largura;
	private float altura;
	public float getLargura() {
		return largura;
	}
	public boolean setLargura(float largura) {
		if ((largura < 0.0) || (largura > 20.0)) {
			System.out.println("numero invalido");
			return false;
		} else {
			this.largura = largura;
			return true;
		}
	}
	public float getAltura() {
		return altura;
	}
	public boolean setAltura(float altura) {
		if ((altura < 0.0) || (altura > 20.0)) {
			System.out.println("numero invalido");
			return false;
		} else {
			this.altura = altura;
			return true;
		}
	}
	public float perimetro() {
		float p = 2 * (largura + altura);
		return p;
	}
	public float area() {
		float a = (largura * altura);
		return a;
	}
	public static void main(String args[]) {
		Retangulo oj = new Retangulo();    
                Scanner entrada = new Scanner(System.in);    
                System.out.print("altura:");    
                oj.setAltura(entrada.nextFloat());    
                System.out.print("largura:");    
                oj.setLargura(entrada.nextFloat());    
                System.out.print("perimetro : " + oj.perimetro() + " area :"    
                + oj.area());
	}
}