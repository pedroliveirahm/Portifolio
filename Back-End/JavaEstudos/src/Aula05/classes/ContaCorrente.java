package Aula05.classes;

public class ContaCorrente {

    private double saldo = 1200;

    // set -> alterar saldo
    // get -> retornar saldo

    public void setDepositar(double valor) {
       
        if (valor < 0) {
            
            System.out.println("Nao ha como depositar numero negativo");
        
        } else {

            saldo = saldo + valor;  
        }
        
    }

    public double getSaldo() {
        return saldo;
    }
}
