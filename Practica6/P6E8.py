"""RAUL NI�O SALAS DAW 1
Ejercicio 08
Escribe un programa que permita crear una lista de palabras y que, a continuaci�n, ordene la lista
por orden alfab�tico. """

lista=[ ]
numero=input("�Cuantas palabras tiene la lista? ")
for i in range(numero):
    palabra=raw_input("Dime una palabra: ")
    lista.append(palabra)
print lista
lista.sort()
print "La lista ordenada es: "+str(lista)

