package com.tiem625.beatergdx.stages

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.InputListener
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.tiem625.beatergdx.actors.PlayerActor
import com.tiem625.beatergdx.actors.ScrollingBGActor
import com.tiem625.beatergdx.log

class RunStage : Stage(ScreenViewport().apply {

}) {

    init {

        addListener(object : InputListener() {

            override fun keyUp(event: InputEvent?, keycode: Int): Boolean {
                when (keycode) {

                    Input.Keys.ESCAPE -> Gdx.app.exit()
                    Input.Keys.LEFT -> playerActor.rotateBy(-5.5f)
                    Input.Keys.RIGHT -> playerActor.rotateBy(5.5f)
                    Input.Keys.UP -> playerActor.moveBy(5.5f, 0f)
                    Input.Keys.DOWN -> playerActor.moveBy(-5.5f, 0f)


                    else -> log("Used keycode: ${keycode}")
                }

                return true
            }
        })
    }

    val playerActor: PlayerActor = PlayerActor().apply {
        this@RunStage.addActor(this)
    }
    val bgActor: ScrollingBGActor = ScrollingBGActor().apply {
        this@RunStage.addActor(this)
    }

    override fun act(delta: Float) {
        super.act(delta)
    }

    override fun draw() {
        actors.sort({ o1, o2 -> o1.zIndex.compareTo(o2.zIndex) })
        super.draw()
    }
}