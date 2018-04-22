package com.tiem625.beatergdx

import com.badlogic.gdx.graphics.Texture

object Textures {

    lateinit var badLogic: Texture
    lateinit var cats: Texture

    fun load() {

        badLogic = Texture("badlogic.jpg")
        cats = Texture("cats.jpg")
    }

    fun dispose() {

        badLogic.dispose()
    }
}