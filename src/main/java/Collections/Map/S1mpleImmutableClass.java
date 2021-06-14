package Collections.Map;

public final class S1mpleImmutableClass {
    private final int id;
    private final String firstName;

    public S1mpleImmutableClass(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }


}
