package subjects.intro

class exer {

}

/* 1
Cierta persona encargada del cifrado de caracteres requiere de un programa que le permita pasar una vocal a otro
carácter, las correspondencias son las siguientes:
a = L
e = 9
i = $
o = R
u = 4
 */

val vowelsList = List('a', 'i','e','a')

def encryptVowel(vowelsList: List[Char]): List[Char] = {
  val mapVowel = Map ('a' -> 'L', 'e' -> '9', 'i' -> '$', 'o' -> 'R', 'u' -> '4')
  var result: List[Char] = List ()
  for (char <- vowelsList)
    result = result :+ mapVowel (char)

  result
  }

/* 2
Una hamburguesería famosa tiene un sistema que le permite establecer un ingrediente principal en un producto y generar
N subproductos basados en el primero, por ejemplo:
Establecer el ingrediente carne para una hamburguesa
Crear una hamburguesa de carne con queso
Crear una hamburguesa de carne con cebolla
Crear una hamburguesa de carne con cebolla, queso y pepinillo

Establecer el ingrediente champiñón para una hamburguesa
Crear una hamburguesa de champiñones y queso
Crear una hamburguesa de champiñones, queso y papas

Ejercicio: Utilizando el concepto de funciones de orden superior implementa un método que dé soporte al flujo
previamente descrito.
Nota: Considera los ingredientes con un tipo de dato String
 */





/* 3
Utilizando el concepto de funciones de orden superior implementa un método que pueda recibir un String,
ejecutar alguna operación con este String (el consumidor establece el comportamiento) y retornar un String,
en caso de que la ejecución falle se deberá propagar una custom exception llamada HigherOrderFunctionException.
 */



/* 4
Triangulo de Pascal
 */
class MyException extends Exception
val exception = new PascalRowException

def Pascal(row: Int): List[Int] = {
  if (row < 1) throw new PascalRowException
  row match {
  case 1 => List (1)
  case n: Int => 1 +: ((tri (n - 1) zip tri (n - 1).tail) map {
  case (a, b) => a + b
  }) :+ 1
  }
  }


/* 5
Se requiere generar Nodos que cuenten con lo siguiente: Nombre, Descripción; el acceso a estos datos no puede ser
directo ni para lectura ni para escritura. Las estructuras Nodo deben poder relacionarse entre ellas a través de Aristas
las cuales unen dos Nodos, las Aristas deben poder contener un dato adicional llamado Etiqueta el cual una vez
establecido no puede ser modificado pero sí leído de forma indirecta.

Las estructuras antes creadas (Nodos y Aristas) forman parte de una estructura mayor (DataStructure) que cuenta con N
nodos y aristas, la cual a su vez, deberá contener los siguientes datos Nombre, Descripción los cuales deberán poder
cambiarse en el momento que se requiera.

Por último, existe una estructura mucho mayor (DataStructureForest) que está conformada por N estructuras (DataStructure)
y que cuenta con una propiedad llamada Nombre, la cual una vez establecida no deberá ser modificada pero sí leida.

Todas las estructuras deberán tener una implementación para poder recuperar su estructura entera como String

Ejercicio: Realiza el modelado y crea las clases, métodos, atributos correspondientes a lo que se te pide para que la
continuidad espacio-temporal sea restablecida.
 */



/* 6
Una famosa empresa de desarrollo de software tiene una biblioteca heredada que cuenta con las siguientes definiciones:
case class Catalog(index: Int, value: String)
case class Address(index: Int, street: String, name: String)
case class Product(index: Int, name: String, tax: Double)
Actualmente se encuentran en un conflicto ya que requieren convertir variables de tipo Int a cualquiera de las tres
estructuras antes mencionadas pero no pueden realizar métodos independientes para llevar a cabo sus tareas.
Se requiere hacer el casteo directamente en la instancia Int como si de un método nativo se tratara, similar a un
20.toString
Ejercicio. Ayuda a la empresa a resolver su problemática implementando una solución que permita hacer lo siguiente:
20.toCatalog() => Catalog(20,) 20.toAddress() => Address(20,,)
20.toProduct() = Product(20,,0.0) 20.toCatalog(value) = Catalog(20,value)
20.toAddress(street, name) => Address(20,street,name) 20.toProduct(name, tax) => Product(20,name,tax)
 */



