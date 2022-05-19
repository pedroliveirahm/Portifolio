# O que é o DOM
* Modelo de Objeto de Documentos
* Basicamente, é um conjunto de objetos dentro do navegador que da acesso aos componentes do website
## Arvore DOM
* `window` (janela)
    * `location` - diz qual a localização do site : url, página atual, qual foi a página anterior
    * `document` - documento atual
        * html
            * head 
                * meta, title
            * body
                * h1
                * p
                * p
                    * strong
                * div
    * `history` - de onde veio para onde vai   

# Elementos
* Elemento é qualquer coisa que aparecer na arvore DOM
* Seleciona-se esses elementos para navegar dentro da arvore DOM
## Métodos de Acesso a Arvore DOM
### Marca (TAG)
* getElementsByTagName(); 

```bash
var paragrafo = window.getElementsByTagName('p')[0];
var corpo = window.document.body;

window(pode ser ocultado).document.write(paragrafo.innerText);
# imprime no documento o que está escrito na tag p, em excessão da tag <strong>, no qual é um child da tag p
document.write(paragrafo.innerHTML);
# imprime no documento o que está escrito na tag p, e também seus chieldrens (filhos)

p.style.color = 'blue';
# muda a cor da tag p para blue

corpo.style.background = 'black';
# muda a cor do body para black
```
### ID
* getElementById();

### Nome
* getElementsByName();

### Classe
* getElementsByClassName();

### Seletor
* querySelector();
* querySelectorAll();

```bash
var msg = document.querySelector('div#msg');
# a variável msg se refere a uma div com id msg

var title = document.querySelector('h2.title')
# a variável msg se refere a um h2 com class title
```
# Eventos do DOM
* Tudo que possa acontecer com o elemento
### Mouse
    * O mais comum : `mouseenter` (eventos do mouse)  - quando o mouse passa por cima do objeto
    * `mouseout` - quando move-se o mouse para fora do objeto
    * `mousemovie` - quando o mouse move dentro do objeto
    * `mousedown` - ação ao clicar e segurar o botão do mouse
    * `mouseup` - ação ao soltar o botão do mouse
    * `click` - ação de apertar e soltar rapidamente o botão do mouse

```bash
<body>
    <div id="area">Interaja...</div>

    <script>
        var area = document.getElementById('area');

        area.addEventListener('click', clicarMouse);
        area.addEventListener('mouseenter', entrarMouse);
        area.addEventListener('mouseout', sairMouse);

        function clicarMouse() {
            area.innerText = 'Clicou !';
            area.style.background = 'red';
        }

        function entrarMouse() {
            area.innerText = 'Entrou !';
        }

        function sairMouse() {
            area.innerText = 'Saiu !';
            area.style.background = 'greenyellow';
        }
    </script>
</body>
```

```bash
<body>
    <h1>Somando valores</h1>
    <input type="number" name="txtn1" id="txtn1">
    <input type="number" name="txtn2" id="txtn2">
    <input type="button" value="Somar" onclick="somar()">
    <div id="res">Resultado</div>
    
    <script>
        function somar() {
            var tn1 = document.getElementById('txtn1')
            var tn2 = document.querySelector('input#txtn2')
            var res = document.getElementById('res')

            var n1 = Number(tn1.value) 
            var n2 = Number(tn2.value)

            var calculo = n1 + n2

            res.innerHTML = `A soma entre ${n1} e ${n2} é igual a <strong>${calculo}</strong>`
        }
    </script>
</body>
```
### Correção de Erro
* Através do DevTools
    * Na opção 'layout' é possível saber qual linha não conseguiu ser interpretada, provavelmente o problema estará nas linhas a cima da não lida.
