#!/usr/bin/env groovy
package org.foo

enum Environment {
    elephant,
    cat,
    mouse,
    tiger,
    laohu
}

static getAnimalCry(Environment environment = Environment.mouse) {
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
  }
}
