package br.com.atividadepolimorfismo.xadrez;

public class Peca {
	private int x, y;
	private boolean capturada;
	private boolean timeBranco;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public boolean isCapturada() {
		return capturada;
	}

	public void setCapturada(boolean capturada) {
		this.capturada = capturada;
	}

	public boolean isTimeBranco() {
		return timeBranco;
	}

	public void setTimeBranco(boolean timeBranco) {
		this.timeBranco = timeBranco;
	}

	public void movimentar(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String nomePeca() {
		return null;
	};
	
	public String verificaCorPosicao(int x, int y) {
		// Se a a soma de X e Y for um valor par, a peça está na cor preta, caso contrário está na cor branca
		return (x + y) % 2 == 0 ? "P" : "B";
	}
	
}
