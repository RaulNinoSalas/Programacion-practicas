"""RAUL NI�O SALAS. DAW1. PRACTICA 4 EJERCICIO 5. Escriu un programa que demani l'amplada i al�ada d'un rectangle i ho dibuixi de la seg�ent
manera:"""

a=int(raw_input("Dime lo ancho que es "))
l=int(raw_input("Dime lo largo que es "))

for i in range(l):
     for j in range(a-1):
          print '*',
     print "*","\n"
