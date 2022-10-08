import java.util.*;
public class Main{
public static void main(String args[]){
Scanner entrada = new Scanner(System.in);
int sexo, peso, i, homens, mulheres;
for (i=0; i<10; i++){
System.out.printf("Por favor, informe o peso da " + "%do. pessoa.",(i+1));
peso =entrada.nextInt();}
for (i=0; i<10; i++){
System.out.printf("Por favor, digite 1-HOMEM || 2- MULHER para informar o sexo da " + "%do. pessoa.",(i+1));
sexo =entrada.nextInt();
}
if ((peso>= 60 && peso <=80) && (sexo=1)) {
homens++; 
System.out.println(homens);
}
else if ((sexo=2) && (peso >= 50 && peso <= 70))
mulheres++; 
System.out.println(mulheres);
}}

}