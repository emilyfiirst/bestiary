package io.emilyfiirst.bestiary.repository;

import io.emilyfiirst.bestiary.domain.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterRepository extends JpaRepository<Monster, Long> {
}
