package UpAula04.classes;

import javax.swing.JOptionPane;

public class Festa {
    // Atributos
    String convidado;
    String refriDisponivel = "Coca Cola, Guaraná";
    String bebidaDisponivel = "Heineken, Budwaiser";
    String comidaDisponivel = "Coxinha, Empadao";

    // Método Construtor
    // ..

    // Métodos Específicos
    public void desejaVip() {

        // Gambiarra : String -> Char
        String confirmacaoVip = JOptionPane.showInputDialog(null, "O Sr. deseja entrar para lista VIP ?");
        char confirmacaoVipChar = confirmacaoVip.charAt(0); // O Index 0 recebe apenas a primeira letra do que vai ser escrito

        if (confirmacaoVipChar == 's' || confirmacaoVipChar == 'S') {

            // Quero chamar o método construtor da classe VIP checarSenhaVip
            Vip vip = new Vip();
            vip.checarSenhaVip();

        } else if (confirmacaoVipChar == 'n' || confirmacaoVipChar == 'N') {

            JOptionPane.showMessageDialog(null, "Boas Festas!", "Okay Sr.", JOptionPane.INFORMATION_MESSAGE);
            
            naoQuerVip();

        }

    }

    public void naoQuerVip() {

        String disponibilidade = String.format("Bebidas : %s\nComidas : %s\n Refris : %s", bebidaDisponivel,
                comidaDisponivel, refriDisponivel);

        JOptionPane.showMessageDialog(null, disponibilidade, "Estão disponíveis os seguintes itens :\n",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Métodos getters e setters
    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }
}
