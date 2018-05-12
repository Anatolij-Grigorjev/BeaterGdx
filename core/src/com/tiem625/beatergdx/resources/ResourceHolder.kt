package com.tiem625.beatergdx.resources

import com.badlogic.gdx.utils.Disposable
import kotlin.reflect.full.declaredMemberProperties

interface ResourceHolder {

    fun dispose() {

        javaClass.kotlin.declaredMemberProperties.map {
            it.get(this)
        }.filter {it != null}.map { it as Any }.forEach {
            println("Disposing of disposable $it")
            (it as Disposable).dispose()
        }
    }
}