"""RAUL NIÑO SALAS. DAW1. PRACTICA 4 EJERCICIO 2.Escriu un programa que demani dos nombres i escrigui quins nombres son parells i quins són
senars (=”impares”) des del primer fins al segon."""

a=int(raw_input("Dame un numero "))
b=int(raw_input("Dame otro mayor que el primero "))

for i in range(a,b+1):
    if i%2==0:
        print i,"es par"
    elif i%2!=0:
        print i,"es inpar"
