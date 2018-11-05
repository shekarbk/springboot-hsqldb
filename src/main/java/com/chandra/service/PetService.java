package com.chandra.service;

import com.chandra.dao.Pet;
import com.chandra.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {

    @Autowired
    PetRepository petRepository;

    public boolean addPet(Pet pet) {
        petRepository.save(pet);
        return true;
    }

    public List<Pet> getAllPets() {
        List<Pet> petStore = new ArrayList();
        petRepository.findAll().forEach(petStore::add);
        return petStore;
    }

    public boolean deletePet(int id) {
        try {
            petRepository.deleteById(id);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public Pet getPet(int id) {
        return petRepository.findById(id).get();
    }

    public boolean updatePet(int id, Pet newPet) {
        petRepository.save(newPet);
        return true;
    }
}
