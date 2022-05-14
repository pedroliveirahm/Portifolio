package UpAula04.classes;

import javax.swing.JOptionPane;

public class Vip {

        // Atributos
        private String openBar = "Open Bar";
        private String openFood = "Open Food";
        private int senhaVip = 1234;

        // Método Construtor
        // ...
        
        // Métodos Específicos
        public void checarSenhaVip() {

                // Todo valor colocado dentro da biblioteca JOptionPane é do tipo string
                // Float.parseFloat() transforma string em float
                // Double.parseDouble() transforma string em double
                // Integer.parseInt() transforma string em inteiro
                int checagem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Senha : ", "Senha VIP",
                                JOptionPane.INFORMATION_MESSAGE));

                if (checagem == senhaVip) {

                        entrouVip();

                } else {
                        JOptionPane.showMessageDialog(null,
                                        "Senha incorreta, mas na lista de convidados comuns também temos ótimas opções :", "Incorreto", JOptionPane.INFORMATION_MESSAGE);
                        naoEntrouVip();
                }
        }

        private void entrouVip() {

                String disponibilidadeVip = openBar + "\n" + openFood;
                JOptionPane.showMessageDialog(null, "Parabéns! Você tem acesso ao :\n" + disponibilidadeVip, "Vip",
                                JOptionPane.INFORMATION_MESSAGE);
        }

        private void naoEntrouVip() {

                Festa festa = new Festa();
                festa.naoQuerVip();
        }

        // Métodos getters e setters
        public String getOpenBar() {
                return openBar;
        }

        public void setOpenBar(String openBar) {
                this.openBar = openBar;
        }

        public String getOpenFood() {
                return openFood;
        }

        public void setOpenFood(String openFood) {
                this.openFood = openFood;
        }

        public int getSenhaVip() {
                return senhaVip;
        }

        public void setSenhaVip(int senhaVip) {
                this.senhaVip = senhaVip;
        }

        // public String getSenhaVip() {
        // return senhaVip;
        // }

        // public void setSenhaVip(String senhaVip) {
        // this.senhaVip = senhaVip;
        // }

        // public String getChecagemSenha() {
        // return checagemSenha;
        // }

        // public void setChecagemSenha(String checagemSenha) {
        // this.checagemSenha = checagemSenha;
        // }
}
