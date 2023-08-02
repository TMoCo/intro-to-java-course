package uk.co.bbc.tmoco.bookshop.domain.product;

public sealed abstract class Product implements Sales permits Book {
    protected String title;
    protected double price;

    protected double saleDiscount;

    public abstract void print();

    public double calculateSalePrice() {
        return price * (1 - saleDiscount / 100.f);
    }

    public double getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(double saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product[title='%s', price=%,.2f]", title, price);
    }
}
