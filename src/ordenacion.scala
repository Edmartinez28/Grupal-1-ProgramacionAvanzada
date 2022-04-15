object ordenacion extends App {
  // Lista de # aleatorios
  val lista = List(241216,78954,821980,129099,43669,49942,815123,595895,956773,831554,917385,643888,979993,100628,
    738165,192676,229071,757618,299809,103104,901994,848112,481806,125291,480476)

  println("Lista ordenada ascendetemente:")
  for (l <- lista.sorted) println(l)

  println("Lista ordenada descendetemente:")
  for (l <- lista.sorted.reverse) println(l)
}
