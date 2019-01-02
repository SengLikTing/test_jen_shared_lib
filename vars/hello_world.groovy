#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  calMe "work?"
  int_nest_call "hahaha"
  int_nest_call.info "gogo"
  //echo new Environment().getAnimalCry(Environment.tiger)
  //b = new TestMe()
  //echo getAnimalCry(Elu.cat)
}
