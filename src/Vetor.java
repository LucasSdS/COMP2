
public class Vetor {
	public Integer[] Vetor;
	
	public Vetor(int tam){
		Vetor = new Integer[tam];
	}
	
	public void resize(int novoTam){
		Integer[] novoVetor = new Integer[novoTam];
		int menor = (novoTam < Vetor.length ? novoTam : Vetor.length);
		
		for (int i = 0; i < menor; i++){
			novoVetor[i] = Vetor[i];
			
			Vetor = novoVetor;
		}
	}
	
	public int size(){
		return Vetor.length;
	}
	
	public void put(int posicao, int valor) throws VetorIndexOutOfBoundsException{
		if(posicao >= 0 && posicao < Vetor.length){
			Vetor[posicao] = valor;
		}else{
			throw new VetorIndexOutOfBoundsException("Ta ultrapassando o limite, parceiragem");
		}
	}
	
	public int get(int posicao) throws VetorNullPointerException{
		if(Vetor[posicao] != null){
			return Vetor[posicao];
		}else{
			throw new VetorNullPointerException("Posicao NULL");
		}
	}
}
