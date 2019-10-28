import java.util.Objects;

public class Treasure {

   private String name;

    public Treasure(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return Objects.equals(name, treasure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
