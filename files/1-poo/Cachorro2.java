public class Cachorro2 {

	String nome;
	int tamanho;

	public void quemSou() {
		System.out.print("Sou " + nome + " e tenho " + tamanho + " de altura.");
	}

	static public void main(String[] args) {
		Cachorro2 rex = new Cachorro2();
		rex.nome = "Scooby";
		rex.tamanho = 1;

		rex.quemSou();
	}
}