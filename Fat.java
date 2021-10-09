public class Fat{

	int fat;
	int n=3;
	int i=n-1;

	public void calculo(){
		while(i>0){
			fat=n*i;
			n=fat;
			i--;
		}
		System.out.println("fatorial: "+n);
	}

	public static void main(String[] args){

		Fat resultado = new Fat();
		resultado.calculo();
	}

}
	