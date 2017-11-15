
"""RAUL NIÑO SALAS DAW 1
Ejercicio_05
Escribe un programa que te pida una frase y una vocal, y pase estos datos como parámetro a una
función que se encargará de cambiar todas las vocales de la frase por la vocal seleccionada.
Devolverá la función la frase modificada, y el programa principal la imprimirá: 
"""

palabras=raw_input ("Escribe tu frase: ")
vocal=raw_input ("Escribe la vocal: ")

def frase(palabras,vocal):
	vocales=['a','e','i','o','u']
	aux=''
	for i in range (len(palabras)):
		if palabras[i] in vocales:
			aux+=vocal		
		else:
			aux+=palabras[i]
	return aux

print frase(palabras,vocal)
