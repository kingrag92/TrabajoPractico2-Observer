# Trabajo Practico 2-Observer

Se agregan 2 carpetas son dos formas distintas del trabajo. 
La primer en la carpeta taller tiene los 3 niveles agua, aceite y presión de cubiertas como booleanos dando a entender que el dueño lleva el auto al service.
La segunda el mecánico se fija los niveles de cada atributo.

Observación al querer hacer mas de un addObserver se multiplica el mensaje porque cada uno ejemplo si tengo 3 addObservers el método update se ejecuta 3 veces

Respuestas:
A)
   1) Primero se decide cual de las clases utiliza Observer y cual Observable.
   2) Se utiliza el método addObserver para tener un "progreso" del mismo
   3) Se utiliza setChanged para avisar que el objeto fue modificado.
   4) Se les avisa a los demás observadores con el para que vayan a ver el cambio
   5) El que implementa Observer tienen un método update que avisa que cambio hubo, ya se por impresión de pantalla o por algún otro medio.

B) Cuando se utiliza el método notifyObservers se le puede pasar o no un parámetros cualquiera previamente es necesario agregar el método setChanged()
 para alertar del cambio, luego se ejecuta el método update donde el tiene al objeto observado y la modificación

, "el objeto que se pasa en el notifyObservers" de tipo){
//
}

Se necesita castear el objeto al tipo de dato, ejemplo con este tp

Si en el notifyObservers le paso un objeto auto
se tiene que hacer en el update lo siguiente:
Auto aux=(Auto) o1-> siendo o1 el Object
y luego mostrar lo que se necesite en el update