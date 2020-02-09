package com.openosrs.example.external

import org.slf4j.LoggerFactory
import org.slf4j.Logger

abstract class Log {
    val log: Logger = LoggerFactory.getLogger(this.javaClass)
}