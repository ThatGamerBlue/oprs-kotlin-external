package com.openosrs.example.external

import net.runelite.api.Client
import net.runelite.api.events.GameTick
import net.runelite.client.eventbus.Subscribe
import net.runelite.client.plugins.Plugin
import net.runelite.client.plugins.PluginDescriptor
import net.runelite.client.plugins.PluginType
import javax.inject.Inject

@PluginDescriptor(name = "Example External Plugin", description = "Example External Plugin for OpenOSRS", type = PluginType.EXTERNAL)
class ExamplePlugin : Plugin() {

    companion object : Log()

    @Inject
    private lateinit var client : Client

    override fun startUp()/*: Unit*/ {
        log.info("Plugin start!")
    }

    override fun shutDown()/*: Unit*/ {
        log.info("Plugin stop!")
    }

    @Subscribe
    fun onGameTick(event: GameTick?)/*: Unit*/ {
        log.debug("Game tick...")
    }
}