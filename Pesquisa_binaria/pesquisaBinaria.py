'''
baixo e alto é uma representação do menor número da lista e o maior.
meio se preocupa em dividir a lista no meio
chute recebe o valor do meio
se o chute for igual ao item, achou
se o chute for maior que o item, -1 no fim da lista
se o chute for menor que o item, +1 no começo da lista
caso não seja encontrado retorna None
'''

def pesquisa_binaria(lista, item):
    baixo = 0
    alto = len(lista) - 1

    while baixo <= alto:
        meio = (baixo + alto) // 2
        chute = lista[meio]

        if chute == item:
            return meio
        if chute > item:
            alto = meio - 1
        else:
            baixo = meio + 1
    return None


minha_lista = [1, 3, 5, 7, 9]
print(minha_lista, "\nValor que estamos procurando: 3\nSe encontra no endereço: ", pesquisa_binaria(minha_lista, 3))
print(minha_lista, "\nValor que estamos procurando: 2\nSe encontra no endereço: ", pesquisa_binaria(minha_lista, -1))
