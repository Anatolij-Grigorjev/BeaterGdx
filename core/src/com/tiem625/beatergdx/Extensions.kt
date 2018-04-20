package com.tiem625.beatergdx

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import java.text.SimpleDateFormat
import java.util.*


fun doClearColor(r: Float, g: Float, b: Float, a: Float) {

    Gdx.gl.glClearColor(r, g, b, a)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
}

val logDateFormat = SimpleDateFormat("yyyy.MM.dd HH:mm:ss")

fun Any.log(vararg message: Any) {

    System.out.println(logDateFormat.format(Date()) +
            " (${this.javaClass.name})" +
            "[${Thread.currentThread().name}]: " +
            message.joinToString { it.toString() })
}
