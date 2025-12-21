package io.emilyfiirst.bestiary.domain;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "signs")
@Entity(name = "signs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "url_image", nullable = false, unique = true)
    private String urlImage;
}
