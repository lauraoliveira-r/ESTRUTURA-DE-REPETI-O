import java.util.*;
public class Main{
public static void main(String args[]){
Scanner entrada = new Scanner(System.in);
int n, i, fatorial = 1;
System.out.println("Por favor, digite um número:");
n =entrada.nextInt();
  System.out.println();
  
for (i=1; i<=n; i++){
  fatorial *= i;
 }
  System.out.println( n +"! =" + fatorial);
  entrada.close();
}
} 
