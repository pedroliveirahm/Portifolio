package br.pedro.projetos.arquivos;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.*;
import java.awt.*;

public class PrincipalPanel extends JPanel implements ActionListener{
    
    // Atributos
    private JPanel telas;
    private CardLayout controleTela;
    
    // Método Construtor
    public PrincipalPanel(JPanel telas) {
        
        JLabel mensagem = new JLabel("Conteúdo do PrincipalPainel");
        this.add(mensagem);

        JButton botao = new JButton("Voltar");
        this.add(botao);
        botao.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
}
