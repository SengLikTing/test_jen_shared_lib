#!/usr/bin/env groovy

enum Environment {
    elephant,
    cat,
    mouse,
    tiger,
    laohu

    static getAnimalCry(Environment environment) {
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
}
def call(String nn = "int nesy") {
  echo "this is int nest call ${nn}"
  echo Environment.getAnimalCry(Environment.laohu)
}
