package iphone;

import equipamentoMultifuncional.EquipamentoMultifuncional;

public class Iphone {
	public static void main(String[] args) {
		EquipamentoMultifuncional iphone = new EquipamentoMultifuncional();
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Minha musica favorita\n");
		iphone.ligar(" 1232311");
		iphone.atender();
		iphone.iniciarconversa();
		System.out.println("\n");
		iphone.exibirPagina(": www.google.com");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		
	}

}
