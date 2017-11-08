"""RAUL NIÑO SALAS, DAW 1. PRACTICA 5 EJERCICIO 5
Escriu un programa que te demani dos nombres cada vegada més grans i els guardi en una llista.
Per a terminar d'escriure els nombres, escriu un nombre que no sigui major a l'anterior. El
programa termina escribint la llista de nombres.."""

numeros=[ ]
n1=raw_input("Escribe un numero ")
n2=raw_input("Escribe uno mayor que "+n1+": ")
numeros.append(n1)

while n1<n2:
    numeros.append(n2)
    n2=raw_input("Escribe uno mayor que "+n2+", por favor ")
    
print "Los numeros que has escrito son",numeros
