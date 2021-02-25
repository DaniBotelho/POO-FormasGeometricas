package Formas;

public abstract class Forma implements Dimensionavel {
	
	private String cor;
		
	public Forma(String cor) {
		super();
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public float redimensiona(float fator) {
		return fator;
	}
	
	 abstract float area();
	
}
