/**
Find the last but one element of a list.
    Example:

    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5
*/

object P02 {
    def penultimate[A](list: List[A]): A = 
        (list, list.tail) match {
            case (h :: Nil, _)          => throw new NoSuchElementException
            case (h :: t, th :: Nil)    => h
            case (h :: t, th :: tt)     => penultimate(list.tail) 
        }
}