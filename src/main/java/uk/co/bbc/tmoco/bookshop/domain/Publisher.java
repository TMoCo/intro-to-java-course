package uk.co.bbc.tmoco.bookshop.domain;

public class Publisher {
    private Address address;
    private String name;

    public Publisher(String name, Address address) {
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
        return String.format("uk.co.bbc.tmoco.bookshop.domain.Publisher[name='%s' address=%s]", name, address);
    }
}

