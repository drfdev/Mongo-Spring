package dev.drf.demo.mongospring.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "monsters")
public class Monster {

    @Id
    private ObjectId id;

    @Field
    private String name;

    @Field
    private Integer age;

    @Field
    private Integer combatPower;

    @Field
    private String description;

    public Monster(ObjectId id) {
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCombatPower() {
        return combatPower;
    }

    public void setCombatPower(Integer combatPower) {
        this.combatPower = combatPower;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
