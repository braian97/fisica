package fisica;

public class Calculadora {
	public float fpgravidade, fpmassa;
	public float craio, cvelocidade, cmassa;
	public float iforca, isegundo;
	public float metro;
	public float distancia, tempo;
	public float disparo;
	public float mvelocidade, mtempo, mveloinicial, maceleracao, mvainicial, mvafincal, matempo;
	
	public float Cfpeso () {
		float fpeso = fpgravidade*fpmassa;
		return fpeso;
		
	}
	public float Cfcentripeta () {
		float fcentripeta = ((cvelocidade*cvelocidade)/craio)*cmassa;
		return  fcentripeta;	
	}
	
	public float Cimpulso () {
		float impulso = iforca*isegundo;
		return impulso;	
	}	
	
	public float Cfelastica () {
		float felastica = 200*metro;
		return felastica;		
	}	
	
	public float Cvmedia () {
		float vmedia = distancia/tempo;
		return vmedia;		
	}
	
	public float Cmru () {
		float mru = disparo * 340/2;
		return mru;
		
	}
	
	public float  Cmruv () {
		float mruv = ((maceleracao*mtempo)+mveloinicial);
		return mruv;
		
	}
	
}
