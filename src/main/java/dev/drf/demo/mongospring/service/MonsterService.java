package dev.drf.demo.mongospring.service;

import dev.drf.demo.mongospring.model.Monster;
import dev.drf.demo.mongospring.repository.MonsterRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterService {

    @Autowired
    private MonsterRepository repository;

    public MonsterService() {
    }

    public List<Monster> all() {
        return repository.findAll();
    }

    public Monster getByName(String name) {
        return repository.findFirstByName(name)
                .orElse(null);
    }

    public Monster get(ObjectId id) {
        return repository.findById(id)
                .orElse(null);
    }

    /*public void save(String name, Integer age, Integer cp, String description) {
        Monster monster = new Monster();

        monster.setName(name);
        monster.setAge(age);
        monster.setCombatPower(cp);
        monster.setDescription(description);

        save(monster);
    }*/

    public void save(Monster monster) {
        repository.save(monster);
    }

    /*public void replace(String name, Integer age, Integer cp, String description) {

    }*/

    /*public Monster replace(ObjectId id, Monster monster) {
        return repository.findById(monster.getId())
                .map(m -> {
                    m.setName(monster.getName());
                    m.setAge(monster.getAge());
                    m.setCombatPower(monster.getCombatPower());
                    m.setDescription(monster.getDescription());
                    return repository.save(m);
                }).orElse(() -> {
                    monster.setId(id);
                    return repository.save(monster);
            });
    }*/
}
