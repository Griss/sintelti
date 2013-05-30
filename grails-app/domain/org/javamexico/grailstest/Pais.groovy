package org.javamexico.grailstest

class Pais {

   String idPais
    String nombre

    static constraints = {
        idPais(blank: false)
        nombre(blank: false)
    }
}
