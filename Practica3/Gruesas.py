cantidad=int(raw_input("Escribe una cantidad "))
docena=cantidad/12
gruesa=cantidad/144
docena=docena%12
unidad=cantidad%12

print "Son ",gruesa,"gruesas",docena,"docenas y ",unidad,"unidad."
