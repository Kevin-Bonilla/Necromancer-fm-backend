package com.KevinBonilla.Necromancer_fm.mapper;

import com.KevinBonilla.Necromancer_fm.domain.CreateArtistRequest;
import com.KevinBonilla.Necromancer_fm.domain.dto.ArtistDto;
import com.KevinBonilla.Necromancer_fm.domain.entity.Artist;

public interface ArtistMapper {
    // changing a CreateArtistRequest dto to a CreateArtistRequest
    CreateArtistRequest fromDto(CreateArtistRequest dto);

    // changing an artist to an artistDto
    ArtistDto toDto(Artist artist);
}
