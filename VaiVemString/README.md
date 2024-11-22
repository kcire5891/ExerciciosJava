# Desafio

Dada uma String "str" e um inteiro positivo "X", onde o tamanho de "str" é SEMPRE maior que "X", determine a String resultante da quebra da "str" em "X" linhas e reordenando-as no padrão "Vai e Vem". Se a quebra não for exata, intercale os caracteres remanescentes entre o começo e fim da String resultante. No "Vai e Vem", linhas pares têm o conteúdo invertido.

Exemplo 1:

Entrada: str = "SEMSOBRAS", X = 3

Quebra:

```
["SEM"]
["SOB"]
["RAS"]
```
Resultado: SEMOBRASAG

Exemplo 2:

Entrada: str = "HELLOWISECODE", X = 3

Quebra:

```
["HELL"]
["OWIS"]
["ECOD"]
["E"]
```
Resultado: EHELLSIWOECOD

Exemplo 3:

Entrada: str = "STRINGCOMSOBRAFOUR", X = 5

Quebra:

```
["STR"]
["ING"]
["COM"]
["SOB"]
["RAF"]
["OUR"]
```
Resultado: ROSTRGNICOMBOSRAFU

Note que "X" não é o número de caracteres, mas o número mínimo de quebras (mínimo de linhas quando não há sobra).