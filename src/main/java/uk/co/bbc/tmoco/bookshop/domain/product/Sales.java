package uk.co.bbc.tmoco.bookshop.domain.product;

public interface Sales {

    double calculateSalePrice();

    double getSaleDiscount();

    void setSaleDiscount(double saleDiscount);
}
