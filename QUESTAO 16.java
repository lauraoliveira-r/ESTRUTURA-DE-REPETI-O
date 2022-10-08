import java.util.*;
public class Main{
public static void main(String args[]){
Scanner entrada = new Scanner(System.in);
int nota, Maiornota=Integer.MIN_VALUE, Menornota=Integer.MAX_VALUE, i;
for (i=0; i<5; i++){
System.out.printf("Por favor, informe a " + "%do. nota.",(i+1));
nota =entrada.nextInt();
  if (nota> Maiornota){
    Maiornota = nota;
  }
  else if (nota< Menornota){
   Menornota = nota;
  }
}
System.out.println();
System.out.println("Maior nota =" + Maiornota);
System.out.println("Menor nota =" + Menornota);
}}