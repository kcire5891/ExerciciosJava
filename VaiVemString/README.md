# Desafio

Dada uma String "str" e um inteiro positivo "X", onde o tamanho de "str" é SEMPRE maior que "X", determine a String resultante da quebra da "str" em "X" linhas e reordenando-as no padrão "Vai e Vem". Se a quebra não for exata, intercale os caracteres remanescentes entre o começo e fim da String resultante. No "Vai e Vem", linhas ímpares têm o conteúdo invertido.

Exemplo 1:

Entrada: str = "SEMOBRASAG", X = 3

Quebra:

```
SEM
OBR
SAG
```
Resultado: SEMOBRASAG

Exemplo 2:

Entrada: str = "HELLOIMTESTCODE", X = 4

Quebra:

```
HELL
OIMT
ESTC
ODE
```
Resultado: HELLOIMTSETCODE

Exemplo 3:

Entrada: str = "STRINGCOMSOBRAFOUR", X = 5

Quebra:

```
STRIN
GCOMS
OBRAF
OUR
```
Resultado: POSTRINGCOMSOBRAFU

Note que "X" não é o número de caracteres, mas o número mínimo de quebras (mínimo de linhas quando não há sobra).