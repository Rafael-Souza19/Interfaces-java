package equipamentoMultifuncional;

import equipamento.AparelhoTelefonico.Telefone;
import equipamento.NavegadorDeInternet.Internet;
import equipamento.ReprodutorMusical.Reprodutor;

public class EquipamentoMultifuncional implements Reprodutor, Internet, Telefone {

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero"+ numero);	
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");	
		
	}

	@Override
	public void iniciarconversa() {
		System.out.println("Iniciando conversa");	
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo url" + url);	
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");	
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");	
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando Música");	
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Música");	
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando Música" + musica);	
		
	}
	

}
