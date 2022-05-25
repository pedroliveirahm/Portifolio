# Paradigmas da Programação
* Imperativo - máquina de turing
     * Davam comandos de passo a passo do que a máquina teria que fazer
     * Geravam códigos muito grandes, logo, era um código de difícil manuntenção
* Procedural - aqui surge as funções/método, o que diminui o tamanho do código
* Estrutural - surgue condicionais, loops, diminuindo mais ainda o tamanho do código
* Orientado a objetos - trazer o mundo real para a programação, aqui surge as classes e os conceitos de objeto (polimorfismo, herança, encapsulamento)
# Paradigmas Declarativos
* Se preocupam em como fazer, e não como foi feito
* Programação Funcional - surgiu para ser mais rápida que a p.o.o
* Programação Lógica
* Linguagens de marcação
     * HTML, XML, SQL
# C++
* Linguagem multiparadigma
     * Paradigma da programação procedural
          * Tudo que está dentro da função main vai ser executada de forma sequêncial
     * Paradigma da programação orientada a objetos
## Variáveis
### Tipagem
* Dinâmica - é preciso atribuir o tipo primitivo de dado à variável
### Tipos Primitivos
* `string` nome = "Pedro";
     * è necessário incluir biblioteca
     ```bash
     #include <string>
     ```
* `int` numeroInteiro = 10;
* `float` numeroFlutuante1 = 1.6235; 
     * precisão de +- 6 casas decimais;
* `double` numeroFlutuante2 = 1.6235; 
     * precisão de +- 10 casas decimais;
* `char` sexo = 'M';
* `bool` escolha = true; 
## Entrada e Saída de Dados
* Incluir biblioteca :
```bash
#include <iostream>
using namespace std;
```
### Entrada
* Função : `cout` <<;
### Saída
* Função : `cin` >>;
## Condicionais
* if...else if...else
* switch() {case : ;}
## Laços de Repetição
* for
* while
* do...while

