import java.util.Random;

public class Metodo1 {

    public static void main(String[] args) {

        int min = -1000;
		int max = 1000;
		int range = max - min + 1;
		int [] y = new int [100];

        
		for(int i= 0; i<100; i++) {
			int x = (int) (Math.random()* range) + min;
			y[i] = x;		
			
			System.out.println(x);
		}
		
		int contador = contarNegativos(y);
		System.out.println("A quantidade de números negativos é " + contador);

		int contador2 = contarPositivos(y);
		System.out.println("A quantidade de números positivos é " + contador2);
		
		
	}

	private static int contarNegativos(int[] y) {
		int contador = 0;
		for(int b: y) {
			if(b<0) {
				contador++;
			}
		}
		return contador;

    }
	
	private static int contarPositivos(int[] y) {
		int contador2 = 0;
		for(int a: y) {
			if(a>0) {
				contador2++;
			}
		}
		return contador2;
	}


}
