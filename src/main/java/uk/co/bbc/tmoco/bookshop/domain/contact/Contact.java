package uk.co.bbc.tmoco.bookshop.domain.contact;

public class Contact {
    protected Address address;
    protected String name;

    protected Contact(String name, Address address) {
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
        return String.format("Contact[name='%s', address=%s]", name, address);
    }
}
