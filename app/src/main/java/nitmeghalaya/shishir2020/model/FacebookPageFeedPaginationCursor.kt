package nitmeghalaya.shishir2020.model

import com.squareup.moshi.JsonClass

/**
 * Created by Devansh on 8/3/20
 */

@JsonClass(generateAdapter = true)
class FacebookPageFeedPaginationCursor(
    val before: String = "",
    val after: String = ""
)