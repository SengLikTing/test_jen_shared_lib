#!/usr/bin/env groovy

def call(String nn = "int nesy") {
  echo "this is int nest call ${nn}"
  echo bar.Environment.getAnimalCry(bar.Environment.laohu)
}
