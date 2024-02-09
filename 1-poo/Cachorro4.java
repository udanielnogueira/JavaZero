public class Cachorro4 {

	String nome;
	int tamanho;

	Cachorro4(String nome, int tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}

	public void quemSou() {
		System.out.println("Sou " + nome + " e tenho " + tamanho + " de altura.");
	}

	static public void main(String[] args) {
		Cachorro4 x = new Cachorro4("MAX", 2);
		x.quemSou();

		Cachorro4 y = new Cachorro4("ALFA", 2);
		y.quemSou();
	}
}