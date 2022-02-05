
public class PosfixCalc implements IPosfixCalc{

	public static void main(String[] args) {
		private String[] Datos;
		private Stack<String> pila = new Stack<String>();
		private int num1 = 0;
		private int num2 = 0;
		private int resutado = 0;
		private string numero = "0123456789";
		private int cont = 0;
		
		@override
		public int Evaluate(String ecua) {
			System.out.println("Expresion " + ecua);
			array = ecua.split(" ");
			for (int i = 0; i < array.Length; i++) {
				for (int j = 0; j < numero.Length; j++) {
					if (array[i] == numero[j]) {
						cont++;
					}	
				}
			}
		}
		
		public Posfix() {
			resultado = 0;
		}
	}

}
