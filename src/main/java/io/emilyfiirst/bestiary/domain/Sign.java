package io.emilyfiirst.bestiary.domain;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "sign")
@Entity(name = "sign")
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

    @Column(nullable = false, unique = true)
    private String URLImage;
}
