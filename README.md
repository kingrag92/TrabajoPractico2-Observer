# Trabajo Practico 2-Observer

Se agregan 2 carpetas son dos formas distintas del trabajo. 
La primer en la carpeta taller tiene los 3 niveles agua, aceite y presi�n de cubiertas como booleanos dando a entender que el due�o lleva el auto al service.
La segunda el mec�nico se fija los niveles de cada atributo.

Observaci�n al querer hacer mas de un addObserver se multiplica el mensaje porque cada uno ejemplo si tengo 3 addObservers el m�todo update se ejecuta 3 veces

Respuestas:
A)
   1) Primero se decide cual de las clases utiliza Observer y cual Observable.
   2) Se utiliza el m�todo addObserver para tener un "progreso" del mismo
   3) Se utiliza setChanged para avisar que el objeto fue modificado.
   4) Se les avisa a los dem�s observadores con el para que vayan a ver el cambio
   5) El que implementa Observer tienen un m�todo update que avisa que cambio hubo, ya se por impresi�n de pantalla o por alg�n otro medio.

B) Cuando se utiliza el m�todo notifyObservers se le puede pasar o no un par�metros cualquiera previamente es necesario agregar el m�todo setChanged()
 para alertar del cambio, luego se ejecuta el m�todo update donde el tiene al objeto observado y la modificaci�n

, "el objeto que se pasa en el notifyObservers" de tipo){
//
}

Se necesita castear el objeto al tipo de dato, ejemplo con este tp

Si en el notifyObservers le paso un objeto auto
se tiene que hacer en el update lo siguiente:
Auto aux=(Auto) o1-> siendo o1 el Object
y luego mostrar lo que se necesite en el update