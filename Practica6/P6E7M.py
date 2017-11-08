"""RAUL NIÑO SALAS DAW1
Ejercicio 07
Escribe un programa que permita crear dos listas de palabras y que, a continuación, escriba las
siguientes listas (en las que no debe haber repeticiones):
• Lista de palabras que aparecen en las dos listas
• Lista de palabras que aparecen en la primera lista, pero no en la segunda
• Lista de palabras que aparecen en la segunda lista, pero no en la primera
• Lista de palabras que aparecen en ambas listas """

lista=[ ]
numero=input("¿Cuantas palabras tiene la lista? ")
for i in range(0,numero):
    palabra=raw_input("Dime una palabra: ")
    lista.append(palabra)
print "La primera lista es "+str(lista)
lista2 = [ ]
numero2=input("¿Cuantas palabras tiene la lista? ")
for j in range(0,numero2):
    palabra2=raw_input("Dime una palabra: ")
    lista2.append(palabra2)
print "La segunda es "+str(lista2)

"Palabras que aparecen en las dos listas: "+str


"Palabras que solo aparecen en la primera lista: "+str

"Palabras que solo aparecen en la segunda lista: "+str

"Todas las palabras: "+str
