package pracaDomowa.ZadDomNiedziela;

public abstract class Animal {

    // NIE NIE MOŻEMY TWORZYĆ OBIEKTU KLASY ABSTRAKCYJNEJ
    // Klasy abstrakcyjne w porówniu z interfejsami mogą mieć ciało

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public static void speak(String name) {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
