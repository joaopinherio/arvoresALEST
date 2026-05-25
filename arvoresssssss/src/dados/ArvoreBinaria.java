package dados;

public class ArvoreBinaria {
    private No<T> raiz;
    
    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void AdcionaRaiz(T valor){
        No<T> novo = No(valor); 
        if(raiz == null){
            raiz = novo;
        }else{ //tinha >= / <= antes mas a aplicacao padrao dessa teoria sao identificadores unicos HASHES
            if(novo.valor < raiz.valor){
                raiz.esquerda = novo;
                raiz.esquerda.paiDele = novo;
            }
            if(novo.valor > raiz.valor){
                raiz.setDireita(novo);
                raiz.esquerda.setPaiDele(raiz);
            }
        }
    }


    class No<T>{
        T dado;
        No<T> esquerda;
        No<T> direita;
        No<T> paiDele;

        public No<T>(T valor){
            T dado = valor;
            No esquerda = null;
            No diereita = null;
            No paiDele = null;
        }


    public No<T> getEsquerda() {
        return this.esquerda;
    }

    public void setEsquerda (No<T> esquerda) {
        this.esquerda = esquerda;
    }

    public No<T> getdireita() {
        return this.direita;
    }

    public void setdireita(No<T> paiDele) {
        this.paiDele = paiDele;
    }

    public No<T> getpaiDele() {
        return this.paiDele;
    }

    public void setpaiDele(No<T> paiDele) {
        this.paiDele = paiDele;
    }

    }
}
