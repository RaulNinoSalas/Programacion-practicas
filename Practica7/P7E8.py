"""RAUL NI�O SALAS DAW 1
Ejercicio_08
Escribe un programa que pida una frase, y pase la frase como par�metro a una funci�n que debe
eliminar los espacios en blanco (compactar la frase). El programa principal imprimir� por pantalla
el resultado final. """


def frase(a):
    b=" "
    for i in range (len(a)):
        if a[i]==" ":
            del [i]
        else:
            b+=a[i]
    return b
a=raw_input ("Escribe una frase: ")
print frase(a)
