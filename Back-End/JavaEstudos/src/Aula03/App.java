package Aula03; // Packages - Pacotes, Import - Importações e Estrutura de Pastas

import Aula03.br.com.projeto.gui.*;
import Aula03.br.com.projeto.gui.botoes.*;
import Aula03.br.com.projeto.videos.*;

public class App {
    public static void main(String[] args) {
        
        // Import videos
        Filme filme = new Filme();
        Anime anime = new Anime();
        Documentario documentario = new Documentario();
        Novela novela = new Novela();
        Serie serie = new Serie();

        // Import gui
        Janela janela = new Janela();
        Miniatura miniatura = new Miniatura();
            // Import botoes
            BotaoPlay botaoPlay = new BotaoPlay();
            BotaoPause botaoPause = new BotaoPause();
            BotaoVoltar botaoVoltar = new BotaoVoltar();
    }
}
