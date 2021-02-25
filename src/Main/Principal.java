package Main;

import Formas.Circulo;
import Formas.Forma;
import Formas.Quadrado;

public class Principal {

	public static void main(String[] args) {
				
		Forma[] geometricas = new Forma[4];
				
		Circulo C1 = new Circulo("Vermelho", 5);
		Circulo C2 = new Circulo("Azul    ", 3);
		Quadrado Q1 = new Quadrado("Verde", 3);
		Quadrado Q2 = new Quadrado("Roxo ", 4);
		
		geometricas[0] = C1;
		geometricas[1] = C2;
		geometricas[2] = Q1;
		geometricas[3] = Q2;
				
		for (Forma i : geometricas) {
			
			System.out.println(i);
			System.out.printf("REDMENSIONADO: %.2fm² %n ",(i.redimensiona(2)));
			System.out.println();
		}
		
		
		float soma = C1.area()+C2.area()+Q1.area()+Q2.area();
		System.out.printf(" Soma das Áreas: %.2fm²" ,(soma));
		
	}
}


