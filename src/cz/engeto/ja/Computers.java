package cz.engeto.ja;

import java.math.BigDecimal;

public class Computers {
    private String description;
    private int yearOfProduction;
    BigDecimal price;

    public Computers(String description, int yearOfProduction, BigDecimal price) {
        this.description = description;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
