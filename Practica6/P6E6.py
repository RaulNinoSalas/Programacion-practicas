"""RAUL NI�O SALAS DAW 1
Ejercicio 06
Escribe un programa que permita crear una lista de palabras y que, a continuaci�n, cree una
segunda lista igual a la primera, pero al rev�s (no se trata de escribir la lista al rev�s, sino de crear
una lista distinta). """

inversa=[ ]
lista=[ ]
numero=input("�Cuantas palabras tiene la lista? ")
for i in range(0,numero):
    palabra=raw_input("Dime una palabra: ")
    lista.append(palabra)
print "La lista creada es: "+str (lista)

for j in lista:
    inversa= [j] + inversa
print "Y a la inversa "+str (inversa)


