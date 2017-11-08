"""RAUL NIÑO SALAS DAW 1 PRACTICA 5 EJERCICIO 2. Escriu un programa que te demani nombres i els guardi en una llista. Per a terminar d'introduir
nombres, simplement pitja Enter. El programa termina escrivint la llista de nombres."""


numero=raw_input("Escribe un numero ")

numeros=[]

while numero!="":

    numeros.append(float(numero))
    numero=raw_input("Escribe otro ")

print numeros

