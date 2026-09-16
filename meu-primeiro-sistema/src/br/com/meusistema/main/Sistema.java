package br.com.meusistema.main;

// avisa que usará a classe
import br.com.meusistema.model.Carro;

public class Sistema {
    public static void main(String[] args) {
        System.out.println("Iniciando o sistema...");

        // cria e instacia o objeto carro 1
        Carro meuCarro = new Carro();
        meuCarro.setModelo("Fusca");
        meuCarro.setCor("azul");
        meuCarro.setVelocidade(-500);
        meuCarro.buzinar(); // chama o comportamento do objeto
    }
}
