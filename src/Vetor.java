
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
	
	public int find(int valor){
		for(int i = 0; i < Vetor.length; i++){
			if(Vetor[i] == valor){
				return i;
			}
		}else{
			return -1;
		}
	}
	
	public void sort{
		 int i;
       		int aux;
		 // bubble sort
       		for(i = 0; i<vetor.length; i++){
        	for(int j = 0; j<vetor.length-1; j++){
                	if(vetor[j] > vetor[j + 1]){
                    	aux = vetor[j];
                    	vetor[j] = vetor[j+1];
                    	vetor[j+1] = aux;
                	}
            	}
        	}
	}
	public void intersecao(Vetor v2) throws VetorIndexOutOfBoundsException, VetorNullPointerException{

        this.sort();
        v2.sort();

        int cont1 = 0;
        int cont2 = 0;
        int posicao = 0;
        int vet1 = 0;

        int tamanhoMenor = (this.size() < v2.size()) ? this.size() : v2.size();
        Vetor v3 = new Vetor(tamanhoMenor);

        for (int i = 0; i <= this.vetor.length; i++) {
                if(i > 0) {
                        if (i != this.vetor.length && this.vetor[i] == vet1) {
                                cont1++;
                                continue;
                        } else {
                                int qtd = cont1;
                                if(cont1 > cont2) {
                                        qtd = cont2;
                                }

                                for(int k = 0; k < qtd; k++) {
                                        v3.put(posicao, vet1);
                                        posicao++;
                                }

                                if(i == this.vetor.length) {
                                        break;
                                }
                        }
                }
                        cont1 = 1;
                        cont2 = 0;
                        vet1 = this.vetor[i];

                        for(int j = 0; j < v2.vetor.length; j++) {
                                if(v2.vetor[j] == this.vetor[i]) {
                                        cont2++;
                                }
                        }
        }

                for( int i = 0; i < posicao; i++ )
                        System.out.println("posicao " + i + " - " + v3.vetor[i]);
    }
}
