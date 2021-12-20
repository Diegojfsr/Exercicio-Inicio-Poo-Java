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
		}
		
		int contador = contarNegativos(y);
		System.out.println("A quantidade de números negativos é " + contador);
		
		
	}
	
	private static int contarNegativos(int[] y) {
		int contador = 0;
		for(int a: y) {
			if(a<0) {
				contador++;
			}
		}
		return contador;

    }
}
