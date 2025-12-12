package io.emilyfiirst.bestiary.domain;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "potions")
@Entity(name = "potions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Potion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String URLImage;
}
