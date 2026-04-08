package com.KevinBonilla.Necromancer_fm.domain;

import com.KevinBonilla.Necromancer_fm.domain.entity.ArtistStatus;

public record CreateArtistRequest(
    String artistName,
    int playcount,
    ArtistStatus artistStatus
) {
}
