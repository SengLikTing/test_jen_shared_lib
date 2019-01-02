#!/usr/bin/env groovy
package org.foo

public enum Elu {
    elephant,
    cat,
    mouse,
    tiger,
    laohu
}

def dummy(Elu b = Elu.elephant) {
    return "niet"
}
