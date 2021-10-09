//passando valores dos atributos por this

public class Cachorro4{

	String nome;
	int tamanho;

	Cachorro4(String nome, int tamanho){
		this.nome=nome;
		this.tamanho=tamanho;
	}

	public void quemSou(){
		System.out.println("sou "+nome+" e tenho "+tamanho+" de altura");
		System.out.println("PASSADO USANDO THIS");
		System.out.println("");
	}

	static public void main(String[] args){//nao esquecer do String[] args
		Cachorro4 x = new Cachorro4("MAX", 2);
		x.quemSou();

		Cachorro4 y = new Cachorro4("ALFA", 2);
		y.quemSou();
	}
}