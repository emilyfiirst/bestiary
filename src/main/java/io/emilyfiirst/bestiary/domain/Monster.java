package io.emilyfiirst.bestiary.domain;

import io.emilyfiirst.bestiary.domain.enums.Category;
import io.emilyfiirst.bestiary.domain.enums.Game;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;


@Table(name = "monsters")
@Entity(name = "monsters")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Game game;

    private String URLImage;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToMany
    private List<Oil> weaknessesOils = new ArrayList<>();

    @ManyToMany
    private List<Sign> weaknessesSigns = new ArrayList<>();

    @ManyToMany
    private List<Potion> weaknessesPotions = new ArrayList<>();

    @ManyToMany
    private List<Bomb> weaknessesBombs = new ArrayList<>();
}
