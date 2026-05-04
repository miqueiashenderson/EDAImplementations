# Identificação

* Nome: Miquéias Henderson da Silva Santos 
* Email (@ccc): miqueias.henderson.da.silva.santos@ccc.ufcg.edu.br
* Matrícula: 124211400


## O template

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estão na classe AssertsMoveImpostor.java

    javac AssertsMoveImpostor.java ; java -ea AssertsMoveImpostor


# Simulado Prova

    Move impostor
    
    Escreva o método moveImpostor que encontra e move o impostor de um array
    de inteiros uma lista de inteiros. O impostor é o **primeiro** número que quebra uma sequencia em ordem crescente. Por exemplo, na sequência:
    
        1 2 4 3 7 90
    
    O impostor é o elemento 3.
    
    Além de encontrar o impostor, você deve posiciona-lo em seu devido lugar. 
    Para o exemplo acima, seu método deve alterar o array 
    para: 1 2 3 4 7 90.
    
    *Importante!* Só há um impostor. 
    Como dito anteriormente, é o primeiro elemento que quebra uma sequência ordenada.
    
    Veja outro exemplo:
    
    
        5 7 8 19 -4 4 1 6 8 12 81 3
        
        Nessa sequência, o impostor é o elemento -4. Após a execução do seu algoritmo, o array deve ficar neste estado:
    
        -4 5 7 8 19 4 1 6 8 12 81 3
    
    #### Funções que NÃO são permitidas
    Seu programa deve apenas manipular o array de inteiros.
    
        - insert
        - remove
        - pop
        - qualquer função de ordenação


## Entregando a prova

> ⚠️ **Importante:** Todos os comandos abaixo devem ser executados no **diretório pai** do projeto, ou seja, no diretório que **contém** o diretório `template-piloto-prova/`. 

---

### Passo 1: Gerar o arquivo compactado da sua solução

Execute o comando abaixo **no diretório pai** do projeto (o diretório que contém `template-piloto-prova/`):

```bash
tar zcvf nome-sobrenome-matricula.tar.gz template-piloto-prova/
```
---

### Passo 2: Submeter sua solução

Execute o comando abaixo **no mesmo diretório do Passo 1**:

```bash
bash template-piloto-prova/submit-answer.sh simulado nome-sobrenome-matricula.tar.gz
```

Importante: a senha é `leda`

## Importante

* A correção da prova não é automática. Os testes que são executados quando você roda localmente são apenas testes de sanidade.

* Vou considerar sempre a última submissão antes do deadline final. 

* A nota será dada pelos testes no servidor e depois da correção que eu efetuar. Sempre tento corrigir o mais rápido possível. Portanto, tenha paciência.

* A nota será calculada a partir dos testes e análise manual do código. Essa análise manual vai considerar se a solução é eficiente, se não tem loops desnecessários etc.

* Só serão corrigidas as provas dos alunos que assinaram a lista de presença física no laboratório.
