#!/usr/bin/env groovy
import org.foo.*
  
def call(String nn = "int nesy") {
  echo "this is int nest call ${nn}"
  //echo new org.foo.bar().getAnimalCry(org.foo.Environment.cat)
}

def info(message) {
    echo "INFO: ${message}"
}

def warning(bar a) {
   switch(a) {
    case bar.elephant:
      echo "this is ele"
      break
   default:
      echo "unk"
   }
}
