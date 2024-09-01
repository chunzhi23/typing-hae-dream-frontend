package com.phoniler.typinghaedream.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var iconCopy: ImageVector? = null

public val IconCopy: ImageVector
    get() {
        if (iconCopy != null) {
            return iconCopy!!
        }
        iconCopy =
            ImageVector
                .Builder(
                    name = "IconCopy",
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
                        moveTo(7f, 7f)
                        moveToRelative(0f, 2.667f)
                        arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.667f, -2.667f)
                        horizontalLineToRelative(8.666f)
                        arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.667f, 2.667f)
                        verticalLineToRelative(8.666f)
                        arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.667f, 2.667f)
                        horizontalLineToRelative(-8.666f)
                        arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.667f, -2.667f)
                        close()
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
                        moveTo(4.012f, 16.737f)
                        arcToRelative(2.005f, 2.005f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.012f, -1.737f)
                        verticalLineToRelative(-10f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(0.75f, 0f, 1.158f, 0.385f, 1.5f, 1f)
                    }
                }.build()
        return iconCopy!!
    }
