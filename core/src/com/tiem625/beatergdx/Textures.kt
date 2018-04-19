package com.tiem625.beatergdx

import com.badlogic.gdx.graphics.Texture

object Textures {

    lateinit var badLogic: Texture

    fun load() {

        badLogic = Texture("badlogic.jpg")
    }

    fun dispose() {

        badLogic.dispose()
    }
}