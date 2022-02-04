	package estruturas_de_dados;

public class ListaLigada { 
	private Celula primeira=null;
	private Celula ultima=null;
	private int total=0;
	public void AdicionaNoComeco(Object elemento) {
		/**
		 * Método que adiciona  um objeto no começo da lista
		 * @param elemento
		 */
		if(this.total==0) {
			Celula nova=new Celula(elemento);
			this.primeira=nova;
			this.ultima=nova;
			
		
			
		}else {
			Celula nova=new Celula(elemento,this.primeira);
			this.primeira.setAnterior(nova);
			this.primeira=nova; 
		}this.total=this.total+1;
		
		
		//TODO
	}
	/*
	 *trabalhando com sobrecarga de metedo
	 **/
	/**
	 * Método que adiciona  um objeto no final da lista
	 * @param elemento
	 */
	public void adiciona(Object elemento) {
		int posicao = 0;
		if(this.total==0) {
			this.AdicionaNoComeco(elemento);
		}else if
		(posicao==this.total){
			this.adiciona(elemento);
		}else {
		Celula nova=new Celula(elemento,null);
		this.ultima.setProximo(nova);
		nova.setAnterior(this.ultima);
		this.ultima=nova;
		this.total=this.total+1;}
		
	}
	/**
	 * metodo que adiciona wm uma posição X*/
	public void adicionaP(int posicao,Object elemento) {
		if(posicao==0) {
			this.adiciona(elemento);
		}else if(posicao==this.total){
			this.adiciona(elemento);
			 
		}else {
			Celula anterior=this.pegaCelula(-1);
			Celula proxima=anterior.getProximo();
			
			
			Celula nova=new Celula(elemento,anterior.getProximo());
			anterior.setProximo(nova);
			nova.setAnterior(anterior);
			this.total=this.total+1; 
			
		}
		
		Celula anterior=this.pegaCelula(posicao-1);
			
		Celula nova=new Celula(elemento, anterior.getProximo());
		anterior.setProximo(nova);
		this.total=this.total+1; 
	}
	
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
		//TO DO
		
		
	}
	public void removeComeco() {
		if(this.total==0) {
			throw new IllegalArgumentException("lista vazia");
			
		}
		this.primeira=this.primeira.getProximo();
		this.total=this.total-1;
		if(this.total==0) {
			this.ultima=null;
		}
	}
	public void removeDoFim() {
		if(this.total==1) {
			this.removeComeco();
			
		}else{
			Celula penultima=this.ultima.getAnterior(); 
			penultima.setProximo(null);
			this.ultima=penultima;
			this.total=this.total-1;
		}
	}
	public void remove(int posicao) {
		//se existir apenas um elemento
		if(posicao==0) {
			this.removeComeco();
			
		}else if(posicao==this.total-1){//se for o ultimo elemento
			this.removeDoFim();
			
			
		}else {//se for um elemnto do meio
			Celula anterior=this.pegaCelula(posicao-1);
			Celula atual=anterior.getProximo();
			Celula proxima=atual.getProximo();
			
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			
			this.total=this.total-1;
		}
		}
		
		
	
	public int tamanho() {
		return 0; 
		
	}
	public 	boolean contem(Object obj) {
		Celula atual=this.primeira;
		while(atual!=null) {
			if (atual.getElemento().equals(obj)) {
				return true;
			}
			atual=atual.getProximo();
		}return false;
	}
	@Override
	public String toString() {
		if(total==0) {
		return "[]";
	}
	Celula atual=primeira;
	StringBuilder builder=new StringBuilder("[");
	for(int i=0;i<total;i++) {
		builder.append(atual.getElemento());
		builder.append(",");
		atual=atual.getProximo();
		}	builder.append("}");
		return builder.toString();
	}private boolean posicaoocupada(int posicao) {
		return posicao>=0 &&posicao<this.total;
		
	}
	private Celula pegaCelula(int posicao) {
		if(!posicaoocupada(posicao)) {
			throw new IllegalArgumentException("posicão inexistente");
		}Celula atual=this.primeira;
		for(int i=0;i<posicao;i++) {
			atual=atual.getProximo();
			}return atual;
			
	}
	

}
