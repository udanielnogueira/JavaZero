public class Somat {

	int somat;
	int n = 4;
	int s =n - 1;

	public void calculo() {
		while(s > 0) {
			somat = n + s;
			n = somat;
			s--;
		}
		System.out.println("Somatório: " + somat);
	}

	public static void main(String[] args) {

		Somat resultado = new Somat();
		resultado.calculo();
	}
}