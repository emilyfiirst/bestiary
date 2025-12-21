package io.emilyfiirst.bestiary.domain;

import io.emilyfiirst.bestiary.domain.enums.Category;
import io.emilyfiirst.bestiary.domain.enums.Game;

import java.util.List;

public record MonsterResponseDTO(Long id, String name, Category category, Game game, String description,
                                 List<Oil> weaknessesOils, List<Bomb> weaknessesBombs, List<Potion> weaknessesPotions,
                                 List<Sign> weaknessesSigns)
{
    public MonsterResponseDTO(Monster monster){
        this(monster.getId(), monster.getName(), monster.getCategory(), monster.getGame(), monster.getDescription(), monster.getWeaknessesOils(), monster.getWeaknessesBombs(), monster.getWeaknessesPotions(), monster.getWeaknessesSigns());
    }
}
