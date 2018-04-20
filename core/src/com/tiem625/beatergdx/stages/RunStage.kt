package com.tiem625.beatergdx.stages

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.scenes.scene2d.EventListener
import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.InputListener
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.tiem625.beatergdx.actors.PlayerActor
import com.tiem625.beatergdx.log

class RunStage: Stage(ScreenViewport().apply {

}) {

    init {

        addListener(object: InputListener() {

            override fun keyUp(event: InputEvent?, keycode: Int): Boolean {
                when (keycode) {

                    Input.Keys.ESCAPE -> Gdx.app.exit()
                    else -> log("Used keycode: ${keycode}")
                }

                return true
            }
        })
    }

    val playerActor: PlayerActor = PlayerActor().apply {
        this@RunStage.addActor(this)
    }

    override fun act(delta: Float) {
        super.act(delta)
    }
}