package com.plcoding.bookpedia.book.presentation.book_detail.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import cmp_bookpedia.composeapp.generated.resources.Res
import cmp_bookpedia.composeapp.generated.resources.book_cover
import coil3.Image
import coil3.compose.rememberAsyncImagePainter
import com.plcoding.bookpedia.core.presentation.DarkBlue
import com.plcoding.bookpedia.core.presentation.LightBlue
import org.jetbrains.compose.resources.stringResource

@Composable
fun BlurredImageBackground(
    modifier: Modifier,
    imageUrl: String?,
    isFavorite: Boolean,
    onFavoriteClicked: () -> Unit,
    onBackClicked: () -> Unit,
    content: @Composable () -> Unit

) {
    var imageLoadResult by remember { mutableStateOf<Result<Painter>?>(null) }

    val painter = rememberAsyncImagePainter(
        model = imageUrl,
        onSuccess = {
            val size = it.painter.intrinsicSize
            imageLoadResult = if(size.width > 1 && size.height > 1) {
                Result.success(it.painter)

            } else {
                Result.failure(Exception("Invalid image dimensions"))
            }
        }

    )

    Box {
        Column(
            modifier = Modifier
                .fillMaxSize()
            ,
        ) {
            Box(modifier = Modifier
                .weight(0.3f)
                .fillMaxWidth()
                .background(DarkBlue)
            ) {
                imageLoadResult?.getOrNull()?.let { painter ->
                    Image(
                        painter = painter,
                        contentDescription = stringResource(Res.string.book_cover),
                    )
                }

            }
        }
    }
}