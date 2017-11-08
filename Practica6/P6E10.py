"""RAUL NIÑO SALAS DAW 1
Ejercicio 10
Escribe un programa que pida un número y a continuación escriba la lista de todos los divisores
del número (incluidos el uno y él mismo). """
lista=[]
divisores=[]
numero=input("Dime un numero: ")
for i in range (1,numero+1):
    if numero%i==0:
       lista.append(i)
print str(numero)+" tiene "+str(len(lista))+" divisores: "+str(lista)
