public class Cachorro3 {

	String nome;
	int tamanho;

	public void quemSou(String a, int b) {
		nome = a;
		tamanho = b;
		System.out.println("Sou " + nome + " e tenho " + tamanho + " de altura.");
	}

	public static void main(String[] args) {
		Cachorro3 x = new Cachorro3();
		x.quemSou("Bilu", 1);

		Cachorro3 y = new Cachorro3();
		y.quemSou("Wolf", 1);
	}
}