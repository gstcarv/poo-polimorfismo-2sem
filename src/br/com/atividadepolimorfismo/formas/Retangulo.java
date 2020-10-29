package br.com.atividadepolimorfismo.formas;

public class Retangulo extends Forma {

	private double base, altura;
	
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String getNome() {
		return "Ret�ngulo";
	}

	@Override
	public double calcularPerimetro() {
		return (this.base * 2) + (this.altura * 2);
	}

	@Override
	public double calcularArea() {
		return this.base + this.altura;
	}

}
