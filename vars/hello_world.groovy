#!/usr/bin/env groovy
import org.foo.*
 
def call(String name = 'human') {
  echo "Hello, ${name}."
  calMe "work?"
  int_nest_call "hahaha"
  int_nest_call.info "gogo"
  int_nest_call.warning(Elu.kon)
  //echo new Environment().getAnimalCry(Environment.tiger)
  //b = new TestMe()
  //echo getAnimalCry(Elu.cat)
}
