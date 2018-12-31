#!/usr/bin/env groovy

def call(String nn = "int nesy") {
  echo "this is int nest call ${nn}"
  echo org.foo.bar.Environment.getAnimalCry(org.foo.bar.Environment.laohu)
}
