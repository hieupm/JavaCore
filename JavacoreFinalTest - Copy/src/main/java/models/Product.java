package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Product {
    private int id;
    private String name;
    private Type type;
    private String manufacturer;
    private int warrantyPeriod;
    private long price;
    private int stock;
    private String detail;

    @Override
    public String toString() {
        return "models.Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", manufacturer='" + manufacturer + '\'' +
                ", warrantyPeriod=" + warrantyPeriod +
                ", price=" + price +
                ", stock=" + stock +
                ", detail='" + detail + '\'' +
                '}';
    }
}
