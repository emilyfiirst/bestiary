package io.emilyfiirst.bestiary.domain;

import io.emilyfiirst.bestiary.domain.enums.Category;
import io.emilyfiirst.bestiary.domain.enums.Game;

import java.util.List;

public record SignsResponseDTO(Long id, String name, String urlImage)
{
    public SignsResponseDTO(Sign signs){
        this(signs.getId(), signs.getName(), signs.getUrlImage());
    }
}
