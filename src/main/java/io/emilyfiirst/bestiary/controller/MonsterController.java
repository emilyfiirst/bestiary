package io.emilyfiirst.bestiary.controller;

import io.emilyfiirst.bestiary.domain.Monster;
import io.emilyfiirst.bestiary.repository.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("monster")
public class MonsterController {

    @Autowired
    private MonsterRepository repository;

    @GetMapping
    public List<Monster> getAll(){
        List<Monster> monsterList = repository.findAll();
        return monsterList;
    }
}
