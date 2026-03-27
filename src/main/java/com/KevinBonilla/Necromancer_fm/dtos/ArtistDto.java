package com.KevinBonilla.Necromancer_fm.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArtistDto {

    @NotBlank(message = "Artist name is required")
    private String artistName;

    @NotNull(message = "Play count is required")
    private int playCount;

    private boolean rediscovered;
}
