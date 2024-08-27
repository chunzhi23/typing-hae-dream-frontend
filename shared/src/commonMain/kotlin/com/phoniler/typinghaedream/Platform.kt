package com.phoniler.typinghaedream

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform