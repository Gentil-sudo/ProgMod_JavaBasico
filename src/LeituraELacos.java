    /**
     * Recebe uma mensagem para exibir e pede a leitura de um número inteiro, retornando-o. 
     * Código sem robustez para valores não inteiros.
     * @param mensagem Mensagem a ser exibida ao usuário
     * @return Número inteiro lido a partir do teclado
     */
    int lerNumero(String mensagem){
        int valor;
        valor = Integer.parseInt( IO.readln("\t"+mensagem+": "));
        return valor;
    }

    /**
     * Preenche um vetor a partir da leitura de números inteiros
     * @param vetor Vetor a ser preenchido
     */
     void preencherVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerNumero("Digite um valor inteiro");
        }
    }

    /**
     * Recebe um vetor de inteiros como parâmetro e retorna a quantidade de números pares deste vetor.
     * @param vetor O vetor a ser analisado.
     * @return int com a quantidade de pares do vetor (>=0)
     */
    int contaImpares(int[] vetor){
        int contadorImpar=0;
        for (int i = 0; i < vetor.length; i++) {
            contadorImpar += (vetor[i]%2);
        }
        return contadorImpar;
    }

    int somaVetor(int [] vetor){
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        return soma;
    }

    int maioresQue(double valor, int[] vetor){
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > valor){
                contador = contador+1;
            }
        }
        return contador;
    }

    void main(){
        
        int[] vetor;
        int tamanho = lerNumero("Quantidade de inteiros para ler");
        int quantImpares;
        int soma;
        double media;
        int maioresQueAMedia;

        vetor = new int[tamanho];
        preencherVetor(vetor);
        quantImpares = contaImpares(vetor); 
        soma = somaVetor(vetor);
        media = soma / tamanho;
        maioresQueAMedia = maioresQue(media, vetor);

        IO.println("RESULTADOS:");
        IO.println("============");
        IO.println("O vetor tem "+quantImpares+" números ímpares e "+(tamanho-quantImpares)+" pares.");
        IO.println(
                String.format("A soma dos valores é de %d e sua média é de %f", soma, media)
                );
        IO.println(
                String.format("%d valores são maiores que a média", maioresQueAMedia)
                );
        
    }