/* 7
Se tiene una lista de nombres y una lista de consulta de nombres. Para cada consulta, se debe determinar cuántas
veces aparece en la lista de nombres. Por ejemplo, teniendo como entradas: nombres = [“Brenda”,”Brenda”,”Jorge”,”Anais”]
y consulta = [“Jorge”,”Brenda”,”Angelica”]
Se encuentra 1 vez Jorge, 2 veces Brenda y 0 veces Angelica. Se debe retornar una lista con el número de ocurrencias,
por lo que en este caso retornaremos la lista: resultados = [1,2,0]
Completa la siguiente función: def consultaNombres (List[String], List[String]): List[Int]
 */

val nombres = List("Brenda","Brenda","Jorge","Anais")
val consulta = List("Jorge","Brenda","Angelica")


def consultaNombres (consulta: List[String], nombres: List[String]): List[Int] = {
  var result: List[Int] = List ()

  for (nombre <- consulta)
    if (nombres.contains (nombre) ) {
    result = result :+ nombres.groupBy (identity).mapValues (_.size) (nombre)
    }
    else {
    result = result :+ 0
    }

  result
  }


/* 8
Se requiere implementar una función que calcule el peso de una persona dependiendo en qué planeta se encuentre.
Recordando que la fórmula es la siguiente P = m x g Donde: P = peso, m = masa, g = aceleración gravitacional
La aceleración gravitacional varía dependiendo el planeta, se deberá calcular para los siguientes:
Planeta g
Mercurio 3.70
Tierra 9.81
Saturno 11.67

Utilizando funciones de orden superior obten el peso en cada planeta, solo puedes implementar una sola función para
resolver el problema.

def calcularPeso ...
val pesoMercurio = mercurio (70)
val pesoTierra = tierra (70)
val pesoSaturno = saturno (70)
 */
val planeta = "mercurio"
val masa = 32
var peso = 1


def calcularPeso (masa: Int, planeta: String): Double = {
  if (planeta == "mercurio") {
  var peso = masa * 3.70
  } else if (planeta == "tierra") {
  var peso = masa * 9.81
  } else if (planeta == "saturno") {
  var peso = masa * 11.67
  } else {
  println ("Try another planet")
  }
  peso
  }

/* 9
ecuacionSegundoGrado(x1, 1, -5, 6) => 3.0 (cuando es suma)
ecuacionSegundoGrado(x2, 1, -5, 6) => 2.0 (cuando es resta)
 */

import scala.math._

  def x1(): Int = {
  val x = 1
  x
  }

def x2(): Int = {
  val x = -1
  x
  }

def ecuacionSegundoGrado(f: () => Int, a: Int, b: Int, c: Int): Double = {
  val div = 2 * a
  val det = sqrt((b * b)-(4 * a * c))
  val res = (-b + f() *det) / div
  res
  }


/* 10
Escribe una función que reciba un número entero y retorne su representación en binario, octal y Hexadecimal,
también es necesario que pueda retornar el valor concatenado de los posibles tres valores. Notas: En caso de que
no se envíe una de las cuatro posibles opciones(BINARY, OCTAL, HEXADECIMAL, ALL) se deberá lanzar una excepción de
tipo ConvertException No hacer uso de if else
Completa la siguiente función:
def convertDecimalTo( convertTo: String, value: Int ) : String
 */
def convertDecimalTo(convertTo:String, value:Int ): String = {
  val Binary = value.toBinaryString
  val Octal = value.toOctalString
  val Hexa = value.toHexString
  val All = List(Binary, Octal, Hexa)
  val mapConvert = Map ("BINARY" -> Binary, "OCTAL" -> Octal, "HEXA" -> Hexa, "ALL" -> All)
  val result = mapConvert(convertTo)
  result
  }

