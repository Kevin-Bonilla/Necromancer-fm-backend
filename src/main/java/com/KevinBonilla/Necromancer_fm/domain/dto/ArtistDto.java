package com.KevinBonilla.Necromancer_fm.domain.dto;

import com.KevinBonilla.Necromancer_fm.domain.entity.ArtistStatus;

import java.util.UUID;

public record ArtistDto(
        UUID id,
        String artistName,
        int playcount,
        ArtistStatus artistStatus
) {
}
