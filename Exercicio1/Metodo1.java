public class PositivoNegativo {
    public static void main ( String[] args ) {
        int [] v= { 10, 9, -1, -5, 9, -5, -14, -65, 52 };
        int contador = contarNegativos(v);
        
        System.out.print(" A quantidade de números negativos é: " + contador);
    }
    private static int contarNegativos (int[]v) {
        int contador = 0;
        
        for ( int x: v ) {
            if (x<0) {
                contador++;
            }
        }
        return contador;
    }
}