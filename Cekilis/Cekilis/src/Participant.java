public class Participant {
    private int id;
    private String name;

    public Participant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name; // Listede sadece isim görünsün diye
    }


    public int getId() {
        return id;
    }
}