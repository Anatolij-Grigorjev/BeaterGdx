package com.tiem625.beatergdx.actors

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.scenes.scene2d.Actor
import com.tiem625.beatergdx.Textures

class ScrollingBGActor: Actor() {

    init {

        zIndex = 999
    }

    val sprite = Sprite(Textures.cats).apply {

        texture.setWrap(Texture.TextureWrap.Repeat, Texture.TextureWrap.Repeat)
//        this@ScrollingBGActor.width = (this.texture.width * 1).toFloat()
//        this@ScrollingBGActor.height = (this.texture.height * 1).toFloat()
    }

    override fun draw(batch: Batch?, parentAlpha: Float) {
        batch?.draw(sprite.texture, x, y, 0, 0, Gdx.graphics.width, Gdx.graphics.height)
        super.draw(batch, parentAlpha)
    }

}