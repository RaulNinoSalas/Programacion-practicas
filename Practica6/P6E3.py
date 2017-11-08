
"""RAUL NIÑO SALAS DAW1
Escribe un programa que permita crear una lista de palabras y que, a continuación, pida dos
palabras y sustituya la primera por la segunda en la lista."""


lista=[ ]
numero=input("¿Cuantas palabras tiene la lista? ")
for i in range(0,numero):
    palabra=raw_input("Dime una palabra: ")
    lista.append(palabra)
print lista

palabra=raw_input("Dime la palabra que quieres sustituir: ")
lista.remove(palabra)
sustituir=raw_input("por cual: ")
lista.append (sustituir)
print "La lista modificada es"+str (lista)
