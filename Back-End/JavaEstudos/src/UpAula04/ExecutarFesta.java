package UpAula04;

import javax.swing.JOptionPane;

import UpAula04.classes.Festa;

public class ExecutarFesta {
    public static void main(String[] args) {
        
        ExecutarFesta exe = new ExecutarFesta();

    }

    // Atributo 
    private String convidado;

    // Método Construtor
    public ExecutarFesta() {

        setConvidado(JOptionPane.showInputDialog(null, "Bem vindo a festa! Como se chama ?"));
        
        JOptionPane.showMessageDialog(null, "Bem Vindo Sr. " + convidado);

        Festa festa = new Festa();
        festa.desejaVip();
        
    }

    // Métodos Específicos
    // ...

    // Métodos getters e setters 
    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

}
