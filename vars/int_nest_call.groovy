#!/usr/bin/env groovy
import org.foo.bar
  
def call(String nn = "int nesy") {
  echo "this is int nest call ${nn}"
  //echo new org.foo.bar().getAnimalCry(org.foo.Environment.cat)
}

def info(message) {
    echo "INFO: ${message}"
}

def warning() {
  bar.Elu a = bar.Elu.mouse
   switch(a) {
    case bar.Elu.elephant:
      echo "this is ele"
      break
   }
/*  b = new bar()
  b.dummy(Elu.mouse)*/
}
