package subjects
package subjects.intro

package object intro {

  class ejercicio1 {
    // 1. ¿Cómo obtener el primer y último carácter de la cadena "Hola" en Scala?
    val chain = "Hola"
    chain.take(1) // first element
    chain.takeRight(1) // last element
  }

  class ejercicio2 {
    //  2. Escriba un bucle for para calcular el producto del código Unicode (método toLong) de todas las letras de la cadena.
    // Por ejemplo, el producto de todas las cadenas en "Hello" es 9415087488L
    var x: Long = 1
    for (c <- "Hola") x *= c.toLong
    println(x)

    def product(str: String): Long = {
      var prod: Long = 1
      for (ch <- str) prod *= ch
      prod
    }
    println(product("Hola"))
  }

  class ejercicio3 {
    // 3. Escriba una función WordCount para contar el número de palabras en la cadena entrante
    def WordCount(chain: String): Int = {
      var number: Int = 0
      for (word <- chain.split(" ")) number += 1
      number
    }
    println(WordCount("Hola de nuevo"))
  }

  class ejercicio4 {
    // 4. Escriba una función llamada minmax (valores: Array [Int]), que devuelve una tupla con de los valores mínimo y máximo en el array
    def minmax(valores: Array [Int]) = {
      val tuple = (valores.min, valores.max)
      tuple
    }
    println(minmax(Array(1, 2, 3)))
  }



