package dev.drf.demo.mongospring.controller;

import dev.drf.demo.mongospring.model.Monster;
import dev.drf.demo.mongospring.service.MonsterService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monsters")
public class MonsterController {

    @Autowired
    private MonsterService service;

    public MonsterController() {
    }

    @GetMapping(value = "/",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Monster> getAll() {
        return service.all();
    }

    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Monster getById(@PathVariable String id) {
        ObjectId bsonid = new ObjectId(id);
        return service.get(bsonid);
    }

    @GetMapping(value = "/search",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Monster getByName(@RequestParam("name") String name) {
        return service.getByName(name);
    }
}
