"""RAUL NIÑO SALAS. DAW 1. PRACTICA 4. EJERCICIO 9.
Escriu un programa que demani l'amplada i l'alçada d'un rectangle i ho dibuixi de la següent
manera:"""

ancho=int(raw_input("Dime lo ancho que es "))
largo=int(raw_input("Dime lo largo que es "))


for j in range(ancho):
    if j==0 or j==ancho-1:
        print "*",
    else:
        j!=0 and j!=ancho-1,
        print " ","\n",
for i in range(largo):
    if i==0 or i==largo-1:
        print "*",
    else:
        i!=0 and i!=largo-1
        print " ",
