package Formas;

public class Quadrado extends Forma{
	
 private float lado;

 
	public Quadrado(String cor) {
		super(cor);
		
	}
	
	public Quadrado(String cor, float lado) {
		super(cor);
		this.lado = lado;
	}
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float area() {
		return (lado*lado);
	}
	
	@Override
	public float redimensiona(float fator) {
		return fator = 2 * area();
	}	
	
	public String toString() {
		return " Quadrado "
				+" | Cor: "
				+ getCor()
				+" | Área: "
				+ String.format("%.2f m²", area());
	}
		
}
