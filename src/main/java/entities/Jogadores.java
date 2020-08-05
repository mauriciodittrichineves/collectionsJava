package entities;

import java.util.Objects;

public class Jogadores {
    private String name;
    private Integer number;

    public Jogadores(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogadores jogadores = (Jogadores) o;
        return Objects.equals(name, jogadores.name) &&
                Objects.equals(number, jogadores.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
