package com.KevinBonilla.Necromancer_fm.service;

import com.KevinBonilla.Necromancer_fm.domain.CreateArtistRequest;
import com.KevinBonilla.Necromancer_fm.domain.entity.Artist;

public interface ArtistService {

    Artist createArtist(CreateArtistRequest request);
}
