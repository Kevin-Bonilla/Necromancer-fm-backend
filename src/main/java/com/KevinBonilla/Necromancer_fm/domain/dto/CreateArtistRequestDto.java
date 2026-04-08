package com.KevinBonilla.Necromancer_fm.domain.dto;

import com.KevinBonilla.Necromancer_fm.domain.entity.ArtistStatus;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record CreateArtistRequestDto(
        @NotBlank(message = ERROR_MESSAGE_ARTIST_NAME_BLANK)
        @Length(max = 255, message = ERROR_MESSAGE_ARTIST_NAME_LENGTH)
        String artistName,
        int playcount,
        ArtistStatus artistStatus
) {

    private static final String ERROR_MESSAGE_ARTIST_NAME_LENGTH = "Artist name length must be between 1 and 255 characters";
    private static final String ERROR_MESSAGE_ARTIST_NAME_BLANK = "Artist name must not be blank";
}
