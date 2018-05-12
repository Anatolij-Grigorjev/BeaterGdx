package com.tiem625.beatergdx

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.Stage
import com.tiem625.beatergdx.resources.Textures
import com.tiem625.beatergdx.stages.RunStage

class BeaterGdxGame : Game() {

    lateinit var runStage: Stage

    override fun create() {
        Textures.load()

        runStage = RunStage().apply {
            Gdx.input.inputProcessor = this
        }
    }


    override fun render() {
        doClearColor(1.0f, 1.0f, 0.0f, 1.0f)

        runStage.act(Gdx.graphics.deltaTime)
        runStage.draw()
    }

    override fun dispose() {

        runStage.dispose()
        Textures.dispose()
    }
}
