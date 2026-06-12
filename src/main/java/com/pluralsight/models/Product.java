package com.pluralsight.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="products]")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product
{
    @Id
}


//{
//    private int productId;
//    private String productName;
//    private int categoryId;
//    private double unitPrice;
//
//    public Product(int productId, String productName, int categoryId, double unitPrice)
//    {
//        this.productId = productId;
//        this.productName = productName;
//        this.categoryId = categoryId;
//        this.unitPrice = unitPrice;
//    }
//
//    public Product()
//    {
//    }
//
//    public int getProductId()
//    {
//        return productId;
//    }
//
//    public void setProductId(int productId)
//    {
//        this.productId = productId;
//    }
//
//    public String getProductName()
//    {
//        return productName;
//    }
//
//    public void setProductName(String productName)
//    {
//        this.productName = productName;
//    }
//
//    public int getCategoryId()
//    {
//        return categoryId;
//    }
//
//    public void setCategoryId(int categoryId)
//    {
//        this.categoryId = categoryId;
//    }
//
//    public double getUnitPrice()
//    {
//        return unitPrice;
//    }
//
//    public void setUnitPrice(double unitPrice)
//    {
//        this.unitPrice = unitPrice;
//    }
//}
