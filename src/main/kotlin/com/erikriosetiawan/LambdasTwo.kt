package com.erikriosetiawan

import java.time.Duration
import java.time.Instant

object LambdasTwo {
    fun realtime(body: () -> Unit): Duration {
        val start = Instant.now()
        try {
            body()
        } finally {
            val end = Instant.now()
            return Duration.between(start, end)
        }
    }
}