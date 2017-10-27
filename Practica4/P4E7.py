"""RAUL NIÑO SALAS. DAW1. PRACTICA 4 EJERCICIO 7.
Escriu un programa que demani l'alçada d'un triangle i ho dibuixi de la següent manera:"""

b=" "
n=int(input("Dime la base del triangulo "))
for i in range (n,0,-1):
     b=" "
     for j in range(i):
          b=b+"*"
     print b
