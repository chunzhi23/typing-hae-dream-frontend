package com.phoniler.typinghaedream.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var iconBrandKakoTalk: ImageVector? = null

public val IconBrandKakoTalk: ImageVector
    get() {
        if (iconBrandKakoTalk != null) {
            return iconBrandKakoTalk!!
        }
        iconBrandKakoTalk =
            ImageVector
                .Builder(
                    name = "IconBrandKakoTalk",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f
                ).apply {
                    path(
                        fill = null,
                        fillAlpha = 1.0f,
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeAlpha = 1.0f,
                        strokeLineWidth = 2f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                        strokeLineMiter = 1.0f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(10f, 8f)
                        verticalLineToRelative(7f)
                    }
                    path(
                        fill = null,
                        fillAlpha = 1.0f,
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeAlpha = 1.0f,
                        strokeLineWidth = 2f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                        strokeLineMiter = 1.0f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(14f, 10f)
                        lineToRelative(-2f, 2.5f)
                        lineToRelative(2f, 2.5f)
                    }
                    path(
                        fill = null,
                        fillAlpha = 1.0f,
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeAlpha = 1.0f,
                        strokeLineWidth = 2f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                        strokeLineMiter = 1.0f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(12f, 4f)
                        curveToRelative(4.97f, 0f, 9f, 3.358f, 9f, 7.5f)
                        curveToRelative(0f, 4.142f, -4.03f, 7.5f, -9f, 7.5f)
                        curveToRelative(-0.67f, 0f, -1.323f, -0.061f, -1.95f, -0.177f)
                        lineToRelative(-3.05f, 2.177f)
                        lineToRelative(0.592f, -2.962f)
                        curveToRelative(-2.741f, -1.284f, -4.592f, -3.73f, -4.592f, -6.538f)
                        curveToRelative(0f, -4.142f, 4.03f, -7.5f, 9f, -7.5f)
                        close()
                    }
                }.build()
        return iconBrandKakoTalk!!
    }
