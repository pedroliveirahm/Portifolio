# Arrays (Vetores)
* São coleções de elementos que podem ser identificado por um índice
## Wrapper Class
* Uma classe que representa um tipo primitivo
* int -> Integer
* float -> Float
* double -> Double
* char -> Character
* -> String
## Array Estático
* Array = Array Estático
### Como Declarar :
* <tipo-primitivo/wrapper-class>[] <nome-array> = new <tipo-primitivo/wrapper-class>[x];
    * x é quantidade máxima de índices armazenáveis naquele array
```bash
String[] nomes = new String[3];
nome[0] = "Zé";
nome[1] = "Lé";
nome[2] = "Cleitinho";
```
```bash
for(int i = 0; i < nomes.length; i++) {
    System.out.println(nomes[i]);
}
```
## Array Dinâmico
* ArrayList = Array Dinâmico
    * È uma classe do JDK
    * Só aceita Wrapper Class
### Como Declarar : 
* ArrayList<wrapper-class> <nome-arrayList> = new ArrayList<wrapper-class>();
```bash
ArrayList<String> nomes = new ArrayList<String>();
nomes.add("Marquinhos"); # automaticamente índice 0 
nomes.add("Luquinhas"); # automaticamente índice 1
nomes.add("Aninha"); # automaticamente índice 2
```
* `.add` é um método públic, sendo a string, neste caso, um argumento
* e a contagem de índices é predefinida(default)
### Métodos
* `.add(value)` -> adicionar
```bash
    $Exemplo
ArrayList<Integer> numeros = new ArrayList<Integer>();
numeros.add(2);
numeros.add(1);
numeros.add(-2);
numeros.add(0);
numeros.add(-1);
```
* `size()` -> tamanho, função semelhante ao `.length`
```
System.out.println("O array possui tamanho de : " + numeros.size());
```
* `.get(index)` -> pegar
```bash
for (int i = 0; i < numeros.size(); i++) {
    System.out.println(numeros.get(i));
}
```
* `.remove(index)` -> remover
```bash
System.out.println("Imprimindo a sequência exceto o número 0" + numeros.remove(3));
for (int i = 0; i < numeros.size(); i ++) {
    System.out.println(numeros.get(i));
}
```
`.sort(nome-arrayList)` -> ordenar
```bash
Collections.sort(numeros);

for (int i = 0; i < numeros.size(); i ++) {
    System.out.println(numeros.get(i));
}
# -2, -1, 0, 1, 2 
```
# Foreach
* For() específico para arrays
* For (<wrapper-class> <nome-variável> : <array>) {}
    * <nome-variável> vai representar cada índice dentro do array
### Array Estático
```bash
int soma = 0;

Integer[] numeros = new Integer[4];
numeros[0] = 925;
numeros[1] = -291;
numeros[2] = -1050;
numeros[3] = 845;

for (Integer numero : numeros) {
     soma += numero;
}
System.out.println(soma);
```
### Array Dinâmico
```bash
ArrayList<String> nomes = new ArrayList<String>();
nomes.add("Sere");
nomes.add("Lepe");

for (String nome : nomes) {
    System.out.println(nome);
}
```