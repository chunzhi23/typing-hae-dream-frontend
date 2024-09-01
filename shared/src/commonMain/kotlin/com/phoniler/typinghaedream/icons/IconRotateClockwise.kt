package com.phoniler.typinghaedream.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var iconRotateClockwise: ImageVector? = null

public val IconRotateClockwise: ImageVector
    get() {
        if (iconRotateClockwise != null) {
            return iconRotateClockwise!!
        }
        iconRotateClockwise =
            ImageVector
                .Builder(
                    name = "IconRotateClockwise",
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
                        moveTo(4.05f, 11f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.5f, 4f)
                        moveToRelative(-0.5f, 5f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(5f)
                    }
                }.build()
        return iconRotateClockwise!!
    }
