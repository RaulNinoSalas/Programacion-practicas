"""RAUL NIÑO SALAS DAW 1
Ejercicio_03
Escribe un programa que lea una frase, y la pase como parámetro a un procedimiento, y éste
debe mostrar la frase con un carácter en cada línea. """

def a ():
    texto=raw_input ("Escribe una frase: ")
    for i in range (len(texto)):
        print texto[i]
a( )
