#!/usr/bin/env groovy
import org.foo.*
import static org.foo.TestMe

def call(String name = 'human') {
  echo "Hello, ${name}."
  calMe "work?"
  int_nest_call "hahaha"
  //echo new Environment().getAnimalCry(Environment.tiger)
  echo getAnimalCry(Elu.cat)
}
