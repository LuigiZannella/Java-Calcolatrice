package javacalcolatrice;

import java.util.Random;

public class MainDouble {
	
	public static void main(String[] args) {
	
		    Random random = new Random();  
		    double randomNumber1 = random.nextInt((1000)+1);
		    double randomNumber2 = random.nextInt((1000)+1);
		    double randomNumber5 = random.nextInt((1000)+1);
		    double randomNumber6 = random.nextInt((1000)+1);
		    double randomNumber7 = random.nextInt((1000)+1);
		    double randomNumber8 = random.nextInt((1000)+1);
		
			System.out.println(CalcoliHelperDouble.numberDifferenza(randomNumber1, randomNumber2));
			
			System.out.println(CalcoliHelperDouble.numberDifferenza2(3.70, 54.6));
			
			System.out.println(CalcoliHelperDouble.absoluteValue(-12));
			
			System.out.println("I due numeri sono: "+ randomNumber5 + " e " + randomNumber6);
			
			System.out.println("Il numero minore è: " + CalcoliHelperDouble.minValore(randomNumber5, randomNumber6));
			System.out.println("Il numero maggiore è: " + CalcoliHelperDouble.maxValore(randomNumber7, randomNumber8));
		}
}