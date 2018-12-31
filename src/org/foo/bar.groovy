#!/usr/bin/env groovy
package org.foo

enum Environment {
    elephant,
    cat,
    mouse,
    tiger,
    laohu
}

def static getAnimalCry(Environment environment) {
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
