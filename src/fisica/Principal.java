package fisica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        Calculadora cl = new Calculadora();
        
        System.out.println("Calculo for�a Peso");
        System.out.println("Digite o numero: ");
        cl.fpgravidade = teclado.nextFloat();
        System.out.println("Digite o numero: ");
        cl.fpmassa = teclado.nextFloat();
        cl.Cfpeso();
		System.out.printf("for�a peso igual a %s \n",cl.Cfpeso());
		
		System.out.println("Calculo For�a centr�peta");
        System.out.println("Digite o numero: ");
        cl.cvelocidade = teclado.nextFloat();
        System.out.println("Digite o numero: ");
        cl.craio = teclado.nextFloat();
        System.out.println("Digite o numero: ");
        cl.cmassa = teclado.nextFloat();
        cl.Cfcentripeta();
		System.out.printf("for�a peso igual a %s \n",cl.Cfcentripeta());
      
		 System.out.println("Calculo de impulso");
	        System.out.println("Digite a for�a: ");
	        cl.iforca = teclado.nextFloat();
	        System.out.println("Digite os segundos: ");
	        cl.isegundo = teclado.nextFloat();
	        cl.Cimpulso();
	        System.out.printf("impulso � igual a %s \n",cl.Cimpulso());

	        System.out.println("Calculo de for�a el�stica");
	        System.out.println("Digite quantos metros: ");
	        cl.metro = teclado.nextFloat();
	        cl.Cfelastica();
	        System.out.printf("a for�a elastica � igual a %s \n",cl.Cfelastica());

	        System.out.println("Calculo de velocidade m�dia");
	        System.out.println("Digite a dist�ncia: ");
	        cl.distancia = teclado.nextFloat();
	        System.out.println("Digite o tempo: ");
	        cl.tempo = teclado.nextFloat();
	        cl.Cvmedia();
	        System.out.printf("impulso � igual a %s \n",cl.Cvmedia());
	        
	        System.out.println("Calculo de M.R.U.");
	        System.out.println("Digite o Disparo: ");
	        cl.disparo = teclado.nextFloat();
	        cl.Cmru();
	        System.out.printf("O movimento retil�neo uniforme � igual a %s \n",cl.Cmru());
	}

}
