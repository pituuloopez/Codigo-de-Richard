package celular;

public class Celular {

	private String[] a2 = { "a", "b", "c" };
	private String[] a3 = { "d", "e", "f" };
	private String[] a4 = { "g", "h", "i" };
	private String[] a5 = { "j", "k", "l" };
	private String[] a6 = { "m", "n", "o" };
	private String[] a7 = { "p", "q", "r", "s" };
	private String[] a8 = { "t", "u", "v" };
	private String[] a9 = { "w", "x", "y", "z" };

	public void calcularValor(String[] cadena) {
		int arreglo = 0, posicion = 0;
		try {
			for (int i = 0; i < (int) cadena.length; i++) {
				// controlamos que no sea el ultimo caracter
				if (i + 1 != (int) cadena.length) {
					if (cadena[i].equals(" ")) {
							posicion = 0;
					} else {
						arreglo = Integer.parseInt(cadena[i]);
						if (cadena[i].equals("0")) {
							System.out.print(" ");
							posicion = 0;
						}
						if (cadena[i] != cadena[i + 1]) {							
							imprimirValor(arreglo, posicion);
							posicion = 0;
						} else {
							posicion++;
						}
					}
				}else{
					arreglo = Integer.parseInt(cadena[i]);					
				}
				
			}
			imprimirValor(arreglo, posicion);
		} catch (Exception e) {
			System.out.print("secuencia de caracteres incorrecta");
		}
	}

	// se imprime el valor del teclado
	public void imprimirValor(int arreglo, int posicion) {
		switch (arreglo) {
		case 2:
			System.out.print(a2[posicion]);
			break;
		case 3:
			System.out.print(a3[posicion]);
			break;
		case 4:
			System.out.print(a4[posicion]);
			break;
		case 5:
			System.out.print(a5[posicion]);
			break;
		case 6:
			System.out.print(a6[posicion]);
			break;
		case 7:
			System.out.print(a7[posicion]);
			break;
		case 8:
			System.out.print(a8[posicion]);
			break;
		case 9:
			System.out.print(a9[posicion]);
			break;

		}

	}

}
