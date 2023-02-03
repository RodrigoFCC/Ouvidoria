package entities;

import java.util.ArrayList;
import java.util.List;

public class Ouvidoria {

	private ArrayList<Manifestacao> listaManifestacao = new ArrayList();

	public boolean adicionarManifestacao(Manifestacao manifestacao) {

		listaManifestacao.add(manifestacao);
		manifestacao.setId(listaManifestacao.size());
		return true;
	}

	public boolean removerManifestacao(Manifestacao manifestacao) {
		listaManifestacao.remove(manifestacao);
		return true;
	}

	public Manifestacao pegarManifestacao(int id) {
		for (int i = 0; i < listaManifestacao.size(); i++) {
			if (listaManifestacao.get(i).getId() == id) {
				return listaManifestacao.get(i);
			}
		}
		return null;
	}
	
	public Manifestacao pegarManifestacaoNome(String nome) {
		for (int i = 0; i < listaManifestacao.size(); i++) {
			if (listaManifestacao.get(i).getNome().equals(nome)) {
				return listaManifestacao.get(i);
			}
		}
		return null;
	}

	public void listarTipos(int opcao) {
		
		TipoManifestacao tipo = null;
		if (opcao == 1) {
			tipo = TipoManifestacao.ELOGIO;
		} else if (opcao == 2) {
			tipo = TipoManifestacao.SUGESTAO;
		} else if (opcao == 3) {
			tipo = TipoManifestacao.RECLAMACAO;
		}
		for (int i = 0; i < listaManifestacao.size(); i++) {
			if (listaManifestacao.get(i).getTipoManifestacao().equals(tipo)) {
				System.out.println(listaManifestacao.get(i));
				System.out.println("------------------------------");
			}
		}
	}

	public void listarTudo() {
		for (int i = 0; i < listaManifestacao.size(); i++) {
				System.out.println(listaManifestacao.get(i));
				System.out.println("------------------------------");
			}
	}

	public void removerTipos(int indice) {
		
		for (int i = 0; i < listaManifestacao.size(); i++) {
			System.out.println(listaManifestacao.get(i).getId());
			if (listaManifestacao.get(i).getId() == (indice)) {
				listaManifestacao.remove(indice-1);
				System.out.println("Manifestacao removida com sucesso!");
			}
		}
	}
	
	public void removerTudo() {
		listaManifestacao.removeAll(listaManifestacao);
		System.out.println("Todas as manifestações foram deletadas!");
	}
	
}
