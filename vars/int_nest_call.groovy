#!/usr/bin/env groovy
package org.foo

def call(String nn = "int nesy") {
  echo "this is int nest call ${nn}"
  echo Environment.getAnimalCry(Environment.laohu)
}
