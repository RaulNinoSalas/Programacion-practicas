"""RAUL NI�O SALAS. DAW1. PRACTICA 4 EJERCICIO 6. Escriu un programa que demani l'al�ada d'un triangle i ho dibuixi de la seg�ent manera:"""

b=""
n=int(input("Dime lo alto que es el triangulo "))
for i in range(n+1):
    for j in range(i):
        b=b+"*"
    b=b+"\n"
print b
