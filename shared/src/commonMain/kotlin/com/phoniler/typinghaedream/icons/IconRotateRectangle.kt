package com.phoniler.typinghaedream.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var iconRotateRectangle: ImageVector? = null

public val IconRotateRectangle: ImageVector
    get() {
        if (iconRotateRectangle != null) {
            return iconRotateRectangle!!
        }
        iconRotateRectangle =
            ImageVector
                .Builder(
                    name = "IconRotateRectangle",
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
                        moveTo(10.09f, 4.01f)
                        lineToRelative(0.496f, -0.495f)
                        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.828f, 0f)
                        lineToRelative(7.071f, 7.07f)
                        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.83f)
                        lineToRelative(-7.07f, 7.07f)
                        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, 0f)
                        lineToRelative(-7.07f, -7.07f)
                        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.83f)
                        lineToRelative(3.535f, -3.535f)
                        horizontalLineToRelative(-3.988f)
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
                        moveTo(7.05f, 11.038f)
                        verticalLineToRelative(-3.988f)
                    }
                }.build()
        return iconRotateRectangle!!
    }
