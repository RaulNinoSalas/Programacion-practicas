"""RAUL NI�O SALAS DAW 1
Ejercicio 10
Escribe un programa que pida un n�mero y a continuaci�n escriba la lista de todos los divisores
del n�mero (incluidos el uno y �l mismo). """
lista=[]
divisores=[]
numero=input("Dime un numero: ")
for i in range (1,numero+1):
    if numero%i==0:
       lista.append(i)
print str(numero)+" tiene "+str(len(lista))+" divisores: "+str(lista)
