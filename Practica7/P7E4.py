
"""RAUL NI�O SALAS DAW 1
Ejercicio_04
Escribe un programa que pida una frase, y le pase como par�metro a una funci�n dicha frase. La
funci�n debe sustituir todos los espacios en blanco de una frase por un asterisco, y devolver el
resultado para que el programa principal la imprima por pantalla. """


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


