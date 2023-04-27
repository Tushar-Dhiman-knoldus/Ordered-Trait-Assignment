package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class PersonSpec extends AnyFlatSpec {

  "Person" should "be ordered by name length if names are different" in {
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Testing", 25)
    assert(personOne < personTwo)
  }

  it should "be ordered by age if names are same" in {
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test", 25)
    assert(personOne < personTwo)
  }
}
