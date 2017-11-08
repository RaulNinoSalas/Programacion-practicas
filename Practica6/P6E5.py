
"""RAUL NIÑO SALAS DAW1
Ejercicio 05
Escribe un programa que permita crear dos listas de palabras y que, a continuación, elimine de la
primera lista los nombres de la segunda lista. 
"""

lista=[ ]
numero=input("¿Cuantas palabras tiene la lista? ")
for i in range(0,numero):
    palabra=raw_input("Dime una palabra: ")
    lista.append(palabra)
print lista
lista2=[ ]
numero2=input("Dime cuantas palabras quieres eliminar: ")
for j in range (0,numero2):
    palabra2=raw_input("Dime cual: ")
    lista2.append(palabra2)
    lista.remove(palabra2)
print "Quieres eliminar "+str (lista2)
print "La lista final es "+str (lista)
