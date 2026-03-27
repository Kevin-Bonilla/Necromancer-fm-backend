package com.KevinBonilla.Necromancer_fm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Artist {
    //TODO: refine this later
    // loosely writing this and will probably refine later

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Artist name is required")
    private String artistName;

    @Column(nullable = false)
    @NotNull(message = "Play count is required")
    private int playCount;

    @Column(nullable = false)
    private boolean rediscovered;
}
