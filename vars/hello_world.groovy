#!/usr/bin/env groovy


def getAnimalCry(Environment environment = Environment.mouse) {
  switch(environment) {
    case Environment.elephant: 
      return "gao"
      break
    case Environment.cat:
      return "meow"
      break
    case Environment.mouse:
      return "zhizhi"
      break
    case Environment.tiger:
      return "wao"
      break
    case Environment.laohu:
      return "wao"
      break
    default:
        return "mew"
      break
  }
}

def call(String name = 'human') {
  echo "Hello, ${name}."
  calMe "work?"
  int_nest_call "hahaha"
  echo getAnimalCry()
}
