"""RAUL NI�O SALAS DAW 1
Ejercicio_03
Escribe un programa que lea una frase, y la pase como par�metro a un procedimiento, y �ste
debe mostrar la frase con un car�cter en cada l�nea. """

def a ():
    texto=raw_input ("Escribe una frase: ")
    for i in range (len(texto)):
        print texto[i]
a( )
