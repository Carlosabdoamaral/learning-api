package com.carlosamaral.animals.Repository;

import com.carlosamaral.animals.Model.AnimalModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<AnimalModel, Long> { }
