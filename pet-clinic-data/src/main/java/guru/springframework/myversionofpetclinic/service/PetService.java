package guru.springframework.myversionofpetclinic.service;

import guru.springframework.myversionofpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
