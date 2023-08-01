package uk.co.bbc.tmoco.bookshop.domain;

public class Author {
    private Address address;
    private String name;

    public Author(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("uk.co.bbc.tmoco.bookshop.domain.Author[name='%s' address=%s]", name, address);
    }
}
