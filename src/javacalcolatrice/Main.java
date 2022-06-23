package javacalcolatrice;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
	
		    Random random = new Random();  
		    int randomNumber1 = random.nextInt((1000)+1);
	        int randomNumber2 = random.nextInt((1000)+1);
	        int randomNumber5 = random.nextInt((1000)+1);
		    int randomNumber6 = random.nextInt((1000)+1);
		    int randomNumber7 = random.nextInt((1000)+1);
		    int randomNumber8 = random.nextInt((1000)+1);
		
			System.out.println(CalcoliHelper.numberDifferenza(randomNumber1, randomNumber2));
			
			System.out.println(CalcoliHelper.numberDifferenza2(5, 94));
			
			System.out.println(CalcoliHelper.absoluteValue(-12));
			
			System.out.println("I due numeri sono: "+ randomNumber5 + " e " + randomNumber6);
			
			System.out.println("Il numero minore è: " + CalcoliHelper.minValore(randomNumber5, randomNumber6));
			System.out.println("Il numero maggiore è: " + CalcoliHelper.maxValore(randomNumber7, randomNumber8));
		}
}