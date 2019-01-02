#!/usr/bin/env groovy
package org.foo.bar

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
