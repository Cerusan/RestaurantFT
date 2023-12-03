package ru.tastenov.Restaurant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tastenov.Restaurant.models.menu.AbstractMenu;
import ru.tastenov.Restaurant.repositories.AbstractMenuRepository;

import java.util.List;

@Service
public class MenuService {
    private final AbstractMenuRepository abstractMenuRepository;

    @Autowired
    public MenuService(AbstractMenuRepository abstractMenuRepository) {
        this.abstractMenuRepository = abstractMenuRepository;
    }

    public List<AbstractMenu> findAll() {
        return abstractMenuRepository.findAll();
    }

}
