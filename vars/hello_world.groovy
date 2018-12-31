#!/usr/bin/env groovy
import org.foo.*

def call(String name = 'human') {
  echo "Hello, ${name}."
  calMe "work?"
  int_nest_call "hahaha"
  //echo new Environment().getAnimalCry(Environment.tiger)
  b  = new Environment
}
