package br.com.atividadepolimorfismo.formas;

public class Main {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(2);
		Quadrado quadrado = new Quadrado(3);
		Retangulo retangulo = new Retangulo(2, 3);
		Triangulo triangulo = new Triangulo(2);
		
		Forma[] formas = new Forma[] { circulo, quadrado, retangulo, triangulo };
		
		for(Forma forma : formas) {
			System.out.println("Perímetro " + forma.getNome() + ": " + forma.calcularPerimetro());
			System.out.println("Área " + forma.getNome() + ": " + forma.calcularArea());
			System.out.println();
		}
		
		
	}

}
