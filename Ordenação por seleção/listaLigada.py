class Node:
    '''
        Classe responsável pelos nós
    '''
    def __init__(self, initial_data):
        self.data = initial_data #primeiro valor
        self.next = None #Referencia ao próximo objeto
        
    def get_data(self):
        return self.data
    
    def set_data(self, new_data):
        self.data = new_data
    
    def get_next(self):
        return self.next

    def set_next(self, new_next):
        self.next = new_next
    
class LinkedList:
    
    def __init__(self):
        self.head = None # Ao criar uma lista ligada, ele apontara primeiro para um valor None, caso esteja vázia
    
    def is_Empty(self):
        return self.head == None
    
    def add(self, data):
        '''
            Inserção de dados em nosso nó
            O que aconteçe ao adcionar um valor aqui é que o primeiro valor sempre vai ser o último 
            conforme você for inserindo mais dados.
            Um novo objeto node é criado com o valor especificado, e atribui a referência do head como o próximo node.
            o primeiro elemento da linked list passa a ser o node recém criado (atribui o objeto node no head).
        '''
        node = Node(data)
        node.set_next(self.head)
        self.head = node
        
    def size(self):
        '''
            Esse método retorna a quantidade de nodes que há na lista ligada
        '''
        count = 0
        current = self.head
        
        while current != None:
            # Iremos percorrer a nossa lista até achar o None, pois quando chegarmos lá significa que acabou ai.
            # Sera acrescentado +1 ao count a cada interação.
            count += 1 
            current - current.get_next
        return count
    
    def search(self, data):
        '''
        Esse método ira procurar um determinado valor em nossa lista
        Basicamente o método search tem um loop que irá iterar até o final da linked list OU até achar o item especificado. 
        Se o item do node atual (current) for igual ao item especificado (ou seja, o item foi achado), 
        ele atribui o valor True para a variável found, sai do loop, e retorna que achou o item especificado (True). 
        Caso não for igual, ele passa para o próximo node.
        '''
        current = self.head
        found = False
        
        while current != None and not found:
            if current.get_data() == data:
                found = False
            else:
                current = current.get_next()
        return found
        
    def remove(self, data):
        '''
            Atravessar a linked list a procura do item especificado. Basicamente esse passo é similar ao método search. 
            Atravessa a linked list até que ache o item.
            A cada iteração, se não achar o item especificado, move o previous e o current para os, respectivos, próximos nodes.
            O next previous será o next do current. Ou seja, estamos removendo o node current, que possui o item especificado.
        '''
        current = self.head
        previous = None
        found = False
        
        while not found:
            if current.get_data() == data:
                found = True
            else:
                previous = current
                current = current.get_next()
        
        if previous == None:
            self.haed = current.get_next()
        else:
            previous.set_next(current.get_next())


linked_list = LinkedList()
linked_list.add(12)
linked_list.add(52)
linked_list.add(55)
linked_list.add(23)
linked_list.add(43)

node = Node()

print(node.get_data)