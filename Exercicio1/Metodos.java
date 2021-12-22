import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//-----------------------Inicio da Classe----------------------------------------------------//           

public class Metodos{


//-----------------------Inicio Metodo1----------------------------------------------------//           

            
            void Metodo1(){
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


                
           
                


//-----------------------inicio Metodo2----------------------------------------------------//           
            
        void Metodo2(){
            Scanner elementos = new  Scanner (System.in);
                int elemento;
                    System.out.print(" Informe a quantidade máxima de elementos do vetor: ");
                    elemento = elementos.nextInt();

                System.out.println(" O temanho do vetor é: "+ elemento + " E os valores são: ");

            Random gerador = new Random();
                for (int i = 0; i < elemento; i++) {
                System.out.println(gerador.nextInt(1000));
		        }
        }   



} 
