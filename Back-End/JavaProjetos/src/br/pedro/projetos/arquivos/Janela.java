package br.pedro.projetos.arquivos;

// Bibliotecas
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Janela extends JFrame{

    // Método construtor
    public Janela() {

        this.setVisible(true);
        this.setBounds(240, 70,600,600);
        
        CardLayout controleTela = new CardLayout();
        JPanel telas = new JPanel(controleTela);

        LoginPanel login = new LoginPanel(telas);
        PrincipalPanel principal = new PrincipalPanel(telas);
        
        telas.add(login, "Tela Login");
        telas.add(principal, "Tela Principal");

        this.add(telas);

        
        // Janela -> TV 
        // LoginPainel -> Canal 1
        // PrincipalPainel -> Canal 2
    }
    
}
