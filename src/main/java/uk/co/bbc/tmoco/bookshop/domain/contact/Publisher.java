package uk.co.bbc.tmoco.bookshop.domain.contact;

public final class Publisher extends Contact {

    private String organisation;

    public Publisher(String name, Address address, String organisation) {
        super(name, address);
        this.organisation = organisation;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public Publisher(String name, Address address) {
        this(name, address, "");
    }

    @Override
    public void prettyPrint() {
        System.out.println(String.format("Hello I am the publisher %s.",
               this.name));
    }

    @Override
    public String toString() {
        return String.format("Publisher[%s, organisation='%s']",
                super.toString(), organisation);
    }
}

