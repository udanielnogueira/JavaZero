//exemplo com atributo, e imprimindo estes
//pasando para o metodo
//criando mais de um objeto

public class Cachorro3{

	String nome;
	int tamanho;

	public void quemSou(String a, int b){//a=bilu b=1
		nome=a;
		tamanho=b;
		System.out.println("sou "+nome+" e tenho "+tamanho+" de altura");//println, pula linha
	}

	public static void main(String[] args){
		Cachorro3 x = new Cachorro3();
		x.quemSou("Bilu", 1);

		Cachorro3 y = new Cachorro3();
		y.quemSou("Wolf", 1);
	}
}