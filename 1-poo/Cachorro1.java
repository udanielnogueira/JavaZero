//exemplo basico de metodo

public class Cachorro1{

	public void late(){//nao esquecer do parenteses na criacao do metodo
		System.out.print("au!");
	}

	static public void main(String[] args){
		Cachorro1 rex = new Cachorro1();//nao esquecer do parenteses na instancia de um objeto
		rex.late();
	}
}