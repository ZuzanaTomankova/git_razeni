package cz.engeto.ja;

import java.math.BigDecimal;

public class Computer implements Comparable<Computer>{
    private String description;
    private int yearOfProduction;
    BigDecimal price;

    public Computer(String description, int yearOfProduction, BigDecimal price) {
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

    @Override
    public String toString() {
        return "Computer{" +
                "description='" + description + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                " Kč}";
    }

    @Override
    public int compareTo(Computer otherComputer) {
        //*standardní způsob řazení
        //+Vrací:
        //*vrací záporné číslo, pokud má prvek být před otherComputer
        //*nulu, pokud jsou oba počítače ekvivalentní
        //*kladné číslo, pokud tento počítač má být až po otherComputer
        return this.description.compareTo(otherComputer.description);
    }
}
