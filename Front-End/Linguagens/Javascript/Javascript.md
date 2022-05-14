<h4>Sumário</h4>

• [Variáveis](#variável)<br>
• [Constante](#constante)<br>
• [Tipos Primitivos](#tipos-primitivos)<br>
• [Tipagem Dinâmica](#tipagem-dinâmica)<br>
• [Objetos](#objetos)<br>
• [Arrays](#arrays)<br>
• [Funções](#função) <br>
* Operadores:<br>
    *  [Operadores Aritiméticos](#operadores-aritiméticos)<br>
    * [Operadores de Igualdade](#operadores-de-igualdade)<br>
    * [Operador Ternário](#operador-ternário)<br>
    *  [Operadores Lógicos](#operadores-lógicos)

• [Comparador Não Boleano](#comparador-não-boleano)<br>

# Variável
```bash
$Exemplo
let idade = 18;
let nome = 'Pedro';
```
```bash 
console.log(idade);
18
```
```bash
console.log(nome);
Pedro
```
```bash
console.log('Hello World');
Hello World
```

# Constante
• Só usar a função (let) se for preciso alterar os valores posteriormente<br><br>
• A variável constante não tem seu valor alterado posteriormente

```bash
$Exemplo
const valoringresso = 190;
let valoringresso = 200;
console.log('valoringresso');
#Error
```
• Nesse caso ocorrerá um erro, pois a varíavel do tipo (constante) não pode ser alterada
# Tipos Primitivos
```bash
let nome = 'rafael'; //string
let idade = 18; //number - float, double e int
let aprovado = true; //boolean
let sobrenome ; //undefined - em definição
let cor = null; //none - em casos para redefinir valor
```

# Tipagem Dinâmica
• O Js não precisa atribuir o tipo primitivo de dado a variável

```bash
let nome = 'Pedro';
typeof  nome
"string"
```
```bash
let idade = 18;
typeof idade
"number"
```
```bash
let cor = null;
typeof cor
"object"
```

# Objetos
```bash
$Exemplo
let nome = 'Pedro';
let sobrenome = 'Oliveira';
let idade = 18;
let estaAprovado = true;

let pessoa = {
    nome,
    sobrenome,
    idade,
    estaAprovado
};
```
• Uma classe chamada `pessoa` foi gerada
```bash
console.log(pessoa);
#Resultado:
estaAprovado: true
idade: 18
nome: "Pedro"
sobrenome: "Oliveira"
[[Prototype]]: Object
```
• No terminal:
```bash
pessoa.nome;
'Pedro'

typeof pessoa;
"object"
```
# Arrays

• Nada mais é do que um conjunto de dados que pode ser acessado por um indice

• E o índice é a posição exata de onde se encontra uma informação de um conjunto de informações
```bash
let idadefamilia = [18,36,40];
console.log(idadefamilia);
(3) [18, 36, 40]
0: 18
1: 36
2: 40
length: 3 
```
• Essa sequência numérica(0,1,2) são os Arrays
```bash
console.log(idadefamilia[2])
40
```
```bash
console.log(idadefamilia.length)
3
```

# Função
• Controla todo o fluxo de execução
- Entrada de dados
- Saida de dados

• Padrão a seguir (Boas práticas) 
- function verbo+Substantivo

```bash
let corSite = "azul";
function resetaCor() {
    corSite = "";
}
console.log(corSite);
resetaCor();
console.log(corSite);
#vazio
```
```bash
let corSite = "azul";
function resetaCor(cor) {
    corSite = cor;
}
console.log(corSite);
resetaCor("vermelho");
console.log(corSite);
#vermelho
```
```bash
let corSite = "azul";
function resetaCor(cor,tonalidade) {
    corSite = cor + ' ' + tonalidade;
}
console.log(corSite);
resetaCor("verde", "claro");
console.log(corSite)
#verde claro
```
# Operadores Aritiméticos
• + Adição <br>
• - Subtração<br>
• * Multiplicação<br>
• / Divisão<br>
• ** Exponenciação

• Operadores:
 - Incremento ++
 - Decremento --
```bash
let idade = 18;

console.log(idade++)
18
console.log(idade)
19
```
```bash
let idade = 20

console.log(++idade)
21
```

# Operadores de igualdade
```bash
console.log(1===1);
#true
```
• Está sendo tanto o valor quanto o tipo primitivo, também é o mais recomendado
```bash
console.log('1'===1);
#false
```
```bash
console.log('1'==1)
#true
```
• Está sendo comparado apenas o valor

# Operador Ternário 
```bash
let pontos = 100;
let tipocliente = pontos > 100 ? 'premium' : 'comum';
console.log(tipo)
#comum
```
```bash
let pontos = 120;
let tipocliente = pontos > 100 ? 'premium' : 'comum';
console.log(tipo)
#premium
```

# Operadores Lógicos
• Tomam decisões baseadas em condições multiplas
- And (Representado por &&)
- Or (Representado por )
- Not (Representado por )

* && Retorna true se os dois operandos forem true
```bash
console.log(true&&true);
true
```
```bash
console.log(true&&false);
false
```
```bash
// Pessoa x, só pode aplicar para carteira de habilitação caso houver: carteira de trabalho && maior que 18 anos

let maiorDeIdade = true;
let possuiCarteiraDeTrabalho = true;
let podeAplicar = maiorDeIdade&&possuiCarteiraDeTrabalho;

console.log(podeAplicar)
true
```

# Comparador não Boleano
• Falsy, são todos os valores:
* Undefined
* Null
* 0
* False
* '' (String vazio)
* NaN (not a number) - calculos matemáticos que resultam em resultados não compatíveis

• Truthy:
- True
- String
- Number
```bash
const corPadrao = 'Azul';
let corPersonalizada = 'Vermelho';
let corPerfil = corPadrao || corPersonalizada;
console.log(corPerfil);
Azul
```
• O || (Or) para de fazer a comparação ao aparecer o primeiro valor Truthy

# Trocar valores de Variáveis

let a = 'Azul'
let v = 'Vermelho'
let av = 
console.log(a)
console.log(b)