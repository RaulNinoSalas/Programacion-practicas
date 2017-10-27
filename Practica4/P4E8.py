"""RAUL NIÑO SALAS. DAW 1. PRACTICA 4. EJERCICIO 8.
Escriu un programa que demani l'amplada d'un triangle i ho dibuixi de la següent manera:"""


b=" "
n=int(input("Dime la base del triangulo "))
for i in range(n+1):
    b=" "
    for j in range(i):
        b=b+"*"
    print b
    
for k in range (n-1,0,-1):
     b=" "
     for l in range(k):
          b=b+"*"
     print b




        
