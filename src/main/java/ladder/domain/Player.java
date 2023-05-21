package ladder.domain;

public class Player {
    private static final int MAX_NAME_LENGTH = 5;
    
    private String name;

    public Player(String name) {
        validateName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validateName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(String.format("Input should be within %d characters, but %d characters were provided.", MAX_NAME_LENGTH, name.length()));
        }
    }
}
