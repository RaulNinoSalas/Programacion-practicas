"""RAUL NIÑO SALAS DAW 1 PRACTICA 5 EJERCICIO 3.
Escriu un programa que demani notes i les guardi en una llista. Per a terminar d'introduir notes,
escriu una nota que no estigui entre 0 i 10. El programa termina escrivint la llista de notes."""

n=float(raw_input("Escribe tus notas "))

notas=[ ]

while (n<=10 and n>=1):
    notas.append(float(n))
    n=float(raw_input("Escribe la siguiente nota "))

print notas
