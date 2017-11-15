"""RAUL NIÑO SALAS DAW 1
Ejercicio_05
Escribe un programa que te pida una frase y una vocal, y pase estos datos como parámetro a una
función que se encargará de cambiar todas las vocales de la frase por la vocal seleccionada.
Devolverá la función la frase modificada, y el programa principal la imprimirá: 
"""


def cambia(frase):
    vocales=[a,e,i,o,u]
    for i in range (len(frase)):
        if i in range (len(frase)):
            if frase[i]==vocales:
                vocales+=vocal
            else:
                vocales+=frase[i]
    return vocales
    
    frase.replace(i,vocales)    
frase=raw_input ("Escribe una frase: ")
vocal=raw_input("Dime una vocal ")

print cambia(frase)
