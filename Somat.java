public class Somat{

	int somat;
	int n=4;
	int s=n-1;

	public void calculo(){
		while(s>0){
			somat=n+s;
			n=somat;//atualizando valor
			s--;
		}
		System.out.println("somatorio: "+somat);
	}

	public static void main(String[] args){

		Somat resultado = new Somat();
		resultado.calculo();
	}

}
	