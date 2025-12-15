package io.emilyfiirst.bestiary.controller;

import io.emilyfiirst.bestiary.domain.Monster;
import io.emilyfiirst.bestiary.domain.MonsterResponseDTO;
import io.emilyfiirst.bestiary.repository.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/monsters")
public class MonsterController {

    @Autowired
    private MonsterRepository repository;

    @GetMapping
    public List<MonsterResponseDTO> getAll(){
        return repository.findAll().stream().map(MonsterResponseDTO::new).toList();
    }
}
