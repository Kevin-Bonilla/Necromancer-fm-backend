package com.KevinBonilla.Necromancer_fm.domain.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    // -------------------- Artist fields --------------------
    @Column(name = "artist_name", nullable = false)
    private String artistName;

    @Column(name = "playcount", nullable = false)
    private int playcount;

    @Enumerated(EnumType.STRING)
    @Column(name = "artist_status" , nullable = false)
    private ArtistStatus artistStatus;

    // -------------------- Audit Fields --------------------
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
