import numpy as np
import matplotlib.pyplot as plt

datos = np.arange(0,360) # arange de rango marcado a otroGenera un vecto, llega en x y y de 0-numero marcado# 
datos = np.radians(datos) #Convierte los grados de datos a radianes#
datos = np.sin(datos)#calcula el seno con respecto a los datos que se dan, convertidos a redianes#


plt.plot(datos,"g--") #marca con plot los datos y el color de datos y linea#
plt.show()    #Muesftra la grafica en pantalla#

 plt.savefig("seno.png"t) --Nos guarda la figura en un archivo png#


#Funcion del Sen(x)-1

datos_a = np.arange(0,360)
datos_a = np.radians(datos_a)
datos_a = np.sin(datos_a)+1

plt.plot(datos_a,"b--")
plt.show()



