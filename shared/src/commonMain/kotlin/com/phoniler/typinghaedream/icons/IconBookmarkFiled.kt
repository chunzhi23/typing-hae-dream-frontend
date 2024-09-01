package com.phoniler.typinghaedream.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var iconBookmarkFiled: ImageVector? = null

public val IconBookmarkFiled: ImageVector
    get() {
        if (iconBookmarkFiled != null) {
            return iconBookmarkFiled!!
        }
        iconBookmarkFiled =
            ImageVector
                .Builder(
                    name = "IconBookmarkFiled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 1.0f,
                        stroke = null,
                        strokeAlpha = 1.0f,
                        strokeLineWidth = 1.0f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Miter,
                        strokeLineMiter = 1.0f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(14f, 2f)
                        arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                        verticalLineToRelative(14f)
                        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.555f, 0.832f)
                        lineToRelative(-5.445f, -3.63f)
                        lineToRelative(-5.444f, 3.63f)
                        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.55f, -0.72f)
                        lineToRelative(-0.006f, -0.112f)
                        verticalLineToRelative(-14f)
                        arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                        horizontalLineToRelative(4f)
                        close()
                    }
                }.build()
        return iconBookmarkFiled!!
    }
