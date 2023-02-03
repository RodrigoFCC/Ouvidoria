package application;

import java.util.Scanner;

import entities.Elogio;
import entities.Manifestacao;
import entities.Ouvidoria;
import entities.Reclamacao;
import entities.Sugestao;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 5;
		Ouvidoria ouv = new Ouvidoria();
		Manifestacao manifestacao = new Manifestacao();
		String descricao;
		String nome;
		int indice;
		int id;
		
		System.out.println("--==--==--==--==--==--==--==--==--==--==--");
		System.out.println("------        Bem Vindo!        ----------");
		System.out.println("--==--==--==--==--==--==--==--==--==--==--");
		
		while (opcao != 7) {
		
		try {	
			System.out.println("1- Cadastrar uma guia");
			System.out.println("2- Checar guia(s)");
			System.out.println("3- Deletar guia(s)");
			System.out.println("7- Sair");
			opcao = Integer.parseInt(sc.nextLine());
			
			if (opcao == 1) {
				
				System.out.println("1- Cadastrar um elogio");
				System.out.println("2- Cadastrar uma sugestão");
				System.out.println("3- Cadastrar uma reclamação");
				System.out.println("0- Voltar");
				opcao = Integer.parseInt(sc.nextLine());
				
				if (opcao == 0){
					System.out.println("Voltando para o menu...");
					System.out.println("------------------------------");
				}else if (opcao == 1) {
					System.out.println("Digite seu nome: ");
					nome = sc.nextLine();
					System.out.println("Escreva seu caso: ");
					descricao = sc.nextLine();
					manifestacao = new Elogio(nome,descricao);
					ouv.adicionarManifestacao(manifestacao);
				}else if (opcao == 2) {
					System.out.println("Digite seu nome: ");
					nome = sc.nextLine();
					System.out.println("Escreva seu caso: ");
					descricao = sc.nextLine();
					manifestacao = new Sugestao(nome,descricao);
					ouv.adicionarManifestacao(manifestacao);
				}else if (opcao == 3) {
					System.out.println("Digite seu nome: ");
					nome = sc.nextLine();
					System.out.println("Escreva seu caso: ");
					descricao = sc.nextLine();
					manifestacao = new Reclamacao(nome,descricao);
					ouv.adicionarManifestacao(manifestacao);
				}
			}else if (opcao == 2) {
				
				System.out.println("1- Checar elogio(s)");
				System.out.println("2- Checar sugestão(s)");
				System.out.println("3- Checar reclamação(s)");
				System.out.println("4- Checar por ID");
				System.out.println("5- Checar por nome");
				System.out.println("6- Checar todas as guias");
				System.out.println("0- Voltar");
				opcao = Integer.parseInt(sc.nextLine());
				if (opcao >= 1 && opcao <=3) {
					ouv.listarTipos(opcao);
				}else if (opcao == 4) {
					do {
						System.out.println("Digite o ID da manifestação: ");
						id = Integer.parseInt(sc.nextLine());
						if (ouv.pegarManifestacao(id) != null) {
							System.out.println(ouv.pegarManifestacao(id));
						}else {
							System.out.println("ID não encontrado, tente novamente!");
							System.out.println("------------------------------");
						}
					}while(ouv.pegarManifestacao(id) == null);
				}else if (opcao == 5) {
					do {
						System.out.println("Digite o nome do usuário da manifestação: ");
						nome = sc.nextLine();
						if (ouv.pegarManifestacaoNome(nome) != null) {
							System.out.println(ouv.pegarManifestacaoNome(nome));
						}else {
							System.out.println("Nome não encontrado, tente novamente!");
							System.out.println("------------------------------");
						}
					}while(ouv.pegarManifestacaoNome(nome) == null); 
				}else if (opcao == 6) {
					ouv.listarTudo();
				}else if (opcao == 0) {
					System.out.println("Voltando para o menu...");
					System.out.println("------------------------------");
				}
				
			}else if (opcao == 3) {
				
				System.out.println("1- Deletar uma guia de Elogios");
				System.out.println("2- Deletar uma guia de Sugestões");
				System.out.println("3- Deletar uma guia de Reclamações");
				System.out.println("4- Todas as guias");
				System.out.println("0- Voltar");
				opcao = Integer.parseInt(sc.nextLine());
				if (opcao >= 1 && opcao <=3) {
					ouv.listarTipos(opcao);
					System.out.println("Digite o indice da manifestacão que voce quer deletar: ");
					indice = Integer.parseInt(sc.nextLine());
					ouv.removerTipos(indice);
				}else if (opcao == 4) {
					ouv.removerTudo();
				}else if (opcao == 0) {
					System.out.println("Voltando para o menu...");
					System.out.println("------------------------------");
				}
				
			}else if (opcao == 0) {
				System.out.println("Até mais!");
			}
			
			}catch (Exception e) {
				System.out.println("Erro indesejado");
			}
		}
		
		sc.close();
		
	}

}
