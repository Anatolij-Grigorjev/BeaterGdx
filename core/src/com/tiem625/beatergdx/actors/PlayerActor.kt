package com.tiem625.beatergdx.actors

import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.scenes.scene2d.Actor
import com.tiem625.beatergdx.Textures

class PlayerActor: Actor() {

    val sprite = Sprite(Textures.badLogic)

    override fun draw(batch: Batch?, parentAlpha: Float) {
        super.draw(batch, parentAlpha)
    }

}