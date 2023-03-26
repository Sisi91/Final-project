package bg.travelhouse.model.entity;

import bg.travelhouse.model.enums.CategoryTypeEnum;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CategoryTypeEnum location;

    public Category() {
    }

    public Category(CategoryTypeEnum location) {
        this.location = location;
    }

    public CategoryTypeEnum getLocation() {
        return location;
    }

    public void setLocation(CategoryTypeEnum location) {
        this.location = location;
    }
}
