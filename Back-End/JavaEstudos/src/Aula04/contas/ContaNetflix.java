package Aula04.contas;

public class ContaNetflix {
    // Atributos
    private String idiomaPreferencial = "PT-BR";
    private String resolucaoPreferencial = "FULL-HD";
    
    // Método Construtor (Aula06)
    // ...

    // Métodos Específicos
    private void carregarIdioma() {
        
        // Operadores lógicos : == Igual, || Ou
        if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US") {
            System.out.println("Com o idioma " + idiomaPreferencial);
        
        } else {
            System.out.println("Com o idioma PT-BR");
        }
    }

    private void carregarResolucao() {

        if (resolucaoPreferencial == "FULL-HD") {
            System.out.println("Em FULL-HD");
        }
    }

    private void buscarPreferenciaUsuario() {
        
        carregarIdioma(); //método
        carregarResolucao(); //método
    }

    public void assistirFilme(String nomeFilme) { //parâmetro
        
        System.out.println("Carregando o filme " + nomeFilme); 
        
        buscarPreferenciaUsuario(); //método
    }
    
    // Métodos getters e setters (Aula05)
    //...
}


// Premissa (Algoritmo)
    // Acesso apenas ao entrar : mostrando as preferências do user
        // preferências do user : resolução, idioma
            // private void bucarPreferenciaUsuario
            // resolução <- atributo 
            // idioma <- método
                // poderia ser tanto método como atributo

            // public assistirFilme