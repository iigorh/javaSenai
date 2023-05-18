package entites;

public class Tv {

	// Crie uma classe Televisor. Essa classe deve possuir tr�s atributos: 
		//canal  // inicia em 1 e vai at� 16
		//volume // inicia em 0 e vai at� 10
		//ligado // inicia em desligado ou false
		
		// E a seguinte lista de m�todos:
		//aumentarVolume()	// Aumenta em 1 o volume
		//reduzirVolume()		// Diminui em 1 o volume
		//subirCanal()		// Aumenta em 1 o canal
		//descerCanal()		// Diminui em 1 o canal
		//ligarTelevisor()	// Liga a televis�o
		//desligarTelevisor()	// Desliga a televis�o
		//mostraStatus() 		// Dizer qual o canal, o volume e se o televisor est� ligado
		 
		public int canal = 1;
		public int volume = 0;
		public boolean ligado = false;
		
		public void ligarTv() {
			ligado = true;
		}
		public void desligarTV() {
			ligado = false;
		}
		public void aumentarVolume() {
			if (ligado && volume < 10) {
				volume++;
			}
			if (volume >= 10) {
				System.out.println("Seu volume j� est� na capacidade m�xima!");
			}
		}
		
		public void diminuirVolume() {
			if (ligado && volume > 0) {
				volume--;
			}
		}
		
		public void subirCanal() {
			if (ligado == false) {
				if(canal < 16)
					canal += 1;
			}
			if (canal >= 16) {
				System.out.println("N�o h� mais canais dispon�veis");
			}
		}
		
		public void descerCanal() {
			if (ligado == true) {
				if(canal > 1)
					canal -= 1;
			}
		}
		
		public void status() {
			if(ligado == true) {
				System.out.println("Sua televis�o est� ligada e voc� est� no canal: " + canal + ", seu volume est� em: " + volume + " e sua televis�o est� ligada!");
			}else if(ligado == false) {
				System.out.println("Sua televis�o est� desligada.");
			}
				
		}
				
		
		

	}