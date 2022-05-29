package com.danielfeliciano.pokedex.data.remote.responses

import com.danielfeliciano.pokedex.data.remote.responses.DreamWorld
import com.danielfeliciano.pokedex.data.remote.responses.Home
import com.danielfeliciano.pokedex.data.remote.responses.OfficialArtwork

data class Other(
    val dream_world: DreamWorld,
    val home: Home,
    val official_artwork: OfficialArtwork
)