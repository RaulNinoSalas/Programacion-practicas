"""RAUL NIÑO SALAS DAW 1 PRACTICA 5 EJERCICIO 4.
Escriu un programa que te demani dos nombres, de manera que el segon sigui major que el
primer. El programa termina escrivint els dos nombre tal i com es demana."""


n1=int(raw_input("Escribe un numero "))
n2=int(raw_input("Escribe otro, mayor "))

while n1>n2:
    n2=int(raw_input("Uno mayor, por favor "))       
print "Los numeros que has escrito son",n1,n2

