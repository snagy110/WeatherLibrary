package com.telekommms.weatherlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform