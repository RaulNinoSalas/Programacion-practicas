"""RAUL NI�O SALAS DAW 1
Ejercicio_07
Escribe un programa que lea una frase, y la pase como par�metro a un procedimiento. El
procedimiento contar� el n�mero de vocales (de cada una) que aparecen, y lo imprimir� por
pantalla. 
"""

nombre=raw_input("Dime una frase ")

def cuantos ():
    conta1=nombre.count("a")
    conta2=nombre.count("e")
    conta3=nombre.count("i")
    conta4=nombre.count("o")
    conta5=nombre.count("u")
    print "Hay "+str(conta1)+" a"
    print "Hay "+str(conta2)+" e"
    print "Hay "+str(conta3)+" i"
    print "Hay "+str(conta4)+" o"
    print "Hay "+str(conta5)+" u"
cuantos()
