
Proyecto 3 - Animadores Para Eventos
Profesor:
Pedro Ulises Cervantes González confundeme@ciencias.unam.mx
Ayudantes:
Julio Vázquez Alvarez julio.vazquez@ciencias.unam.mx
Ian Israel García Vázquez iangarcia@ciencias.unam.mx
Erick Bernal Márquez erick07@ciencias.unam.mx
Yessica Janeth Pablo Martínez yessica_j_ pablo@ciencias.unam.mx

Equipo:
-Cano Tenorio Alan Kevin(321259967)
-Escobedo Irineo Malinalli (424121101)


Sobre el proyecto:
El proyecto trata sobre un programa que permite modificar un catálogo de empleados y crear una cotización para eventos.
Las funciones que realiza el proyecto son las siguientes:
•Agregar un empleado.
•Despedir un empleado.
•Modificar el rol de un empleado.
•Modificar el sueldo de un empleado
•Crear una cotización.


Estructura:
El proyecto esta dividido en tres archivos de la extension .java. A continuación, se dara una breve descripcion de cada uno.

-ListaDeEmpleados.java : Este archivo contiene varios metodos principales y algunos auxiliares que se desarrollaron para poder cumplir con las funciones anteriormente descritas, se opto por colocar los metodos en el
orden que aparecen en el menú para mejor intuición al momento de leer el código, y los metodos auxiliares se colocaron hasta el final de la clase. Cada método tiene una breve descripción sobre lo que hace.
-Nodo.java : Este archivo tiene los atributos que se requeria que los empleados tuvieran para el proyecto:
•Sueldo por hora 
•Nombre del tipo de empleado 
•Cantidad de empleados.

ademas de otro atributo de tipo Nodo llamado siguiente, el cual sirve para apuntar la siguiente empleado de la lista. Por otra parte, la clase contiene setters y getters para poder modificar los atributos y obtenerlos

-Main.java: Este archivo es la clase principal del programa, por el cual, se crean los objetos y se muestra en la terminal el catalogo que la empresa tiene antes y despues de cada operación , y un menu que permite 
interactuar con los diferentes métodos de la clase ListaDeEmpleados, y se  muestra la cotización hecha por el usuario. Esta clase incluye la clase scanner para que el usuario pueda interactuar con el programa de forma 
directa.Esta conformado por un public static void main(String[] args), en el cual se crea un objeto de tipo ListaDeEmpleados llamado listaprincipal, la cuál es el catálogo, otro objeto del mismo tipo llamado 
listacotizacion el cual es la cotización, dos String que se agregan a la listaprincipal  cerca del inicio de la clase para no tener un catálogo inicial vacio, y otros dos de tipo Scanner, esto con la finalidad de usar 
con eficacia el menu, estos dos ultimos estan alojados en esta parte y dentro de un do-while para que se ejecute hasta que el usuario desee. Este menu es de gran utilidad porque ayuda al usuario a ejecutar el programa 
de la forma que el guste.

Inconvenientes que se presentaron:
El primer inconveniente que tuvimos fue comenzar el proyecto, esto debido a que, a pesar de que sabíamos que debiamos hacer, no sabiamos como comenzar a implementarlo, pero conforme fuimos escribiendo la forma de implementarlo fue más sencillo.
El segundo incoveniente se presento a la hora de mostrar la cotización debido a que solo arrojaba la cantidad de horas del evento, la comisión y la cotización final, pero no a los involucrados en la cotización, además, cuando logramos hacerlo no imprimía bien los valores de la cotización. Esto se debia a que no estaba implementado bien el menú en la clase Main
Recurrimos a preguntarle a nuestro profesor que nos recomendaría hacer para solucionar esta parte y en base a su respuesta, pudimos imprimir la cotización de forma correcta


Ejecucion:
Primero se descarga el archivo. Zip que se subio al classroom y guardalo en la carpeta que desees
Posteriormente se descomprime el .zip (solo tienes que  dar doble clic sobre el archivo)
Abre la terminal y métete a la carpeta en la cual guardaste el archivo, para hacer esto escribe:

computadora:~$ cd + “nombre de la carpeta que descargaste”

Posteriormente escribe el comando ls
Si te aparecen los archivos ListaDeEmpleados.java, Main.java y Nodo.java, estas en la carpeta correcta

En la terminal escribe javac *.java
Esto compila todos los archivos que tengas en esa carpeta
Finalmente escribe java Main y en en la terminal se mostrara un menu que indica los metodos disponibles

En ese menu presionas cualquiera de los 6 numeros que te arroja el programa y sigues las instrucciones que te arrojan.