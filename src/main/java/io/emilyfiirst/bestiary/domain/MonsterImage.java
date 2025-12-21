package io.emilyfiirst.bestiary.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "monster_images")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MonsterImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String url;

    @ManyToOne
    @JoinColumn(name = "monster_id", nullable = false)
    private Monster monster;
}
