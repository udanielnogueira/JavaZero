//exemplo com atributo, e imprimindo estes
//passando pelo objeto

public class Cachorro2{

	String nome;
	int tamanho;

	public void quemSou(){
		System.out.print("sou "+nome+" e tenho "+tamanho+" de altura");
	}

	static public void main(String[] args){
		Cachorro2 rex = new Cachorro2();//lembre, rex eh o nome de uma variavel. Poderia ser x por exemplo
		rex.nome="Scooby";
		rex.tamanho=1;//rex.atributo <--- variavel.atributo

		rex.quemSou();//nao esquecer do parenteses na chamada do método
	}
}