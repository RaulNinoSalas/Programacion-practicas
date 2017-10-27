"""RAUL NIÑO SALAS. DAW1. PRACTICA 4 EJERCICIO 5. Escriu un programa que demani l'amplada i alçada d'un rectangle i ho dibuixi de la següent
manera:"""

a=int(raw_input("Dime lo ancho que es "))
l=int(raw_input("Dime lo largo que es "))

for i in range(l):
     for j in range(a-1):
          print '*',
     print "*","\n"
