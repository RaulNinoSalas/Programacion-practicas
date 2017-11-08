"""RAUL NIÑO SALAS DAW 1
Ejercicio 09
Escribe un programa que permita crear una lista de palabras y que, a continuación, cree una
segunda lista con las palabras de la primera, pero sin palabras repetidas (el orden de las palabras
en la segunda lista no es importante). 
"""

lista=[ ]
lista2=[ ]

numero=input("¿Cuantas palabras tiene la lista? ")
for i in range(0,numero):
    palabra=raw_input("Dime una palabra: ")
    lista.append(palabra)
print "La lista creada es: "+str(lista)

for j in range (len(lista)):
    if lista[j] not in lista2:
        lista2.append(lista[j])

print "La lista sin repeticiones es: "+str(lista2)
