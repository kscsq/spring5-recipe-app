package ru.fedordmitriev.recipe.repository;

import org.springframework.data.repository.CrudRepository;
import ru.fedordmitriev.recipe.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
