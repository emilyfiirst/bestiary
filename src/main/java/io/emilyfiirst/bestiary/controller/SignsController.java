package io.emilyfiirst.bestiary.controller;

import io.emilyfiirst.bestiary.domain.MonsterResponseDTO;
import io.emilyfiirst.bestiary.domain.SignsResponseDTO;
import io.emilyfiirst.bestiary.repository.SignsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/signs")
public class SignsController {

    @Autowired
    private SignsRepository repository;

    @GetMapping
    public List<SignsResponseDTO> getAll(){
        return repository.findAll().stream().map(SignsResponseDTO::new).toList();
    }
}
