package com.tiem625.beatergdx

import com.badlogic.gdx.graphics.Texture

data class Spritesheet(
        val texture: Texture,
        val spriteWidth: Int,
        val spriteHeight: Int,
        val spriteCols: Int = 1,
        val spriteRows: Int = 1,
        val paddingX: Int = 0,
        val paddingY: Int = 0
) {
    class Region(spriteWidth: Int, spriteHeight: Int) {
        var srcX: Int = 0
        var srcY: Int = 0
        val width = spriteWidth
        val height = spriteHeight
    }

    val totalSprites = spriteCols * spriteRows
    val currentRegion = Region(spriteWidth, spriteHeight)

    var currentSprite: Int = 0
        set(value) {
            field = value
            currentRegion.apply {
                //number of element after removing rows offset by sprite + padding
                srcX = (value % spriteCols) * (spriteWidth + paddingX)
                //which of the rows element is in basedo n height + padding
                srcY = (value / spriteCols) * (spriteHeight + paddingY)
            }
        }
}