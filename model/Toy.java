package model;

import java.util.UUID;

public class Toy {
    private String id;
    private String name;
    private Integer count = 0;
    private Double weight;

    public Toy() {
        this.id = UUID.randomUUID().toString();
        this.count++;
    }

    public Toy(String name, Double weight) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.count++;
        this.weight = weight;
    }
    public Toy(Toy toy) {
        this.id = toy.id;
        this.name = toy.name;
        this.count = 1;
        this.weight = toy.weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", weight=" + weight +
                '}';
    }
}
