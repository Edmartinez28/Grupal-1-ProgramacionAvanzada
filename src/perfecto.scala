object perfecto extends App {
  // Lista de # aleatorios
  val lista = List(241216,78954,821980,129099,43669,49942,815123,595895,956773,831554,917385,643888,979993,100628,
    738165,192676,229071,757618,299809,103104,901994,848112,481806,125291,480476)

  // Función para verificar si un número es perfecto
  def isPerfecto (n:Int) ={
    val suma = (1 to n-1).filter(k => n%k == 0).sum
    if(suma == n)
      true
    else
      false
  }
  print(lista.filter(x => isPerfecto(x)))
}
