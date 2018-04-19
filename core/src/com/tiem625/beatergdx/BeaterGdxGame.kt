package com.tiem625.beatergdx

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.scenes.scene2d.Stage
import com.tiem625.beatergdx.actors.PlayerActor

class BeaterGdxGame : ApplicationAdapter() {
    lateinit var batch: SpriteBatch
    lateinit var playerActor: PlayerActor
    lateinit var stage: Stage

    override fun create() {
        Textures.load()
        batch = SpriteBatch()
        playerActor = PlayerActor()
        stage = Stage().apply {
            actors.add(playerActor)
        }
    }

    override fun render() {
        Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()
        stage.draw()
        batch.end()
    }

    override fun dispose() {
        Textures.dispose()
    }
}
