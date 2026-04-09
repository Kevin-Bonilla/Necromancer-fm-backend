package com.KevinBonilla.Necromancer_fm.mapper.impl;

import com.KevinBonilla.Necromancer_fm.domain.CreateArtistRequest;
import com.KevinBonilla.Necromancer_fm.domain.dto.ArtistDto;
import com.KevinBonilla.Necromancer_fm.domain.entity.Artist;
import com.KevinBonilla.Necromancer_fm.mapper.ArtistMapper;
import org.springframework.stereotype.Component;

@Component
public class ArtistMapperImpl implements ArtistMapper {
    @Override
    public CreateArtistRequest fromDto(CreateArtistRequest dto) {
        return new CreateArtistRequest(
                dto.artistName(),
                dto.playcount(),
                dto.artistStatus()
        );
    }

    @Override
    public ArtistDto toDto(Artist artist) {
        return new ArtistDto(
                artist.getId(),
                artist.getArtistName(),
                artist.getPlaycount(),
                artist.getArtistStatus()
        );
    }
}
