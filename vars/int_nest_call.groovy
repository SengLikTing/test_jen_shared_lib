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
          echo "gao"
          break
        case Environment.cat:
          echo "meow"
          break
        case Environment.mouse:
          echo "zhizhi"
          break
        case Environment.tiger:
          echo "wao"
          break
        case Environment.laohu:
          echo "wao"
          break
        default:
          echo "O_O?"
      }
    }
}
def call(String nn = "int nesy") {
  echo "this is int nest call ${nn}"
  Environment.getAnimalCry(Environment.laohu)
}
