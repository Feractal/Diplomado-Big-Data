package subjects
package subjects.intro

package object intro {

  class ejercicio1 {
    def encryptVowel(vowelsList: List[Char]): List[Char] = {
      val mapVowel = Map('a' -> 'L', 'e' -> '9', 'i' -> '$', 'o' -> 'R', 'u' -> '4')
      var result: List[Char] = List()
      for (char <- vowelsList)
        result = result :+ mapVowel(char)

      result
    }
  }


  class ejercicio4 {
    def Pascal(row: Int): List[Int] = {
      row match {
        case 1 => List(1)
        case n: Int => 1 +: ((tri(n - 1) zip tri(n - 1).tail) map {
          case (a, b) => a + b
        }) :+ 1
      }
    }
  }


  class ejercicio7 {
    def consultaNombres(consulta: List[String], nombres: List[String]): List[Int] = {
      var result: List[Int] = List()

      for (nombre <- consulta)
        if (nombres.contains(nombre)) {
          result = result :+ nombres.groupBy(identity).mapValues(_.size)(nombre)
        }
        else {
          result = result :+ 0
        }

      result
    }
  }

  class ejercicio8 {
    def calcularPeso(masa: Int, planeta: String): Double = {
      if (planeta == "mercurio") {
        var peso = masa * 3.70
      } else if (planeta == "tierra") {
        var peso = masa * 9.81
      } else if (planeta == "saturno") {
        var peso = masa * 11.67
      } else {
        println("Try another planet")
      }
      peso
    }
  }


  class ejercicio10 {
    def convertDecimalTo(convertTo: String, value: Int): String = {
      val Binary = value.toBinaryString
      val Octal = value.toOctalString
      val Hexa = value.toHexString
      val All = List(Binary, Octal, Hexa)
      val mapConvert = Map("BINARY" -> Binary, "OCTAL" -> Octal, "HEXA" -> Hexa, "ALL" -> All)
      val result = mapConvert(convertTo)
      result
    }
  }
}

