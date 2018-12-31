#!/usr/bin/env groovy
package org.foo

enum Elu {
    elephant,
    cat,
    mouse,
    tiger,
    laohu
}

class TestMe {
    static def getAnimalCry(Elu environment = Elu.mouse) {
      /*  switch(environment) {
        case Elu.elephant: 
          return "gao"
          break
        case Elu.cat:
          return "meow"
          break
        case Elu.mouse:
          return "zhizhi"
          break
        case Elu.tiger:
          return "wao"
          break
        case Elu.laohu:
          return "wao"
          break
        default:
            return "mew"
          break
        }*/
        return "haha"
    }
}

