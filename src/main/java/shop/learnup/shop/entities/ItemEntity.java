package shop.learnup.shop.entities;

import javax.persistence.*;

@Entity
@Table(name="items")
public class ItemEntity {

    public ItemEntity(String name, Double price, Boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public ItemEntity() {
    }

    @Id
    @GeneratedValue
    protected Integer id;

    @Column(name="name")
    protected String name;

    @Column(name="price")
    protected Double price;

    @Column(name="available")
    protected Boolean available;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
