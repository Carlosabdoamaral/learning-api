package com.carlosamaral.animals.Controller;

import com.carlosamaral.animals.Model.AnimalModel;
import com.carlosamaral.animals.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    AnimalRepository _AnimalRepository;

    @GetMapping
    public List<AnimalModel> allAnimals() {
        return _AnimalRepository.findAll();
    }

    @PostMapping
    public HttpStatus setAnimal(@RequestBody @Valid AnimalModel animal) {
        try {
            _AnimalRepository.save(animal);
            return HttpStatus.OK;
        } catch (Error e) {
            return HttpStatus.CONFLICT;
        }
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteAnimal(@PathVariable Long id) {
        try {
            _AnimalRepository.deleteById(id);
            return HttpStatus.OK;
        } catch (Error e) {
            return HttpStatus.BAD_REQUEST;
        }
    }
}
