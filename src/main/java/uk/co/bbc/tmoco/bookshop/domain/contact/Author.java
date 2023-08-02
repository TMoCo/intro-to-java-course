package uk.co.bbc.tmoco.bookshop.domain.contact;

public final class Author extends Contact {
    private String genre;

    public Author(String name, Address address, String genre) {
        super(name, address);
        this.genre = genre;
    }

    public Author(String name, Address address) {
        this(name, address, "");
    }

    @Override
    public void prettyPrint() {
        System.out.println(String.format("Hello I am %s. I write %s books.",
                this.name, this.genre));
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("Author[%s, genre='%s']", super.toString(), genre);
    }
}
