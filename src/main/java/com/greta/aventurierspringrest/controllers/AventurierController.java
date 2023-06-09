package com.greta.aventurierspringrest.controllers;

import com.greta.aventurierspringrest.models.entities.Aventurier;
import com.greta.aventurierspringrest.services.AventurierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin // permet de controler d'ou vienne les requettes
@RestController
public class AventurierController {

    private AventurierService aventurierService;

    @Autowired
    public AventurierController(AventurierService aventurierService) {
        this.aventurierService = aventurierService;
    }
    @GetMapping("/aventurier")
    public List<Aventurier> index(){
    return aventurierService.index();
    }

    @GetMapping("/aventurier/{id}")
    public Aventurier show(@PathVariable(name = "id") Long id){
        return aventurierService.show(id);
    }

    @GetMapping("/aventuries/nom/{nom}")
    public List<Aventurier> rechercheNom(@PathVariable(name ="nom") String nom){
        return aventurierService.searchNom(nom);
    }


    @PostMapping("/aventurier")
    public Aventurier add(@RequestBody Aventurier aventurier){
        return aventurierService.save(aventurier);
    }
    @PutMapping("/aventurier")
    public Aventurier update(@RequestBody Aventurier aventurier){
        return aventurierService.save(aventurier);
    }
    @DeleteMapping("/aventurier/{id}")
    public void delete(@PathVariable(name="id") Long id){
     aventurierService.delete(id);
    }
}
