package com.tiem625.beatergdx.actors

import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.scenes.scene2d.Actor
import com.tiem625.beatergdx.resources.Textures

class PlayerActor : Actor() {

    init {

        zIndex = 10
    }

    val sprite = Sprite(Textures.davis_0).apply {
        this@PlayerActor.width = this.width
        this@PlayerActor.height = this.height

        this@PlayerActor.setOrigin(width / 2, height / 2)
    }

    override fun draw(batch: Batch?, parentAlpha: Float) {

        batch?.draw(sprite, x, y, originX, originY, width, height, scaleX, scaleY, rotation)
        super.draw(batch, parentAlpha)
    }

}