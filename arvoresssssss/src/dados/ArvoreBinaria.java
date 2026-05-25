public class ArvoreBinaria {
    private No<T> raiz;
    
    public ArovreBinaria(){
        this.raiz = null;
    }

    public void AdcionaRaiz(T valor){
        No<T> novo = No(valor); 
        if(raiz == null){
            raiz = novo;
        }else{
            if(novo <= raiz){
                raiz.setEsquerda(novo);
                raiz.esquerda.setPaiDele(raiz);
            }
            if(novo >= raiz){
                raiz.setDireita(novo);
                raiz.esquerda.setPaiDele(raiz);
            }
        }
    }


    public class No<T>{
        private T dado;
        private No esquerda;
        private No direita;
        private No paiDele;

        public No<T>(T valor){
            dado = valor;
            private No esquerda = null;
            private No diereita = null;
            private No paiDele = null;
        }


    public No<T> getEsquerda() {
        return this.raiz;
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
