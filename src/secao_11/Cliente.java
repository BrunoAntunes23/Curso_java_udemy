package secao_11;

public class Cliente implements Comparable{
	private int idade;
  private String nome,endereco;
  
    public Cliente(int idade,String nome,String endereco){
        this.nome=nome;
        this.endereco=endereco;
    }

    public String getNome() {
        return this.nome;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.nome;
    }

	@Override
	public int compareTo(Object outro) {
		// TODO Auto-generated method stub
		Cliente aux=(Cliente)outro;
		if(this.idade<aux.idade) {
			return -1;
		}else if(this.idade > aux.idade) {
			return 1;
		}else {
			return 0;
			}
		
	}
}
