package celular;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Celular a = new Celular();
		String[] cad=  {"9","9","9","3","3","7","7","7","7"}; 
		//String[] cad=  {"4","4"," ","4","4","4"};//hi
		//String[] cad=  {"3","3","3","6","6","6"," ","6","6","6","0","2","2"," ","2","7","7","7"}; //foo bar
	//	String[] cad=  {"4","4","3","3","5","5","5"," ","5","5","5","6","6","6","0","9","6","6","6","7","7","7","5","5","5","3"}; //hello word
		
		a.calcularValor(cad);
	}

}
