// P01 (*) Find the last element of a list.
//     Example:
//     scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

import scala.annotation.tailrec

object P01 {
    /*My solution*/
    def last[A](list: List[A]): A = 
        if(list.isEmpty) throw new NoSuchElementException
        else if(list.tail.isEmpty) list.head
        else last(list.tail)

    /*Proposed solution*/
    def lastP[A](list: List[A]): A = 
        list match {
            case h :: Nil   => h
            case _ :: tail  => lastP(tail)
            case _          => throw new NoSuchElementException
        }

    /*The proposed solution is definetly more idiomatic. Uses a scala pattern matching on Scala lists.*/
    /*We're using what's call Polymorphic methods https://docs.scala-lang.org/tour/polymorphic-methods.html*/
}