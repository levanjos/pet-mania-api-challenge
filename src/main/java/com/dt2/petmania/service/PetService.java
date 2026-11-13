package com.dt2.petmania.service;
import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    private final PetRepository repository;

    public PetService(PetRepository repository) {
        this.repository = repository;
    }

    public List<Pet> mostrarPet() {
        List<Pet> petList = new ArrayList<>();
        return petList = repository.findAll();
    }

    public void cadastrarPet (Pet p){
        Pet pet = new Pet();
        pet.setNome(p.getNome());
        pet.setEspecie(p.getEspecie());
        pet.setRaca(p.getRaca());
        pet.setIdade(p.getIdade());
        pet.setSexo(p.getSexo());
        pet.setPorte(p.getPorte());
        pet.setPersonalidade(p.getPersonalidade());
        pet.setFoto(p.getFoto());
        pet.setDisponivel(p.isDisponivel());
        repository.save(pet);
    }
}
