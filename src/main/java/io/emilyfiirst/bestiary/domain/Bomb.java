package io.emilyfiirst.bestiary.domain;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "bombs")
@Entity(name = "bombs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bomb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "url_image", nullable = false, unique = true)
    private String urlImage;
}
