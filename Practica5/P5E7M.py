"""RAUL NIÑO SALAS. DAW 1. PRACTICA 5. EJERCICIO 7.
Escriu un programa que demani un nombre (límit) i després et demani nombres fins a què la suma
dels nombres introduits superi un nombre inicial. El programa termina escribint la llista de
nombres."""

lista=[ ]
limit=int(raw_input("Escribe el limite: "))

while lista<limit: 
    n=int(raw_input("Escribe valores hasta que su suma supere el limite"))
    lista.append(n)
    
