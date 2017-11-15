"""RAUL NIÑO SALAS DAW 1
Ejercicio_08
Escribe un programa que pida una frase, y pase la frase como parámetro a una función que debe
eliminar los espacios en blanco (compactar la frase). El programa principal imprimirá por pantalla
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
