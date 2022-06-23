
package javacalcolatrice;

public class CalcoliHelper {
	

	 /*Consegna
	 Creare una classe di helper CalcoliHelper. Come visto a lezione, strutturare la classe in modo che non possa essere istanziata (cioè non posso creare oggetti di tipo CalcoliHelper con la parola chiave new) e che presenti i seguenti metodi static:
	 - Somma di due numeri interi
	 - Differenza tra due numeri interi
	 - Moltiplicazione di due numeri interi
	 - Valore assoluto di un numero intero
	 - Minimo tra due numeri interi
	 - Massimo tra due numeri interi
	 Create anche una classe CalcoliTest con il metodo main in cui testate tutti i metodi della vostra classe di helper (con un esempio per ogni casistica)
	 */
	
	private CalcoliHelper() {
	}
	// costruttore privato
	// Somma di due numeri interi
	public static int numberSomma (int primoAddendo,int secondoAddendo) {
		return primoAddendo + secondoAddendo;
	}
	// Differenza tra 2 numeri interi
	public static int numberDifferenza (int sottPrimo, int sottSecondo) {
		return sottPrimo - sottSecondo;
	}
	public static int numberDifferenza2 (int sottTerzo, int sottQuarto) {
		if (sottTerzo < sottQuarto) {
			return sottTerzo - sottQuarto;
			}
		else {
			return sottTerzo - sottQuarto;
		}
	}
	// Moltiplicazione 2 interi
	public static int numberMoltiplicazione (int moltUno, int moltDue) {
		return moltUno * moltDue;
	}
	// Numeri Assoluti
	public static int absoluteValue (int primoAss) {
		
		if (primoAss < 0) {
			primoAss = -primoAss;
		}
			return primoAss;
		}

	
	public static int minValore (int primoNumero , int secondoNumero) {
		
		int minimoValore;
		
		if (primoNumero < secondoNumero) {
			minimoValore = primoNumero;
		}
		else {
			minimoValore = secondoNumero;
		}
		return minimoValore;
	}
	
	
    public static int maxValore (int primoNumero , int secondoNumero) {
		
		int massimoValore;
		
		if (primoNumero > secondoNumero) {
			massimoValore = primoNumero;
		}
		else {
			massimoValore = secondoNumero;
		}
		return massimoValore;
	}
	
	
}