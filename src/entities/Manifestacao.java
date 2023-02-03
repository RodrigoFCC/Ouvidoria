package entities;

public class Manifestacao {

		private String nome;
		private String descricao;
		private int id;
		private TipoManifestacao tipoManifestacao;
		
		public Manifestacao() {
			
		}
		
		public Manifestacao(String nome, String descricao,TipoManifestacao tipoManifestacao) {
			this.nome = nome;
			this.descricao = descricao;
			this.tipoManifestacao = tipoManifestacao;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getDescricao() {
			return descricao;
		}


		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}

		public TipoManifestacao getTipoManifestacao() {
			return tipoManifestacao;
		}

		public void setTipoManifestacao(TipoManifestacao tipoManifestacao) {
			this.tipoManifestacao = tipoManifestacao;
		}

		@Override
		public String toString() {
			return "Manifestacao do tipo " + tipoManifestacao 
					+ "\nSeu ID é: " + id 
					+ "\nNome: " + nome 
					+ "\nDescricao: " + descricao;
		}
		
		
		
}
