#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  calMe "work?"
  int_nest_call "hahaha"
  //echo new Environment().getAnimalCry(Environment.tiger)
  echo new org.foo.bar().getAnimalCry(org.foo.elu.cat)
}
