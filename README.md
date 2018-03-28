# TrabajoPractico2-Observer

Se agregan 2 carpertas son dos formas distintas del trabajo. 
La primer en la carpeta taller tiene los 3 niveles agua, aceite y presion de cubiertas como booleanos dando a entender que el dueño lleva el auto al service.
La segunda el mecanico se fija los niveles de cada atributo.

Observacion al queres hacer mas de un addObserver se multiplica el mensaje porque cada uno ejemplo si tengo 3 addObservers el metodo update se ejecuta 3 veces

Respuestas:
A)
   1) Primero se decide cual de las clases utiliza observer y cual Observable.
   2) Se utiliza el metodo addObserver para tener un "progreso" del mismo
   3) Se utiliza setChanged para avisar que el objeto fue modificado.
   4) Se les avisa alos demas observadores con el notifyObservers para que vayan a ver el cambio
   5) El que implementa Observer tienen un metodo update que avisa que cambio hubo, ya se por impresion de pantalla o por algun otro medio.

B) Cuando se utiliza el metodo notifyObservers se le puede pasar o no un parametros cualquiera previamente es necesario agregar el metodo setChanged()
 para alertar del cambio, luego se ejecuta el metodo opdate donde el tienenal objeto observado y la modidicacion

update(Observado, "el objeto que se pasa en el notifyObservers" de tipo Object){
//
}

Se necesita caster el objeto al tipo de datoq ue se paso en el notify, ejemplo con este tp

Si en el notifyObservers le paso un objeto auto
se tiene que hacer en el update lo siguiente:
Auto aux=(Auto) o1-> siendo o1 el Object
y luego mostrar lo que se necesite en el update