package Aula04.festas; // sempre colocar modificador de acesso

// private - só quem está dentro da classe consegue ler ou alterar os atributos e métodos private
// public - quem está fora da classe consegue fazer um chamado
// default - é o padrão, quando não é colocado nada como modificador

public class Vip {

    // Modificador de acesso se aplica a um atributo de classe ou método
    // <modificador> <tipo> <nome-atributo>
    // Atributos devem ser private e se precisar haver uma alteração terá que ser
    // pelos métodos getters e setters
    public int qtdCafe = 30;
    public int qtdSalgado = 50;

    public void entrar() {
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    // <modificador> <retorno-método> <nome-método>
    private void beberCafe() {
        qtdCafe--; // qtdCafe = qtdCafe - 1;
        System.out.println("Bebeu 1 xicara de cafe\n");
    }

    private void comerSalgado() {
        qtdSalgado--; // qtdSalgado = qtdSalgado - 1;
        System.out.print("Comeu 5 salgados\n");
    }

    public void entrarVip(int i) {
    }
}
