#!/usr/bin/groovy

import static org.foo.bar.*
 
def call(String name = 'human') {
  echo "Hello, ${name}."
  calMe "work?"
  int_nest_call "hahaha"
  int_nest_call.info "gogo"
  int_nest_call.warning(Elu.elephant)
 echo dummy()
  //echo new Environment().getAnimalCry(Environment.tiger)
  //b = new TestMe()
  //echo getAnimalCry(Elu.cat)
}
