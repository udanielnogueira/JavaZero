public class Pot {

	int p;
	int b1 = 2;
	int b2 = b1;
	int e = 4;

	public void calculo() {

		if(e == 0) {
			p = 1;
		}

		if(e == 1) {
			p = b1;
		}

		while(e > 1) {
			p = b1 * b2;
			b2 = p;
			e--;
		}


		System.out.println("Potência: " + p);
	}

	public static void main(String[] args) {

		Pot resultado = new Pot();
		resultado.calculo();
	}

}