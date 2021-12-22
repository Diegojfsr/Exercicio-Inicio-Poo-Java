import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//-----------------------Inicio da Classe----------------------------------------------------//           

public class NumerosRandomicos{

            int [] numero = new int [10]; //vetor random numero iniciado com 10 posições
            int [] gerarNumeros = new int [10]; //vetor gerarNumeros/armazenas os numeros do metodo gerarNumeros
            int [] imprimirNumeros = new int [10]; //vetor imprimirNumeros/armazena os numeros impressos
            int [] ordenarNumeros = new int [10]; //vetor ordenarNumeros / armazena os numeros ordenados

//-----------------------Metodo Gerar Numeros----------------------------------------------------//           

            
            void gerarNumeros(){
                Random gerador = new Random();//metodo para gerar numeros aleatorios
                    for (int i = 0; i < 10; i++){
                    numero[i] = gerador.nextInt(100); // Guarda o numero no vetor numero  
                }
            }

//-----------------------Metodo Imprimir Numeros----------------------------------------------------//           
            
            void imprimirNumeros(){
                for(int num:numero){
                    System.out.printf("%d - ", num); // printa os valores armazenados
                }
                System.out.println("Numeros Gerados");
            }   

//-----------------------Metodo Ordenar Numeros----------------------------------------------------//           

            void ordenarNumeros(){
                Arrays.sort(numero); 
                for(int n:numero){
                    System.out.printf("%d - ", n); // printa os valores armazenados
                }
                System.out.println("Numeros Ordenados");
            }

}
