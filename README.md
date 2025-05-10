# DiaMesAno
#  Projeto: Diferença entre Datas (Dia, Mês e Ano)

Este é um programa simples em Java que calcula a diferença entre a **data de nascimento** informada pelo usuário e a **data atual**, informando a quantidade de dias, meses e anos de diferença.

---

##  Objetivo

- Praticar leitura de dados com `Scanner`
- Utilizar a classe `Calendar` para capturar a data atual do sistema
- Aplicar operações matemáticas com `Math.abs`
- Consolidar a lógica de comparação entre datas

---

##  Funcionamento

O programa segue os seguintes passos:

1. Solicita ao usuário:
   - Dia de nascimento
   - Mês de nascimento
   - Ano de nascimento
2. Captura automaticamente:
   - Dia atual
   - Mês atual
   - Ano atual
3. Calcula a **diferença absoluta** entre cada unidade de tempo usando `Math.abs`
4. Exibe o resultado no terminal

###  Observação
Este programa **não calcula a idade exata completa**, apenas a **diferença numérica isolada** entre os valores de dia, mês e ano. Ele não leva em conta o calendário ou a progressão correta das datas (ex: 31/12 para 01/01).
