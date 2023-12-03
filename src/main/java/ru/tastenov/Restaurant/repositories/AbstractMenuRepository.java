package ru.tastenov.Restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tastenov.Restaurant.models.menu.AbstractMenu;

@Repository
public interface AbstractMenuRepository extends JpaRepository<AbstractMenu, Integer> {
}
