package fisica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        Calculadora cl = new Calculadora();
        
        System.out.println("Calculo força Peso");
        System.out.println("Digite o numero: ");
        cl.fpgravidade = teclado.nextFloat();
        System.out.println("Digite o numero: ");
        cl.fpmassa = teclado.nextFloat();
        cl.Cfpeso();
		System.out.printf("força peso igual a %s \n",cl.Cfpeso());
		
		System.out.println("Calculo Força centrípeta");
        System.out.println("Digite o numero: ");
        cl.cvelocidade = teclado.nextFloat();
        System.out.println("Digite o numero: ");
        cl.craio = teclado.nextFloat();
        System.out.println("Digite o numero: ");
        cl.cmassa = teclado.nextFloat();
        cl.Cfcentripeta();
		System.out.printf("força peso igual a %s \n",cl.Cfcentripeta());
      
		 System.out.println("Calculo de impulso");
	        System.out.println("Digite a força: ");
	        cl.iforca = teclado.nextFloat();
	        System.out.println("Digite os segundos: ");
	        cl.isegundo = teclado.nextFloat();
	        cl.Cimpulso();
	        System.out.printf("impulso é igual a %s \n",cl.Cimpulso());

	        System.out.println("Calculo de força elástica");
	        System.out.println("Digite quantos metros: ");
	        cl.metro = teclado.nextFloat();
	        cl.Cfelastica();
	        System.out.printf("a força elastica é igual a %s \n",cl.Cfelastica());

	        System.out.println("Calculo de velocidade média");
	        System.out.println("Digite a distância: ");
	        cl.distancia = teclado.nextFloat();
	        System.out.println("Digite o tempo: ");
	        cl.tempo = teclado.nextFloat();
	        cl.Cvmedia();
	        System.out.printf("impulso é igual a %s \n",cl.Cvmedia());
	        
	        System.out.println("Calculo de M.R.U.");
	        System.out.println("Digite o Disparo: ");
	        cl.disparo = teclado.nextFloat();
	        cl.Cmru();
	        System.out.printf("O movimento retilíneo uniforme é igual a %s \n",cl.Cmru());
	}

}
