#!/usr/bin/env groovy
package org.foo

enum elu {
    elephant,
    cat,
    mouse,
    tiger,
    laohu
}

def getAnimalCry(elu environment = elu.mouse) {
    switch(environment) {
    case elu.elephant: 
      return "gao"
      break
    case elu.cat:
      return "meow"
      break
    case elu.mouse:
      return "zhizhi"
      break
    case elu.tiger:
      return "wao"
      break
    case elu.laohu:
      return "wao"
      break
    default:
        return "mew"
      break
    }
}

