
"""RAUL NIÑO SALAS. DAW 1. PRACTICA 5. EJERCICO 6
Escriu un programa que demani primer dos nombres (màxim i mínim) i que després te demani 2
nombres situats entre ells. Per a terminar d'escriure nombres, escriu un nombre que no sigui
comprès entre els dos valors inicials. El programa termina escribint la llista de nombres."""

lista=[ ]
n1=raw_input("Escribe un numero ")
n2=raw_input("escribe uno mayor que "+n1+" ")

while n1>=n2:
    n2=raw_input("Escribe un numero mayor que "+n1+" ")

while n2>=n1:
    n3=raw_input("Escribe numeros entre estos dos "+n1+" y "+n2+" ")
    lista.append(n3)
    (n3>=n1 and n3<=n2)
print "Los numeros que has escrito entre estos dos son ",lista        
