#!/usr/bin/env groovy
import static org.foo.*

def call(String name = 'human') {
  echo "Hello, ${name}."
  calMe "work?"
  int_nest_call "hahaha"
  //echo new Environment().getAnimalCry(Environment.tiger)
  echo TestMe.getAnimalCry(Elu.cat)
}
