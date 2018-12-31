#!/usr/bin/env groovy
package org.foo

def call(String name = 'human') {
  echo "Hello, ${name}."
  calMe "work?"
  int_nest_call "hahaha"
  echo Environment.getAnimalCry()
}
