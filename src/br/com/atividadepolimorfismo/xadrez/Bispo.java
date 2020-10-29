package br.com.atividadepolimorfismo.xadrez;

public class Bispo extends Peca {
	
	@Override
	public void movimentar(int x, int y) {
		
		/* 
		 * Verifica se o movimento para o bispo é um movimento válido de acordo com as regras do xadrez:
		 * - O bispo não pode sair da cor inicial
		 * - O bispo não pode ser movido para a mesma coluna (X)
		 * - A subtração de X - Y ou Y - X deve sempre resultar em 2 (pode resultar em 0 caso o bispo ande no espaço preto)
		 * */
		if((this.verificaCorPosicao(x, y) == this.verificaCorPosicao(this.getX(), this.getY()) &&
		   (this.getX() != x)) &&
		   (x - y == 2 || y - x == 2 || (this.verificaCorPosicao(x, y) == "P" && y - x == 0))) {
			super.movimentar(x, y);
		}

	
	}
	
	@Override
	public String nomePeca() {
		return "Bispo";
	}

}
