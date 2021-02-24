# Figuras Geometricas

Explicación de código fuente

El siguiente programa se trata de que podamos dibujar 5 figuras geométricas en una tabla presionando un botón con el nombre de cada figura geométrica.  El programa fue hecho en el entorno de programación (IDE) llamado NetBeans para su compilación no se requirió más que darle clic en el icono ejecutar.
A continuación, se presenta el código donde se importan las librerías necesarias para poder utilizar las clases que se utilizaron durante el programa. 

![imagen](https://user-images.githubusercontent.com/71055467/109018753-ffd3eb00-767d-11eb-9bb0-5341f8c5fda3.png)

Este programa lo hemos hecho en dos partes, primero mostraremos la clase principal, donde comienza a ejecutarse el programa.es necesario hacer uso de las variables para almacenar los valores, y para esto hacemos la siguiente declaración:

![imagen](https://user-images.githubusercontent.com/71055467/109018781-05c9cc00-767e-11eb-8b80-180ed6991718.png)

Y después insertamos un constructor que es.

![imagen](https://user-images.githubusercontent.com/71055467/109018811-0bbfad00-767e-11eb-8108-5c5525c86d74.png)

Una vez hecho esto vamos a crear 5 métodos, donde cada uno de ellos va a llevar el nombre de una de las figuras geométricas que vamos a realizar y quedaría de la siguiente manera.

![imagen](https://user-images.githubusercontent.com/71055467/109018854-11b58e00-767e-11eb-841f-2e434928d1ba.png)
![imagen](https://user-images.githubusercontent.com/71055467/109018878-167a4200-767e-11eb-988e-1732e5a0d55f.png)

Para poder imprimir cada una de las figuras, es necesario crear una clase que herede de JFrame, para que se pueda agregar los diferentes bonetes de las figuras y también donde hemos creado un botón salir.

![imagen](https://user-images.githubusercontent.com/71055467/109018914-22660400-767e-11eb-91f5-ff72bc3418a4.png)

Ahora lo que sigue es programar la ventana, como agregar el panel necesario para que a partir de aquí se pueda agregar los botones y las figuras, es aquí donde se encuentra la mayor parte del código fuente del programa.
La clase dibujo se declara como se muestra en seguida, esta hereda de la clase JPanel, ya que es ella la que sirve para crear las figuras.

![imagen](https://user-images.githubusercontent.com/71055467/109018978-2f82f300-767e-11eb-8203-9fb86e804819.png)

En esta misma clase se instancia una clase llamada Dibujo, la cual nos servirá para crear el marco del programa, y para que se pueda ver en la siguiente línea se hace visible con el método set Visible.

![imagen](https://user-images.githubusercontent.com/71055467/109019000-3578d400-767e-11eb-92c2-74a7b494d4c5.png)

![imagen](https://user-images.githubusercontent.com/71055467/109019017-390c5b00-767e-11eb-9d82-1415b8691274.png)

En líneas siguientes se muestra el código del método que servirá para agregar la figura y que se ponga a la escucha para que cuando sea llamada, esta ejecuta lo que contiene.
Este método recibe datos por parámetros, en este caso recibirá un objeto de tipo Graphics necesario para crear la figura.

![imagen](https://user-images.githubusercontent.com/71055467/109019059-41fd2c80-767e-11eb-9730-dab069ddd210.png)
![imagen](https://user-images.githubusercontent.com/71055467/109019079-4590b380-767e-11eb-80d6-a47f9c97b322.png)

La última parte simplemente se trata de la declaración de variables necesarios que se utilizó para la creación de la interfaz del programa.

![imagen](https://user-images.githubusercontent.com/71055467/109019103-4cb7c180-767e-11eb-831a-d594712b4f6a.png)


Ejecución del Programa 2:


          Cuando le damos en la opción de compilar y ejecutar en NetBeans nos mostrará la siguiente ventana y en su interior podremos ver los botones con el nombre” Figura”, por el momento no se muestran las porque con un click que le haremos al botón es cuando mostrará la figura.

![imagen](https://user-images.githubusercontent.com/71055467/109019162-5a6d4700-767e-11eb-8fc6-f95330835e90.png)

Ahora si le hacemos click en el botón, vemos como nos aparece las figuras siguientes y lo que sucede es que en el momento de que el usuario da click sobre el botón de una figura distinta a la que selecciono primero, esta desaparece de manera inmediata.

![imagen](https://user-images.githubusercontent.com/71055467/109019181-60632800-767e-11eb-93b8-c47f8d1f32cb.png)

![imagen](https://user-images.githubusercontent.com/71055467/109019196-635e1880-767e-11eb-9cb7-afda714df5f6.png)

