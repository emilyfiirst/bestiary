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
@EqualsAndHashCode(of = "id")
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

    @OneToMany(
            mappedBy = "monster",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<MonsterImage> images = new ArrayList<>();


    @Column(columnDefinition = "TEXT")
    private String description;


    @ManyToMany
    @JoinTable(name = "monster_oils",
            joinColumns = @JoinColumn(name = "monster_id"),
            inverseJoinColumns = @JoinColumn(name = "oil_id"))
    private List<Oil> weaknessesOils = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "monster_signs",
            joinColumns = @JoinColumn(name = "monster_id"),
            inverseJoinColumns = @JoinColumn(name = "sign_id"))
    private List<Sign> weaknessesSigns = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "monster_potions",
            joinColumns = @JoinColumn(name = "monster_id"),
            inverseJoinColumns = @JoinColumn(name = "potion_id"))
    private List<Potion> weaknessesPotions = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "monster_bombs",
            joinColumns = @JoinColumn(name = "monster_id"),
            inverseJoinColumns = @JoinColumn(name = "bomb_id"))
    private List<Bomb> weaknessesBombs = new ArrayList<>();
}
