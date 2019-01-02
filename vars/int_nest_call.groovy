#!/usr/bin/env groovy

enum Alu {
   kon,
   rin,
   zai,
   dette
}

def call(String nn = "int nesy") {
  echo "this is int nest call ${nn}"
  //echo new org.foo.bar().getAnimalCry(org.foo.Environment.cat)
}

def info(message) {
    echo "INFO: ${message}"
}

def warning(Alu a) {
   switch(a) {
    case Alu.kon:
      echo "this is kon"
      break
   default:
      echo "unk"
   }
}
