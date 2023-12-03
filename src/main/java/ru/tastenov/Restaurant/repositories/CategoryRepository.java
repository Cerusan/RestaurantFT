package ru.tastenov.Restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tastenov.Restaurant.models.menu.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
