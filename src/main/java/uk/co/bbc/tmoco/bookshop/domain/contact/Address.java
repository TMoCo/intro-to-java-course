package uk.co.bbc.tmoco.bookshop.domain.contact;

public record Address(int number, String street, String city, String county,
                      String postcode) {
    @Override
    public String toString() {
        return String.format("Address[number=%d, street='%s', city='%s', " +
                        "county='%s', postcode='%s']", number, street, city, county,
                postcode);
    }
}
