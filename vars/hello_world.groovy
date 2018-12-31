#!/usr/bin/env groovy
import org.foo.bar

def call(String name = 'human') {
  echo "Hello, ${name}."
  calMe "work?"
  int_nest_call "hahaha"
  //echo new Environment().getAnimalCry(Environment.tiger)
  echo new bar().getAnimalCry(org.foo.Elu.cat)
}
