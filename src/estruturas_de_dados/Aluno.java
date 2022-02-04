package estruturas_de_dados;

public class Aluno {
	public String nome;
	
	public Aluno(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Aluno outro=(Aluno)obj;
		return  outro.getNome().equals(this.nome);
	}
	@Override
	public String toString() {
		return this.nome;
	}
	

}
