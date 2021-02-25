package Formas;

public class Circulo extends Forma {
	
	private float raio;
	
	
	public Circulo(String cor) {
		super(cor);
	}
	
	public Circulo(String cor, float raio) {
		super(cor);
		this.raio = raio;
	}

	public float getRaio() {
		return raio;
	}


	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float area() {
		return (float) (3.14 * (raio*raio ));
		
	}
	@Override
	public float redimensiona(float fator) {
		return fator = 2 * area();
	}
	
	
	public String toString() {
		return " Circulo  "
				+" | Cor: "
				+ getCor() 
				+" | Área: "
				+ String.format("%.2f m²", area());
	}
}