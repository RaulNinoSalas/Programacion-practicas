
"""RAUL NIÑO SALAS DAW1 PRACTICA 5 EJERCICIO 1.
Escriu un programa que te demani paraules i les guardi en una llista. Per a terminar d'introduir
paraules, simplement pitja Enter. El programa termina escribint la llista de paraules."""

palabra=raw_input("Escribe una palabra ")


palabras=[]

while palabra!="":

    palabras.append(palabra)
    palabra= raw_input("Escribe otra palabra ")
        
print palabras
    
