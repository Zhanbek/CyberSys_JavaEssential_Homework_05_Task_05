package model;

public class Friends {
    String name;

    public Friends(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Friends {" +
                "name='" + name + '\'' +
                '}';
    }
}
