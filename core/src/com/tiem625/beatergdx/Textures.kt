package com.tiem625.beatergdx

import com.badlogic.gdx.graphics.Texture

object Textures {

    lateinit var badLogic: Texture
    lateinit var cats: Texture
    lateinit var davis_0: Texture

    fun load() {

        badLogic = Texture("badlogic.jpg")
        davis_0 = Texture("davis.bmp")
        cats = Texture("cats.jpg")
    }

    fun dispose() {

        badLogic.dispose()
    }
}