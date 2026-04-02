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

    public Artist() {
    }

    public Artist(UUID id, String artistName, int playcount, ArtistStatus artistStatus, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.artistName = artistName;
        this.playcount = playcount;
        this.artistStatus = artistStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getPlaycount() {
        return playcount;
    }

    public void setPlaycount(int playcount) {
        this.playcount = playcount;
    }

    public ArtistStatus getArtistStatus() {
        return artistStatus;
    }

    public void setArtistStatus(ArtistStatus artistStatus) {
        this.artistStatus = artistStatus;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
