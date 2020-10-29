package br.com.atividadepolimorfismo;

public class Circulo extends Forma {
	
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String getNome() {
		return "Círculo";
	}

	@Override
	public double calcularPerimetro() {
		return this.raio * 2 * Math.PI;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (Math.pow(this.raio, 2)) * Math.PI;
	}
	
}
