"""RAUL NI�O SALAS DAW1 PRACTICA 6
Ejercicio 01
Escribe un programa que permita crear una lista de palabras. Para ello, el programa tiene que
pedir un n�mero y luego solicitar ese n�mero de palabras para crear la lista. Por �ltimo, el
programa tiene que escribir la lista."""

lista=[ ]
numero=input("�Cuantas palabras tiene la lista? ")
for i in range(0,numero):
    palabra=raw_input("Dime una palabra: ")
    lista.append(palabra)
print "La lista final es "+str (lista)
