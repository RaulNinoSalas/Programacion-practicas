"""RAUL NI�O SALAS. DAW1. PRACTICA 4 EJERCICIO 7.
Escriu un programa que demani l'al�ada d'un triangle i ho dibuixi de la seg�ent manera:"""

b=" "
n=int(input("Dime la base del triangulo "))
for i in range (n,0,-1):
     b=" "
     for j in range(i):
          b=b+"*"
     print b
