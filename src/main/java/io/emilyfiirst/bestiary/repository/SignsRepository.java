package io.emilyfiirst.bestiary.repository;

import io.emilyfiirst.bestiary.domain.Sign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignsRepository extends JpaRepository<Sign, Long> {
}
