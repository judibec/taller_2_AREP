# AREP TALLER 2

Creacion de servicio que busca archivos en el disco local para poderlos mostrar en un browser, indicando el path especifico y la url correcta

## Iniciando

### Prerequisites

* Git: controlador de versiones y administrador de repositorio
* Java: Ambiente de desarrollo
* Maven: Administrador del ciclo de vida del proyecto

### Installing

Primero debemos clonar el repositorio con el siguiente comando

```
git clone https://github.com/judibec/taller_2_AREP.git
```

Luego entramos a la carpeta donde se encuenta el archivo ```pom.xml``` y ejecutamos el siguiente comando

```
mvn clean package exec:java -D "exec.mainClass"="edu.escuelaing.arem.ASE.app.services.FirstWebApp"
```

Entramos a cualquier Browser y entramos a la direccion http://localhost:34000/apps/ podemos agregar index,script,style o imagen para ver los diferentes archivos que se crearon

Para visualizar el javadoc basta con ejecutar el comando 

```
mvn javadoc:javadoc
```
Y entramos a dicha ruta

```
...\miprimera-app\target\site\apidocs
```
## Built With

* [Maven](https://maven.apache.org/) - Administrador de dependencias

## Version

Version 1.0

## Authors

* **Juan Diego Becerra Peña**: [judibec](https://github.com/judibec)

## Descripcion especifica

Se construyo una interfaz la cual tiene los metodos para devolver el header y el body de una pagina, se crearon varias clases que implementan esta interfaz para que leyeran archivos html, css, js y MIME, para esto se usa un httpServer el cual es el que levanta la conexion y revisa que link ingresa para redireccionar de la mejor manera

