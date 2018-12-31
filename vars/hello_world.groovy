#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  calMe "work?"
  int_nest_call "hahaha"
  echo int_nest_call.Environment.getAnimalCry(int_nest_call.Environment.mouse)
}
