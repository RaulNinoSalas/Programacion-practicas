"""RAUL NIÑO SALAS DAW1
Ejercicio 02
Escribe un programa que permita crear una lista de palabras y que, a continuación, pida una
palabra y diga cuántas veces aparece esa palabra en la lista."""

lista=[ ]
numero=input("¿Cuantas palabras tiene la lista? ")
for i in range(0,numero):
    palabra=raw_input("Dime una palabra: ")
    lista.append(palabra)
print lista

repeticion=raw_input("Dime la palabra ")

print repeticion+" esta palabra esta "+str (lista.count(repeticion))+" veces"
