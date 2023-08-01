package uk.co.bbc.tmoco.bookshop.domain.product;

public class Product {
    protected String title;
    protected double price;

    private double saleDiscount;

    protected Product(String title, double price) {
        this.title = title;
        this.price = price;
        this.saleDiscount = 0.0f;
    }

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
