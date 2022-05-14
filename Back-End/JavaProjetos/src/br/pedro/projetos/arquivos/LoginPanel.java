package br.pedro.projetos.arquivos;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;
import java.awt.*;

public class LoginPanel extends JPanel implements ActionListener {
    
    private JPanel telas;
    private CardLayout controleTela;

    // Método Construtor
    public LoginPanel(JPanel telas) {
        
        // LayoutManager -> CardLayout
        this.telas = telas;
        this.controleTela = (CardLayout) telas.getLayout();

        JLabel mensagem = new JLabel("Conteúdo do LoginPainel");
        this.add(mensagem);

        JButton botao = new JButton("Fazer Login");
        this.add(botao);
        botao.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        controleTela.show(telas, "Tela de Início");
    }
    
}
