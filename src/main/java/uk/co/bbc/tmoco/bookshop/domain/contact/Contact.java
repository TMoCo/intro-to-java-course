package uk.co.bbc.tmoco.bookshop.domain.contact;

import uk.co.bbc.tmoco.bookshop.utils.PrettyPrinter;

public sealed abstract class Contact implements PrettyPrinter permits Author,
        Publisher {
    protected Address address;
    protected String name;

    public Contact(String name, Address address) {
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
