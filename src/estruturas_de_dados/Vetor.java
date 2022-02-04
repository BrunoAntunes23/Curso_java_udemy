package estruturas_de_dados;

import java.util.Arrays;

public class Vetor {
	
	private Aluno alunos[]=new Aluno[100];
	private int total=0;
	
	public void adiciona(Aluno aluno) {
		this.GarantirEspaco();
	this.alunos[total]=aluno;
	total=total+1;
			
		}
	//sobrecarga do metodo adiciona
	public void adiciona(int posicao,Aluno aluno) {
		this.GarantirEspaco();
		if(!PosicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posição invalida");
		}
		for(int i=total-1;i>=posicao;i-=1) {
			alunos[i+1]=alunos[i];
			
		}
		alunos[posicao]=aluno;
		total++;
		
	}
	public Aluno pega(int posicao) {
		if(!PosicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posição invalida");
		}
		return this.alunos[posicao];
		//recebe uma posição e devolve
		
		
	}
	
	public  void  remove(int posicao) {
		for(int i=posicao;i<this.total;i++) {
			this.alunos[i]=this.alunos[i+1];
		}total--;
	}
	
	public boolean contem(Aluno aluno) {
		for(int i=0;i<total;i++) {
			if(aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
		
	}
	public int tamanho() {
		return this.total;
	} @Override
	public String toString() {
		// TODOFAcilita a vizualição dos arrays
		return Arrays.toString(this.alunos);
	}
	private boolean PosicaoOcupada(int posicao) {
		return posicao>=0 &&posicao<total;
		
	}
	private void GarantirEspaco() {
		if(total==alunos.length) {
			/*aso estaja cheio copia e cria um array
			 *  com o dobro de tamanho e o prenche com os dados do antigo
			 */
			Aluno novoArray[]=new Aluno [alunos.length*2];
			/*Copia os dados do array anterior para o novo array*/
			for(int i=0;i<alunos.length;i++) {
				novoArray[i]=alunos[i];
	
				
			}//por ultimo atribuimos o novo array ao array original	
			this.alunos=novoArray;
		}
	}

}
