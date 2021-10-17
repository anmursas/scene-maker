@file:JvmName("Ellipse")

package com.ieseljust.kscenemaker

import java.awt.Graphics
import java.awt.Color

class Ellipse : Figura {

    // Inicialitzem les variables en la delcaració mateix
    // No utilitzarem cap constructor primari
    var radi_x: Int = 100
    var radi_y: Int = 100

    // Constructors secundaris
    constructor() : super() //Sense arguments

    constructor(x: Int, y: Int, radi_x: Int = 100, radi_y: Int = 100, color: Color = Color.BLACK) : super(x, y, color) {
        //super(x, y, color)
        this.radi_x = radi_x
        this.radi_y = radi_y

    }

    override fun describeMe() {
        /*
        * Mètode que mostra en mode text una descripció de la figura per la consola.
        * S'utilitzarà per al mètode llista de la CLI.
        */
        println("Ellipse " + x + " " + y + " " + radi_x + " " + radi_y + " " + color)
    }

    override fun render(g: Graphics) {

        /*
         * Mètode que dibuixa sobre un context gràfic la figura rectangle.
         * S'utilitza per al mètode render() de App.
         * 
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         * 
         * Fixeu-vos que això són classes de java que estem utilitzant
         * directament des de Kotlin!
         * 
         */

        g.setColor(color)             // Establim el color interior
        g.fillOval(x, y, radi_x, radi_y)    // Dibuixem un ellipse en la posició i mida indicades
    }

}

