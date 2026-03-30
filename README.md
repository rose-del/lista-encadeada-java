# Lista Encadeada em Java

Lista Encadeada Simples (Singly Linked List) em Java, utilizando nós conectados sequencialmente por referências. O objetivo é demonstrar o funcionamento interno de uma estrutura de dados dinâmica, muito utilizada em algoritmos e aplicações que exigem inserções e remoções eficientes.

## Como Funciona a Lista Encadeada Simples

Na lista encadeada simples, cada nodo aponta apenas para o próximo elemento.

Estrutura ilustrativa:

```
[10] → [20] → [50] → [100] → [35] → [80] → [18] → [45] → NULL
```

Isso significa que:

* A navegação ocorre apenas **em um único sentido**
* Não há referência para o nodo anterior
* Inserções e remoções são feitas ajustando referências

## Estrutura do Projeto

O projeto é composto por **3 classes principais**:

### `Nodo`

Representa cada elemento da lista.

Cada nodo contém:

* `valor` → valor armazenado
* `prox` → referência para o próximo nodo

### `ListaEncadeada`

Classe responsável por gerenciar a lista encadeada.

#### Atributos:

* `primeiro` → referência para o primeiro nodo
* `tamanho` → quantidade de elementos

#### Métodos Implementados:

| Método                         | Descrição                             |
| ------------------------------ | ------------------------------------- |
| `size()`                       | Retorna o tamanho da lista            |
| `addElemento(int elemento)`    | Adiciona elemento no final            |
| `add(int index, int elemento)` | Insere elemento em posição específica |
| `get(int index)`               | Retorna o nodo em uma posição         |
| `remove(int index)`            | Remove elemento em uma posição        |

### `Main`

Classe responsável por testar e demonstrar o funcionamento da lista.

Ela executa:

* Inserções no final
* Inserções em posições específicas
* Acesso a elementos
* Remoção de elementos
* Impressão da lista

## Exemplo de Execução

Saída esperada ao executar o programa:

```
Tamanho da lista: 8
Elemento na posição 1: 20
Tamanho após remover: 7

Posição 0: 10
Posição 1: 50
Posição 2: 100
Posição 3: 35
Posição 4: 80
Posição 5: 18
Posição 6: 45
```

## Como Executar

### 1. Clone o repositório

```bash
git clone https://github.com/rose-del/lista-encadeada-java.git
```

### 2. Compile os arquivos

```bash
javac *.java
```

### 3. Execute o programa

```bash
java Main
```
