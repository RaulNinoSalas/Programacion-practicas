"""RAUL NI�O SALAS DAW 1
Ejercicio_06
Escribe un programa que lea el nombre de una persona y un car�cter, le pase estos datos a una
funci�n que comprobar� si dicho car�cter est� en su nombre. El resultado de dicha funci�n lo
imprimir� el programa principal por pantalla. """

nombre=raw_input("Dime tu nombre ")
letra=raw_input("Dame una letra ")


def cuantos ():
    conta1=nombre.count(letra)
    print conta1
cuantos()
