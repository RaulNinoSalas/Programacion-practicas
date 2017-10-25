segundo=int(raw_input("Escribe cuantos segundos "))
minuto=segundo/60
hora=segundo/3600
minuto=minuto%60
segundo=segundo%60

print "Son ",hora,"horas",minuto,"minutos y ",segundo,"segundos."
