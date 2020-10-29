package br.com.atividadepolimorfismo.xadrez;

public class Cavalo extends Peca {

	@Override
	public void movimentar(int x, int y) {
		// Verifica se o movimento para o cavalo é um movimento válido de acordo com as regras do xadrez
		if(((x == this.getX() + 2 || x == this.getX() - 2) && (y == this.getY() + 1 || y == this.getY() - 1)) ||
			((x == this.getX() + 1 || x == this.getX() - 1) && (y == this.getY() + 2 || y == this.getY() - 2))) {
			super.movimentar(x, y);
		}
	}

	@Override
	public String nomePeca() {
		return "Cavalo";
	}
	
	
}
