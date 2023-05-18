package entites;

public class Tv {

	// Crie uma classe Televisor. Essa classe deve possuir três atributos: 
		//canal  // inicia em 1 e vai até 16
		//volume // inicia em 0 e vai até 10
		//ligado // inicia em desligado ou false
		
		// E a seguinte lista de métodos:
		//aumentarVolume()	// Aumenta em 1 o volume
		//reduzirVolume()		// Diminui em 1 o volume
		//subirCanal()		// Aumenta em 1 o canal
		//descerCanal()		// Diminui em 1 o canal
		//ligarTelevisor()	// Liga a televisão
		//desligarTelevisor()	// Desliga a televisão
		//mostraStatus() 		// Dizer qual o canal, o volume e se o televisor está ligado
		 
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
				System.out.println("Seu volume já está na capacidade máxima!");
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
				System.out.println("Não há mais canais disponíveis");
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
				System.out.println("Sua televisão está ligada e você está no canal: " + canal + ", seu volume está em: " + volume + " e sua televisão está ligada!");
			}
			System.out.println("Sua televisão está desligada");	
		}
				
		
		

	}

