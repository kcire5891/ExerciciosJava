# Desafio

Um array de strings no formato JSON, conforme exemplo abaixo, pede para retornar um novo JSON Array formado pelos
anagramas encontrados no array original.

Exemplo de Entrada:

```
json
    [
        {"str": "amor"},
        {"str": "roma"},
        {"str": "ignorado"},
        {"str": "bolo"},
        {"str": "nada"},
        {"str": "lobo"}
    ]
```

Exemplo de Saída:

```
json
    [
        {"anagramas": ["amor", "roma"]},
        {"anagramas": ["bolo", "lobo"]}
    ]
```

Atenção: A resposta deve estar na ordem em que os termos aparecem.

Dicas:

Use e abuse da biblioteca Gson (https://github.com/google/gson).

Conceito de anagrama: https://pt.wikipedia.org/wiki/Anagrama.