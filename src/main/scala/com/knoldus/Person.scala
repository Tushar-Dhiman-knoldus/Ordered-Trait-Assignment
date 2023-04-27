package com.knoldus

class Person(val name: String, val age: Int) extends Ordered[Person] {
  def compare(personTwo: Person): Int = {
    if (this.name == personTwo.name) this.age.compare(personTwo.age)
    else this.name.length.compare(personTwo.name.length)
  }
}
