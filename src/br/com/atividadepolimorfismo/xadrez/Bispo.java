package br.com.atividadepolimorfismo.xadrez;

public class Bispo extends Peca {
	
	@Override
	public void movimentar(int x, int y) {
		
		/* 
		 * Verifica se o movimento para o bispo � um movimento v�lido de acordo com as regras do xadrez:
		 * - O bispo n�o pode sair da cor inicial
		 * - O bispo n�o pode ser movido para a mesma coluna (X)
		 * - A subtra��o de X - Y ou Y - X deve sempre resultar em 2 (pode resultar em 0 caso o bispo ande no espa�o preto)
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
