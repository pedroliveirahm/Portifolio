* [Comandos Específicos](#comandos-específicos)

# Origem dos Bancos de Dados
* Os primeiros computadores surgiram durante a década de 50 para uso militar e acadêmico.

* Antigamente os dados eram guardados em papel 
    * Da forma física : Fichas | Pastas | Armários
    * Da forma virtual :    Registros | Tabelas | Arquivos (B.D)

* A transição do armazenamento de dados da forma física para virtual aconteceu através dos arquivos sequênciais (dados eram guardados em sequência)

* Depois das fitas surgiram os discos (disquete e HDs) - armazenavam dados de forma direta (acesso direto)
    * Era possível guardar os registros através de índices dentro de tabelas

* Ná década de 60 o departamento de defesa dos EUA inicou o estudo dos bancos de dados

## Composição do B.D - B.S.L.P
    * Base de Dados (dados propriamente dito);
    * SGDB - Sitema gerenciador de banco de dados
    * Linguaguem de Exploração/Requisição (SQL)
    * Programas Adicionais (gerência de usuário, otimizadores de dados)   

## Modelos de B.D
    * Hierarquico - dados interligados de forma simplista, mas hierarquica
    * Modelo em rede
    * Relacionais - ao invés da hierarquia ou ligações de rede, eles teriam relações mais intrinsecas, eles teriam relação

## Princípios
    * B.D contém tabelas, tabelas contém registros, registros são compostos por campos|colunas.
    * Como os dados vão ser armazenados em disco, é preciso ter uma boa dimensão da atribuição dos tipos primitivos.

# MySQL
## Comandos Específicos

### DDL - Definição
* CREATE | DROP NDATABASE
* CREATE | DROP NTABLE ...
    * IF EXISTS & IF NOT EXISTS (CONSTRAINTS)
* ALTER | DROP TABLE NTABLE ... 
### DML - Manipulação
* INSERT INTO NTABLE VALUES
* UPDATE TABLE ...
* DELETE FROM TABLE ...
* TRUNCATE TABLE NTABLE
### DQL - Solicitações (Select)

### DCL - Controle 
* Quais usuários podem acessar o B.D, qual tipo de acesso,etc
    
### DTL - transações 
* Qualquer solicitação que pode ser feita para o B.D seguindo os 4 principios conhecidos como DICA
   * D.I.C.A - Durabilidade,Isolamento,Consistência, Atomicidade

### Java + MySQL (classe connection)

## Comandos de Checagem
* describe ntable; // mostra as colunas da tabela
* select * from table; // mostra quem / o que foi cadastrado na tabela

## Dicas
* Não se cadastra idade em B.D por mudar constantemente.
* Não é recomendado salvar imagens em BD.
# Tipos primitivos 
* São separados por famílias, que possuem subdivisões e subtipos.
    
### Númerico - Inteiro, Real e Lógico
    * Inteiro : TynyInt, SmallInt, Int, MediumInt, BigInt
    * Real : Decimal, Float, Double, Real
    * Lógico : Bit, Boolean 
### Data & Tempo
    * Date, DateTime, TimeStamp, Time, Year

### Literal - Caracter, Texto, Binário, Coleção
    * Character : Char(fixo) e Varchar(variante)
    * Texto : TinyText, Text, MediumText,LongText
    * Binário : TinyBlob, Blob, MediumBlob, LongBlob
    * Coleção : Enum, Set

### Espacial
    * Geometry, Pointm Polygon, MultiPolygon

# Aula 01
### Workbench
* create table pessoa (
    * nome varchar(30),
    * idade tinyint(3),
    * sexo char(1),
    * idade float,
    * altura float,
    * nacionalidade varchar(20)
* );

# Aula02
* parâmetros em SQL são chamados de `constraints`
* `collation` - ?é a ação?, definição dos caracteres
* default character set utf8 // UTF8 é o padrão de acentuação latino

### Workbench

* default collation utf8_general_ci;
* create table pessoa (
    * nome varchar(30) not null, // not null diz que o preenchimento é obrigatório
    * nascimento date, // data e tempo
    * sexo enum('M','F'), // coleção
    * peso decimal(5,2) // (total de casas, qtd max de casas após o ponto flutuante)
    * altura decimal(3,2), // numérico
    * nacionalidade varchar(20) default 'Brasil' // por padrão a nacionalidade é Brasil
* ) default charset utf8;

* describe pessoa // descreve as colunas | campos da tabela
### Registro de chave primária 
* através de um indentificador (id) - evita uma pessoa faça cadastro duas vezes

* create table pessoa (
    * id int not null auto_increment,
    * nome varchar(30) not null,
    * nascimento date, 
    * sexo enum('M','F'), 
    * peso decimal(5,2),
    * altura decimal(3,2),
    * nacionalidade varchar(20) default 'Brasil',
    * primary key(id)
* ) default charset utf8;

# Aula 03
### Comandos
* inset into nameTable 
* (coluna1,coluna2,...) 
* values 
* (valor1,valor2,...), ...; // Todos esses valores formam uma linha
### Workbench
* use cadastro;
* insert into pessoa
* ( id, nome, nascimento, sexo, peso, altura, nacionalidade ) 
* values
* ( '1', 'Godofredo', '1990-04-22', 'M', '78.5', '1.80', 'Brasil' ),
* ( default, 'Creuza', '1980-02-09', 'F', '52', '1.55', default),
* ( default, 'Romário', '1982-03-23', 'M','82.3', '1.78', 'Portugal'),
* ( default, 'Ana', '1978-11-28', 'F','54.3', '1.58', default);

* select * from pessoa; // mostra as pessoas cadastradas

# Aula 04
### Comandos
* alter table
    * add column;
    * modify column; // alterar o tipo primitivo e/ou a constraints
    * change column lastName newName tipoPrimitivo constraints;
    * rename to nameTable; // renomear a tabela
* constraints alter table
    * after colunaX // adicionar depois da coluna X
    * before colunaX // adicionar antes da coluna X
    * first // adicionar na primeira posição
        * se não colocar nada ele é predifinido como o ultimo
    * primary key // adicionar chave primária
* constraint de coluna 
    * unique != primary key - não é possível colocar 2 cursos com o mesmo nome
    * unsigned - sem sinal, só os números positivos
### Workbench
* alter table pessoa
* add column profissao varchar(10);

* desc pessoa;

* alter table pessoa
* drop column profissao;

* alter table pessoa
* add column profissao varchar (10) after nome;

* alter table pessoa
* modify column profissao varchar(20) first;

* create table if not exists curso (
	* idcurso int not null auto_increment,
	* nome varchar(30) not null unique,
    * descricao text,
    * carga int unsigned,
    * totalaulas int,
    * ano year default '2022',
    * primary key (idcurso)
* ) default charset = utf8;

* insert into curso
* (idcurso,nome,descricao,carga,totalaulas,ano)
* values
* (default, 'HTML5', 'Curso de HTML5', '40', '37','2022'),
* (default,'CSS','Curso de CSS', '60','40','2022'),
* (default,'Java', 'Curso de Java', '55','35','2022');

# Aula05 - Manipulando Linhas
* O banco de dados armazena tabelas, que, por sua vez armazena registros que são formados por colunas, que, por sua vez, são compostas por linhas
* Linhas são os dados que são cadastrados nas colunas
* As linhas podem ser vistas através do comando : select * from Table
* As colunas podem ser vistas através do comando desc ntable
* As linhas vem com uma proteção para alteração de linhas
### Comandos
* update Table
* set columnX = 'newValor', columnY = 'newValor', ...
* where column = 'valor' // se quiser modificar apenas a linha da coluna(X ou ID)
* limit qtdLinhas; // caso queira limitar quantas linhas vão poder ser afetadas - esse é um método de segurança
#
* delete from ntable // deleta o registroX de uma tabela
* where column = 'valor';
* truncate table cursos; // apaga todas os registros de uma tabela
### Workbench
* update curso
* set nome = 'JavaScript', totalaulas = '43'
* where idcurso = '3'
* limit qtdLinhas;

* uptade curso
* set totalaulas = '40'
* limit 3;

* Após desligar a ferramenta de proteção de alteração de linhas

* update curso 
* set ano = '2025'
* where ano = '2022';

