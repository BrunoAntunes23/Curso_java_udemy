package estruturas_de_dados;
/**
 * Classe que repesenta  uma celula (conteiner)
 * onde teremos o objeto (valor) e uma celula que será a ligação para o proximo
 * @author Bruno
 * 
 * */

public class Celula {
	private Object elemento;
	private Celula proximo;
	private Celula anterior;
	public Celula(Object elemento,Celula proximo) {
		this.elemento=elemento;
		this.proximo=proximo;
	}
	public Celula(Object elemento) {
		this(elemento,null);
	}
	public Celula getAnterior() {
		return this.anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	
	public Celula getProximo() {
		return this.proximo;
	}
	public Object getElemento() {
		return this.elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	

}
