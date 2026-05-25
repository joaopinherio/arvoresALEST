package app;
import dados.*;

public class App {
    ArvoreBinaria arvoreBin;
    
    public App(){
        arvoreBin = new ArvoreBinaria();
    }

    public void executar(){
        arvoreBin.AdcionaRaiz(1);
    }
}
