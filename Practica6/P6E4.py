"""RAUL NIÑO SALAS DAW1
Ejercicio 04
Escribe un programa que permita crear una lista de palabras y que, a continuación, pida una
palabra y elimine esa palabra de la lista. """

lista=[ ]
numero=input("¿Cuantas palabras tiene la lista? ")
for i in range(0,numero):
    palabra=raw_input("Dime una palabra: ")
    lista.append(palabra)
print lista
eliminar=raw_input("Dime la palabra que quieres eliminar: ")
lista.remove(eliminar)
print "La lista ahora es "+str (lista)
