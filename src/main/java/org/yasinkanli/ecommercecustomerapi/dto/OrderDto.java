package org.yasinkanli.ecommercecustomerapi.dto;

public class OrderDto {
    private String productName;
    private Double amount;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
