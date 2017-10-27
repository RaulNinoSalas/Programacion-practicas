"""RAUL NIÑO SALAS. DAW1. PRACTICA 4 EJERCICIO 4.Escriu un programa que demani un nombre i calculi el seu factorial"""

f=1
a=int(raw_input("Dame un numero y te calculare su factorial "))
for i in range(1,a+1):
    f=i*f
print f 
