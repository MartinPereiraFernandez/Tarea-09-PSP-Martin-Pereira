# Niveles realizados: 1
## Nivel 1:
### Salida ejemplo:
![img.png](img.png)

### Tabla:
#### Ejecucion 1:
Descarga mas lenta:  
meditacion.mp4 - 4759 ms  
![img_4.png](img_4.png)

Timepo real (ms):  
4762ms  
![img_5.png](img_5.png)

Suma (ms):   
16346 ms  
![img_6.png](img_6.png)

#### Ejecución 2:
Descarga mas lenta:  
cuerzos.mp4 - 3451 ms  
![img_7.png](img_7.png)

Timepo real (ms):  
3453 ms   
![img_8.png](img_8.png)

Suma (ms):   
12401 ms  
![img_9.png](img_9.png)

#### Ejecución 3:
Descarga mas lenta:  
meditacion.mp4 - 4940 ms  
![img_10.png](img_10.png)

Timepo real (ms):  
4942 ms  
![img_11.png](img_11.png)


Suma (ms):   
15071 ms  
![img_12.png](img_12.png)

### ¿Por qué el tiempo real es mucho menor que la suma?
Esto se debe a que el tiempo real es el tiempo en el que los 4 hilos terminan de funcionar, mientras que la suma sería la suma de los 4 hilos si se hiciese de manera individual.

### ¿Qué pasa si hacéis start() y join() dentro del mismo bucle? Probadlo y poned el tiempo real que os sale.
![img_13.png](img_13.png)  
Lo que pasa en este caso es que primero tiene que ejecutarse un hilo para poder empezar el siguiente, por lo que se rompe la paralelidad:   
![img_14.png](img_14.png)

## Declaracion de uso de IA: 
Para esta tarea usé claude ya que no entiendia la diferencia entre el tiempo total y la suma. Para ello la consulte y saqué las lineas de codigo para poder obtener el tiempo total.





