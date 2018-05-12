package com.tiem625.beatergdx.resources

import com.badlogic.gdx.graphics.Texture

object Textures: ResourceHolder {

    lateinit var badLogic: Texture
    lateinit var cats: Texture
    lateinit var davis_0: Texture

    fun load() {

        badLogic = Texture("badlogic.jpg")
        davis_0 = Texture("davis_0.bmp")
        cats = Texture("cats.jpg")
    }
}