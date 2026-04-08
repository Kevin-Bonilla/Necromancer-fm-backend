package com.KevinBonilla.Necromancer_fm.repository;

import com.KevinBonilla.Necromancer_fm.domain.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, UUID> {
    // we don't need to implement anything here thanks to JpaRepository
}
